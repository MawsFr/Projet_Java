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
		  //TODO LEVER UNE EXCEPTION SUR LE NB DE PLACE DANS LA VOITURE
		  this.marque = marque;
		  this.setNbPlaces(nbPlaces);
	  }
	  
	  /**
	   * Voiture spécifiant juste le nombre de place mais pas la marque
	   * @param nbPlaces
	   */
	  public Voiture(Integer nbPlaces) {
		  this.setNbPlaces(nbPlaces);
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
		  if(nbPlaces >=2)
		  {
			  this.nbPlaces = nbPlaces;
		  }
		  else
		  {
			  System.out.println("La voiture doit avoir au moins deux place !! En attendant de lever l'exception on met a deux par defaut");
			  this.nbPlaces = 2;
		  }
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
