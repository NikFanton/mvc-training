package ua.training.model.dao;

import org.springframework.data.repository.CrudRepository;
import ua.training.model.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
