package question1;

public class PileVideException extends Exception{
   
    public PileVideException() {
        super("Exception: Pile Est Vide!!");
    }
    
    public PileVideException(String str) {
        super(str);
    }
    
    public String getMessage() {
        return super.getMessage();
    }
}