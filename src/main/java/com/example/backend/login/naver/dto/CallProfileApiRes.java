package com.example.backend.login.naver.dto;

public class CallProfileApiRes {
    // API 호출 결과 코드 (필수)
    private String resultcode;
    
    // 호출 결과 메시지 (필수)
    private String message;

    // 네이버 로그인 API 응답값 (필수)
    private NaverLoginApiResponse response;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NaverLoginApiResponse getResponse() {
        return response;
    }

    public void setResponse(NaverLoginApiResponse response) {
        this.response = response;
    }    
}
