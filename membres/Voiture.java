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

	  
	  private void Voiture() {
		  this.nbPlaces = 2;
		  this.marque = "Inconnue";
	  }

	  public void Voiture(String marque, Integer nbPlaces) {
		  this.marque = marque;
		  this.nbPlaces = nbPlaces;
	  }

	  public void Voiture(Integer nbPlaces) {
		  this.nbPlaces = nbPlaces;
	  }

	  public Integer getNbPlaces() {
		  return this.nbPlaces;
	  }

	  public String getMarque() {
		  return this.marque;
	  }

}
