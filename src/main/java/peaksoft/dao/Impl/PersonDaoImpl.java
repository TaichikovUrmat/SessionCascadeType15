package peaksoft.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.PersonDao;
import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;

import java.util.List;

public class PersonDaoImpl implements PersonDao {
    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();

    @Override
    public String savePerson(Person person) {
        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setPerson(person);
        person.setSocialMedia(List.of(socialMedia));
        entityManager.persist(person);

        entityManager.getTransaction().commit();
        entityManager.close();
        return "success";
    }

    @Override
    public String deletePerson(Long personId) {
        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        Person person = new Person();
        entityManager.getTransaction().begin();

        int personId1 = entityManager.createQuery("DELETE FROM Person p WHERE  p.id = :personId")
                .setParameter("personId", personId).executeUpdate();
        if (person.getId() == personId1) {
            person.setId(null);
            entityManager.getTransaction().commit();
            entityManager.close();
        }else {
            throw  new RuntimeException("person id not match");
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return " Delete success" + personId1;
    }

    @Override
    public Person getById(Long personId) {
        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Person person = entityManager.find(Person.class, personId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return person;
    }
}
