package biblio.test;

import java.text.ParseException;

import biblio.metier.BiblioException;
import biblio.metier.EmpruntEnCours;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;
import biblio.metier.Utilisateur;

public class TestLivre {
	public static void main(String[] args) throws ParseException {
		
		Utilisateur u1=new Utilisateur("PAUL","Jean",Utilisateur.sdf.parse("19/06/1999"),"Homme",12,"eau","voiture");
		Exemplaire e1=new Exemplaire();
		EmpruntEnCours ec=new EmpruntEnCours();
		
		try {
			e1 = new Exemplaire(9,Exemplaire.sdf.parse("12/01/2000"),EnumStatusExemplaire.DISPONIBLE,"44568878");
		} catch (BiblioException e) {
			System.out.println(e);
		}
		try {
			ec = new EmpruntEnCours(EmpruntEnCours.sdf.parse("05/11/2005"),u1);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		
		try {
			e1.setEmpruntEnCours(ec);
		} catch (BiblioException e) {
			System.out.println(e);
		}
/*		try {
			ec.setExemplaire(e1);
		} catch (BiblioException e) {
			System.out.println(e);
		}*/
		
		System.out.println("e1: "+e1);
		System.out.println("ec: "+ec);
		
	}
}
