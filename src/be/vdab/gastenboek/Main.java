package be.vdab.gastenboek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var manager = new GastenBoekManager();
        var gastenboek = manager.lees();
        var scanner = new Scanner(System.in);
        System.out.println("T=tonen,S=schrijven,E=einde;");
        for ( String keuze; !(keuze = scanner.nextLine()).equals("E");) {
            switch (keuze) {
                case "T":
                case "t":
                    System.out.println(gastenboek);
                    break;
                case "S":
                case "s":
                    System.out.println("Schrijver: ");
                    var schrijver = scanner.nextLine();
                    System.out.println("Boodschap:");
                    var boodschap = scanner.nextLine();
                    gastenboek.toevoegen(new GastenboekEntry(schrijver, boodschap));
                    manager.schrijf(gastenboek);
                    break;
                default:
                    System.out.println("Verkeerde keuze");

            }
            System.out.println("T=tonen,S=schrijven,E=einde;");
        }


    }
}
