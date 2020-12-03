package miu.edu.restfulemployee.controller;

import miu.edu.restfulemployee.domain.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
public class EmployeeRestController {

    //@CrossOrigin(value = {"http://localhost:9000"}, maxAge = 5000)
    @PostMapping("/employees")
    public Employee addEmployee(@Valid @RequestBody Employee employee){
        System.out.println(employee);
        //save to DB

        return employee;
    }
}
