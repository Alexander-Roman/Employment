package by.alexander.employment.service;

import by.alexander.employment.model.Employee;
import by.alexander.employment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        UUID uuid = UUID.randomUUID();
        String code = uuid.toString();
        Employee changed = Employee.Builder.from(employee)
                .setCode(code)
                .build();
        return employeeRepository.save(changed);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        Optional<Employee> found = employeeRepository.findById(id);
        return found.orElseThrow(
                () -> new EntityNotFoundException("Employee with specified ID is not found! ID: " + id)
        );
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}