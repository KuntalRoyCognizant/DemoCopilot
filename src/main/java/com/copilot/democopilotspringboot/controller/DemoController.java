package com.copilot.democopilotspringboot.controller;

import com.copilot.model.Employee;
import com.copilot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Copilot")
public class DemoController {

  @Autowired
  private EmployeeService employeeService;

    /*create employee*/
    @PostMapping("/addEmployee") // http://localhost:8083/addEmployee
    public void createEmployee() {
        System.out.println("createEmployee");
        employeeService.addEmployee();
    }

    /*get employee*/
    @GetMapping("/getEmployee") // http://localhost:8083/getEmployee
    public List<Employee> getEmployee() {
        System.out.println("getEmployee");
        return employeeService.getEmployee();

    }
}
