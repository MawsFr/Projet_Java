package gestion;

import java.util.GregorianCalendar;
import java.util.List;


public class Trajet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	private String adresseDepart;
	private String adresseDestination;
	private GregorianCalendar heureDepart;
	private String descriptif;
	private Membre auteur;
	private Integer nbPlaces;
	private List<Membre> passagers;
	private Integer idTrajet;


	public void Trajet(String adresseDepart, String adresseDestination, GregorianCalendar heureDepart, String descriptif, Membre auteur) {
	}

	public void ajouterPassager(Membre passager) {
	}

	public void ajouterPassager(List<Membre> passagers) {
		
		if (restePlaces())
		{
			if (passagers.size() < nbPlaces)
				this.passagers.addAll(passagers);
			else
				System.out.println("Il n'y a pas assez de place");
		}
		else
			System.out.println("Il n'y plus de places");
	}
	
	public boolean restePlaces()
	{
		return (this.nbPlaces>0);
	}

}
