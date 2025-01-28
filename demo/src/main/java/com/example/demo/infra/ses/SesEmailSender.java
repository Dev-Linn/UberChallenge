package com.example.demo.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.example.demo.adpters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void SendEmail(String to, String subject, String body) {
        SendEmailRequest sendEmailRequest = new SendEmailRequest()
                .withSource("lramain3636@gmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message().withSubject(new Content(subject)).withBody(new Body().withText(new Content(body))));
        try {
            this.amazonSimpleEmailService.sendEmail(sendEmailRequest);
        } catch (AmazonServiceException e) {
                throw new EmailServiceException("Failure while sending email");
        }
    }
}
