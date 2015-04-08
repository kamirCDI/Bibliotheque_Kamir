/**
 * 
 */
package biblio.metier;

import java.util.Date;

/**
 * @author afpa
 *
 */
public class Adherent extends Utilisateur{

	private String telephone;
	private static int nbMaxPrets=3;
	private static int dureeMaxPrets=15;
	
	
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int id, String pwd, String pseudonyme, String telephone){
		super(nom, prenom, dateNaissance, sexe, id, pwd, pseudonyme);
		setTelephone(telephone);
	}

	/***************************Getters et Setters*******************************************/
	public String getTelephone() {
		return telephone;
	}

	

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/********************************classes métier*********************************************/
	public Boolean isConditionsPretAcceptees(){
		return true;
	}
	
	public int getNbRetards(){
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Adherent [telephone=" + telephone + "]";
	}
}
