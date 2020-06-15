package be.vdab.hfdst17;

import java.util.ArrayList;

public class VBArrayList {
    public static void main(String[] args) {
        var al = new ArrayList<String>();
        al.add("fiets");
        al.add(null);
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen");
        al.add("boom");
        al.add("aap");

        System.out.println("4e element is: "+al.get(3));

        System.out.println("voorbeeld van een arraylist: ");
        for (var woord:al){
            System.out.println(woord);
        }

        System.out.println("\nWeergave mbv Iterator");
        for (var i = al.iterator(); i.hasNext();){

            var woord = i.next();
            System.out.println(woord);
        }
    }
}
