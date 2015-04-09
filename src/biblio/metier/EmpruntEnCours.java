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
		setExemplaire(null);
	}

	public EmpruntEnCours() {
		
	}
	
	public EmpruntEnCours(){
		this(null,null);
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
		setDateEmprunt(new Date());
	}

	public Exemplaire getExemplaire() {
		return exemplaire;
	}

<<<<<<< HEAD
	public void setExemplaire(Exemplaire exemplaire) {
		if (exemplaire != null){
			this.exemplaire = exemplaire;
			exemplaire.setEmprunt(this);
		}
		
=======
	public void setExemplaire(Exemplaire exemplaire) throws BiblioException {
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
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir
	}

	@Override
	public String toString() {
<<<<<<< HEAD
				return "EmpruntEnCours [dateEmprunt=" + sdf.format(dateEmprunt) + ", emprunteur="
					+ emprunteur + ", examplaire=" + exemplaire + "]";
=======
		return "EmpruntEnCours [dateEmprunt=" + sdf.format(dateEmprunt) + ", emprunteur="
				+ emprunteur + ", exemplaire=" + exemplaire + "]";
>>>>>>> branch 'master' of https://github.com/kamirCDI/Bibliotheque_kamir
	}

}
