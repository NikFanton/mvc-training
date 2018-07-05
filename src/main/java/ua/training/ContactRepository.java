package ua.training;

import org.springframework.data.repository.CrudRepository;
import ua.training.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
