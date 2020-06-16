package be.vdab.tienkamper;

import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper> {
    private String naam;
    private int punten;

    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Tienkamper)){
            return false;
        }
        Tienkamper andere = (Tienkamper) o;
        return naam.equals(andere.naam);
    }

    @Override
    public int compareTo(Tienkamper tienkamper){
        return naam.compareTo(tienkamper.naam);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public String toString() {
        return naam + " - "+punten;
    }
}
