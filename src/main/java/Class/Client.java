package Class;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Enzo Portillo.
 */
@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String name;
    private String dni;
    private String adress;
    private String contact;
    private String dateIn;
    @OneToMany(mappedBy = "client")
    private List<Sanction> sancList;
    @OneToMany(mappedBy = "client")
    private List<Loan> loanList;

    // =================================================== CONSTRUCTOR METHODS.
    public Client() {
    }

    public Client(int id, String name, String dni, String adress, String contact,
            String dateIn, List<Loan> loanList, List<Sanction> sancList) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.adress = adress;
        this.contact = contact;
        this.dateIn = dateIn;
        this.loanList = loanList;
        this.sancList = sancList;
    }

    // ===================================================== GETTERS & SETTERS.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    public List<Sanction> getSancList() {
        return sancList;
    }

    public void setSancList(List<Sanction> sancList) {
        this.sancList = sancList;
    }
}
