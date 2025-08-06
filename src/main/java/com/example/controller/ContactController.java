package com.example.controller;

import com.example.dto.ContactRequest;
import com.example.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> handleContact(@RequestBody ContactRequest request) {
        emailService.sendContactEmail(request.getName(), request.getEmail(), request.getMessage());
        return ResponseEntity.ok("Message sent to company email");
    }
}
