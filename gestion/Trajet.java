package gestion;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Trajet {

	private static Integer nbTrajetsCrees;
	private String adresseDepart;
	private String adresseDestination;
	private GregorianCalendar heureDepart;
	private String descriptif;
	private Membre auteur;
	private Integer nbPlaces;
	private List<Membre> passagers;
	private Integer idTrajet;

	public void Trajet(String adresseDepart, String adresseDestination, GregorianCalendar heureDepart, String descriptif, Membre auteur) {
		this.nbTrajetsCrees++;
		this.adresseDepart=adresseDepart;
		this.adresseDestination=adresseDestination;
		this.heureDepart=heureDepart;
		this.descriptif=descriptif;
		this.auteur=auteur;

		if(auteur.aUneVoiture())
			this.nbPlaces=auteur.getVoiture().getNbPlaces();

		passagers = new ArrayList<Membre>();
		this.idTrajet=this.nbTrajetsCrees;
	}
	
	public boolean placeLibre() {
		return nbPlaces>0;
	}

	public void ajouterPassager(Membre passager) {
		if(placeLibre())
			passagers.add(passager);
		else
			System.out.println("Plus de places disponible !");
	}

	public void ajouterPassager(List<Membre> passagers) {
		if(placeLibre()) {
			if (passagers.size()>nbPlaces)
				System.out.println("Pas assez de place pour la liste de passagers !");
			else
				this.passagers.addAll(passagers);	
		} else
			System.out.println("Plus de place disponible !");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}
}
