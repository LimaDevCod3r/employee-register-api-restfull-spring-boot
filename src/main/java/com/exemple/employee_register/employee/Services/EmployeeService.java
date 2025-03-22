package com.exemple.employee_register.employee.Services;

import com.exemple.employee_register.employee.Models.EmployeeModel;
import com.exemple.employee_register.employee.repositories.IEmployeeRepository;
import com.exemple.employee_register.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {


    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeModel> FindAll() {
        return this.employeeRepository.findAll();
    }

    public EmployeeModel findById(UUID id) {
        return this.employeeRepository.findById(id).orElseThrow(() -> new NotFoundException("Employee not found"));
    }

    public EmployeeModel create(EmployeeModel employee) {
        return this.employeeRepository.save(employee);
    }

    public void delete(UUID id) {

        if (!employeeRepository.existsById(id)) {
            throw new NotFoundException("Employee not found");
        }
        this.employeeRepository.deleteById(id);
    }
}
