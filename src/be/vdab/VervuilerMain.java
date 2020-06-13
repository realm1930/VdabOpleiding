package be.vdab;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.verwarming.Stookketel;
import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Vrachtwagen;

import java.text.DecimalFormat;

public class VervuilerMain {
    public static void main(String[] args) {
        var persoon = new Personenwagen("Arne",500,100,10,"BJP-555",5,4);
        persoon.toon();
        System.out.println(persoon);
        var vracht = new Vrachtwagen("Jos",1000,200,20,"JPS-666",12000);
        vracht.toon();
        System.out.println(vracht);
        var fmt = new DecimalFormat("#0.00");
        System.out.println("Array van vervuilers: ");
        var vervuilers = new Vervuiler[3];
        vervuilers[0] = persoon;
        vervuilers[1] = vracht;
        vervuilers[2] = new Stookketel(7.5F);

        for (var vervuiler:vervuilers){
            System.out.println("vuil: "+fmt.format(vervuiler.berekenVervuiling()));
        }
        var voertuigen = new Privaat[2];
        voertuigen[0] = persoon;
        voertuigen[1] = vracht;
        for (var auto:voertuigen){
            auto.geefPrivateData();
        }
        var voertuigen2 = new Milieu[2];
        voertuigen2[0] = persoon;
        voertuigen2[1] = vracht;
        for(var auto:voertuigen2){
            auto.geefMilieuData();
        }


    }


}
