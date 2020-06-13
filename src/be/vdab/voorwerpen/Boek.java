package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;
    private String isbn13;


    protected Boek(String isbn13, String titel, String auteur, float aankoopPrijs, String genre) throws Isbn13Exception {
        setIsbn13(isbn13);
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
    }

    public String getIsbn13() {
        return isbn13;
    }

    private final void setIsbn13(String isbn13) {
        if (checkIsbn13(isbn13)){
            this.isbn13 = isbn13;
        } else {
            throw new Isbn13Exception("laatste cijfer is ongeldig");
        }
    }

    public String getTitel() {
        return titel;
    }

    public final void setTitel(String titel) {
        if (auteur != null) {
            this.titel = titel;
        }
    }

    public String getAuteur() {
        return auteur;
    }

    public final void setAuteur(String auteur) {
        if (auteur != null) {
            this.auteur = auteur;
        }
    }

    public float getAankoopPrijs() {
        return aankoopPrijs;
    }

    public final void setAankoopPrijs(float aankoopPrijs) {
        if (aankoopPrijs>0) {
            this.aankoopPrijs = aankoopPrijs;
        }
    }

    public String getGenre() {
        return genre;
    }

    public final void setGenre(String genre) {
        if (genre != null) {
            this.genre = genre;
        }
    }

    @Override
    public void gegevensTonen(){
        System.out.println("Gegevens boek");
        System.out.println("titel: "+ titel);
        System.out.println("auteur: "+ auteur);
        System.out.println("eigendom van: "+EIGENAAR);
        System.out.println("aankoopprijs: "+ aankoopPrijs);
        System.out.println("genre: "+genre);

    }
    @Override
    public String toString(){
        return (titel+";"+auteur+";"+EIGENAAR+";"+aankoopPrijs+";"+genre);
    }

    private boolean checkIsbn13(String isbn13){
        if (isbn13 == null || isbn13.trim().isEmpty()){
            return false;
        }
        isbn13 = isbn13.replaceAll("-","");

        if (isbn13.length() != 13){
            return false;
        }
        try {
            var tot=0;
            int factor;
            for (var i=0;i<12;i++){
                var digit = Integer.parseInt(isbn13.substring(i,i+1));
                factor = (i%2 == 0)?1:3;
                tot += factor * digit;

            }
            var checksom = 10 - (tot %10);
            if (checksom == 10){
                checksom = 0;
            }
            return checksom == Integer.parseInt(isbn13.substring(12));
        } catch (NumberFormatException ex){
            return false;
        }
    }

}
