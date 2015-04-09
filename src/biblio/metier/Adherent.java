/**
 * 
 */
package biblio.metier;

import java.text.ParseException;
import java.util.Date;

/**
 * @author afpa
 *
 */
public class Adherent extends Utilisateur{

	private String telephone;
	private static int nbMaxPrets=3;
	private static int dureeMaxPrets=15;
	
	
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int id, String pwd, String pseudonyme, String telephone) throws ParseException{
		super(nom, prenom, dateNaissance, sexe, id, pwd, pseudonyme);
		setTelephone(telephone);
	}
	
	public Adherent() throws ParseException{
		this("Devanne", "camille", sdf.parse("02/05/1970"), "feminin", 3, "kamille", "foufou", "0102253563");
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
