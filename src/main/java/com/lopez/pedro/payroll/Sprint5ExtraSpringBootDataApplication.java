package com.lopez.pedro.payroll;

import com.lopez.pedro.payroll.entity.Manager;
import com.lopez.pedro.payroll.entity.Sucursal;
import com.lopez.pedro.payroll.repository.ManagerRepository;
import com.lopez.pedro.payroll.repository.SucursalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sprint5ExtraSpringBootDataApplication {

	public static void main(String[] args) {SpringApplication.run(Sprint5ExtraSpringBootDataApplication.class, args);}

	@Bean
	CommandLineRunner initDataDemo (SucursalRepository surcursalRepository,
									ManagerRepository managerRepository) {
		return args -> {
			Manager manager = managerRepository.save(new Manager("Rulfo"));
			surcursalRepository.save(new Sucursal("Collegium", "Harmonic", manager));
			surcursalRepository.save(new Sucursal("Brio", "Fully", manager));
		};
	}



}
