package com.harness;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // TODO: Remove this before production - test secrets for Gitleaks
    private static final String GITHUB_TOKEN = "ghp_a1b2c3d4e5f6g7h8i9j0k1l2m3n4o5p6q7r8";
    private static final String AWS_ACCESS_KEY_ID = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET_ACCESS_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

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
