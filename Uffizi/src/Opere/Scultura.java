package Opere;

public class Scultura extends OperaArte {
	
	private double larghezza;
	private double altezza;
	private double profondit�;
	
	public Scultura(String titolo, String artista, double larghezza, double altezza, double profondit�) 
	    {
		  super(titolo,artista);
		  this.larghezza = larghezza;
		  this.altezza = altezza;
		  this.profondit� = profondit�; 
	    }
	
	public double ingombro() 
	     {
		   return this.altezza*this.larghezza*this.profondit�;
	     }

}
