package Class;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Enzo Portillo.
 */
@Entity
public class Loan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    private Book book;
    @ManyToOne
    private Client client;
    @Basic
    private int amount;
    @Temporal(TemporalType.DATE)
    private Date dateOut;
    @Temporal(TemporalType.DATE)
    private Date dateIn;
    @Basic
    private String status;

    // =================================================== CONSTRUCTOR METHODS.
    public Loan() {
    }

    public Loan(int id, Book book, Client client, int amount, Date dateOut, Date dateIn, String status) {
        this.id = id;
        this.book = book;
        this.client = client;
        this.amount = amount;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
        this.status = status;
    }

    // ===================================================== GETTERS & SETTERS.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
