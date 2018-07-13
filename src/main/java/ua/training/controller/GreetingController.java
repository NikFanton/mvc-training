package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/hi")
    public String doGreeting(Model model) {
        model.addAttribute("greeting", "AND HELLO FROM CONTROLLER!");
        return "forward:index.jsp";
    }

    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("first") int first,
                                  @RequestParam("second") int second) {
        ModelAndView mav = new ModelAndView("view/displaySum");
        mav.addObject("sum", first + second);
        return mav;
    }
}