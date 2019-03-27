package question1;
public class PolygoneRegulier {
    
    private int nombreDeCotes;
    private int longueurDuCote;
    
    public PolygoneRegulier(int nombreDeCotes, int longueurDuCote) {
        this.nombreDeCotes = nombreDeCotes;
        this.longueurDuCote = longueurDuCote;
    }
    
    public int perimetre() {
        return nombreDeCotes * longueurDuCote;
    }
    
    public int surface() {
        return (int) (1 / 4.0 * nombreDeCotes * Math.pow(longueurDuCote, 2.0) *
        cotg(Math.PI / nombreDeCotes));
    }
    
    public int longueurDuCote(){ 
        return longueurDuCote; 
    }
    
    private static double cotg(double x) {
        return Math.cos(x) / Math.sin(x);
    }
    
    @Override
    public String toString(){
        return "Polygone(Cotes: "+nombreDeCotes+" long: "+longueurDuCote+")";
    }
}