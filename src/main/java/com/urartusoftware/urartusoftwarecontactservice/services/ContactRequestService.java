package com.urartusoftware.urartusoftwarecontactservice.services;

import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequest;
import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequestDTO;
import com.urartusoftware.urartusoftwarecontactservice.repositories.ContactRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactRequestService {
    private final ContactRequestRepository crRepository;

    @Autowired
    public ContactRequestService(ContactRequestRepository crRepository) {
        this.crRepository = crRepository;
    }

    public ContactRequest createContactRequest(ContactRequestDTO crDTO) {
        ContactRequest cr = new ContactRequest(crDTO);
        return crRepository.save(cr);
    }
}
