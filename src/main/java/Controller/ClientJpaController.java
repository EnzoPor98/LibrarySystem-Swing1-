/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Class.Client;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Class.Loan;
import java.util.ArrayList;
import java.util.List;
import Class.Sanction;
import Controller.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author x
 */
public class ClientJpaController implements Serializable {

    public ClientJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ClientJpaController() {
        emf = Persistence.createEntityManagerFactory("LibrarySystem_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Client client) {
        if (client.getLoanList() == null) {
            client.setLoanList(new ArrayList<Loan>());
        }
        if (client.getSancList() == null) {
            client.setSancList(new ArrayList<Sanction>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Loan> attachedLoanList = new ArrayList<Loan>();
            for (Loan loanListLoanToAttach : client.getLoanList()) {
                loanListLoanToAttach = em.getReference(loanListLoanToAttach.getClass(), loanListLoanToAttach.getId());
                attachedLoanList.add(loanListLoanToAttach);
            }
            client.setLoanList(attachedLoanList);
            List<Sanction> attachedSancList = new ArrayList<Sanction>();
            for (Sanction sancListSanctionToAttach : client.getSancList()) {
                sancListSanctionToAttach = em.getReference(sancListSanctionToAttach.getClass(), sancListSanctionToAttach.getId());
                attachedSancList.add(sancListSanctionToAttach);
            }
            client.setSancList(attachedSancList);
            em.persist(client);
            for (Loan loanListLoan : client.getLoanList()) {
                Client oldClientOfLoanListLoan = loanListLoan.getClient();
                loanListLoan.setClient(client);
                loanListLoan = em.merge(loanListLoan);
                if (oldClientOfLoanListLoan != null) {
                    oldClientOfLoanListLoan.getLoanList().remove(loanListLoan);
                    oldClientOfLoanListLoan = em.merge(oldClientOfLoanListLoan);
                }
            }
            for (Sanction sancListSanction : client.getSancList()) {
                Client oldClientOfSancListSanction = sancListSanction.getClient();
                sancListSanction.setClient(client);
                sancListSanction = em.merge(sancListSanction);
                if (oldClientOfSancListSanction != null) {
                    oldClientOfSancListSanction.getSancList().remove(sancListSanction);
                    oldClientOfSancListSanction = em.merge(oldClientOfSancListSanction);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Client client) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client persistentClient = em.find(Client.class, client.getId());
            List<Loan> loanListOld = persistentClient.getLoanList();
            List<Loan> loanListNew = client.getLoanList();
            List<Sanction> sancListOld = persistentClient.getSancList();
            List<Sanction> sancListNew = client.getSancList();
            List<Loan> attachedLoanListNew = new ArrayList<Loan>();
            for (Loan loanListNewLoanToAttach : loanListNew) {
                loanListNewLoanToAttach = em.getReference(loanListNewLoanToAttach.getClass(), loanListNewLoanToAttach.getId());
                attachedLoanListNew.add(loanListNewLoanToAttach);
            }
            loanListNew = attachedLoanListNew;
            client.setLoanList(loanListNew);
            List<Sanction> attachedSancListNew = new ArrayList<Sanction>();
            for (Sanction sancListNewSanctionToAttach : sancListNew) {
                sancListNewSanctionToAttach = em.getReference(sancListNewSanctionToAttach.getClass(), sancListNewSanctionToAttach.getId());
                attachedSancListNew.add(sancListNewSanctionToAttach);
            }
            sancListNew = attachedSancListNew;
            client.setSancList(sancListNew);
            client = em.merge(client);
            for (Loan loanListOldLoan : loanListOld) {
                if (!loanListNew.contains(loanListOldLoan)) {
                    loanListOldLoan.setClient(null);
                    loanListOldLoan = em.merge(loanListOldLoan);
                }
            }
            for (Loan loanListNewLoan : loanListNew) {
                if (!loanListOld.contains(loanListNewLoan)) {
                    Client oldClientOfLoanListNewLoan = loanListNewLoan.getClient();
                    loanListNewLoan.setClient(client);
                    loanListNewLoan = em.merge(loanListNewLoan);
                    if (oldClientOfLoanListNewLoan != null && !oldClientOfLoanListNewLoan.equals(client)) {
                        oldClientOfLoanListNewLoan.getLoanList().remove(loanListNewLoan);
                        oldClientOfLoanListNewLoan = em.merge(oldClientOfLoanListNewLoan);
                    }
                }
            }
            for (Sanction sancListOldSanction : sancListOld) {
                if (!sancListNew.contains(sancListOldSanction)) {
                    sancListOldSanction.setClient(null);
                    sancListOldSanction = em.merge(sancListOldSanction);
                }
            }
            for (Sanction sancListNewSanction : sancListNew) {
                if (!sancListOld.contains(sancListNewSanction)) {
                    Client oldClientOfSancListNewSanction = sancListNewSanction.getClient();
                    sancListNewSanction.setClient(client);
                    sancListNewSanction = em.merge(sancListNewSanction);
                    if (oldClientOfSancListNewSanction != null && !oldClientOfSancListNewSanction.equals(client)) {
                        oldClientOfSancListNewSanction.getSancList().remove(sancListNewSanction);
                        oldClientOfSancListNewSanction = em.merge(oldClientOfSancListNewSanction);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = client.getId();
                if (findClient(id) == null) {
                    throw new NonexistentEntityException("The client with id " + id + " no longer exists.");
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
            Client client;
            try {
                client = em.getReference(Client.class, id);
                client.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The client with id " + id + " no longer exists.", enfe);
            }
            List<Loan> loanList = client.getLoanList();
            for (Loan loanListLoan : loanList) {
                loanListLoan.setClient(null);
                loanListLoan = em.merge(loanListLoan);
            }
            List<Sanction> sancList = client.getSancList();
            for (Sanction sancListSanction : sancList) {
                sancListSanction.setClient(null);
                sancListSanction = em.merge(sancListSanction);
            }
            em.remove(client);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Client> findClientEntities() {
        return findClientEntities(true, -1, -1);
    }

    public List<Client> findClientEntities(int maxResults, int firstResult) {
        return findClientEntities(false, maxResults, firstResult);
    }

    private List<Client> findClientEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Client.class));
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

    public Client findClient(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Client.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Client> rt = cq.from(Client.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
