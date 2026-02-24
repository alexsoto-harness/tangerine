package com.harness;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // TODO: Remove this before production - test secret for Gitleaks
    private static final String AWS_ACCESS_KEY_ID = "AKIAZ7FAKE9TESTKEYID";
    private static final String AWS_SECRET_KEY = "wJalrXUtnFEMI7FAKE9bPxRfiCYSECRETKEY1234";

    @GetMapping("/")
    public String home() {
        String projectName = "Tangerine Spring Boot Sample";
        String projectDescription = "A Spring Boot microservice";

        return "<html>" +
               "<head>" +
               "<title>Welcome to the " + projectName + " application!</title>" +
               "</head>" +
               "<body>" +
               "<h1>Welcome to the " + projectName + " application!</h1>" +
               "<p>This application was built and deployed with <strong>Harness</strong>.</p>" +
               "<h2>Project Details</h2>" +
               "<ul>" +
               "<li><strong>Project Name:</strong> " + projectName + "</li>" +
               "<li><strong>Project Description:</strong> " + projectDescription + "</li>" +
               "</ul>" +
               "</body>" +
               "</html>";
    }
}
