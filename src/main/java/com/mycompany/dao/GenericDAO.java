package com.mycompany.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 * Classe responsável por gerenciar o banco de dados
 */
public class GenericDAO<T extends EntidadeBase> {

    private static EntityManager entityManager; //hibernate
    
    public GenericDAO() {
        entityManager = ConnectionFactory.getEntityManager();
        
    }

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    
   
    /**
     * Método responsável por Salvar
     *
     */
    public boolean saveOrUpdate(T obj) {
        try {
            entityManager = ConnectionFactory.getEntityManager();
            entityManager.getTransaction().begin();
            if (obj.getId() == null) {
                entityManager.persist(obj);
            } else {
                entityManager.merge(obj);
            }
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Método responsável por retornar um item por ID
     *
     */
    public T findById(Class<T> clazz, Integer id) {
        return entityManager.find(clazz, id);
    }

    /**
     * Método responsável por excluir
     *
     */
    public boolean remove(Class<T> clazz, Integer id) {
        try {
            entityManager = ConnectionFactory.getEntityManager();
            T t = findById(clazz, id);
            entityManager.getTransaction().begin();
            entityManager.remove(t);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Método responsável por listar os item da entidade
     *
     */
    public List<T> list(Class<T> entidade) {
        entityManager = ConnectionFactory.getEntityManager();
        List<T> lista = null;
        try {

            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            lista = entityManager.createQuery("from " + entidade.getName()+ " r").getResultList();

            transaction.commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {

            entityManager.close();
        }

        return lista;
    }

}