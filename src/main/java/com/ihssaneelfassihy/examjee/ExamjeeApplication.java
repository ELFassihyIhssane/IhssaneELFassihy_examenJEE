package com.ihssaneelfassihy.examjee;

import com.ihssaneelfassihy.examjee.dao.entities.Organisateur;
import com.ihssaneelfassihy.examjee.dao.repositories.OrganisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class ExamjeeApplication implements CommandLineRunner {
    private OrganisateurRepository organisateurRepository;
	public static void main(String[] args) {
		SpringApplication.run(ExamjeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Organisateur organisateur = new Organisateur(null,"Ihssane","ihssane@elfassihy.com",null);
		organisateurRepository.save(organisateur);
		System.out.println(organisateur + " Enregistrement Avec Sucees");
	}

}
