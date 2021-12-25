package com.designpatters.adapter;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        EmployeeClient client  = new EmployeeClient();
        List<Employee> employees = client.getEmployees();
        System.out.println(employees);
    }
}
