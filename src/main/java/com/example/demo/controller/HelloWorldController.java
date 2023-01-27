package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello World!");
        return "helloworld";
    }

    @GetMapping("/style")
    public String add_css_js(){
        return "css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String add_bootstrap(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sai","Charan","scharan518@gmail.com"));
        employees.add(new Employee("Akhil","Kothuri","akhil.k@gmail.com"));
        employees.add(new Employee("Gopi","don","dongopi@gmail.com"));
        model.addAttribute("employees",employees);

        return "bootstrap-demo";
    }

    @GetMapping("/if-unless")
    public String if_unless(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Sai","Admin","scharan518@gmail.com","male"));
        users.add(new User("Akhil","Admin","akhil.k@gmail.com","male"));
        users.add(new User("Radhika","User","radhika143@gmail.com","female"));
        model.addAttribute("users",users);

        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switch_case(Model model){
        User user = new User("Ram","Admin","ram01@yahoo.com","male");
        model.addAttribute("user",user);

        return "switch-demo";
    }

    @GetMapping("/arraysDemo")
    public String arraysDemo(Model model) {
        String[] players = {
                "SACHIN",
                "SEHWAG",
                "DRAVID",
                "GANGULY",
                "DHONI",
                "RAINA"
        };
        model.addAttribute("players", players);
        return "array-demo";
    }
}
