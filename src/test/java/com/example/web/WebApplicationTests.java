package com.example.web;

import com.example.web.controller.WhatController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@WebMvcTest
@AutoConfigureMockMvc
class WebApplicationTests {


	@Autowired
	WhatController whatController;

	@Autowired
	private MockMvc mvc;

//	@Autowired
//	private TestRestTemplate testRestTemplate;

	@Test
	void app() {

	}

	@Test
	void contextLoads() {
		assertThat(whatController).isNotNull();
	}

	@Test
	void assertOneIsOneTest() {
		assertThat(1).isEqualTo(2-1);
	}

	@Test
	void assertTwoIsntOneTest() {
		assertThat(2).isNotEqualTo(1);
	}

	@Test
	void getControllerTest() throws Exception {

		mvc.perform(
				MockMvcRequestBuilders
						.get("/asd"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("a")));

	}

	@Test
	void getControllerTestRestTemplateTest() {

//		String res = testRestTemplate.getForObject("http://localhost:8080" + "/asd",
//				String.class);
//
//
//		assertThat(res).contains("aaaa");

	}

}
