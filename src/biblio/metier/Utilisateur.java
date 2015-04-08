package biblio.metier;

import java.util.Date;

/**
 * @author afpa
 *
 */
public class Utilisateur extends Personne {
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe, int id, String pwd, String pseudonyme){
	 super(nom, prenom, dateNaissance, sexe);
	 setPwd(pwd);
	 setPseudonyme(pseudonyme);		
	}
	
	
/************************Getters et Setters*******************************************************/
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	


	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Utilisateur [idUtilisateur=" + idUtilisateur + ", pwd=" + pwd
				+ ", pseudonyme=" + pseudonyme + "]";
	}
/*****************************classes métiers****************************************************/
	
	public int getNbEmpruntsEnCours(){
		return 0;
	}
}
