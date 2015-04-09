package biblio.metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntEnCours {
	private Date dateEmprunt;
	private Utilisateur emprunteur;
	private Exemplaire exemplaire;
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	static {sdf.setLenient(false);}

	
	public EmpruntEnCours(Date dateEmprunt, Utilisateur emprunteur,	Exemplaire exemplaire) throws BiblioException {
		setDateEmprunt(dateEmprunt);
		setEmprunteur(emprunteur);
		setExemplaire(exemplaire);
	}
	
	public EmpruntEnCours(Date dateEmprunt, Utilisateur emprunteur) throws BiblioException {
		setDateEmprunt(dateEmprunt);
		setEmprunteur(emprunteur);
	}

	public EmpruntEnCours() {
		
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		if(dateEmprunt!=null)
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

/*	public void setExemplaire(Exemplaire exemplaire) throws BiblioException {
		if(exemplaire==null)
		{
			this.exemplaire=exemplaire;
			this.setDateEmprunt(null);
		}
		
		else
		{
			if(exemplaire != this.exemplaire)
			{
				this.exemplaire=exemplaire;
				this.exemplaire.setEmpruntEnCours(this);
			}
		}
		
		this.exemplaire = exemplaire;
	}*/
	
	public void setExemplaire(Exemplaire exemplaire) throws BiblioException {
		this.exemplaire=exemplaire;
	}

	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunt=" + sdf.format(dateEmprunt) + ", emprunteur="
				+ emprunteur + ", exemplaire=" + exemplaire + "]";
	}

}
