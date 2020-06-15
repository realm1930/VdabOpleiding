package be.vdab.voertuigen;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        var setVoertuigen = new TreeSet<Voertuig>();
        var persoon = new Personenwagen("Arne",500,100,10,"BJP-555",5,4);
        persoon.toon();
        System.out.println(persoon);
        var vracht = new Vrachtwagen("Jos",1000,200,20,"JPS-666",12000);
        vracht.toon();

        setVoertuigen.add(persoon);
        setVoertuigen.add(new Personenwagen("Piet peters", 18321.0F,110,7.1F,"1-lkj-654",5,5));
        setVoertuigen.add(vracht);

        System.out.println("\nTreeset Voertuigen;");
        for (var eenVoertuig : setVoertuigen){
            System.out.println(eenVoertuig.hashCode());
            System.out.println(eenVoertuig);
        }
    }

}
