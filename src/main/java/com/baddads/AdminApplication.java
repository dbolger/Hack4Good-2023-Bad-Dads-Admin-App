package com.baddads;

import com.baddads.entities.usermanagement.Admin;
import com.baddads.repository.AdminRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@SpringBootApplication
public class AdminApplication {

	private static final Logger log = LoggerFactory.getLogger(AdminApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

	@Bean
	CommandLineRunner initAdminDatabase(AdminRepository repository) {
		return args -> {
            log.info("Preloading " + repository.save(new Admin("Dylan", "Bolger", "dbolger")));
        };
	}

}
