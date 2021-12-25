package com.designpatters.adapter;

public class EmployeeLDAP {
    private String crn;
    private String surname;
    private String givenName;
    private String orgEmail;

    public EmployeeLDAP(String crn, String surname, String givenName, String orgEmail) {
        this.crn = crn;
        this.surname = surname;
        this.givenName = givenName;
        this.orgEmail = orgEmail;
    }

    public String getCrn() {
        return crn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getOrgEmail() {
        return orgEmail;
    }
}
