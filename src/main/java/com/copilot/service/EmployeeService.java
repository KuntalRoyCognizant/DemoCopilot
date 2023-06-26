package com.copilot.service;

import com.copilot.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    public List<Employee> addEmployee() {
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
        employee = new Employee();
        employee.setId(2);
        employee.setName("Jampa");
        employee.setAddress("Brisben, USA");
        employee.setEmail("jam@gmail.com");
        employee.setPhone("8899229922");
        employee.setDepartment("Testing");
        employee.setSalary("60000");
        employee.setStatus("Active");
        employeeList.add(employee);
        employee = new Employee();
        employee.setId(3);
        employee.setName("Sanjay");
        employee.setAddress("Pune, India");
        employee.setEmail("joy@gmail.com");
        employee.setPhone("6788997877");
        employee.setDepartment("HR");
        employee.setSalary("100000");
        employee.setStatus("Active");
        employeeList.add(employee);
        employee = new Employee();
        employee.setId(4);
        employee.setName("Raj");
        employee.setAddress("Chicago, USA");
        employee.setEmail("raj@hotmail.com");
        employee.setPhone("3448833388");
        employee.setDepartment("Engineering");
        employee.setSalary("50000");
        employee.setStatus("Active");
        employeeList.add(employee);
        employee = new Employee();
        employee.setId(5);
        employee.setName("Will");
        employee.setAddress("Missisaga, Canada");
        employee.setEmail("will@test.com");
        employee.setPhone("8192229998");
        employee.setDepartment("CEO");
        employee.setSalary("180000");
        employee.setStatus("Active");
        employeeList.add(employee);
        return employeeList;
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

        return employeeList;
    }

    private Long iterateEmployeeListUsingForLoopAndCalculateTime(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingForLoopAndCalculateTime");
        long startTime = System.nanoTime();
        for (Employee employee : employeeList) {
            //System.out.println(employee.getName() + " " + employee.getSalary());
        }
        long endTime = System.nanoTime();
        System.out.println("Total Time Taken: " + (endTime - startTime));
        return endTime - startTime;
    }

    private Long iterateEmployeeListUsingLambdaAndCalculateTime(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingLambdaAndCalculateTime");
        long startTime = System.nanoTime();
        employeeList.forEach(employee -> employee.getName());
        long endTime = System.nanoTime();
        System.out.println("Total Time Taken: " + (endTime - startTime));
        return endTime - startTime;
    }

    // iterate through stream
    private Long iterateEmployeeListUsingStream(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingStream");
        long startTime = System.nanoTime();
        employeeList.stream().forEach(employee -> employee.getName());
        long endTime = System.nanoTime();
        System.out.println("Total Time Taken: " + (endTime - startTime));
        return endTime - startTime;

    }

    private Long iterateEmployeeListUsingParallelStream(List<Employee> employeeList) {
        System.out.println("iterateEmployeeListUsingParallelStream");
        long startTime = System.nanoTime();
        employeeList.parallelStream().forEach(employee -> employee.getName());
        long endTime = System.nanoTime();
        System.out.println("Total Time Taken: " + (endTime - startTime));
        return endTime - startTime;
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
        Long time;
        System.out.println("getAllEmployee");
        List<Employee> employeeList = populateEmployee100k();
        Long time2 = iterateEmployeeListUsingForLoopAndCalculateTime(employeeList);
        Long time3 = iterateEmployeeListUsingLambdaAndCalculateTime(employeeList);
        Long time4 = iterateEmployeeListUsingStream(employeeList);
        //Long time5 = iterateEmployeeListUsingParallelStream(employeeList);
        /* compare time2, time3, time4, time5 and find out which one is the shortest */
        time = time2;
        if (time3 < time) {
            time = time3;
        }
        if (time4 < time) {
            time = time4;
        }
//        if (time5 < time) {
//            time = time5;
//        }
        System.out.println("Shortest Time: " + time);
    }

    /* populate 1000 employee */
    public void populateEmployee() {
        System.out.println("populateEmployee");
        for (int i = 0; i < 1000; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName("Kuntal" + i);
            employee.setAddress("Birati" + i + ", India");
            employee.setEmail("latnuk" + i + "@gmail.com");
            employee.setPhone("9988443388" + i);
            employee.setDepartment("IT");
            employee.setSalary("80000" + i);
            employee.setStatus("Active");
            employeeList.add(employee);
        }
    }

/* populate 10000 employee */
    public List<Employee> populateEmployee10k() {
        System.out.println("populateEmployee10k");
        for (int i = 0; i < 10000; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName("Kuntal" + i);
            employee.setAddress("Birati" + i + ", India");
            employee.setEmail("latnuk" + i + "@gmail.com");
            employee.setPhone("9988443388" + i);
            employee.setDepartment("IT");
            employee.setSalary("80000" + i);
            employee.setStatus("Active");
            employeeList.add(employee);
        }
        return employeeList;
    }

/* populate 100000 employee */
    public List<Employee> populateEmployee100k() {
        System.out.println("populateEmployee100k");
        for (int i = 0; i < 100000; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName("Kuntal" + i);
            employee.setAddress("Birati" + i + ", India");
            employee.setEmail("latnuk" + i + "@gmail.com");
            employee.setPhone("9988443388" + i);
            employee.setDepartment("IT");
            employee.setSalary("80000" + i);
            employee.setStatus("Active");
            employeeList.add(employee);
        }
        return employeeList;
    }

/* populate 1000000 employee */
    public List<Employee> populateEmployee1M() {
        System.out.println("populateEmployee1M");
        for (int i = 0; i < 1000000; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName("Kuntal" + i);
            employee.setAddress("Birati" + i + ", India");
            employee.setEmail("latnuk" + i + "@gmail.com");
            employee.setPhone("9988443388" + i);
            employee.setDepartment("IT");
            employee.setSalary("80000" + i);
            employee.setStatus("Active");
            employeeList.add(employee);
        }
        return employeeList;
    }


}
