package eku.e_commerce.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name="PRODUCTSNAME")
public class Products {


    @Id
    private int id;
    private String pname;
    private String description;
    private String price;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate added;

    public Products(int id, String pname, String description, String price, LocalDate added) {
        this.id = id;
        this.pname = pname;
        this.description = description;
        this.price = price;
        this.added = added;
    }

    public Products(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getAdded() {
        return added;
    }

    public void setAdded(LocalDate added) {
        this.added = added;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", added=" + added +
                '}';
    }
}
