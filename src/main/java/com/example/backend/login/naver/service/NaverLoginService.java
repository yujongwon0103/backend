package com.example.backend.login.naver.service;

import org.springframework.stereotype.Service;

import com.example.backend.login.naver.dto.CallProfileApiRes;
import com.example.backend.login.naver.dto.CreateNaverLoginUrlReq;
import com.example.backend.login.naver.dto.CreateNaverLoginUrlRes;
import com.example.backend.login.naver.dto.InquiryOidcConfigurationRes;
import com.example.backend.login.naver.dto.IssueJwkKeyRes;
import com.example.backend.login.naver.dto.RequestAccessTokenReq;
import com.example.backend.login.naver.dto.RequestAccessTokenRes;
import com.example.backend.login.naver.dto.VerifyUserAcceptProfileAuthorityRes;
import com.example.backend.util.HttpUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NaverLoginService {
 
    // host
    private final static String NAVER_ID_HOST = "https://nid.naver.com";
    private final static String NAVER_OPEN_API_HOST = "https://openapi.naver.com";
    
    // service uri
    private final static String AUTHORIZE_SERVICE_URI = "/oauth2.0/authorize";
    private final static String OIDC_AUTHORIZE_SERVICE_URI = "/oauth2/authorize";
    private final static String TOKEN_SERVICE_URI = "/oauth2.0/token";
    private final static String OIDC_TOKEN_SERVICE_URI = "/oauth2/token";
    private final static String ME_SERVICE_URI = "/v1/nid/me";
    private final static String VERIFY_SERVICE_URI = "/v1/nid/verify";
    private final static String OIDC_SERVICE_URI = "/.well-known/openid-configuration";
    private final static String JWK_SERVICE_URI = "/oauth2/jwks";

    private final static String TOKEN_TYPE = "Bearer";
    
    /**
     * 네이버 로그인 연동 URL 생성하기
     * @param req
     * @return
     */
    public CreateNaverLoginUrlRes createNaverLoginUrl(CreateNaverLoginUrlReq req) {

        String response = HttpUtils.httpGetConnection(NAVER_ID_HOST, AUTHORIZE_SERVICE_URI, null);
        // String response = HttpUtils.httpGetConnection(NAVER_ID_HOST, OIDC_AUTHORIZE_SERVICE_URI, null);

        CreateNaverLoginUrlRes res = new CreateNaverLoginUrlRes();
        return res;
    }

    /**
     * 접근 토큰 발급 요청
     * @param req
     * @return
     */
    public RequestAccessTokenRes requestAccessToken(RequestAccessTokenReq req) {

        String response = HttpUtils.httpGetConnection(NAVER_ID_HOST, TOKEN_SERVICE_URI, null);
        // String response = HttpUtils.httpGetConnection(NAVER_ID_HOST, OIDC_TOKEN_SERVICE_URI, null);

        RequestAccessTokenRes res = new RequestAccessTokenRes();
        return res;
    }
    
    /**
     * 접근 토큰을 이용하여 프로필 API 호출하기
     * @param req
     * @return
     */
    public CallProfileApiRes callProfileApi() {

        String accessToken = "접근토큰값";

        // 요청 헤더 셋팅
        StringBuilder sb = new StringBuilder();
        sb.append(TOKEN_TYPE).append(" ").append(accessToken);
        String authorization = sb.toString();

        String response = HttpUtils.httpGetConnection(NAVER_OPEN_API_HOST, ME_SERVICE_URI, null);

        CallProfileApiRes res = new CallProfileApiRes();
        return res;
    }

    /**
     * 접근 토큰을 이용하여 사용자 허용 프로필 권한 확인하기
     * @param req
     * @return
     */
    public VerifyUserAcceptProfileAuthorityRes verifyUserAcceptProfileAuthority() {

        // 요청 변수 셋팅
        // true일 경우 권한 설정정보 응답
        boolean info = false;

        String accessToken = "접근토큰값";

        // 요청 헤더 셋팅
        StringBuilder sb = new StringBuilder();
        sb.append(TOKEN_TYPE).append(" ").append(accessToken);
        String authorization = sb.toString();
        
        String response = HttpUtils.httpGetConnection(NAVER_OPEN_API_HOST, VERIFY_SERVICE_URI, null);

        VerifyUserAcceptProfileAuthorityRes res = new VerifyUserAcceptProfileAuthorityRes();
        return res;
    }

    /**
     * OIDC configuration 정보 조회
     * @return
     */
    public InquiryOidcConfigurationRes inquiryOidcConfiguration() {
        String response = HttpUtils.httpGetConnection(NAVER_ID_HOST, OIDC_SERVICE_URI, null);

        InquiryOidcConfigurationRes res = new InquiryOidcConfigurationRes();
        return res;
    }
    
    /**
     * jwk key 발급
     * @return
     */
    public IssueJwkKeyRes issueJwkKey() {
        String response = HttpUtils.httpGetConnection(NAVER_ID_HOST, JWK_SERVICE_URI, null);

        System.out.println(response);

        IssueJwkKeyRes res = new IssueJwkKeyRes();
        return res;
    }
}
