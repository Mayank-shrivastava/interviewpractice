package SolidPrinciples.Example1.ProblematicCode;

public class Employee {
    private int id; // Employee ID
    private String name; // Employee name 
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport() {
        // Code to print performance report
        System.out.println("Performance report of employee: " + name);
    }

    public double computeSalary() {
        // Code to compute salary
        return 1000.0;
    }

    public void updateEmployeeData() {
        // Code to update employee data
        System.out.println("Employee data updated successfully");
    }

    public void fetchEmployeeData() {
        // Code to fetch employee data
        System.out.println("Employee data fetched successfully");
    }
}


// This class is trying to do too many things.
// Say, if the taxation changes, we might need to update computeSalary() function
// If data storage requirements are changed we might need to update updateEmployeeData() function 
// If the report format changes we might need to update printEmployeeReport() 

// Because the above class is doing too many things there are too many reasons to update the code present in the class. 
// This violates Single Responsibility principle. 

// Single Responsibility principle states that, there should be one and only one reason to change a class or a piece of code