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
public class Employe extends Utilisateur{

	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;
	


	public Employe(String nom, String prenom, Date dateNaissance, String sexe, int id, String pwd, String pseudonyme, String codeMatricule, EnumCategorieEmploye categorieEmploye) throws BiblioException, ParseException{
		super(nom, prenom, dateNaissance, sexe, id, pwd, pseudonyme);
		setCodeMatricule(codeMatricule);
		setCategorieEmploye(categorieEmploye);
	}
	
	public String getCodeMatricule() {
		return codeMatricule;
	}


	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}


	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}


	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Employe [codeMatricule=" + codeMatricule
				+ ", categorieEmploye=" + categorieEmploye + "]";
	}

}
