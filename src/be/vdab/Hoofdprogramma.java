package be.vdab;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class Hoofdprogramma {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp [3];
        try {
            voorwerpen[0] = new Leesboek();
        } catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[1] = new Leesboek("978-14-302-4764-7","java","oracle",20.4F,"informatica","programmeren");
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try{
            voorwerpen[2] = new Woordenboek("978-90-664-8143-9","woordenboek engels","van dale",30.10F,"genre woordenboek","engels");
        } catch(Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        var totaleWinst = 0;
        for (var eenVoorwerp:voorwerpen){
            if(eenVoorwerp != null){
                eenVoorwerp.gegevensTonen();;
                System.out.println();
                totaleWinst += eenVoorwerp.winstBerekenen();
            }
        }
        System.out.println("De totale winst is: "+totaleWinst);
    }
}
