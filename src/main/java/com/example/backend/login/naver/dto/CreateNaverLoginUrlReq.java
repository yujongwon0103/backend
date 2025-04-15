package com.example.backend.login.naver.dto;

public class CreateNaverLoginUrlReq {
    // 인증 과정에 대한 내부 구분값으로 'code'로 전송해야 함 (필수)
    private final String response_type = "code";
    
    // 애플리케이션 등록 시 발급받은 Client ID 값 (필수)
    private final String client_id = "Client_ID";
    
    // 애플리케이션을 등록 시 입력한 Callback URL 값으로 URL 인코딩을 적용한 값 (필수)
    private final String redirect_uri = "CALLBACK_URL";
    
    // 사이트 간 요청 위조(cross-site request forgery) 공격을 방지하기 위해 애플리케이션에서 생성한 상태 토큰값으로 URL 인코딩을 적용한 값을 사용 (필수)
    private String state;

    // 'openid' scope 필수
    private String scope;

    // 해시처리된 PKCE value 필수 (선택)
    private String code_challenge;

    // PKCE 알고리즘 (선택)
    private String code_challenge_method = "S256";

    public String getResponse_type() {
        return response_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getCode_challenge() {
        return code_challenge;
    }

    public void setCode_challenge(String code_challenge) {
        this.code_challenge = code_challenge;
    }

    public String getCode_challenge_method() {
        return code_challenge_method;
    }

    public void setCode_challenge_method(String code_challenge_method) {
        this.code_challenge_method = code_challenge_method;
    }
}
