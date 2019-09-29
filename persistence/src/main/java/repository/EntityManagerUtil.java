package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
    private EntityManager entityManager = null;
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
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
}
