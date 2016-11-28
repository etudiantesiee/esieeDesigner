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
		
		Point nez1 = new Point(ORIGIN + CASE * 6.8, CASE * 5.2);
		Point nez2 = new Point(ORIGIN + CASE * 7, CASE * 5);
		Point nez3 = new Point(ORIGIN + CASE * 7.2, CASE * 5.2);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez1)
		.ajouter(nez2);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez2)
		.ajouter(nez3);
		
	}

}
