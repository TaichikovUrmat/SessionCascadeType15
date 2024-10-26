package peaksoft.dao;

import peaksoft.entity.Person;

public interface PersonDao {
    String savePerson(Person person);
    String deletePerson(Long personId);
    Person getById(Long personId);
}
