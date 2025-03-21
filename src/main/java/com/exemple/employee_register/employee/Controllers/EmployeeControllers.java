package com.exemple.employee_register.employee.Controllers;

import com.exemple.employee_register.employee.Models.EmployeeModel;
import com.exemple.employee_register.employee.Services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeControllers {


    private final EmployeeService employeeService;

    public EmployeeControllers(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeModel> getOneEmployee() {
        return this.employeeService.FindAllEmployee();
    }
}
