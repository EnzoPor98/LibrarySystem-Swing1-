package Class;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Enzo Portillo.
 */
@Entity
public class Sanction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Client client;
    @Basic
    private String reason;
    @Temporal(TemporalType.DATE)
    private Date sanctDate;

    // =================================================== CONSTRUCTOR METHODS.
    public Sanction() {
    }

    public Sanction(int id, Client client, String reason, Date sanctDate) {
        this.id = id;
        this.client = client;
        this.reason = reason;
        this.sanctDate = sanctDate;
    }

    // ===================================================== GETTERS & SETTERS.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getSanctDate() {
        return sanctDate;
    }

    public void setSanctDate(Date sanctDate) {
        this.sanctDate = sanctDate;
    }
}
