package net.javaguides.AuthAbishek;


import net.javaguides.AuthAbishek.common.Repository.EmployeeRepository;
import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthAbishek {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		System.out.println("Abishek");
		SpringApplication.run(AuthAbishek.class, args);
	}

}
