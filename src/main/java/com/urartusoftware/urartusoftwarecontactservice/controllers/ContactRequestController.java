package com.urartusoftware.urartusoftwarecontactservice.controllers;

import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequest;
import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequestDTO;
import com.urartusoftware.urartusoftwarecontactservice.models.EmailDetails;
import com.urartusoftware.urartusoftwarecontactservice.services.ContactRequestService;
import com.urartusoftware.urartusoftwarecontactservice.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact-requests")
public class ContactRequestController {
    private final ContactRequestService crService;
    private final EmailService emailService;

    @Autowired
    public ContactRequestController(ContactRequestService crService, EmailService emailService) {
        this.crService = crService;
        this.emailService = emailService;
    }

    @PostMapping
    public ContactRequest createRequest(@RequestBody final ContactRequestDTO crDTO) {
        EmailDetails ed = new EmailDetails();
        ed.setSubject("New contact request from " + crDTO.getName());
        ed.setRecipient("vahe.sde@gmail.com");
        ed.setMsgBody("You have a new contact request: \n\n" +
                "Name: " + crDTO.getName() + "\n" +
                "Email: " + crDTO.getEmail() + "\n" +
                "Phone: " + crDTO.getPhone() + "\n" +
                "Website: " + crDTO.getWebsiteUrl() + "\n" +
                "Description: " + crDTO.getProjectDescription() + "\n" +
                "Budget: " + crDTO.getBudget() + "\n" +
                "Business source: " + crDTO.getBusinessSource());

        emailService.sendSimpleMail(ed);
        return crService.createContactRequest(crDTO);
    }
}
