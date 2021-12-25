package com.designpatters.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private Integer identity;
    private String firstname;
    private String lastname;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values,",");
        if(tokenizer.hasMoreTokens())
            identity = Integer.parseInt(tokenizer.nextToken());

        if(tokenizer.hasMoreTokens())
            firstname = tokenizer.nextToken();

        if(tokenizer.hasMoreTokens())
            lastname = tokenizer.nextToken();

        if(tokenizer.hasMoreTokens())
            emailAddress = tokenizer.nextToken();

    }

    public Integer getIdentity() {
        return identity;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
