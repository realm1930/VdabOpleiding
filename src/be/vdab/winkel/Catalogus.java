package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class Catalogus {
    private Set<Product> producten = new LinkedHashSet<>();

    public Catalogus() {
        producten.add(new Product("1kg appels", BigDecimal.valueOf(1.34)));
        producten.add(new Product("1kg peren", BigDecimal.valueOf(1.56)));
        producten.add(new Product("netje citroenen", BigDecimal.valueOf(0.64)));
        producten.add(new Product("bakje aardbijen", BigDecimal.valueOf(2.85)));
        producten.add(new Product("1kg mandareinen", BigDecimal.valueOf(1.60)));
        producten.add(new Product("0.5kg noten", BigDecimal.valueOf(2.35)));
        producten.add(new Product("0.5 kg kastanjes", BigDecimal.valueOf(3.15)));
        producten.add(new Product("zakje rozijnen", BigDecimal.valueOf(1.90)));

    }
    public Set<Product> getProducten(){
        return producten;
    }

    @Override
    public String toString(){
        return producten.toString();
    }
}
