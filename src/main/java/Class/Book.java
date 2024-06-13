package Class;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Enzo Portillo.
 */
@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String title;
    private String author;
    @Basic
    private String datePubl;
    private String edit;
    private String categ;
    private int stock;
    private int available;

    // =================================================== CONSTRUCTOR METHODS.
    public Book() {
    }

    public Book(int id, String title, String author, String datePubl,
            String edit, String categ, int stock, int available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.datePubl = datePubl;
        this.edit = edit;
        this.categ = categ;
        this.stock = stock;
        this.available = available;
    }

    // ===================================================== GETTERS & SETTERS.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDatePubl() {
        return datePubl;
    }

    public void setDatePubl(String datePubl) {
        this.datePubl = datePubl;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
