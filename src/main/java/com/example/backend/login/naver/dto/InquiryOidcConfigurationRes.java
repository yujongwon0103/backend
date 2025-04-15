package com.example.backend.login.naver.dto;

import java.util.List;

public class InquiryOidcConfigurationRes {
    private String issuer;

    private String authorization_endpoint;

    private String token_endpoint;

    private List<String> token_endpoint_auth_methods_supported;

    private String jwks_uri;

    private String userinfo_endpoint;

    private List<String> response_types_supported;

    private List<String> grant_types_supported;

    private List<String> code_challenge_methods_supported;

    private List<String> subject_types_supported;

    private List<String> id_token_signing_alg_values_supported;

    private List<String> scopes_supported;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAuthorization_endpoint() {
        return authorization_endpoint;
    }

    public void setAuthorization_endpoint(String authorization_endpoint) {
        this.authorization_endpoint = authorization_endpoint;
    }

    public String getToken_endpoint() {
        return token_endpoint;
    }

    public void setToken_endpoint(String token_endpoint) {
        this.token_endpoint = token_endpoint;
    }

    public List<String> getToken_endpoint_auth_methods_supported() {
        return token_endpoint_auth_methods_supported;
    }

    public void setToken_endpoint_auth_methods_supported(List<String> token_endpoint_auth_methods_supported) {
        this.token_endpoint_auth_methods_supported = token_endpoint_auth_methods_supported;
    }

    public String getJwks_uri() {
        return jwks_uri;
    }

    public void setJwks_uri(String jwks_uri) {
        this.jwks_uri = jwks_uri;
    }

    public String getUserinfo_endpoint() {
        return userinfo_endpoint;
    }

    public void setUserinfo_endpoint(String userinfo_endpoint) {
        this.userinfo_endpoint = userinfo_endpoint;
    }

    public List<String> getResponse_types_supported() {
        return response_types_supported;
    }

    public void setResponse_types_supported(List<String> response_types_supported) {
        this.response_types_supported = response_types_supported;
    }

    public List<String> getGrant_types_supported() {
        return grant_types_supported;
    }

    public void setGrant_types_supported(List<String> grant_types_supported) {
        this.grant_types_supported = grant_types_supported;
    }

    public List<String> getCode_challenge_methods_supported() {
        return code_challenge_methods_supported;
    }

    public void setCode_challenge_methods_supported(List<String> code_challenge_methods_supported) {
        this.code_challenge_methods_supported = code_challenge_methods_supported;
    }

    public List<String> getSubject_types_supported() {
        return subject_types_supported;
    }

    public void setSubject_types_supported(List<String> subject_types_supported) {
        this.subject_types_supported = subject_types_supported;
    }

    public List<String> getId_token_signing_alg_values_supported() {
        return id_token_signing_alg_values_supported;
    }

    public void setId_token_signing_alg_values_supported(List<String> id_token_signing_alg_values_supported) {
        this.id_token_signing_alg_values_supported = id_token_signing_alg_values_supported;
    }

    public List<String> getScopes_supported() {
        return scopes_supported;
    }

    public void setScopes_supported(List<String> scopes_supported) {
        this.scopes_supported = scopes_supported;
    }
}
