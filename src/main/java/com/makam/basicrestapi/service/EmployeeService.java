package com.makam.basicrestapi.service;

import com.makam.basicrestapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeList;

    public EmployeeService(){
        employeeList = new ArrayList<>();

        Employee emp1 = new Employee(1, "John", 30, "USA", "Development");
        Employee emp2 = new Employee(2, "Taylor", 40, "NYC", "Development");
        Employee emp3 = new Employee(3, "Swift", 50,  "BER", "Development");

        employeeList.addAll(Arrays.asList(emp1, emp2, emp3));
    }
    public Employee getEmployee(int id) {
        for(Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
