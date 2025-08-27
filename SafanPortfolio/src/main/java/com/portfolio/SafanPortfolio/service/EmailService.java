package com.portfolio.SafanPortfolio.service;



import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendContactEmail(String fromEmail, String name, String subject, String message) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("rahsafan007@gmail.com");
        email.setSubject("Portfolio Contact: " + subject);
        email.setText("Name: " + name + "\nEmail: " + fromEmail + "\n\nMessage:\n" + message);
        email.setFrom(fromEmail);

        mailSender.send(email);
    }
}
