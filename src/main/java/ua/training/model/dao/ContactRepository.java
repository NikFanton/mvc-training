package ua.training.model;

import org.springframework.data.repository.CrudRepository;
import ua.training.model.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
