package net.javaguides.AuthAbishek.login.Repository;

import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginEmployeeRepository extends JpaRepository<LoginEmployee, Long> {
   // Method to check if a phone number exists
   // boolean existsByPhoneNumber(String phoneNumber);
   // Optional<LoginEmployee> findByphonenumber(String PhoneNumber);
}
