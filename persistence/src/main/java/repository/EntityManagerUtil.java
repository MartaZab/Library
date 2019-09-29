package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
    private static EntityManagerUtil instance;

    private EntityManagerUtil() {
    }

    public static EntityManagerUtil getInstance() {
        if (instance == null) {
            instance = new EntityManagerUtil();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
