package com.exemple.employee_register.employee.Controllers;

import com.exemple.employee_register.employee.Models.EmployeeModel;
import com.exemple.employee_register.employee.Services.EmployeeService;
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
    public ResponseEntity<EmployeeModel> findEmployeeById(@PathVariable UUID id) {
        return employeeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
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
