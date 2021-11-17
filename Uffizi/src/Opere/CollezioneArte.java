package Opere;

import java.util.*;

public class CollezioneArte {
	
	private String nome;
	private String luogo;
	private  ArrayList<OperaArte>op = new ArrayList();
	
	public CollezioneArte(String nome, String luogo) 
	     {
		    this.nome = nome;
		    this.luogo = luogo;  
	     }
	
	public String getNome() { return this.nome; }
	public String getLuogo() { return this.luogo; }
	
	
	public boolean addOpera(OperaArte OP) 
	     {
		   if(op.contains(OP)) return false;
		     else 
		        {
		    	   op.add(OP);
		    	   return true; 
		        }
		   
	     }
	
	
	public ArrayList<String> totOpereArte() 
	      {
		     ArrayList<String> ritorno = new ArrayList(); 
		     for(OperaArte o : op) ritorno.add(o.toString());  
		     
		     return ritorno; 
	      }

}
