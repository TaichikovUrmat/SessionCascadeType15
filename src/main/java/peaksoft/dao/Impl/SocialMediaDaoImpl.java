package peaksoft.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.SocialMediaDao;
import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;

import java.util.List;

public class SocialMediaDaoImpl implements SocialMediaDao {
    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();

    @Override
    public String saveSocialMedia(SocialMedia socialMedia) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(socialMedia);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "success";
    }

    @Override
    public void deleteSocialMedia(SocialMedia socialMedia) {

    }

    @Override
    public void assignSocialMediaToPerson(Long personId, Long socialMediaId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Person person = entityManager.find(Person.class, personId);
        SocialMedia socialMedia = entityManager.find(SocialMedia.class, socialMediaId);

        person.setSocialMedia(List.of(socialMedia));
        socialMedia.setPerson(person);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
