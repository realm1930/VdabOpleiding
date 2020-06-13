package be.vdab.voertuigen;

import be.vdab.util.Vervuiler;

public class Vrachtwagen extends Voertuig implements Vervuiler {
    private float maxLading = 10000.0F;

    public Vrachtwagen(String polishouder, float kostprijs,
                       int pk, float gemVerbruik, String nummerplaat,
                       float maxLading){
        super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
        if (maxLading >=0) {
            this.maxLading = maxLading;
        }

    }
    @Override
    public String toString() {
        return super.toString() + "; " + maxLading;
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("Maximum lading: "+maxLading);
    }
    @Override
    public double getKyotoScore(){
        return getGemVerbruik()*getPk()/(maxLading/1000.0F);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore()*20.0F;
    }
}
