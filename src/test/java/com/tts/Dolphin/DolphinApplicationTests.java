package com.tts.Dolphin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.tts.Dolphin.controller.DolphinController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DolphinApplicationTests {

	@LocalServerPort
	private int port;
	
	@Autowired
	private DolphinController controller;
	
	@Autowired 
	private TestRestTemplate restTemplate;
	
	@Test
	void contextLoads() {
		assertNotNull(controller);
	}
	
	@Test
	void checkingRequests() throws Exception{
		assertThat(this.restTemplate.getForObject("http://localhost:" +port+"/", String.class))
			.contains("dolphin");
	}

}
