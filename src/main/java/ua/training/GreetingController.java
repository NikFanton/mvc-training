package ua.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.training.service.ContactService;
import ua.training.service.impl.ContactServiceImpl;

@Controller
public class GreetingController {

    @RequestMapping(value = "/hi")
    public String doGreeting(Model model) {
        model.addAttribute("greeting", "AND HELLO FROM CONTROLLER!");
        return "forward:index.jsp";
    }

    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("first") int first,
                                  @RequestParam("second") int second) {
        ModelAndView mav = new ModelAndView("displaySum");
        mav.addObject("sum", first + second);
        System.out.println(first + " " + second);

        ContactService contactService = new ContactServiceImpl();
        mav.addObject("contacts", contactService.findAll());
        return mav;
    }
}