package biblio.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status =  EnumStatusExemplaire.DISPONIBLE;
	private String isbn;
	private EmpruntEnCours emprunt;
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	

/*******************************constructeur***********************************************/

	public Exemplaire(int id, Date dateAchat, String isbn) throws BiblioException{
		setIdExemplaire(id);
		setDateAchat(dateAchat);
		setIsbn(isbn);	
		emprunt = new EmpruntEnCours();
	}

	
	public Exemplaire() throws BiblioException, ParseException
	{
		this(1, sdf.parse("15/02/2000"), "1MJ23");
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

	
	public EmpruntEnCours getEmprunt() {
		return emprunt;
	}
	
	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours){
			this.emprunt= empruntEnCours;
			setStatus(EnumStatusExemplaire.PRETE);
		
	}

	

/**************************toString***********************************************************/
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat="
				+ sdf.format(dateAchat) + ", status=" + status + ", isbn=" + isbn + "]";

	}

/****************************Un exemplaire tient 0 ou un prêt en cours******************************/	
	


	/*private static class EmpruntEnCours{

		
		private Date dateEmprunt;
		private Utilisateur emprunteur;
		private Exemplaire exemplaire;*/
		


		
	/*******************************Getteres et Setters**********************************************/	
		/*public Date getDateEmprunt() {
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

		}*/
		/***********************************toString()**********************************************/
		/*@Override
		public String toString() {
			return "EmpruntEnCours [dateEmprunt=" + dateEmprunt
					+ ", emprunteur=" + emprunteur + ", exemplaire="
					+ exemplaire + "]";
		}*/
		
	
	

		}
		

	

	
	
	


