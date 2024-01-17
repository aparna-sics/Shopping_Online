package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

   EmployeeDto createEmployee(EmployeeDto employeeDto);
   EmployeeDto getEmployeeById(Long id);
   List<EmployeeDto> getAllEmployee();
   EmployeeDto updateEmployee(Long id,EmployeeDto updatedEmployee);
   void deleteEmployee(Long id);

}
