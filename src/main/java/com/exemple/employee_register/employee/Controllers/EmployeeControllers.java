package com.exemple.employee_register.employee.Controllers;

import com.exemple.employee_register.employee.Models.EmployeeModel;
import com.exemple.employee_register.employee.Services.EmployeeService;
import com.exemple.employee_register.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/employee")
public class EmployeeControllers {


    private final EmployeeService employeeService;

    public EmployeeControllers(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeModel> findAllEmployee() {
        return this.employeeService.FindAll();
    }


    // @PathVariable recebe valores diretamente da URL como parâmetros
    @GetMapping("/{id}")
    public ResponseEntity<?> findEmployeeById(@PathVariable UUID id) {

        EmployeeModel employee = employeeService.findById(id);
        return ResponseEntity.ok(employee);

    }


    @PostMapping
    public EmployeeModel registerEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.create(employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable UUID id) {
        employeeService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
