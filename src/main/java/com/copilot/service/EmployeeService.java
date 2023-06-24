package com.copilot.service;

import com.copilot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    public void addEmployee() {
        System.out.println("addEmployee");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Kuntal");
        employee.setAddress("Birati, India");
        employee.setEmail("latnuk@gmail.com");
        employee.setPhone("9988443388");
        employee.setDepartment("IT");
        employee.setSalary("80000");
        employee.setStatus("Active");
        employeeList.add(employee);
        Employee employee1 = new Employee();
        employee.setId(2);
        employee.setName("Jampa");
        employee.setAddress("Brisben, USA");
        employee.setEmail("jam@gmail.com");
        employee.setPhone("8899229922");
        employee.setDepartment("Testing");
        employee.setSalary("60000");
        employee.setStatus("Active");
        employeeList.add(employee1);
        Employee employee2 = new Employee();
        employee.setId(3);
        employee.setName("Sanjay");
        employee.setAddress("Pune, India");
        employee.setEmail("joy@gmail.com");
        employee.setPhone("6788997877");
        employee.setDepartment("HR");
        employee.setSalary("100000");
        employee.setStatus("Active");
        employeeList.add(employee2);
        Employee employee3 = new Employee();
        employee.setId(4);
        employee.setName("Raj");
        employee.setAddress("Chicago, USA");
        employee.setEmail("raj@hotmail.com");
        employee.setPhone("3448833388");
        employee.setDepartment("Engineering");
        employee.setSalary("50000");
        employee.setStatus("Active");
        employeeList.add(employee3);
        Employee employee4 = new Employee();
        employee.setId(5);
        employee.setName("Will");
        employee.setAddress("Missisaga, Canada");
        employee.setEmail("will@test.com");
        employee.setPhone("8192229998");
        employee.setDepartment("CEO");
        employee.setSalary("180000");
        employee.setStatus("Active");
        employeeList.add(employee4);




    }

    public void updateEmployee() {
        System.out.println("updateEmployee");
    }

    public void deleteEmployee() {
        System.out.println("deleteEmployee");
    }

    public List<Employee> getEmployee() {
        System.out.println("getEmployee");
        getEmployeeWithMaxSalary(employeeList);
        iterateEmployeeListUsingForEachAndCalculateTime(employeeList);
        iterateEmployeeListUsingForLoopAndCalculateTime(employeeList);
        iterateEmployeeListUsingLambdaAndCalculateTime(employeeList);
        return null;
    }

    private void iterateEmployeeListUsingForEachAndCalculateTime(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingForEachAndCalculateTime");
        long startTime = System.currentTimeMillis();
        employeeList.forEach(employee -> System.out.println(employee.getName() + " " + employee.getSalary()));
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (endTime - startTime));
    }

    private void iterateEmployeeListUsingForLoopAndCalculateTime(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingForLoopAndCalculateTime");
        long startTime = System.currentTimeMillis();
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (endTime - startTime));
    }

    private void iterateEmployeeListUsingLambdaAndCalculateTime(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingLambdaAndCalculateTime");
        long startTime = System.currentTimeMillis();
        employeeList.forEach(employee -> System.out.println(employee.getName() + " " + employee.getSalary()));
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (endTime - startTime));
    }

    /* Get Employee with Max Salary */
    private void getEmployeeWithMaxSalary(List<Employee> employeeList) {
        int maxSalary = 0;
        Employee employee = null;
        for (Employee emp : employeeList) {
            if (Integer.parseInt(emp.getSalary()) > maxSalary) {
                maxSalary = Integer.parseInt(emp.getSalary());
                employee = emp;
            }
        }
        System.out.println("Employee with Max Salary: " + employee.getName() + " " + employee.getSalary());
    }

    public void getAllEmployee() {
        System.out.println("getAllEmployee");
    }
}
