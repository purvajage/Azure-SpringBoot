package com.example.springbootazureapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootazureapp.repository.EmployeeRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.springbootazureapp.model.Employee;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
@Autowired
private EmployeeRepo employeeRepo;
@GetMapping("/getEmployee")
public List<Employee> getAll(){
    return employeeRepo.findAll();
}
@PostMapping("/createEmployee")
public Employee create(@RequestBody Employee employee) {
    return employeeRepo.save(employee);
}
@PutMapping("/updateEmployee")
public Employee update(@RequestBody Employee employee) {
    return employeeRepo.save(employee);
}
@DeleteMapping("/deleteEmployee")
public void delete(@RequestParam int id){
    employeeRepo.deleteById((long) id);
}

}


