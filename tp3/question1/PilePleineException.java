package question1;
public class PilePleineException extends Exception{
   
    public PilePleineException() {
        super("Exception: Pile Est Pleine!!");
    }
    
    public PilePleineException(String str) {
        super(str);
    }
    
    public String getMessage() {
        return super.getMessage();
    }
}