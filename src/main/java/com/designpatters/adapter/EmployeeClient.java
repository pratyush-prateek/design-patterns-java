package com.designpatters.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    private List<Employee> employees = new ArrayList<Employee>();

    public List<Employee> getEmployees() {
        Employee employee1 = new EmployeeDB("John","Wick","12456","john@wick.com");
        EmployeeCSV employee2 = new EmployeeCSV("567,dane,warren,dane@warren.com");
        EmployeeLDAP employee3 = new EmployeeLDAP("45789","Joseph","Bryan","joesph@bryan.com");
        employees.add(employee1);
        employees.add(new EmployeeCSVAdapter(employee2));
        employees.add(new EmployeeLDAPAdapter(employee3));
        return employees;
    }
}
