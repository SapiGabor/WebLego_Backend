package hu.unideb.inf.lego.exception;

public class LegoNotFoundException extends RuntimeException {
    public LegoNotFoundException(String message){
        super(message);
    }
}
