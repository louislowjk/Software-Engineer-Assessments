package com.ryde;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ryde.DTO.UserDTO;
import com.ryde.Service.UserService;

@SpringBootApplication
public class SoftwareEngineerAssessmentApplication implements CommandLineRunner {
	@Autowired
	UserService service;

	public static void main(String[] args) {
		SpringApplication.run(SoftwareEngineerAssessmentApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
