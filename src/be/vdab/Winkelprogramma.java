package be.vdab;

import be.vdab.winkel.Catalogus;
import be.vdab.winkel.Mandje;

public class Winkelprogramma {

    public static void main(String[] args) {

        var catalogus = new Catalogus();
        var mandje = new Mandje();
        System.out.println(mandje);
        System.out.println(catalogus);
        var teller = 1;
        for (var product : catalogus.getProducten()){
            if (teller % 2 == 0){
                mandje.add(product,teller);

            }
            teller++;
        }
        System.out.println("u kocht:");
        for (var entry:mandje.getMandje().entrySet()){
            System.out.println((entry.getKey())+"; aantal stuks: "+entry.getValue());
        }
        System.out.println();
        System.out.println("u kocht voor een totaal van : " + mandje.getTotalePrijs());
    }

}
