package gestion;

import java.util.ArrayList;
import java.util.List;
import membres.*;
import trajets.*;

public class Bdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}
	
	//attributs
	
	private List<Trajet> listeTrajets;
	private List<Membre> listeMembres;

	public Bdd()
	{
		this.listeMembres = new ArrayList<Membre>();
		this.listeTrajets = new ArrayList<Trajet>();
	}
	
//	public Bdd(List<Trajet> listeTrajets)
//	{
//		
//	}
//	
//	public Bdd(List<Membre> listeMembres)
//	{
//		
//	}
	
	public Bdd(List<Trajet> listeTrajets, List<Membre> listeMembres)
	{
		this.listeMembres = listeMembres;
		this.listeTrajets = listeTrajets;
	}
	
	public void associer(Trajet trajet, Membre membre) {
		
		if(trajetExiste(trajet) && membreExiste(membre))
		{
			if(membre.conduit())
			{
				trajet.setAuteur(membre);
			}
			
		}
		
		
	}

	public void creerMembre(Membre embre) {
		
	}

	public void creerTrajet(Trajet trajet) {
		
		
	}

	public void supprimerTrajet(Trajet trajet) {
	}

	public void supprimerMembre(Membre membre) {
		
	}
	
	public Integer rechercherTrajet(Trajet trajet)
	{
		if (trajetExiste(trajet))
		{
			return listeTrajets.indexOf(trajet);
		}
		else
		{
			return -1;
		}
	}
	
	public Boolean trajetExiste(Trajet trajet)
	{
		return listeTrajets.contains(trajet);
	}
	
	public Boolean membreExiste(Membre membre)
	{
		return listeTrajets.contains(membre);
	}
}
