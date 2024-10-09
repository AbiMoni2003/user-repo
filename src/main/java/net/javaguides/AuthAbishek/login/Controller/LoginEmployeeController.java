package net.javaguides.AuthAbishek.login.Controller;

import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import net.javaguides.AuthAbishek.login.Repository.LoginEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Abishek")
public class LoginEmployeeController {
    @Autowired
    private LoginEmployeeRepository loginEmployeeRepository;

    @PostMapping("/createemployee")
    public LoginEmployee createEmployee(@RequestBody LoginEmployee loginEmployee) {
        return loginEmployeeRepository.save(loginEmployee);
    }

}


