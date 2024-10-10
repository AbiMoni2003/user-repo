package net.javaguides.AuthAbishek.login.Controller;

import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import net.javaguides.AuthAbishek.login.Repository.LoginEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/signin")
public class SigninEmployeeController {
    @Autowired
    private LoginEmployeeRepository loginEmployeeRepository;

    @GetMapping
    public List<LoginEmployee> getAllEmployees() {
        return loginEmployeeRepository.findAll();
    }

    @PostMapping("/post")
    public LoginEmployee signIn(@RequestBody LoginEmployee loginEmployee) {
        // Check if the phone number exists
//        if (loginEmployeeRepository.existsByPhoneNumber(loginEmployee.getPhoneNumber())) {
//            return ResponseEntity.status(HttpStatus.CONFLICT)
//                    .body("Phone number already exists."); // 409 Conflict
//        }
//
//        // Save the employee details if the phone number does not exist
//        LoginEmployee savedEmployee = loginEmployeeRepository.save(loginEmployee);
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body("Employee signed in with ID: " + savedEmployee.getId()); // 201 Created
//    }
        return loginEmployeeRepository.save(loginEmployee);
    }
}
