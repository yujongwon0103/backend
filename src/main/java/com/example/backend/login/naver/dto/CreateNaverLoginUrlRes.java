package com.example.backend.login.naver.dto;

public class CreateNaverLoginUrlRes {
    // 네이버 로그인 인증에 성공하면 반환받는 인증 코드, 접근 토큰(access token) 발급에 사용
    private String code;

    // 사이트 간 요청 위조 공격을 방지하기 위해 애플리케이션에서 생성한 상태 토큰으로 URL 인코딩을 적용한 값
    private String state;

    // 네이버 로그인 인증에 실패하면 반환받는 에러 코드
    private String error;

    // 네이버 로그인 인증에 실패하면 반환받는 에러 메시지
    private String error_description;

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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    
}
