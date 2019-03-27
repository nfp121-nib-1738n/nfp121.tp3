package question1;

import question2.PileI;

public class Pile implements PileI{ 

  public final static int TAILLE_PAR_DEFAUT = 5; 

  private Object[] zone; 
  private int ptr; 
  private int taille;
  private int ID;
  public static int nextID = 1;

  public Pile(int taille) { 
    if (taille < 0) this.taille = TAILLE_PAR_DEFAUT;
    else this.taille = taille;
    
    this.ID = this.nextID++;
    this.zone = new Object[this.taille]; 
    this.ptr = 0; 
  } 

  public Pile() { 
    this(TAILLE_PAR_DEFAUT); 
  } 

  @Override
  public void empiler(Object i) throws PilePleineException { 
    if (estPleine()) 
      throw new PilePleineException(); 
    this.zone[this.ptr] = i; 
    this.ptr++; 
  } 

  @Override
  public Object depiler() throws PileVideException { 
    if (estVide()) 
      throw new PileVideException(); 
    this.ptr--; 
    return zone[ptr].toString(); 
  } 

  @Override
  public boolean estVide() { 
    return ptr == 0; 
  } 

  @Override
  public boolean estPleine() { 
    return ptr == zone.length; 
  } 

  @Override 
  public String toString() { 
    StringBuffer sb = new StringBuffer("["); 
    for (int i = ptr - 1; i >= 0; i--) { 
      sb.append(zone[i].toString()); 
      if (i > 0) 
        sb.append(", "); 
    } 
    sb.append("]"); 
    return sb.toString(); 
  } 
  
  @Override
  public Object sommet() throws PileVideException {
      if(this.estVide()) return null;
      return zone[ptr-1];
  }
  
  @Override
  public int capacite() {
      if(this.estVide()) return 0;
      return ptr-1;
  }
  
  @Override
  public int taille() {
      return this.taille;
  }
  
  @Override
  public boolean equals(Object o) {
      if(this.toString().equals(((Pile)o).toString())) return true;
      return false;
  }
  
  @Override
  public int hashCode() {
      return this.ID;
  }
  
}