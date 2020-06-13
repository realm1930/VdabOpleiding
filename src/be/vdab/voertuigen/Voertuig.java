package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;

public abstract class Voertuig implements Privaat, Milieu {
    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig(){
    }
    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat){
        if (nummerplaat != null && !nummerplaat.isEmpty()) {
            this.nummerplaat = nummerplaat;
        }
        if (gemVerbruik > 0) {
            this.gemVerbruik = gemVerbruik;
        }
        if (polishouder != null &&!polishouder.isEmpty()){
            this.polishouder = polishouder;
        }
        if (kostprijs > 0){
            this.kostprijs = kostprijs;
        }
        if (pk > 0){
            this.pk = pk;
        }
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        this.kostprijs = kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        this.gemVerbruik = gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    @Override
    public String toString(){
        return polishouder+"; "+kostprijs+"; "+pk+"; "+gemVerbruik+"; "+nummerplaat;
    }
    public void toon(){
        System.out.print("Naam polishouder: "+polishouder+"\nKostprijs auto: "+kostprijs+"\npk auto: "+pk+
                "\nGemiddeld verbruik auto: "+gemVerbruik+"\nNummerplaat auto: "+nummerplaat+"\n");
    }


    public abstract double getKyotoScore();

    @Override
    public void geefPrivateData(){
        System.out.println("-- Private voertuig data --");
        System.out.println("Polishouder :"+getPolishouder());
        System.out.println("Nummerplaat: "+getNummerplaat());
    }

    @Override
    public void geefMilieuData(){
        System.out.println("-- Milieu data voertuig --");
        System.out.println("PK : "+getPk());
        System.out.println("Kostprijs: "+ getKostprijs());
        System.out.println("Gem. verbruik: "+getGemVerbruik());
    }


}
