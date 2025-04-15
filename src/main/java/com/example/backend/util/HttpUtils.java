package com.example.backend.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpUtils {
    private static final int SECOND = 1000;
    private static final int MINUTE = SECOND * 60;
    private static final int FIVE_MINUTE = MINUTE * 5;
    private static final int TEN_MINUTE = MINUTE * 10;

    /**
     * URL 생성
     *
     * @param host
     * @param serviceURI
     * @param param
     * @return
     */
    private static String createUri(String host, String serviceURI, Map<String, String> param) {
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(host);
        urlBuilder.append(serviceURI);

        if(param != null) {
            param.forEach((key, val) -> {
                urlBuilder.append("&").append(URLEncoder.encode(key, StandardCharsets.UTF_8));
                urlBuilder.append("=").append(URLEncoder.encode(val, StandardCharsets.UTF_8));
            });
            return urlBuilder.toString().replaceFirst("[&]", "?");
        } else {
            return urlBuilder.toString();
        }
    }

    /**
     * HTTP GET 방식 통신
     *
     * @param host
     * @param serviceURI
     * @param param
     * @return
     */
    public static String httpGetConnection(String host, String serviceURI, Map<String, String> param) {
        return httpGetConnection(host, serviceURI, param, FIVE_MINUTE);
    }

    /**
     * HTTP GET 방식 통신
     *
     * @param host
     * @param serviceURI
     * @param param
     * @param timeout
     * @return
     */
    public static String httpGetConnection(String host, String serviceURI, Map<String, String> param, int timeout) {
        String uri = createUri(host, serviceURI, param); // URI
        HttpURLConnection conn = null;
        BufferedReader rd;
        StringBuilder sb;

        try {
            URL url = new URI(uri).toURL();
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            conn.setDoInput(true);

            System.out.println("Response code: " + conn.getResponseCode());

            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), StandardCharsets.UTF_8));
            }

            sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line).append("\n\r");
            }
            rd.close();

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }

        return sb.toString();
    }
}
