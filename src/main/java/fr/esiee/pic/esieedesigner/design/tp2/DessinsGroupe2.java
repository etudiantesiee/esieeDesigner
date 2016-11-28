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
		dessinerTorse();
		dessinerVisage();
	}
	
	/**
	 * Dessin torse
	 */
	public void dessinerTorse() {
		// Dessin torse
		Point p1 = new Point(ORIGIN + CASE*3, CASE*8);
		Point p2 = new Point(ORIGIN + CASE*4, CASE*8);
		Point p3 = new Point(ORIGIN + CASE*6, CASE*9);
		Point p4 = new Point(ORIGIN + CASE*8, CASE*9);
		Point p5 = new Point(ORIGIN + CASE*10, CASE*8);
		Point p6 = new Point(ORIGIN + CASE*11, CASE*8);
		Point p7 = new Point(ORIGIN + CASE*13, CASE*10);
		Point p8 = new Point(ORIGIN + CASE*12, CASE*11);
		Point p9 = new Point(ORIGIN + CASE*11, CASE*10);
		Point p10 = new Point(ORIGIN + CASE*11, CASE*11);
		Point p11 = new Point(ORIGIN + CASE*3, CASE*11);
		Point p12 = new Point(ORIGIN + CASE*3, CASE*10);
		Point p13 = new Point(ORIGIN + CASE*2, CASE*11);
		Point p14 = new Point(ORIGIN + CASE*1, CASE*10);
		Point p15 = new Point(ORIGIN + CASE*3, CASE*8);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10)
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15);
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
	}
}
