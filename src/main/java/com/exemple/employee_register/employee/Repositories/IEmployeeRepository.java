package com.exemple.employee_register.employee.repositories;

import com.exemple.employee_register.employee.Models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeModel, UUID> {
}
