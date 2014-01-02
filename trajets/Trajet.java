package trajets;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import membres.*;

public class Trajet {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	private static int nbTrajetsCrees;
	private String adresseDepart;
	private String adresseDestination;
	private GregorianCalendar heureDepart;
	private String descriptif;
	private Membre auteur;
	private Voiture voitureUtilisee;
	private int nbPlacesLibre;
	private List<Membre> passagers;
	private int idTrajet;

	public Trajet(String adresseDepart, String adresseDestination, GregorianCalendar heureDepart, String descriptif, Membre auteur) {
		nbTrajetsCrees++;
		this.adresseDepart=adresseDepart;
		this.adresseDestination=adresseDestination;
		this.heureDepart=heureDepart;
		this.descriptif=descriptif;
		this.auteur=auteur;

		if(auteur.aUneVoiture())
		{
			this.voitureUtilisee = auteur.getVoiture();
			this.nbPlacesLibre = voitureUtilisee.getNbPlaces() - 1;
		}
		

		passagers = new ArrayList<Membre>();
		this.idTrajet= nbTrajetsCrees;
	}
	
	public boolean auMoinsUnPassagerConduit()
	{
		if (auteur.conduit())
		{
			return true;
		}
		
		Iterator<Membre> it = passagers.iterator();
		while(it.hasNext())
		{
			if(it.next().conduit())
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean placeLibre() {
		return nbPlacesLibre > 0;
	}

	public void ajouterPassager(Membre passager) {
		if(placeLibre())
		{
			if(nbPlacesLibre > 1)
			{
				//on peut en ajouter sans se soucier de quoi que ce soit
				passagers.add(passager);
				nbPlacesLibre--;
			}
			else
			{
				//ici il reste une place, il faut donc vérifier qu'il y'a une voiture et un passager qui conduit (car peut etre qu'entre temps un passager qui avait une voiture a abandonné et du coups il ne reste plus de place)
				if(auMoinsUnPassagerConduit())
				{
					if(voitureUtilisee != null)
					{
						passagers.add(passager);
						nbPlacesLibre--; //= 0
					}
					else
					{
						System.out.println("Il y a bien un ou plusieurs conducteur mais aucun n'as de voiture !! Il faut en ajouter une ! Donc ajouter un passager qui a une voiture peut importe s'il conduit !");
					}
				}
				else
				{
					//il restera une place ici
					System.out.println("Au moins un passager doit conduire !!");
				}
			}
			
		}
		else
		{
			//Si justement le passager qu'on ajoute a une voiture, on la prend comme voiture utilisé et on ajoute le passager
			if(passager.aUneVoiture())
			{
				this.voitureUtilisee = passager.getVoiture();
				this.nbPlacesLibre = voitureUtilisee.getNbPlaces() - 1;
				passagers.add(passager);
			}
			System.out.println("Plus de places disponibles !");
		}
			
	}
	

	public String getAdresseDepart() {
		return adresseDepart;
	}

	public void setAdresseDepart(String adresseDepart) {
		this.adresseDepart = adresseDepart;
	}

	public String getAdresseDestination() {
		return adresseDestination;
	}

	public void setAdresseDestination(String adresseDestination) {
		this.adresseDestination = adresseDestination;
	}

	public GregorianCalendar getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(GregorianCalendar heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Membre getAuteur() {
		return auteur;
	}

	public void setAuteur(Membre auteur) {
		this.auteur = auteur;
	}

	public Integer getNbPlaces() {
		return nbPlacesLibre;
	}

	private void setNbPlaces(Integer nbPlaces) {
		this.nbPlacesLibre = nbPlaces;
	}

	
}
