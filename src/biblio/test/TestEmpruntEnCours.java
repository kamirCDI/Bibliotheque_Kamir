package biblio.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import biblio.metier.*;

public class TestEmpruntEnCours {

	public static void main(String[] args) throws ParseException { 
		
		
/**********************************Instanciation de la classe Personne, Utilisateur, Adherent, Employe****************************************************************/
		
                         /***************************Test classe Personne****************************************************************************/
		System.out.println("******************************Test de la classe Personne******************************");
		System.out.println();
		Personne personne1 = new Personne();
		System.out.println(personne1);
		System.out.println();
		System.out.println();
		
		
		System.out.println("******************Test de la classe utilisateur**************************");
		System.out.println();
		Utilisateur utilisateur1 = new Utilisateur();
		System.out.println(utilisateur1);
		System.out.println("Nombre d'emprunts en cours :" + utilisateur1.getNbEmpruntsEnCours());
		System.out.println();
		System.out.println();
		
/****************************************Instanciation d'un exemplaire*************************************************************/
		
		System.out.println("***************************creation d'un exemplaire****************************");
		System.out.println();		
		Exemplaire exemplaire1 = new Exemplaire();
		System.out.println(exemplaire1);
		
/***********************************************creation d'un adherent*******************************************************************/	
	}

}
