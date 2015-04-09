package biblio.test;

import java.text.ParseException;

import biblio.metier.EmpruntEnCours;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;
import biblio.metier.Utilisateur;

public class TestLivre {
	public static void main(String[] args) throws ParseException {
		
		Utilisateur u1=new Utilisateur("PAUL","Jean",Utilisateur.sdf.parse("19/06/1999"),"Homme",12,"eau","voiture");
		Exemplaire e1=new Exemplaire(9,Exemplaire.sdf.parse("12/01/2000"),EnumStatusExemplaire.DISPONIBLE,"44568878");
		EmpruntEnCours ec=new EmpruntEnCours(EmpruntEnCours.sdf.parse("05/11/2005"),u1);
		//e1.setEmpruntEnCours(ec);
		ec.setExemplaire(e1);
		System.out.println("e1: "+e1);
		System.out.println("ec: "+ec);
		
	}
}
