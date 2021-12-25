package com.designpatters.adapter;

public class EmployeeDB implements Employee {
    private String firstName;
    private String lastName;
    private String id;
    private String email;
    public EmployeeDB(String firstName, String lastName, String id, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    public String toString() {
        return "ID: " + getId() + " First Name: "  + getFirstName() + " Last name: " + getLastName() + " Email: " + getEmail();
    }
}
