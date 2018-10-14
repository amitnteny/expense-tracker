package com.amitnteny.expensetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
   @GetMapping("/welcome")
   public String welcome(Model model) {
      String world = "world";
      model.addAttribute("message", world);
      return "welcome";
   }
}
