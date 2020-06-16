package be.vdab.BeginLetter;

import java.util.HashMap;

public class Beginletter {

    public static void main(String[] args) {
        String[] woorden = {"een","twee","drie","vier","vijf","zes","zeven","acht","negen","tien"};
        var hashMapAantal = new HashMap<Character, Integer>();
        for (var woord:woorden){
            if (hashMapAantal.containsKey(woord.charAt(0)) == false) {
                hashMapAantal.put(woord.charAt(0),1);

            } else {
                hashMapAantal.put(woord.charAt(0),hashMapAantal.get(woord.charAt(0))+1);
            }
        }
        System.out.println("Aantal woorden die beginnen met elke letter:");
        System.out.println(hashMapAantal);
        System.out.println("Size: "+hashMapAantal.size());
        System.out.println("isEmpty?:"+hashMapAantal.isEmpty());
        System.out.println("---set keys---");
        for (var c : hashMapAantal.keySet()){
            System.out.println(c);
        }
        System.out.println("--- set values ---");
        for (var i : hashMapAantal.values()){
            System.out.println(i);
        }
        System.out.println("--- set map.entries");
        for (var entry : hashMapAantal.entrySet()){
            System.out.println(entry);
            System.out.println("of anders: "+entry.getKey()+":"+entry.getValue());
        }
    }
}
