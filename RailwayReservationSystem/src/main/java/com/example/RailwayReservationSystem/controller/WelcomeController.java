package com.example.RailwayReservationSystem.controller;

import com.example.RailwayReservationSystem.models.User;
import com.example.RailwayReservationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        User user = new User();
        model.addAttribute("User", user);
        return "WelcomePage";
    }
    @PostMapping("/SaveNewUser")
    public  String SaveNewUser(@ModelAttribute("User") User user ){
        userService.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/AddSomeUsers")
    public String AddSomeUsers(Model model) {
        User user = new User();
        model.addAttribute("User", user);
        return "AddSomeUsers";
    }
    @GetMapping("/Login")
    public String viewHomePage8(Model model) {
        User user = new User();
        model.addAttribute("User",user);
        return "login";
    }
    @GetMapping("/GetUserOrAdminPage")
    public String GetUserOrAdminPage(@ModelAttribute("User") User user , Model model){
        User ExUser = userService.getUserByFirstName(user.getFirstName());
        if(ExUser == null){ return "NormalUserPage"; }
        model.addAttribute("User",ExUser);
        if(ExUser.getRole().equals("User")){
            return "NormalUserPage";
        }
        else {
            return "AdminPage";
        }
    }
    @GetMapping("/AdminPage")
    public  String GetAdminPage(){
        return "AdminPage";
    }

    @GetMapping("/GetNormalUserPage")
    public  String GetNormalUserPage(){
        return "NormalUserPage";
    }

}
