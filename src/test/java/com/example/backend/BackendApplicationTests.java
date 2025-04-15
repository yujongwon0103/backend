package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.backend.login.naver.service.NaverLoginService;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private NaverLoginService naverLoginService;

	@Test
	void issueJwkKeyTest() {
		naverLoginService.issueJwkKey();
	}

}
