package com.designpatters.adapter;

public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV instance;
    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getIdentity().toString();
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    public String toString() {
        return "ID: " + getId() + " First Name: " + getFirstName() + " Last Name: " + getLastName() + " Email ID: " + getEmail();
    }
}
