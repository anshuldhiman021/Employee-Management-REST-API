package com.example.EmployeData.repo;
import com.example.EmployeData.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}