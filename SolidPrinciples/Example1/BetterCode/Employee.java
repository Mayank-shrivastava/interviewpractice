package SolidPrinciples.Example1.BetterCode;


// This class follows SRP as it only contains the Employee class 
public class Employee {
    private int id; // Employee ID
    private String name; // Employee name
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getEmployeeId() {
        return this.id;
    }

    public String getEmployeeName() {
        return this.name;
    }

    public String getEmployeeAddress() {
        return this.address;
    }

    public void setEmployeeAddress(String address) {
        this.address = address;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

}


// This class is now only responsible for basic employee data creation and fetching