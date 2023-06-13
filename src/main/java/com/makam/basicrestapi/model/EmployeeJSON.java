package com.makam.basicrestapi.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

public class EmployeeJSON {
   private int id;
   private String role;
   private String firstName;
   private String lastName;
   private String preferredFullName;
   private String employeeCode;
   private String region;
   private String phone;
   private String email;
   private List<String> tags;
   private Address address;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getPreferredFullName() {
      return preferredFullName;
   }

   public void setPreferredFullName(String preferredFullName) {
      this.preferredFullName = preferredFullName;
   }

   public String getEmployeeCode() {
      return employeeCode;
   }

   public void setEmployeeCode(String employeeCode) {
      this.employeeCode = employeeCode;
   }

   public String getRegion() {
      return region;
   }

   public void setRegion(String region) {
      this.region = region;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public List<String> getTags() {
      return tags;
   }

   public void setTags(List<String> tags) {
      this.tags = tags;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   public static class Address {
      private String street;
      private String pincode;
      private String city;
      private String state;

      public String getStreet() {
         return street;
      }

      public void setStreet(String street) {
         this.street = street;
      }

      public String getPincode() {
         return pincode;
      }

      public void setPincode(String pincode) {
         this.pincode = pincode;
      }

      public String getCity() {
         return city;
      }

      public void setCity(String city) {
         this.city = city;
      }

      public String getState() {
         return state;
      }

      public void setState(String state) {
         this.state = state;
      }
   }
}
