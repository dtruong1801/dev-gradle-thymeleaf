package com.devops.backend.service;

import com.devops.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by dtruong1801 on 8/28/17.
 */
public interface EmailService {

    /**
     * Send an email with the content in the Feedback Pojo
     * @param feedbackPojo The feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Send an email with the content of the Simple Mail Message object
     * @param message The object containing the email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);

}
