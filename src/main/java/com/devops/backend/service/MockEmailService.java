package com.devops.backend.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by dtruong1801 on 8/28/17.
 */
public class MockEmailService extends AbstractEmailService {

     /** the application logger */
     private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        LOG.debug("Simulating and email service....");
        LOG.info(message.toString());
        LOG.debug("Email sent");
    }
}