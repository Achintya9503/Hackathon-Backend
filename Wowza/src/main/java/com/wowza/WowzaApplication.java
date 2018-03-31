package com.wowza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.wowza.repository")
@EntityScan("com.wowza.model")
public class WowzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WowzaApplication.class, args);
	}
}
