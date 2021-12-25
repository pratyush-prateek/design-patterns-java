package com.designpatters.adapter;

public class EmployeeLDAPAdapter implements Employee {
    private EmployeeLDAP instance;
    public EmployeeLDAPAdapter(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCrn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getOrgEmail();
    }

    public String toString() {
        return "ID: " + this.getId() + " First Name: " + this.getFirstName() + " Last Name: " + this.getLastName() + " Email ID: " + this.getEmail();
    }
}
