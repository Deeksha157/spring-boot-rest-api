package com.makam.basicrestapi.model;

public class Employee {
     private int id;
     private String name;
     private int age;
     private String location;
     private String department;

     public Employee(int id, String name, int age, String location, String department){
          this.id = id;
          this.name = name;
          this.age = age;
          this.location = location;
          this.department = department;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getLocation() {
          return location;
     }

     public void setLocation(String location) {
          this.location = location;
     }

     public String getDepartment() {
          return department;
     }

     public void setDepartment(String department) {
          this.department = department;
     }
}
