package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DemoApplicationTests {

    @Autowired
    TestController controller;
    
    TestModel model;
  
    @BeforeAll
    void setup() {
      model = controller.getTest();
    }
    
	@Test
	void testNotNull() {
	  assertThat(model!=null);
	}
	
	@Test
	void testValuesNotNull() {
	  assertThat(model.getTimestamp()!=null);
	  assertThat(model.getIsoTimestamp()!=null);
	}
	
}
