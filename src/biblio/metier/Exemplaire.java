package biblio.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status= EnumStatusExemplaire.DISPONIBLE;
	private String isbn;
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
<<<<<<< HEAD
/*******************************constructeur
 * @throws BiblioException *******************************************/
=======
/*******************************constructeur***********************************************/
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir.git
	
<<<<<<< HEAD
	public Exemplaire(int id, Date dateAchat, EnumStatusExemplaire status, String isbn) throws BiblioException{
=======
	public Exemplaire(int id, Date dateAchat, String isbn){
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir.git
		setIdExemplaire(id);
		setDateAchat(dateAchat);
		setStatus(status);
		setIsbn(isbn);
	}
	
<<<<<<< HEAD
	public Exemplaire(int id, Date dateAchat, EnumStatusExemplaire status, String isbn, EmpruntEnCours empruntEnCours) throws BiblioException{
		setIdExemplaire(id);
		setDateAchat(dateAchat);
		setStatus(status);
		setIsbn(isbn);
		setEmpruntEnCours(empruntEnCours);
=======
	public Exemplaire() throws ParseException{
		this(1, sdf.parse("10/02/2000"), "IN12345");
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir.git
	}
	
	public Exemplaire() {
		
	}

/**********************************Getters et Setters****************************************/	
	public int getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
<<<<<<< HEAD
	
	public EmpruntEnCours getEmpruntEnCours() {
		return empruntEnCours;
	}

	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) throws BiblioException{
		if(empruntEnCours==null)
			this.empruntEnCours = empruntEnCours;
		else
		{
			if(empruntEnCours != this.empruntEnCours)
			{
				this.empruntEnCours=empruntEnCours;
				this.empruntEnCours.setExemplaire(this);
			}
		}
	}
=======
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir.git

/**************************toString***********************************************************/
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat="
<<<<<<< HEAD
				+ sdf.format(dateAchat) + ", status=" + status + ", isbn=" + isbn
				+ ", empruntEnCours=" + empruntEnCours + "]";
=======
				+ sdf.format(dateAchat) + ", status=" + status + ", isbn=" + isbn + "]";
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir.git
	}

/****************************Un exemplaire tient des prêts en cours******************************/	
	
/*	private static class EmpruntEnCours{
		
		private Date dateEmprunt;
		private Utilisateur emprunteur;
		private Exemplaire exemplaire;
		
<<<<<<< HEAD
		*//*******remarque***********************//*
=======
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir.git
		
		public Date getDateEmprunt() {
			return dateEmprunt;
		}
		public void setDateEmprunt(Date dateEmprunt) {
			this.dateEmprunt = dateEmprunt;
		}
		public Utilisateur getEmprunteur() {
			return emprunteur;
		}
		public void setEmprunteur(Utilisateur emprunteur) {
			this.emprunteur = emprunteur;
		}
		public Exemplaire getExemplaire() {
			return exemplaire;
		}
		public void setExemplaire(Exemplaire exemplaire) {
			this.exemplaire = exemplaire;
		}
	}*/

	
	
	

}
