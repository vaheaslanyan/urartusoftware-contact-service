package com.urartusoftware.urartusoftwarecontactservice;

import com.urartusoftware.urartusoftwarecontactservice.repositories.ContactRequestRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class UrartusoftwareContactServiceApplication {

	ContactRequestRepository crRepository;
	public static void main(String[] args) {
		SpringApplication.run(UrartusoftwareContactServiceApplication.class, args);
	}

}
