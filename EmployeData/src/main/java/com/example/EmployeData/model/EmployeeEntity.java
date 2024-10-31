package com.example.EmployeData.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Entity
@Table(name = "employees")
@Data
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 1, message = "Name cannot be empty")
    private String name;

    @NotNull(message = "Designation cannot be null")
    @Size(min = 2, message = "Designation must be at least 2 characters long")
    private String designation;

    @NotNull(message = "Salary cannot be null")
    @Min(value = 1, message = "Salary must be greater than 0")
    private double salary;

}