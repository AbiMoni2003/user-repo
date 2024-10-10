package net.javaguides.AuthAbishek.login.Controller;

import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import net.javaguides.AuthAbishek.login.Exception.LoginResourceNotFoundException;
import net.javaguides.AuthAbishek.login.Repository.LoginEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/update")
public class UpdateController {
    @Autowired
    private LoginEmployeeRepository loginEmployeeRepository;

    @GetMapping
    public List<LoginEmployee> getAllEmployees() {
        return loginEmployeeRepository.findAll();
    }

@PutMapping("/{id}")
    public ResponseEntity<LoginEmployee> updateEmployee(@PathVariable Long id,@RequestBody LoginEmployee loginEmployee){
        LoginEmployee existingEmployee=loginEmployeeRepository.findById(id)
                .orElseThrow(()->new LoginResourceNotFoundException("Id not found"+id));

        existingEmployee.setUserName(loginEmployee.getUserName());
        existingEmployee.setEmailId(loginEmployee.getEmailId());
        existingEmployee.setPhoneNumber(loginEmployee.getPhoneNumber());
        existingEmployee.setPassword(loginEmployee.getPassword());

        LoginEmployee updatedemployee=loginEmployeeRepository.save(existingEmployee);
        return ResponseEntity.ok(updatedemployee);
    }
}
