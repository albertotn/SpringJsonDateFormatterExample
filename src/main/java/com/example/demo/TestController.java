package com.example.demo;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path = "/test")
	public TestModel getTest() {
		TestModel test = new TestModel();
		test.setId(1L);
		Timestamp timestamp = Timestamp.from(Instant.now());
		test.setTimestamp(timestamp);
		test.setIsoTimestamp(timestamp);
		return test;
	}

}
