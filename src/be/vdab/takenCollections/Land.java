package be.vdab.takenCollections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import be.vdab.util.LandException;

public class Land {
    private String landCode;
    private String landNaam;
    private String hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdstad, BigInteger aantalInwoners, BigDecimal oppervlakte) {
        this.landCode = landCode;
        this.landNaam = landNaam;
        this.hoofdstad = hoofdstad;
        this.aantalInwoners = aantalInwoners;
        this.oppervlakte = oppervlakte;
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        if (landCode.trim().isEmpty() || landCode == null) {
            throw new LandException("Landcode verplicht in te vullen");
        }
        this.landCode = landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public void setLandNaam(String landNaam) {
        if (landNaam == null || landNaam.trim().isEmpty()) {
            throw new LandException("Landnaam verplicht in te vullen");
        }
        this.landNaam = landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public void setHoofdstad(String hoofdstad) {
        if (hoofdstad == null || hoofdstad.trim().isEmpty()) {
            throw new LandException("Hoofstad verplicht in te vullen");
        }

        this.hoofdstad = hoofdstad;
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(BigInteger aantalInwoners) {
        if (aantalInwoners.compareTo(BigInteger.ZERO)<=0) {
            throw new LandException("Aantalinwoners verplicht in te vullen");
        }
        this.aantalInwoners = aantalInwoners;
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(BigDecimal oppervlakte) {
        if (oppervlakte.compareTo(BigDecimal.ZERO)<=0) {
            throw new LandException("Oppervlakte verplicht in te vullen");
        }
        this.oppervlakte = oppervlakte;
    }

    public BigDecimal bevolkingsDichtheid(){
        var bevolkingsDichtheid = new BigDecimal(aantalInwoners).divide(oppervlakte,2, RoundingMode.HALF_UP);
        return bevolkingsDichtheid;
    }

    @Override
    public String toString(){
        return landCode + ";"+landNaam+";"+hoofdstad+";"+aantalInwoners+";"+oppervlakte+";"+bevolkingsDichtheid();
    }

}
