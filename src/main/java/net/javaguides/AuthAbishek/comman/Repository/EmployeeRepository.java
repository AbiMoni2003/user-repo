package net.javaguides.AuthAbishek.comman.Repository;

import net.javaguides.AuthAbishek.comman.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
