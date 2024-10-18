package org.launchcode.controllers;

import org.springframework.ui.Model;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, @RequestParam String verifyPassword) {

        if(!user.getPassword().equals(verifyPassword)) {
            model.addAttribute("error", "Passwords do not match");
            return "user/add";
        }

        return "redirect:/";
    }

}
