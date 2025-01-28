package com.example.demo.adpters;

public interface EmailSenderGateway {
    void SendEmail(String to, String subject, String body);
}
