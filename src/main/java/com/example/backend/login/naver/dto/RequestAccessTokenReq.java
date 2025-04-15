package com.example.backend.login.naver.dto;

public class RequestAccessTokenReq {
    /**
     * 인증 과정에 대한 구분값 (필수)
     * 1) 발급:'authorization_code'
     * 2) 갱신:'refresh_token'
     * 3) 삭제: 'delete'
     */
    private String grant_type;

    // 애플리케이션 등록 시 발급받은 Client ID 값 (필수)
    private String client_id;
    
    // 애플리케이션 등록 시 발급받은 Client secret 값 (필수)
    private String client_secret;

    // 로그인 인증 요청 API 호출에 성공하고 리턴받은 인증코드값 (authorization code) (발급 때 필수)
    private String code;

    // 사이트 간 요청 위조(cross-site request forgery) 공격을 방지하기 위해 애플리케이션에서 생성한 상태 토큰값으로 URL 인코딩을 적용한 값을 사용 (발급 때 필수)
    private String state;
    
    // 네이버 사용자 인증에 성공하고 발급받은 갱신 토큰(refresh token) (갱신 때 필수)
    private String refresh_token;

    // 기 발급받은 접근 토큰으로 URL 인코딩을 적용한 값을 사용 (삭제 때 필수)
    private String access_token;

    // 'NAVER'	인증 제공자 이름으로 'NAVER'로 세팅해 전송 (삭제 때 필수)
    private String service_provider;

    // PKCE로 동작하는 경우 추가
    private String code_verifier;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getService_provider() {
        return service_provider;
    }

    public void setService_provider(String service_provider) {
        this.service_provider = service_provider;
    }

    public String getCode_verifier() {
        return code_verifier;
    }

    public void setCode_verifier(String code_verifier) {
        this.code_verifier = code_verifier;
    }
}
