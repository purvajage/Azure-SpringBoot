package com.example.springbootazureapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootazureapp.model.Employee;
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
}
