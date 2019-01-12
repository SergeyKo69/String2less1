package ru.kogut.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Less1Application {

	public static void main(String[] args) {
		SpringApplication.run(Less1Application.class, args);
	}

}

