package com.exemple.employee_register.employee.Services;

import com.exemple.employee_register.employee.Models.EmployeeModel;
import com.exemple.employee_register.employee.repositories.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }

    public List<EmployeeModel> FindAllEmployee() {
        return this.employeeRepository.findAll();
    }

}
