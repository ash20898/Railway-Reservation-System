package com.example.RailwayReservationSystem.controller;

import com.example.RailwayReservationSystem.models.User;
import com.example.RailwayReservationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String viewHomePage(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "UsersList";
    }

    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model) {
        User user = new User();
        model.addAttribute("User", user);
        return "newUserForm";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("User") User user) {  // @RequestBody User user
        userService.saveUser(user);
        return "redirect:/Users";
    }

    @GetMapping("/showUpdateUserForm/{id}")
    public String showUpdateUserForm(@PathVariable("id") long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("User", user);
        return "updateUserForm";
    }

    @PostMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") long id, @ModelAttribute("User") User user) {
        userService.saveUser(user);
        return "redirect:/Users";
    }
    @GetMapping("/deleteUser/{id}")
    public  String deleteUser(@PathVariable("id") long id){
        User user = userService.getUserById(id);
        userService.deleteUser(user);
        return "redirect:/Users";
    }


}