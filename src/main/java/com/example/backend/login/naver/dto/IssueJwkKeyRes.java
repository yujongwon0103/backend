package com.example.backend.login.naver.dto;

import java.util.List;

public class IssueJwkKeyRes {
    private List<JwkKey> keys;

    public List<JwkKey> getKeys() {
        return keys;
    }

    public void setKeys(List<JwkKey> keys) {
        this.keys = keys;
    }
}
