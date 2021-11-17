package Opere;

public class Quadro extends OperaArte{
	
	private double larghezza;
	private double altezza;
	
	public Quadro(String titolo , String artista, double larghezza, double altezza) 
	     {
		    super(titolo,artista);
		    this.larghezza = larghezza;
		    this.altezza = altezza;
	     }
	
	
	public double ingombro() 
	      {
		    return this.larghezza * this.altezza;
	      }
	
	public String getTitolo() { return this.titolo; }
    public String getArtista() { return this.artista; }	
    
	
	
	
	

}
