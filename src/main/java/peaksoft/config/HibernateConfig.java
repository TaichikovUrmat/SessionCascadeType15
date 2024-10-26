package peaksoft.config;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;

import java.util.Properties;

public class HibernateConfig {
    public static EntityManagerFactory getEntityManager() {
        try {
            Properties properties = new Properties();
            properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:postgresql://localhost:5432/java15");
            properties.put(Environment.JAKARTA_JDBC_USER, "postgres");
            properties.put(Environment.JAKARTA_JDBC_PASSWORD, "Urmat0204");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.FORMAT_SQL, "true");

            Configuration configuration = new Configuration();
            configuration.addProperties(properties);
            configuration.addAnnotatedClass(Person.class);
            configuration.addAnnotatedClass(SocialMedia.class);

            System.out.println("Successfully connected!");
            return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}