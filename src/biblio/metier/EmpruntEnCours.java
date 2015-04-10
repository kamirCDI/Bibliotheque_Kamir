package biblio.metier;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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

	
	public EmpruntEnCours() throws BiblioException{
		this(null,null);
	}
	
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
		if (emprunteur != null){
			this.emprunteur = emprunteur;
			setDateEmprunt(new Date());
		}
		 else
			 this.emprunteur = null;
	}

	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	

	
	public void setExemplaire(Exemplaire exemplaire) throws BiblioException {
			if (exemplaire != null){
				this.exemplaire=exemplaire;
				exemplaire.setEmpruntEnCours(this);
			}
			else 
				exemplaire.setEmpruntEnCours(null);
	}
	
/*	public void addUtilisateur(Utilisateur emprunteur)
	{
		if(emprunteur!=null)
		{
			emprunteur.getEmpruntEnCours().add(this);
			this.emprunteur=emprunteur;
		}
	}*/
	
	public boolean isPretEnRetard() {

		// Instanciation � la date du jour et configuration Timezone et locale
		Calendar cl = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		// Soustraction de la dur�e max de pret
		cl.add(Calendar.DAY_OF_YEAR, -Adherent.getDureeMaxPrets());
		// Determine la date mini sans retard
		Date dateMinSansRetard = cl.getTime();

		return this.getDateEmprunt().before(dateMinSansRetard);
	}

	@Override
	public String toString() {
				return "EmpruntEnCours [dateEmprunt=" + sdf.format(getDateEmprunt()) + ", emprunteur="
					+ emprunteur.getNom() + ", examplaire=" + exemplaire.getIdExemplaire() + "]";

				
	}

}
