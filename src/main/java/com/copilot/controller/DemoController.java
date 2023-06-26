package com.copilot.controller;

import com.copilot.model.Employee;
import com.copilot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

  @Autowired
  private EmployeeService employeeService;

    /*create employee*/
    @PostMapping("/addEmployee") // http://localhost:8083/addEmployee
    public String createEmployee() {
        System.out.println("createEmployee");
        List<Employee> employeeList = employeeService.addEmployee();
        /*check if employee created return Success else return Failure*/
        if (employeeList.size() > 0) {
            return "Employee Created Successfully";
        } else {
            return "Employee Creation Failed";
        }

    }

    /*get employee*/
    @GetMapping("/getEmployee") // http://localhost:8083/getEmployee
    public List<Employee> getEmployee() {
        System.out.println("getEmployee");
        return employeeService.getEmployee();

    }

    /* get all employee */
    @GetMapping("/getAllEmployee") // http://localhost:8083/getAllEmployee
    public void getAllEmployee() {
        System.out.println("getAllEmployee");
        employeeService.getAllEmployee();

    }
}
