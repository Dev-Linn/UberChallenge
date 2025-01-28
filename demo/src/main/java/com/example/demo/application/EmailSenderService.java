package com.example.demo.application;

import com.example.demo.adpters.EmailSenderGateway;
import com.example.demo.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUserCase {


    private EmailSenderGateway emailSenderGateway;
    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void SendEmail(String to, String subject, String body) {
        this.emailSenderGateway.SendEmail(to, subject, body);
    }
}
