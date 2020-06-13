package be.vdab.jpfhfdst10;

public class KostProgramma {
    public static void main(String[] args) {
        var eddy = new Werknemer("Eddy",2000.0);
        var elly = new Werknemer("Elly",2500.0);
        var daf = new Vrachtwagen("DAF", 0.35,25000,150000.0,8);
        var konica = new Kopieermachine("Konica", 0.02,9000);
        var personeelsKosten = 0.0;
        var andereKosten = 0.0;

        if(eddy.personeelsKost())
            personeelsKosten += eddy.bedragKost();
        else
            andereKosten += eddy.bedragKost();

        if(elly.personeelsKost())
            personeelsKosten += elly.bedragKost();
        else
            andereKosten += elly.bedragKost();
        if (daf.personeelsKost())
            personeelsKosten += daf.bedragKost();
        else
            andereKosten += daf.bedragKost();
        if (konica.personeelsKost())
            personeelsKosten += konica.bedragKost();
        else
            andereKosten = andereKosten + konica.bedragKost();
        System.out.println(personeelsKosten);
        System.out.println(andereKosten);


    }
}
