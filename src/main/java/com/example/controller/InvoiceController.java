package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmailService;

@RestController
@RequestMapping("/api/invoice")
//@CrossOrigin(origins = "*")
public class InvoiceController {

    @Autowired private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<?> sendInvoice(@RequestBody Map<String, Object> data) {
        String email = (String) data.get("email");
        String name = (String) data.get("name");
        String invoiceText = "Hi " + name + ",\n\nHere is your invoice from ZENTRADE...\nThanks!";
        emailService.sendInvoiceEmail(email, "Your ZENTRADE Invoice", invoiceText);
        return ResponseEntity.ok("Invoice sent successfully");
    }
}

