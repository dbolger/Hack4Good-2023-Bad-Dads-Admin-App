package com.baddads;

import com.baddads.entities.usermanagement.user.Dad;
import com.baddads.entities.usermanagement.staff.StaffMember;
import com.baddads.repository.DadRepository;
import com.baddads.repository.StaffMemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@SpringBootApplication
@ComponentScan
public class AdminApplication {

	private static final Logger log = LoggerFactory.getLogger(AdminApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

	@Bean
	CommandLineRunner initAdminDatabase(StaffMemberRepository staffMemberRepo, DadRepository dadRepo) {
		return args -> {
			if (staffMemberRepo.findByFirstNameAndLastName("Dylan", "Bolger").isEmpty()) {
				log.info("Preloading " + staffMemberRepo.save(new StaffMember("Dylan", "Bolger", "dbolger")));
			} else {
				log.info("Found existing StaffMember: " + staffMemberRepo.findByFirstNameAndLastName("Dylan", "Bolger").get(0).getFirstName());
			}
			if (dadRepo.findByFirstNameAndLastName("John", "Doe").isEmpty()) {
				log.info("Preloading " + dadRepo.save(new Dad("John", "Doe")));
			} else {
				log.info("Found existing Dad: " + dadRepo.findByFirstNameAndLastName("John", "Doe").get(0));
			}
        };
	}

}
