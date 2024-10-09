package net.javaguides.AuthAbishek.common.Repository;

import net.javaguides.AuthAbishek.common.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
