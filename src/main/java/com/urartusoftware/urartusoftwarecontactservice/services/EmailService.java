package com.urartusoftware.urartusoftwarecontactservice.services;

import com.urartusoftware.urartusoftwarecontactservice.models.EmailDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailService implements EmailServiceInterface {

    private JavaMailSender jms;

    public EmailService(JavaMailSender jms) {
        this.jms = jms;
    }

    @Value("${spring.mail.username}")
    private String sender;

    public boolean sendSimpleMail(EmailDetails details) {

        // Try block to check for exceptions
        try {
            // Creating a simple mail message
            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();

            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());

            // Sending the mail
            jms.send(mailMessage);
        } catch (Exception e) {
            // NEED TO LOG
            System.out.println(e);
            return false;
        }
        return true;
    }
}
