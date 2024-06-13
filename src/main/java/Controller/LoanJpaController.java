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
import Class.Loan;
import Controller.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author x
 */
public class LoanJpaController implements Serializable {

    public LoanJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public LoanJpaController() {
        emf = Persistence.createEntityManagerFactory("LibrarySystem_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Loan loan) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client client = loan.getClient();
            if (client != null) {
                client = em.getReference(client.getClass(), client.getId());
                loan.setClient(client);
            }
            em.persist(loan);
            if (client != null) {
                client.getLoanList().add(loan);
                client = em.merge(client);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Loan loan) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Loan persistentLoan = em.find(Loan.class, loan.getId());
            Client clientOld = persistentLoan.getClient();
            Client clientNew = loan.getClient();
            if (clientNew != null) {
                clientNew = em.getReference(clientNew.getClass(), clientNew.getId());
                loan.setClient(clientNew);
            }
            loan = em.merge(loan);
            if (clientOld != null && !clientOld.equals(clientNew)) {
                clientOld.getLoanList().remove(loan);
                clientOld = em.merge(clientOld);
            }
            if (clientNew != null && !clientNew.equals(clientOld)) {
                clientNew.getLoanList().add(loan);
                clientNew = em.merge(clientNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = loan.getId();
                if (findLoan(id) == null) {
                    throw new NonexistentEntityException("The loan with id " + id + " no longer exists.");
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
            Loan loan;
            try {
                loan = em.getReference(Loan.class, id);
                loan.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loan with id " + id + " no longer exists.", enfe);
            }
            Client client = loan.getClient();
            if (client != null) {
                client.getLoanList().remove(loan);
                client = em.merge(client);
            }
            em.remove(loan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Loan> findLoanEntities() {
        return findLoanEntities(true, -1, -1);
    }

    public List<Loan> findLoanEntities(int maxResults, int firstResult) {
        return findLoanEntities(false, maxResults, firstResult);
    }

    private List<Loan> findLoanEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Loan.class));
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

    public Loan findLoan(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Loan.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoanCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Loan> rt = cq.from(Loan.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
