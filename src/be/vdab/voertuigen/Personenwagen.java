package be.vdab.voertuigen;

import be.vdab.util.Vervuiler;

public class Personenwagen extends Voertuig implements Vervuiler {
    private int aantalDeuren = 4;
    private int aantalPasagiers = 5;

    public Personenwagen(String polishouder, float kostprijs, int pk,
                         float gemVerbruik, String nummerplaat,
                         int aantalDeuren, int aantalPasagiers){
        super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
        if (aantalDeuren>=0) {
            this.aantalDeuren = aantalDeuren;
        }
        if (aantalPasagiers>=0) {
            this.aantalPasagiers = aantalPasagiers;
        }
    }



    @Override
    public String toString(){
        return super.toString()+"; "+aantalDeuren+"; "+aantalPasagiers;
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("Aantal deuren: "+aantalDeuren);
        System.out.println("Aantal pasagiers: "+aantalPasagiers);
    }
    @Override
    public double getKyotoScore(){
        return getGemVerbruik()*getPk()/aantalPasagiers;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore()*5.0F;
    }
}
