package Main;
import java.util.*;
import Opere.*;

public class main {

	public static void main (String[] args) {
		
		int scelta;
		boolean uscita=true;
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("MENU");
			System.out.println("Che cosa vuoi fare? ");
			System.out.println("1) Creare una collezione di opere d'arte;");
			System.out.println("2) Inserire una nuova opera;");
			System.out.println("3) Stampa la collezione;");
			System.out.println("4) Stampa l'ingombre delle varie opere;");
			System.out.println("5) Esci dal programma ");
			
		    scelta=input.nextInt();
		    
		    switch(scelta) {
		    
		    case 1:
		    	
		    	break;
		    case 2:
		    	
		    	break;
		    case 3:
		    	
		    	break;
		    case 4:
		    	
		    	break;
		    case 5:
		    	uscita=false;
		    	break;
		    default:
		    	System.out.println("INSERISCI SOLO CARATTERI CONSENTITI!");
		        break;
		    }
		    System.out.println("");
			System.out.println("");
		}while(uscita);
	
		
	}

}
