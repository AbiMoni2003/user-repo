package net.javaguides.AuthAbishek.login.Controller;

import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import net.javaguides.AuthAbishek.login.Exception.LoginResourceNotFoundException;
import net.javaguides.AuthAbishek.login.Repository.LoginEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/get")
public class GetidController {
    @Autowired
    LoginEmployeeRepository loginEmployeeRepository;

    @GetMapping
    public List<LoginEmployee> getAllEmployees() {
        return loginEmployeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoginEmployee> getemplyeebyid(@PathVariable Long id){
        LoginEmployee loginEmployee=loginEmployeeRepository.findById(id)
                .orElseThrow(()->new LoginResourceNotFoundException("Id is not found"+id));
        return ResponseEntity.ok(loginEmployee);
    }
}
