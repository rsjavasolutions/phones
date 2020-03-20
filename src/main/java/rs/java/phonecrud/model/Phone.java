package rs.java.phonecrud.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private BigDecimal price;
    private LocalDate production;
    private boolean isNew;

    public Phone() {
    }

    public Phone(int id, String brand, String model, BigDecimal price, LocalDate production, boolean isNew) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.production = production;
        this.isNew = isNew;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getProduction() {
        return production;
    }

    public void setProduction(LocalDate production) {
        this.production = production;
    }

    public boolean isNew(boolean b) {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
