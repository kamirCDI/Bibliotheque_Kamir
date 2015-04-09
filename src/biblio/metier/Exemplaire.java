package biblio.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	private EmpruntEnCours empruntEnCours;
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	

/*******************************constructeur***********************************************/

	

	public Exemplaire(int id, Date dateAchat, EnumStatusExemplaire status, String isbn) throws BiblioException{

		setIdExemplaire(id);
		setDateAchat(dateAchat);
		setIsbn(isbn);		
	}
	

	public Exemplaire(int id, Date dateAchat, EnumStatusExemplaire status, String isbn, EmpruntEnCours empruntEnCours) throws BiblioException{
		setIdExemplaire(id);
		setDateAchat(dateAchat);
		setStatus(status);
		setIsbn(isbn);
		setEmpruntEnCours(empruntEnCours);
	}

/*	public Exemplaire() throws ParseException, BiblioException{
		this(1, sdf.parse("10/02/2000"),EnumStatusExemplaire.DISPONIBLE, "IN12345");
	}*/
	
	public Exemplaire()
	{
		this.empruntEnCours=new EmpruntEnCours();
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

/*	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) throws BiblioException{
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
	}*/
	
	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours){
		this.empruntEnCours = empruntEnCours;
	}

	

/**************************toString***********************************************************/
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat="

				+ sdf.format(dateAchat) + ", status=" + status + ", isbn=" + isbn
				+ ", empruntEnCours=" + empruntEnCours + "]"

				+ sdf.format(dateAchat) + ", status=" + status + ", isbn=" + isbn + "]";

	}

/****************************Un exemplaire tient 0 ou un prêt en cours******************************/	
	


	private static class EmpruntEnCours{

		
		private Date dateEmprunt;
		private Utilisateur emprunteur;
		private Exemplaire exemplaire;
		

		/*******remarque***********************/

		
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
		
		@Override
		public String toString() {
			return "EmpruntEnCours [dateEmprunt=" + dateEmprunt
					+ ", emprunteur=" + emprunteur + ", exemplaire="
					+ exemplaire + "]";
		}
	}

	
	
	


