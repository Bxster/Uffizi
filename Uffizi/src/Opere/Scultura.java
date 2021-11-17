package Opere;

public class Scultura extends OperaArte {
	
	private double larghezza;
	private double altezza;
	private double profondità;
	
	public Scultura(String titolo, String artista, double larghezza, double altezza, double profondità) 
	    {
		  super(titolo,artista);
		  this.larghezza = larghezza;
		  this.altezza = altezza;
		  this.profondità = profondità; 
	    }
	
	public double ingombro() 
	     {
		   return this.altezza*this.larghezza*this.profondità;
	     }

}
