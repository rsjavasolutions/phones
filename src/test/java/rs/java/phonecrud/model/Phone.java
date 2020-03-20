package rs.java.phonecrud.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "phone")
public class Phone {

    private String brand;
    private String model;
    private BigDecimal price;
    private LocalDate production;
    private boolean isNew;

    public Phone() {
    }

    public Phone(String brand, String model, BigDecimal price, LocalDate production, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.production = production;
        this.isNew = isNew;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
