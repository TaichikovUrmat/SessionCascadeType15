package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;
import peaksoft.service.PersonService;
import peaksoft.service.SocialMediaService;
import peaksoft.service.impl.PersonServiceImpl;
import peaksoft.service.impl.SocialMediaServiceImpl;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
//        HibernateConfig.getEntityManager();

        PersonService personService = new PersonServiceImpl();
        SocialMediaService socialMediaService = new SocialMediaServiceImpl();
//        personService.savePerson(new Person("Askat",20,"askat@gmail.com"));

//        socialMediaService.saveSocialMedia(new SocialMedia("Instagram"));
//        socialMediaService.saveSocialMedia(new SocialMedia("Tik-tok"));
//        socialMediaService.assignSocialMediaToPerson(1L,1L);


//        Person person = new Person("Adilet",19,"adilet@gmail.coom");
//        SocialMedia socialMedia1 = new SocialMedia("Facebook");
//        SocialMedia socialMedia2 = new SocialMedia("Youtube");
//        socialMedia1.setPerson(person);
//        socialMedia2.setPerson(person);
//        person.setSocialMedia(List.of(socialMedia1, socialMedia2));
//        personService.savePerson(person);

//        System.out.println(personService.getById(152L));
        System.out.println(personService.deletePerson(1L));


    }
}
