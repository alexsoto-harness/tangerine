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
        return "<!DOCTYPE html>" +
               "<html lang=\"en\">" +
               "<head>" +
               "<meta charset=\"UTF-8\">" +
               "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
               "<title>Citrus Bank - Online Banking Login</title>" +
               "</head>" +
               "<body>" +
               "<header>" +
               "<div>" +
               "<h1>Citrus Bank</h1>" +
               "<p>Fresh Banking for a Brighter Future</p>" +
               "</div>" +
               "<nav>" +
               "<a href=\"#\">Personal</a> | " +
               "<a href=\"#\">Business</a> | " +
               "<a href=\"#\">About Us</a> | " +
               "<a href=\"#\">Contact</a>" +
               "</nav>" +
               "</header>" +
               "<main>" +
               "<section>" +
               "<h2>Sign In to Online Banking</h2>" +
               "<form>" +
               "<div>" +
               "<label for=\"clientId\">Client ID</label><br>" +
               "<input type=\"text\" id=\"clientId\" name=\"clientId\" placeholder=\"Enter your Client ID\" required>" +
               "</div>" +
               "<br>" +
               "<div>" +
               "<label for=\"pin\">PIN</label><br>" +
               "<input type=\"password\" id=\"pin\" name=\"pin\" placeholder=\"Enter your PIN\" required>" +
               "</div>" +
               "<br>" +
               "<div>" +
               "<input type=\"checkbox\" id=\"rememberMe\" name=\"rememberMe\">" +
               "<label for=\"rememberMe\"> Remember my Client ID</label>" +
               "</div>" +
               "<br>" +
               "<button type=\"submit\">Log In</button>" +
               "</form>" +
               "<p><a href=\"#\">Forgot your Client ID?</a> | <a href=\"#\">Forgot your PIN?</a></p>" +
               "</section>" +
               "<section>" +
               "<h3>New to Citrus Bank?</h3>" +
               "<p>Open an account in minutes and start enjoying:</p>" +
               "<ul>" +
               "<li>No monthly fees on everyday banking</li>" +
               "<li>High-interest savings accounts</li>" +
               "<li>24/7 online and mobile banking</li>" +
               "<li>Free e-Transfers</li>" +
               "</ul>" +
               "<a href=\"#\">Open an Account</a>" +
               "</section>" +
               "<section>" +
               "<h3>Security Notice</h3>" +
               "<p>Citrus Bank will never ask for your full PIN or password via email or phone. " +
               "Always ensure you are on our official website before entering your credentials.</p>" +
               "</section>" +
               "</main>" +
               "<footer>" +
               "<p>&copy; 2026 Citrus Bank. All rights reserved.</p>" +
               "<p>This application was proudly deployed with <strong>Harness.io</strong> - The Modern Software Delivery Platform</p>" +
               "<nav>" +
               "<a href=\"#\">Privacy Policy</a> | " +
               "<a href=\"#\">Terms of Service</a> | " +
               "<a href=\"#\">Accessibility</a> | " +
               "<a href=\"#\">Security</a>" +
               "</nav>" +
               "</footer>" +
               "</body>" +
               "</html>";
    }
}
