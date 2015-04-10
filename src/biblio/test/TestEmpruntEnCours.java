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
		System.out.println("Nombre d'emprunts en cours: " + utilisateur1.getNbEmpruntsEnCours());
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
	Exemplaire exemplaire2 = new Exemplaire();
	Exemplaire exemplaire3 = new Exemplaire();
	Exemplaire exemplaire4 = new Exemplaire();
	System.out.println(exemplaire1);
	//System.out.println(exemplaire2);
	System.out.println();
	System.out.println();
	

	
/********************************************realiser un prêt en cours*****************************************************/
<<<<<<< HEAD
	System.out.println("***************************Réaliser un prêt**************************************");
=======
	System.out.println("***************************realiser un prêt en cours****************************");
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir
	exemplaire1.getEmprunt().setEmprunteur(adherent1);
	exemplaire1.getEmprunt().setExemplaire(exemplaire1);
<<<<<<< HEAD
	System.out.println("Afficher l'emprunt en cours de l'adherent1");
	System.out.println("---------------"+exemplaire1.getEmprunt());
	System.out.println("Afficher l'adherent1");
	System.out.println("----------------"+exemplaire1.getEmprunt().getEmprunteur().getNom());
	System.out.println("Afficher exemplaire1 emprunté");
	System.out.println("----------------"+exemplaire1);
=======
	exemplaire2.getEmprunt().setEmprunteur(adherent1);
	exemplaire2.getEmprunt().setExemplaire(exemplaire2);
	exemplaire3.getEmprunt().setEmprunteur(adherent1);
	exemplaire3.getEmprunt().setExemplaire(exemplaire3);
	exemplaire4.getEmprunt().setEmprunteur(adherent1);
	exemplaire4.getEmprunt().setExemplaire(exemplaire4);
	System.out.println(exemplaire1.getEmprunt());
	System.out.println(exemplaire2.getEmprunt());
	System.out.println(exemplaire3.getEmprunt());
	System.out.println(exemplaire4.getEmprunt());
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir
	System.out.println();
<<<<<<< HEAD
	System.out.println();
=======
	//System.out.println(exemplaire1);

/********************************************connaître le nombre d'emprunts*****************************************************/
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir
	
<<<<<<< HEAD
/*****************************************rendre le livre*******************************************************************/	
	/*	exemplaire1.getEmprunt().setEmprunteur(null);
		exemplaire1.getEmprunt().setExemplaire(null);
		System.out.println(exemplaire1.getEmprunt());
	*/
	
	
=======
	System.out.println("***************************connaître le nombre d'emprunts****************************");
	adherent1.addEmpruntEnCours(exemplaire1.getEmprunt());
	adherent1.addEmpruntEnCours(exemplaire2.getEmprunt());
	adherent1.addEmpruntEnCours(exemplaire3.getEmprunt());
	adherent1.addEmpruntEnCours(exemplaire4.getEmprunt());
	System.out.println("Nombre d'emprunts en cours pour l'adherent ("+adherent1.getNom()+" "+adherent1.getPrenom()+"): "+adherent1.getNbEmpruntsEnCours());
	System.out.println("Liste des emprunts en cours pour l'adherent ("+adherent1.getNom()+" "+adherent1.getPrenom()+"): "+adherent1.getEmpruntEnCours());
	if(adherent1.isConditionsPretAcceptees()==false)
		System.out.println("L'adherent ("+adherent1.getNom()+" "+adherent1.getPrenom()+") a des prets non acceptés");
	else
		System.out.println("L'adherent ("+adherent1.getNom()+" "+adherent1.getPrenom()+") a des prets acceptés");
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir
	}
}
