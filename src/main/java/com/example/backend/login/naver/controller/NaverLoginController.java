package com.example.backend.login.naver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.login.naver.dto.CallProfileApiRes;
import com.example.backend.login.naver.dto.CreateNaverLoginUrlReq;
import com.example.backend.login.naver.dto.CreateNaverLoginUrlRes;
import com.example.backend.login.naver.dto.InquiryOidcConfigurationRes;
import com.example.backend.login.naver.dto.IssueJwkKeyRes;
import com.example.backend.login.naver.dto.RequestAccessTokenReq;
import com.example.backend.login.naver.dto.RequestAccessTokenRes;
import com.example.backend.login.naver.dto.VerifyUserAcceptProfileAuthorityRes;
import com.example.backend.login.naver.service.NaverLoginService;


@RestController
@RequestMapping(value = "/login/naver")
public class NaverLoginController {

    @Autowired
    private NaverLoginService naverLoginService;
    
    /**
     * 네이버 로그인 연동 URL 생성하기
     * @param req
     * @return
     */
    @GetMapping(value = "/createNaverLoginUrl")
    public CreateNaverLoginUrlRes createNaverLoginUrl(@RequestBody CreateNaverLoginUrlReq req) {
        CreateNaverLoginUrlRes res = naverLoginService.createNaverLoginUrl(req);
        return res;
    }

    /**
     * 접근 토큰 발급 요청
     * @param req
     * @return
     */
    @GetMapping(value = "/requestAccessToken")
    public RequestAccessTokenRes requestAccessToken(@RequestBody RequestAccessTokenReq req) {
        RequestAccessTokenRes res = naverLoginService.requestAccessToken(req);
        return res;
    }

    /**
     * 접근 토큰을 이용하여 프로필 API 호출하기
     * @return
     */
    @GetMapping(value = "/callProfileApi")
    public CallProfileApiRes callProfileApi() {
        CallProfileApiRes res = naverLoginService.callProfileApi();
        return res;
    }

    /**
     * 접근 토큰을 이용하여 사용자 허용 프로필 권한 확인하기
     * @return
     */
    @GetMapping(value = "/verifyUserAcceptProfileAuthority")
    public VerifyUserAcceptProfileAuthorityRes verifyUserAcceptProfileAuthority() {
        VerifyUserAcceptProfileAuthorityRes res = naverLoginService.verifyUserAcceptProfileAuthority();
        return res;
    }

    /**
     * OIDC configuration 정보 조회
     * @return
     */
    @GetMapping(value = "/inquiryOidcConfiguration")
    public InquiryOidcConfigurationRes inquiryOidcConfiguration() {
        InquiryOidcConfigurationRes res = naverLoginService.inquiryOidcConfiguration();
        return res;
    }

    /**
     * jwk key 발급
     * @return
     */
    @GetMapping(value = "/issueJwkKey")
    public IssueJwkKeyRes issueJwkKey() {
        IssueJwkKeyRes res = naverLoginService.issueJwkKey();
        return res;
    }
}
