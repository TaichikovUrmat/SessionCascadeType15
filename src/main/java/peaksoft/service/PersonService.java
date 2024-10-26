package peaksoft.service;

import peaksoft.entity.Person;

public interface PersonService {
    // Crud
    String savePerson(Person person);
    String deletePerson(Long personId);
    Person getById(Long personId);
}
