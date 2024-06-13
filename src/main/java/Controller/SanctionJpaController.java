/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Class.Client;
import Class.Sanction;
import Controller.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author x
 */
public class SanctionJpaController implements Serializable {

    public SanctionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public SanctionJpaController() {
        emf = Persistence.createEntityManagerFactory("LibrarySystem_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sanction sanction) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client client = sanction.getClient();
            if (client != null) {
                client = em.getReference(client.getClass(), client.getId());
                sanction.setClient(client);
            }
            em.persist(sanction);
            if (client != null) {
                client.getSancList().add(sanction);
                client = em.merge(client);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sanction sanction) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sanction persistentSanction = em.find(Sanction.class, sanction.getId());
            Client clientOld = persistentSanction.getClient();
            Client clientNew = sanction.getClient();
            if (clientNew != null) {
                clientNew = em.getReference(clientNew.getClass(), clientNew.getId());
                sanction.setClient(clientNew);
            }
            sanction = em.merge(sanction);
            if (clientOld != null && !clientOld.equals(clientNew)) {
                clientOld.getSancList().remove(sanction);
                clientOld = em.merge(clientOld);
            }
            if (clientNew != null && !clientNew.equals(clientOld)) {
                clientNew.getSancList().add(sanction);
                clientNew = em.merge(clientNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sanction.getId();
                if (findSanction(id) == null) {
                    throw new NonexistentEntityException("The sanction with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sanction sanction;
            try {
                sanction = em.getReference(Sanction.class, id);
                sanction.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sanction with id " + id + " no longer exists.", enfe);
            }
            Client client = sanction.getClient();
            if (client != null) {
                client.getSancList().remove(sanction);
                client = em.merge(client);
            }
            em.remove(sanction);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sanction> findSanctionEntities() {
        return findSanctionEntities(true, -1, -1);
    }

    public List<Sanction> findSanctionEntities(int maxResults, int firstResult) {
        return findSanctionEntities(false, maxResults, firstResult);
    }

    private List<Sanction> findSanctionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sanction.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Sanction findSanction(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sanction.class, id);
        } finally {
            em.close();
        }
    }

    public int getSanctionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sanction> rt = cq.from(Sanction.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
