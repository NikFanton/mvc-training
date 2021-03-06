package ua.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.training.model.entity.Contact;
import ua.training.model.service.ContactService;

import java.util.List;

@RequestMapping("/contacts")
@Controller
public class ContactController {
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        logger.info("Listening contacts");
        List<Contact> contacts = contactService.findAll();
        model.addAttribute("contacts", contacts);
        logger.info("No. of contacts" + contacts.size());
        return "views/contacts/list";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showContact(@PathVariable Long id, Model uiModel) {
        Contact contact = contactService.findById(id);
        uiModel.addAttribute("contact", contact);
        return "views/contacts/show";
    }



    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
