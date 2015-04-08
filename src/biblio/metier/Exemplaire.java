package biblio.metier;

import java.util.ArrayList;
import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	
/*******************************constructeur*******************************************/
	
	public Exemplaire(int id, Date dateAchat, EnumStatusExemplaire status, String isbn){
		setIdExemplaire(id);
		setDateAchat(dateAchat);
		setStatus(status);
		setIsbn(isbn);
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

/**************************toString***********************************************************/
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat="
				+ dateAchat + ", status=" + status + ", isbn=" + isbn + "]";
	}

/****************************Un exemplaire tient des prêts en cours******************************/	
	
	private static class EmpruntEnCours{
		
		private Date dateEmprunt;
		private Utilisateur emprunteur;
		private Exemplaire exemplaire;
		
		
		
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
	}

	
	
	

}
