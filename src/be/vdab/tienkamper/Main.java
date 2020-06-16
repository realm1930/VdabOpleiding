package be.vdab.tienkamper;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        var Jurgen = new Tienkamper("Jurgen",8832);
        var Pol = new Tienkamper("Pol", 8891);
        var Jos = new Tienkamper("Jos",8847);
        var Flup = new Tienkamper("Flup", 8891);

        var lijst = new ArrayList<Tienkamper>();
        lijst.add(Jurgen);
        lijst.add(Pol);
        lijst.add(Jos);
        lijst.add(Flup);

        for (var eenTienkamper:lijst)
            System.out.println(eenTienkamper);
        System.out.println();

        var lijst2 = new TreeSet<Tienkamper>();

        lijst2.add(Jurgen);
        lijst2.add(Pol);
        lijst2.add(Jos);
        lijst2.add(Flup);

        for (var eenTienkamper:lijst2){
            System.out.println(eenTienkamper);

        }
        System.out.println();
    }
}
