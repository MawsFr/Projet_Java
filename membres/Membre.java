package membres;

import membres.*;

public class Membre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}
	
	private static int nbMembresCrees;
	private Voiture voiture;
	private Boolean conduit;
	private String nom;
	private String email;
	private String telephone;
	private Integer idMembre;

	public void Membre(String nom, Boolean conduit, Voiture voiture, String email, String telephone) {
		nbMembresCrees++;
		this.nom = nom;
		this.conduit = conduit;
		this.voiture = voiture;
		this.email = email;
		this.telephone = telephone;
		this.idMembre = nbMembresCrees;
	}

	public void Membre(String nom, Boolean conduit, Voiture voiture) {
		nbMembresCrees++;
		this.nom = nom;
		this.conduit = conduit;
		this.voiture = voiture;
		this.idMembre = nbMembresCrees;
	}

	public void Membre(String nom, String email, String telephone) {
		nbMembresCrees++;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.idMembre = nbMembresCrees;

	}
	public void changerVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setConduit(Boolean conduit) {
		this.conduit = conduit;
	}

	public Boolean conduit() {
		return this.conduit;
	}

	public Boolean aUneVoiture() {
		return (this.voiture != null) ;
	}

	public Voiture getVoiture() {
		return this.voiture;
	}

	public String getNom() {
		return this.nom;
	}

	public String getEmail() {
		return this.email;
	}

	public String getTelephone() {
		return this.telephone;
	}

}
