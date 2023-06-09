package com.makam.basicrestapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

    private static final Logger logger = LoggerFactory.getLogger(Employee.class);

    @GetMapping("/basic-get")

    public String basicApi(@RequestParam int id, @RequestParam String name, @RequestParam String role, @RequestParam String location) {
        logger.info("Request parameters: id= " + id + "; name= "+ name + "; role= " + role +"; location= "+ location);
        return "success";
    }
}
