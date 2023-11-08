package com.example.restapi;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RestApiApplicationForStudentAndSubjectApplicationTests {


    private TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void applicationStartsAndRespondsToHttpRequests() {
        String url = "http://localhost:" + 8080 + "/"; // Change this URL according to your application's endpoints

    }
}
