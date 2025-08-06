package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    
    public void sendInvoiceEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

    
    public void sendContactEmail(String name, String email, String messageText) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("zentrade@yopmail.com"); 
        mail.setSubject("New Contact Form Submission from ZENTRADE");
        mail.setText("Name: " + name + "\nEmail: " + email + "\n\nMessage:\n" + messageText);
        mailSender.send(mail);
    }
}

