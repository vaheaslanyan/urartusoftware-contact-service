package com.urartusoftware.urartusoftwarecontactservice.services;

import com.urartusoftware.urartusoftwarecontactservice.models.EmailDetails;

public interface EmailServiceInterface {
    boolean sendSimpleMail(EmailDetails details);
}
