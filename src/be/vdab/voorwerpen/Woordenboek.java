package be.vdab.voorwerpen;
import be.vdab.util.Isbn13Exception;


public class Woordenboek extends Boek {

    private String taal;
    private static final float WINSTMARGE = 1.75F;

    public Woordenboek() throws Isbn13Exception {
        this("978-90-664-8384-2", "Woordenboek Engels", "Van Dale",25.8F,"verklarend woordenboek","taal nederlands");
    }

    public Woordenboek(String isbn13, String titel, String auteur, float aankoopPrijs, String genre, String taal) {
        super(isbn13, titel, auteur, aankoopPrijs, genre);
        setTaal(taal);
    }


    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        if (taal != null) {
            this.taal = taal;
        }
    }

    public static float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public void gegevensTonen(){
        super.gegevensTonen();
        System.out.println("taal: "+ taal);
        System.out.println("winst: "+winstBerekenen());
    }
    @Override
    public float winstBerekenen() {
        return super.getAankoopPrijs()*WINSTMARGE;
    }
}
