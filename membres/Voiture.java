package membres;

import membres.*;

public class Voiture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	  private String marque;
	  private Integer nbPlaces;

	  /**
	   * Voiture par défaut avec deux places mais de marque inconnue
	   */
	  public Voiture() {
		  this.nbPlaces = 2;
		  this.marque = "Inconnue";
	  }
	  
	  /**
	   * Voiture compète
	   * 
	   * @param marque
	   * @param nbPlaces
	   */
	  public Voiture(String marque, Integer nbPlaces) {
		  this.marque = marque;
		  this.nbPlaces = nbPlaces;
	  }
	  
	  /**
	   * Voiture spécifiant juste le nombre de place mais pas la marque
	   * @param nbPlaces
	   */
	  public Voiture(Integer nbPlaces) {
		  this.nbPlaces = nbPlaces;
	  }

	  /**
	   * 
	   * @return Le nombre de places dans la voiture
	   */
	  public Integer getNbPlaces() {
		  return this.nbPlaces;
	  }

	  /**
	   * 
	   * @return La marque de la voiture
	   */
	  public String getMarque() {
		  return this.marque;
	  }

	  /**
	   * Modifie le nombre de places de la voiture
	   * @param nbPlaces
	   */
	  public void setNbPlaces(int nbPlaces)
	  {
		  this.nbPlaces = nbPlaces;
	  }
	  
	  /**
	   * Modifie la marque de la voiture
	   * @param marque
	   */
	  public void setMarque(String marque)
	  {
		  this.marque = marque;
	  }
}
