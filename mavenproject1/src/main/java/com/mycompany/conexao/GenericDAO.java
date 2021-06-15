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

    
    public Voluntario findVoluntarioByCPF(String  id){
        Voluntario voluntario1= null;
        
        try{
            Query query= entityManager.createNamedQuery("Find Usuario By nome");
            query.setParameter("parametro", id);
            voluntario1= (Voluntario) query.setMaxResults(1).getSingleResult();           
        } catch (Exception e) {
            voluntario1= null;
        }finally {
            
        }
        return voluntario1;
    }
    
    public Usuario findUsuarioByCPF(String  id){
        Usuario usuario1= null;
        
        try{
            Query query= entityManager.createNamedQuery("Find Usuario By nome");
            query.setParameter("parametro", id);
            usuario1= (Usuario) query.setMaxResults(1).getSingleResult();           
        } catch (Exception e) {
            usuario1= null;
        }finally {
            
        }
        return usuario1;
    }
    
    public Assistido findAssistidoByCPF(String  id){
        Assistido assistido1= null;
        
        try{
            Query query= entityManager.createNamedQuery("Find Assistido By CPF");
            query.setParameter("parametro", id);
            assistido1= (Assistido) query.setMaxResults(1).getSingleResult();           
        } catch (Exception e) {
            assistido1= null;
        }finally {
            
        }
        return assistido1;
    }
    
    public Psc findPSCByCPF(String  id){
        Psc psc1= null;
        
        try{
            Query query= entityManager.createNamedQuery("Find Usuario By nome");
            query.setParameter("parametro", id);
            psc1= (Psc) query.setMaxResults(1).getSingleResult();           
        } catch (Exception e) {
            psc1= null;
        }finally {
            
        }
        return psc1;
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