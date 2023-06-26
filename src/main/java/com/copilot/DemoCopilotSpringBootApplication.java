package com.copilot;

import com.copilot.model.Employee;
import com.copilot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.copilot"})
public class DemoCopilotSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Inside Copilot World!");
        SpringApplication.run(DemoCopilotSpringBootApplication.class, args);
    }

    @RestController
    @RequestMapping("/Copilot")
    public static class DemoController {

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

        /*delete employee*/
        @PostMapping("/deleteEmployee") // http://localhost:8083/deleteEmployee
        public void deleteEmployee() {
            System.out.println("deleteEmployee");
            employeeService.deleteEmployee();
        }
        /*update employee */
        @PostMapping("/updateEmployee") // http://localhost:8083/updateEmployee
        public void updateEmployee() {
            System.out.println("updateEmployee");
            employeeService.updateEmployee();
        }
    }
}
