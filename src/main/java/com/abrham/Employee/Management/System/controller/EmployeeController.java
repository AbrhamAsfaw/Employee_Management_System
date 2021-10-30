package com.abrham.Employee.Management.System.controller;

import com.abrham.Employee.Management.System.model.Employee;
import com.abrham.Employee.Management.System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("employees" , employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/newEmployeeForm")
    public String newEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee" , employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";

    }
}
