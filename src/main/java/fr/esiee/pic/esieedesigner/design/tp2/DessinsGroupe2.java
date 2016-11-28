package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.Point;

/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe2 extends CreateurDeForme {

	/**
	 * Point de départ groupe 2
	 */
	private static final double ORIGIN = 1400;
	
	/**
	 * Nombre de pixel d'une case
	 */
	private static final double CASE = 25;
	
	@Override
	public void dessiner() {
		dessinerVisage();
	}
	
	/**
	 * Fonction pour dessiner le visage.
	 */
	public void dessinerVisage() {
		
		// == Dessin du nez
		
		// Déclaration des points
		Point nez1 = new Point(ORIGIN + CASE * 6.8, CASE * 5.2);
		Point nez2 = new Point(ORIGIN + CASE * 7, CASE * 5);
		Point nez3 = new Point(ORIGIN + CASE * 7.2, CASE * 5.2);
		
		// Premier trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez1)
		.ajouter(nez2);
		
		// Deuxième trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez2)
		.ajouter(nez3);
		
		// == Dessin de la bouche
		
		// Déclaration des points
		Point bouche1 = new Point(ORIGIN + CASE * 4, CASE * 6);
		Point bouche2 = new Point(ORIGIN + CASE * 4, CASE * 7);
		Point bouche3 = new Point(ORIGIN + CASE * 6, CASE * 8);
		Point bouche4 = new Point(ORIGIN + CASE * 8, CASE * 8);
		Point bouche5 = new Point(ORIGIN + CASE * 10, CASE * 7);
		Point bouche6 = new Point(ORIGIN + CASE * 10, CASE * 6);
		
		// dessin trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(bouche1)
		.ajouter(bouche2)
		.ajouter(bouche3)
		.ajouter(bouche4)
		.ajouter(bouche5)
		.ajouter(bouche6);
		
	}

}
