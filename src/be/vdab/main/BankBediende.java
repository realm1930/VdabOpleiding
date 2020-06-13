package be.vdab.main;

import be.vdab.rekening.Rekening;
import be.vdab.rekening.Spaarrekening;
import be.vdab.rekening.Zichtrekening;
import be.vdab.util.RekeningnummerException;

public class BankBediende {
    public static void main(String[] args) {
        var rekeningen = new Rekening[7];
        try {
            rekeningen[0] = new Spaarrekening("BE68 1234 56789 9002", 1.5);
            rekeningen[0].storten(100.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}