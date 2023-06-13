package com.makam.basicrestapi.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

@Configuration
public class EmployeeJSONConfig {

    @Bean
    public List<EmployeeJSON> employeeJSONList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource("assets/employee.json");
        return objectMapper.readValue(resource.getFile(), new TypeReference<List<EmployeeJSON>>() {
        });
    }
}
