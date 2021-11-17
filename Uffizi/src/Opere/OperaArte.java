package Opere;

public abstract class OperaArte {
	
	protected String titolo;
	protected String artista;
	
	public OperaArte(String titolo , String artista) 
	      { 
		     this.titolo = titolo;
		     this.artista = artista;
	      }
	
	public abstract double ingombro(); 
	public boolean eqauls(Object o) 
	              {
		           if(o instanceof Quadro ) 
		        	  { 
		        	    Quadro q = ((Quadro)o);
		        	    if(q.ingombro() == this.ingombro() && q.getTitolo().equals(this.titolo)) return true;
		        	   
		        	  }
		           
		           if(o instanceof Scultura ) 
		        	  { 
		        	    Scultura q = ((Scultura)o);
		        	    if(q.ingombro() == this.ingombro() && q.getTitolo().equals(this.titolo)) return true;
		        	   
		        	  }
		           return false; 
	              }
		 
   public String getTitolo() { return this.titolo; }
 
   
   public String toString() 
        {
	       return "TITOLO: " + this.titolo + " ARTISTA: " + this.titolo;
        }
		               


}
