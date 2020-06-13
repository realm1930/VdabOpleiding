package be.vdab.jpfhfdst10;

public class Kostprogramma2 {
    public static void main(String[] args) {
        var kosten = new Kost[4];
        kosten[0] = new Werknemer("Eddy", 2000.0);
        kosten[1] = new Werknemer("Elly",2500.0);
        kosten[2] = new Vrachtwagen("DAF", 0.35,25000,150000.0,8);
        kosten[3] = new Kopieermachine("Konica",0.02,9000);

        var personeelsKosten = 0.0;
        var andereKosten = 0.0;

        for (var eenKost : kosten){
            if (eenKost.personeelsKost())
                personeelsKosten += eenKost.bedragKost();
            else
                andereKosten += eenKost.bedragKost();
        }
        System.out.println("personeelskosten: "+ personeelsKosten);
        System.out.println("andere kosten: "+andereKosten);

    }
}
