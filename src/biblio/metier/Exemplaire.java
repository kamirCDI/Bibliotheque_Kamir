package biblio.metier;

import java.util.Date;

public class Exemplaire {
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	
	private static class EmpruntEnCours{
		private Date dateEmprunt;
		private Utilisateur emprunteur;
	}
	
	

}
