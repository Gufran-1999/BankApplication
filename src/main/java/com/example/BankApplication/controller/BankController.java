package com.example.BankApplication.controller;

import com.example.BankApplication.models.Branch;
import com.example.BankApplication.models.BankService;
import com.example.BankApplication.service.BankServiceService;
import com.example.BankApplication.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller// Assume this is making API's inside this class visible to
// the embeded server so that it can route to an appropiate function.
public class BankController {

    @Autowired
    BankServiceService bankServiceService;
    @Autowired
    BranchService branchService;

    @Value("${bank.name}")
    private String bankname;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("bankName", bankname);
        return "home";
    }
    @GetMapping("/branches")
    public String getAllBranch(Model model){
        model.addAttribute("bankName", bankname);
        model.addAttribute("branches", branchService.findAll());
        return "branches";
    }

    @GetMapping("/services")
    public String getAllServices(Model model){
        model.addAttribute("bankName", bankname);
        model.addAttribute("services", bankServiceService.findAll());
        return "services";
    }

}
