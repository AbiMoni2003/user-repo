package net.javaguides.AuthAbishek.login.Repository;

import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginEmployeeRepository extends JpaRepository<LoginEmployee, Long> {

}
