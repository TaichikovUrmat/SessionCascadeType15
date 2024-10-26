package peaksoft.service.impl;

import peaksoft.dao.Impl.PersonDaoImpl;
import peaksoft.dao.PersonDao;
import peaksoft.entity.Person;
import peaksoft.service.PersonService;

public class PersonServiceImpl  implements PersonService {
    private final PersonDao personDao = new PersonDaoImpl();

    @Override
    public String savePerson(Person person) {
        return personDao.savePerson(person);
    }

    @Override
    public String deletePerson(Long personId) {
        return personDao.deletePerson(personId);
    }

    @Override
    public Person getById(Long personId) {
        return personDao.getById(personId);
    }
}
