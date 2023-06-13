package com.makam.basicrestapi.controller;

import com.makam.basicrestapi.model.EmployeeJSON;
import com.makam.basicrestapi.service.EmployeeJSONService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeJSONController {

    private EmployeeJSONService employeeJSONService;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeJSONController.class);

    @Autowired
    public EmployeeJSONController(EmployeeJSONService employeeJSONService) {
        this.employeeJSONService = employeeJSONService;
    }

    @GetMapping("/employeeTag")
    public List<EmployeeJSON> getEmployeeJSONList(@RequestParam(required = false) List<String> tags){
        logger.info("Tags: " + tags);
        if(tags != null) {
            return this.employeeJSONService.getEmployees(tags);
        }
        else {
            return this.employeeJSONService.getEmployees();
        }
    }

}
