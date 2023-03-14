package com.urartusoftware.urartusoftwarecontactservice.repositories;

import com.urartusoftware.urartusoftwarecontactservice.models.ContactRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRequestRepository extends MongoRepository<ContactRequest, String> {
}
