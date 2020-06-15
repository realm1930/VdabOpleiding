package be.vdab.util;

public class LandException extends RuntimeException {
    public LandException() {
    }
    public LandException(String omschrijving){
        super(omschrijving);
    }
}
