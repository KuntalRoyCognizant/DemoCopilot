package com.copilot.model;

@lombok.Data
public class Employee {
    private int id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String department;
    private String designation;
    private String salary;
    private String status;
    //override toString method
    @Override
    public String toString() {
        return "Employee(id=" + this.getId() + ", name=" + this.getName() + ", address=" + this.getAddress() + ", email=" + this.getEmail() + ", phone=" + this.getPhone() + ", department=" + this.getDepartment() + ", designation=" + this.getDesignation() + ", salary=" + this.getSalary() + ", status=" + this.getStatus() + ")";
    }
}
