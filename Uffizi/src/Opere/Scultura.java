package Opere;

public class Scultura extends OperaArte {
	
	private double larghezza;
	private double altezza;
	private double profonditÓ;
	
	public Scultura(String titolo, String artista, double larghezza, double altezza, double profonditÓ) 
	    {
		  super(titolo,artista);
		  this.larghezza = larghezza;
		  this.altezza = altezza;
		  this.profonditÓ = profonditÓ; 
	    }
	
	public double ingombro() 
	     {
		   return this.altezza*this.larghezza*this.profonditÓ;
	     }

}
