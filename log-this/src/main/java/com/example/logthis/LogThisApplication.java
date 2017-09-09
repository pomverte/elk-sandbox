package com.example.logthis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class LogThisApplication {

    @Bean
    public CommandLineRunner clr() {
        return args -> {
            while (true) {
                log.info("Hey I just met you ...");
            }
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(LogThisApplication.class, args);
	}
}
