package be.vdab.winkel;

import java.math.BigDecimal;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    public Product (String omschrijving, BigDecimal prijs){
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        if (omschrijving.trim().isEmpty()) {
            throw new IllegalArgumentException("Omschrijving moet ingevuld worden");
        }
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        if (prijs.compareTo((BigDecimal.ZERO) < 0)) {
            throw new IllegalArgumentException("Prijs moet ingevuld worden");
        }
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Product)){
            return false;
        }
        var product = (Product) object;
        return omschrijving.equals(product.omschrijving);

    }

    @Override
    public int hashCode(){
        return omschrijving.hashCode();
    }

    @Override
    public String toString(){
        return omschrijving+";"+prijs;
    }


}
