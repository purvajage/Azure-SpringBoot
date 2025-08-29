package com.example.springbootazureapp.repository;
import com.example.springbootazureapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
}
