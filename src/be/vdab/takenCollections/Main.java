package be.vdab.takenCollections;

import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Land hetLand = null;
        var aantalLanden = 0;

        BigDecimal gemBevolkingsdichtheid;

        var landen = new ArrayList<Land>();
       try {
           landen.add(new Land("BE", "België", "Brussel", BigInteger.valueOf(11000000),BigDecimal.valueOf(30689.36)));
       } catch (LandException le){
           System.out.println(le.getMessage());
       }
       try {
           landen.add(new Land("Bg", "Bulgarije", "Sofia", BigInteger.valueOf(7800000L), BigDecimal.valueOf(111002.42)) );
       } catch (LandException le) {
           System.out.println(le.getMessage());
       }

       var totBevolkingsdichtheid = BigDecimal.ZERO;
       var absVerschil = BigDecimal.valueOf(Double.MAX_VALUE);
       for (var eenLand : landen){
           if(eenLand != null){
               totBevolkingsdichtheid = totBevolkingsdichtheid.add(eenLand.bevolkingsDichtheid());
               aantalLanden++;
               System.out.println(eenLand);
           }
        }
       gemBevolkingsdichtheid = totBevolkingsdichtheid.divide(BigDecimal.valueOf(aantalLanden), 2 , RoundingMode.HALF_UP);
       for (var eenLand : landen){
           if( (eenLand.bevolkingsDichtheid().subtract((gemBevolkingsdichtheid)).abs().compareTo(absVerschil))<0){
               hetLand = eenLand;
               absVerschil = (eenLand.bevolkingsDichtheid().subtract((gemBevolkingsdichtheid)).abs());
           }
       }

    }

}
