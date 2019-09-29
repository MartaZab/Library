package repository;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public abstract class GenericDao<T, K> {

    protected final EntityManager em;
    private final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    GenericDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
        this.em = EntityManagerUtil.getInstance().getEntityManager();
    }

    public void create(T entity) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(entity);
        transaction.commit();
    }

    public T read(K id) {
        return em.find(entityClass, id);
    }

    public T update(T entity) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        T merge = em.merge(entity);
        transaction.commit();
        return merge;
    }

    public void delete(K id) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        T read = read(id);
        em.remove(read);
        transaction.commit();
    }
}


