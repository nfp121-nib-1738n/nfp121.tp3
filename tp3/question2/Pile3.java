package question2;

import java.util.Vector; 

import question1.PilePleineException; 
import question1.PileVideException;

public class Pile3 implements PileI { 
    
  public final static int TAILLE_PAR_DEFAUT = 5; 
  
  private Vector v; 
  private int taille;
  private int capacite;
  
  public Pile3() {
      this.taille = TAILLE_PAR_DEFAUT;
      this.v = new Vector(this.taille); 
  }
  
  public Pile3(int taille) {
      if (taille < 0) this.taille = TAILLE_PAR_DEFAUT;
      else this.taille = taille;
      
      this.v = new Vector(this.taille); 
  }
    
  @Override
  public void empiler(Object i) throws PilePleineException { 
    if (estPleine()) throw new PilePleineException(); 
    else {
        v.add(i);
    }
  } 

  @Override
  public Object depiler() throws PileVideException { 
    if (estVide()) throw new PileVideException();
    return v.removeElement(v.lastElement()); 
  } 
  
  @Override
  public boolean estVide() { 
    return this.v.isEmpty();
  } 

  @Override
  public boolean estPleine() { 
    return this.v.size() == this.v.capacity(); 
  } 

  @Override 
  public String toString() { 
    StringBuffer sb = new StringBuffer("["); 
    int count = 0;
    for(Object tmp : this.v) { 
      if (count > 0) sb.append(", ");
      sb.append(tmp.toString()); 
    } 
    sb.append("]"); 
    return sb.toString(); 
  } 
  
  @Override
  public Object sommet() throws PileVideException {
      return this.v.firstElement();
  }
  
  @Override
  public int capacite() {
      return this.v.capacity();
  }
  
  @Override
  public int taille() {
      return this.v.size();
  }
  
  @Override
  public boolean equals(Object o) {
      if(this.toString().equals(((Pile3)o).toString())) return true;
      return false;
  }
  
  @Override
  public int hashCode() {
      return this.v.hashCode();
  }
    
}