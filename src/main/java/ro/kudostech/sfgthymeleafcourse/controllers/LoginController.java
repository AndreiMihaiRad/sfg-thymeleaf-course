package ro.kudostech.sfgthymeleafcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.kudostech.sfgthymeleafcourse.commands.LoginCommand;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(Model model){

        model.addAttribute("loginCommand", new LoginCommand());

        return "loginform";
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "loginform";
        }

        return "redirect:/index";
    }

    @RequestMapping("/logout-success")
    public String doLogOut() {
        return "logout-success";
    }
}
