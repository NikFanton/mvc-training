package ua.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.training.service.ContactService;
import ua.training.service.impl.ContactServiceImpl;

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
        ModelAndView mav = new ModelAndView("displaySum");
        mav.addObject("sum", first + second);

//        ContactService contactService = new ContactServiceImpl();
//        System.out.println(contactService.findById(1L));
//        mav.addObject("contacts", contactService.findAll());
//        String date = jdbcTemplate.queryForObject("select birth_date from contact limit 1;", String.class);
        return mav;
    }
}