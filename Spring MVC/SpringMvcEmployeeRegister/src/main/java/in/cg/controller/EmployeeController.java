package in.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/register")
    public String showRegister() {
        return "register";
    }

    @RequestMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }

    @RequestMapping("/personal")
    public String showPersonal() {
        return "personal";
    }
}