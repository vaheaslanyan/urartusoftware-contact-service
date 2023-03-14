package com.urartusoftware.urartusoftwarecontactservice.controllers;

import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequest;
import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequestDTO;
import com.urartusoftware.urartusoftwarecontactservice.services.ContactRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact-requests")
public class ContactRequestController {
    private final ContactRequestService crService;

    @Autowired
    public ContactRequestController(ContactRequestService crService) {
        this.crService = crService;
    }

    @PostMapping
    public ContactRequest createRequest(@RequestBody final ContactRequestDTO crDTO) {
        return crService.createContactRequest(crDTO);
    }
}
