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

	/**
	 * Membre complet avec en plus la création d'une voiture de toute pièce
	 * 
	 * @param nom
	 * @param conduit
	 * @param email
	 * @param telephone
	 * @param nbPlaces
	 * @param marque
	 */
	
	public Membre(String nom, Boolean conduit, String email, String telephone, int nbPlaces, String marque) {
		nbMembresCrees++;
		this.nom = nom;
		this.conduit = conduit;
		this.email = email;
		this.telephone = telephone;
		this.voiture = new Voiture(marque, nbPlaces);
		this.idMembre = nbMembresCrees;
	}
	
	/**
	 * Membre complet mais voiture devant déjà être créée
	 * @param nom
	 * @param conduit
	 * @param email
	 * @param telephone
	 * @param voiture
	 */
	public Membre(String nom, Boolean conduit, String email, String telephone, Voiture voiture) {
		nbMembresCrees++;
		this.nom = nom;
		this.conduit = conduit;
		this.voiture = voiture;
		this.email = email;
		this.telephone = telephone;
		this.idMembre = nbMembresCrees;
	}
	
	/**
	 * Membre complet sans voiture mais conduisant ou pas
	 * @param nom
	 * @param conduit
	 * @param email
	 * @param telephone
	 * @param nbPlaces
	 */
	public Membre(String nom, Boolean conduit, String email, String telephone, int nbPlaces) {
		nbMembresCrees++;
		this.nom = nom;
		this.conduit = conduit;
		this.email = email;
		this.telephone = telephone;
		this.voiture = new Voiture(nbPlaces);
		this.idMembre = nbMembresCrees;
	}
	
	/**
	 * Membre incomplet consuisant ou pas et ayant une voiture
	 * @param nom
	 * @param conduit
	 * @param voiture
	 */
	public Membre(String nom, Boolean conduit, Voiture voiture) {
		nbMembresCrees++;
		this.nom = nom;
		this.conduit = conduit;
		this.voiture = voiture;
		this.idMembre = nbMembresCrees;
	}

	/**
	 * Membre complet sans voiture et on ne sait pas s'il conduit
	 * @param nom
	 * @param email
	 * @param telephone
	 */
	public Membre(String nom, String email, String telephone) {
		nbMembresCrees++;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.idMembre = nbMembresCrees;

	}
	/**
	 * 
	 * @param voiture
	 */
	public void changerVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * 
	 * @param conduit
	 */
	public void setConduit(Boolean conduit) {
		this.conduit = conduit;
	}
	
	/**
	 * 
	 * @return Si le membre conduit ou pas
	 */
	public Boolean conduit() {
		return this.conduit;
	}
	
	/**
	 * 
	 * @return Si le membre a une voiture ou pas
	 */
	public Boolean aUneVoiture() {
		return (this.voiture != null) ;
	}
	
	/**
	 * 
	 * @return La voiture que possède le membre
	 */
	public Voiture getVoiture() {
		return this.voiture;
	}
	
	/**
	 * 
	 * @return Le nom du membre
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @return L'e-mail du membre
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @return Le numéro de téléphone du membre
	 */
	public String getTelephone() {
		return this.telephone;
	}

}
