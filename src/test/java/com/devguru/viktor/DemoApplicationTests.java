package com.devguru.viktor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
    @Value("${section}")
    private String section;
	
    @Test
    void testPropertyLoading() {
        System.out.println("App Section: " + section);
    }

}
