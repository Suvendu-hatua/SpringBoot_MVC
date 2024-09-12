package com.spring_boot.SpringMVC.pojos;


import com.spring_boot.SpringMVC.Annotations.ReferenceCode;
import jakarta.validation.constraints.*;

public class Employee {
    @NotNull(message = "is required!")
    @Size(min = 4,max = 4,message = "Employee Id must be of 4 digits.")
    private String employeeId;

    @NotNull(message = "is required!")
    @Size(min=5,message = "First Name must be minimum of 5 digits.")
    private String firstName;

    private String lastName;

    @NotBlank(message = "is required!")
    @Email(regexp = "^[a-zA-Z0-9_.±]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$",message = "Please Enter a valid Email Address.")
    private String email;

    @NotBlank(message = "is required!")
    @ReferenceCode(value = "VWITS",message = "Must be start with VWITS")
    private String referenceCode;

    @NotNull(message = "is required!")
    @Min(value = 18,message = "Minimum age of Employee must be above 18")
    @Max(value = 60,message = "Maximum age of Employee must be below 60.")
    private Integer age;

    @NotNull(message = "is required!")
    private String gender;

    private String country;

    //Setter and Getter methods--->

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
//Override toString() method--->

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", referenceCode='" + referenceCode + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
