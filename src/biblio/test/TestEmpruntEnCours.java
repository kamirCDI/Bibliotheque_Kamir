package biblio.test;
import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import biblio.metier.*;

public class TestEmpruntEnCours {

	public static void main(String[] args) throws ParseException, BiblioException { 
		
		
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
		
/***********************************************creation d'un adherent*******************************************************************/
		System.out.println("***************************creation d'un adhérent****************************");
		System.out.println();		
		Adherent adherent1 = new Adherent();
		System.out.println(adherent1);

	
	
/****************************************Instanciation d'un exemplaire*************************************************************/
	
	System.out.println("***************************creation d'un exemplaire****************************");
	System.out.println();		
	Exemplaire exemplaire1 = new Exemplaire();
	System.out.println(exemplaire1);
	System.out.println();
	System.out.println();
	

	
/********************************************realiser un prêt en cours*****************************************************/
	System.out.println("***************************Réaliser un prêt**************************************");
	exemplaire1.getEmprunt().setEmprunteur(adherent1);
	exemplaire1.getEmprunt().setExemplaire(exemplaire1);
	System.out.println("Afficher l'emprunt en cours de l'adherent1");
	System.out.println("---------------"+exemplaire1.getEmprunt());
	System.out.println("Afficher l'adherent1");
	System.out.println("----------------"+exemplaire1.getEmprunt().getEmprunteur().getNom());
	System.out.println("Afficher exemplaire1 emprunté");
	System.out.println("----------------"+exemplaire1);
	System.out.println();
	System.out.println();
	
/*****************************************rendre le livre*******************************************************************/	
	/*	exemplaire1.getEmprunt().setEmprunteur(null);
		exemplaire1.getEmprunt().setExemplaire(null);
		System.out.println(exemplaire1.getEmprunt());
	*/
	
	
	}
}
