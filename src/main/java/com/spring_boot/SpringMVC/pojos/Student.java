package com.spring_boot.SpringMVC.pojos;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;

    private List<String> favouriteSubjects;

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public List<String> getFavouriteSubjects() {
        return favouriteSubjects;
    }

    public void setFavouriteSubjects(List<String> favouriteSubjects) {
        this.favouriteSubjects = favouriteSubjects;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", favouriteLanguage='" + favouriteLanguage + '\'' +
                ", favouriteSubjects=" + favouriteSubjects +
                '}';
    }

}
