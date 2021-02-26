package by.alexander.employment.service;

import by.alexander.employment.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee findEmployeeById(Long id);

    List<Employee> findAllEmployees();

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
