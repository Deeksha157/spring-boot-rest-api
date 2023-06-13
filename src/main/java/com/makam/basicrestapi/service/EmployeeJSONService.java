package com.makam.basicrestapi.service;

import com.makam.basicrestapi.model.EmployeeJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeJSONService {

    private List<EmployeeJSON> employees;

    @Autowired
    public EmployeeJSONService(List<EmployeeJSON> employeeJSONList){
        this.employees = employeeJSONList;
    }

    public List<EmployeeJSON> getEmployees(List<String> tags) {

        List<EmployeeJSON> emp = new ArrayList<>();

        for (EmployeeJSON employeeJSON : employees){
            List<String> empTags = employeeJSON.getTags();
            if(empTags.containsAll(tags)){
                emp.add(employeeJSON);
            }
        }
        return emp;
    }

    public List<EmployeeJSON> getEmployees() {
        return employees;
    }
}
