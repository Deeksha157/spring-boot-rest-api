package com.makam.basicrestapi.controller;


import com.makam.basicrestapi.model.Employee;
import com.makam.basicrestapi.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/basic-get")
    public String basicApi(@RequestParam int id, @RequestParam String name, @RequestParam String role, @RequestParam String location) {
        logger.info("Request parameters: id= " + id + "; name= "+ name + "; role= " + role +"; location= "+ location);
        return "success";
    }

    @GetMapping("/employee")
    public Employee getModel(@RequestParam int id){
        return employeeService.getEmployee(id);
    }

}
