package com.example.EmployeeManagementSystem.service.impl;

import com.example.EmployeeManagementSystem.dto.EmployeeDto;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.service.EmployeeService;
import com.example.EmployeeManagementSystem.exception.ResourceNotFoundException;
import com.example.EmployeeManagementSystem.mapper.EmployeeMapper;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exists with the given id : " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map((e) ->  EmployeeMapper.mapToEmployeeDto(e)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployeeDto) {
        Employee employee =  employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exists with the given id : " + employeeId));
        employee.setFirstName(updatedEmployeeDto.getFirstName());
        employee.setLastName(updatedEmployeeDto.getLastName());
        employee.setEmail(updatedEmployeeDto.getEmail());

        Employee updatedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee =  employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exists with the given id : " + employeeId));
        employeeRepository.deleteById(employeeId);
    }
}