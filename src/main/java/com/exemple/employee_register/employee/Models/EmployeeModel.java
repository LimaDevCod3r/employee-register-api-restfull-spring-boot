package com.exemple.employee_register.employee.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "employees")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    private String position;

    private String department;

    @Column(precision = 10, scale = 2)
    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status = CustomerStatus.ACTIVE;

    @Column(name = "date_of_termination", nullable = true)
    private LocalDate dateOfTermination;

    private String Address;

    private String CPF;


    public EmployeeModel() {
    }

    public EmployeeModel(UUID id, String firstName, String lastName, String phoneNumber, LocalDate hireDate, String position, String department, BigDecimal salary, CustomerStatus status, LocalDate dateOfTermination, String address, String CPF) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.status = status;
        this.dateOfTermination = dateOfTermination;
        Address = address;
        this.CPF = CPF;
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LocalDate getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(LocalDate dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

}


