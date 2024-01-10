package com.lopez.pedro.payroll;

import com.lopez.pedro.payroll.entity.Manager;
import com.lopez.pedro.payroll.entity.Branch;
import com.lopez.pedro.payroll.repository.ManagerRepository;
import com.lopez.pedro.payroll.repository.BranchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sprint5ExtraSpringBootDataApplication {

	public static void main(String[] args) {SpringApplication.run(Sprint5ExtraSpringBootDataApplication.class, args);}

	@Bean
	CommandLineRunner initDataDemo (BranchRepository branchRepository, ManagerRepository managerRepository) {
		return args -> {
			Manager manager = managerRepository.save(new Manager("Rulfo"));
			Manager manager2 = managerRepository.save(new Manager("Bye"));

			branchRepository.save(new Branch("Collegium", "Harmonic", manager2));
			branchRepository.save(new Branch("Brio", "Fully", manager));
		};
	}



}
