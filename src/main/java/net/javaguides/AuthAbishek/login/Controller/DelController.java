package net.javaguides.AuthAbishek.login.Controller;


import net.javaguides.AuthAbishek.login.Entity.LoginEmployee;
import net.javaguides.AuthAbishek.login.Exception.LoginResourceNotFoundException;
import net.javaguides.AuthAbishek.login.Repository.LoginEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/delete")
public class DelController {
    @Autowired
    private LoginEmployeeRepository loginEmployeeRepository;

    @GetMapping
    public List<LoginEmployee> getAllEmployees() {
        return loginEmployeeRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletelogin(@PathVariable Long id){
        LoginEmployee exisistemployee=loginEmployeeRepository.findById(id)
                .orElseThrow(()->new LoginResourceNotFoundException("Id is not found"+id));
        loginEmployeeRepository.delete(exisistemployee);
        return ResponseEntity.noContent().build();

    }

}