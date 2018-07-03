package ua.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @RequestMapping(value = "/hi")
    public String doGreeting(Model model) {
        model.addAttribute("greeting", "HELLO FROM CONTROLLER!");
        return "forward:index.jsp";
    }
}
