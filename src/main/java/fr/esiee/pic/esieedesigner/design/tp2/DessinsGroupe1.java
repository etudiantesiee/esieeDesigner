package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe1 extends CreateurDeForme {

	/**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 25;
	
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 25;
	
	/**
	 * Origine X
	 */
	private static final double ORIGIN_X = 2;
	
	/**
	 * Origine Y
	 */
	private static final double ORIGIN_Y = 2;

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerCorps();
		dessinerMains();
		dessinerLunettes();
		dessinerCheveux();
		dessinerVisage();
		

		Point origine1 = new Point(ORIGIN_X * UNITE_HORIZONTALE, ORIGIN_Y * UNITE_VERTICALE);
		Point origine2 = new Point((ORIGIN_X + 1) * UNITE_HORIZONTALE, ORIGIN_Y * UNITE_VERTICALE);
		Point origine3 = new Point(ORIGIN_X * UNITE_HORIZONTALE, (ORIGIN_Y + 1) * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(origine1)
		.ajouter(origine2)
		.ajouter(origine3);
	}
	
	/**
	 * François et Daphnée
	 */
	public void dessinerCorps() {
		Point corps1 = new Point((ORIGIN_X+3) * UNITE_HORIZONTALE, (ORIGIN_Y+14) * UNITE_VERTICALE);
		Point corps2 = new Point((ORIGIN_X+4) * UNITE_HORIZONTALE, (ORIGIN_Y+13) * UNITE_VERTICALE);
		Point corps3 = new Point((ORIGIN_X+5) * UNITE_HORIZONTALE, (ORIGIN_Y+11) * UNITE_VERTICALE);
		Point corps4 = new Point((ORIGIN_X+3) * UNITE_HORIZONTALE, (ORIGIN_Y+10) * UNITE_VERTICALE);
		Point corps5 = new Point((ORIGIN_X+2) * UNITE_HORIZONTALE, (ORIGIN_Y+11) * UNITE_VERTICALE);
		Point corps6 = new Point((ORIGIN_X+2) * UNITE_HORIZONTALE, (ORIGIN_Y+12) * UNITE_VERTICALE);
		Point corps7 = new Point((ORIGIN_X+1) * UNITE_HORIZONTALE, (ORIGIN_Y+12) * UNITE_VERTICALE);
		Point corps8 = new Point((ORIGIN_X+1) * UNITE_HORIZONTALE, (ORIGIN_Y+10) * UNITE_VERTICALE);
		Point corps9 = new Point((ORIGIN_X+3) * UNITE_HORIZONTALE, (ORIGIN_Y+8) * UNITE_VERTICALE);
		Point corps10 = new Point((ORIGIN_X+4) * UNITE_HORIZONTALE, (ORIGIN_Y+8) * UNITE_VERTICALE);
		Point corps11 = new Point((ORIGIN_X+6) * UNITE_HORIZONTALE, (ORIGIN_Y+10) * UNITE_VERTICALE);
		Point corps12 = new Point((ORIGIN_X+8) * UNITE_HORIZONTALE, (ORIGIN_Y+10) * UNITE_VERTICALE);
		Point corps13 = new Point((ORIGIN_X+10) * UNITE_HORIZONTALE, (ORIGIN_Y+8) * UNITE_VERTICALE);
		Point corps14 = new Point((ORIGIN_X+11) * UNITE_HORIZONTALE, (ORIGIN_Y+8) * UNITE_VERTICALE);
		Point corps15 = new Point((ORIGIN_X+13) * UNITE_HORIZONTALE, (ORIGIN_Y+10) * UNITE_VERTICALE);
		Point corps16 = new Point((ORIGIN_X+13) * UNITE_HORIZONTALE, (ORIGIN_Y+12) * UNITE_VERTICALE);
		Point corps17 = new Point((ORIGIN_X+12) * UNITE_HORIZONTALE, (ORIGIN_Y+12) * UNITE_VERTICALE);
		Point corps18 = new Point((ORIGIN_X+12) * UNITE_HORIZONTALE, (ORIGIN_Y+11) * UNITE_VERTICALE);
		Point corps19 = new Point((ORIGIN_X+11) * UNITE_HORIZONTALE, (ORIGIN_Y+10) * UNITE_VERTICALE);
		Point corps20 = new Point((ORIGIN_X+9) * UNITE_HORIZONTALE, (ORIGIN_Y+11) * UNITE_VERTICALE);
		Point corps21 = new Point((ORIGIN_X+10) * UNITE_HORIZONTALE, (ORIGIN_Y+13) * UNITE_VERTICALE);
		Point corps22 = new Point((ORIGIN_X+11) * UNITE_HORIZONTALE, (ORIGIN_Y+14) * UNITE_VERTICALE);
		Point corps23 = new Point((ORIGIN_X+8) * UNITE_HORIZONTALE, (ORIGIN_Y+14) * UNITE_VERTICALE);
		Point corps24 = new Point((ORIGIN_X+9) * UNITE_HORIZONTALE, (ORIGIN_Y+13) * UNITE_VERTICALE);
		Point corps25 = new Point((ORIGIN_X+8) * UNITE_HORIZONTALE, (ORIGIN_Y+12) * UNITE_VERTICALE);
		Point corps26 = new Point((ORIGIN_X+6) * UNITE_HORIZONTALE, (ORIGIN_Y+12) * UNITE_VERTICALE);
		Point corps27 = new Point((ORIGIN_X+5) * UNITE_HORIZONTALE, (ORIGIN_Y+13) * UNITE_VERTICALE);
		Point corps28 = new Point((ORIGIN_X+6) * UNITE_HORIZONTALE, (ORIGIN_Y+14) * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(corps1)
		.ajouter(corps2)
		.ajouter(corps3)
		.ajouter(corps4)
		.ajouter(corps5)
		.ajouter(corps6)
		.ajouter(corps7)
		.ajouter(corps8)
		.ajouter(corps9)
		.ajouter(corps10)
		.ajouter(corps11)
		.ajouter(corps12)
		.ajouter(corps13)
		.ajouter(corps14)
		.ajouter(corps15)
		.ajouter(corps16)
		.ajouter(corps17)
		.ajouter(corps18)
		.ajouter(corps19)
		.ajouter(corps20)
		.ajouter(corps21)
		.ajouter(corps22)
		.ajouter(corps23)
		.ajouter(corps24)
		.ajouter(corps25)
		.ajouter(corps26)
		.ajouter(corps27)
		.ajouter(corps28);
	}
	
	/**
	 * 
	 */
	public void dessinerMains() {
		
	}
	
	/**
	 * Naji et Baptiste
	 */
	public void dessinerLunettes() {
		
	}
	
	/**
	 * Thomas et Eve
	 */
	public void dessinerCheveux() {
		Point touffeGaucheMilieu = new Point(ORIGIN_X * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point touffeGauche1 = new Point(ORIGIN_X * UNITE_HORIZONTALE, (ORIGIN_Y + 1) * UNITE_VERTICALE);
		Point touffeGauche2 = new Point((ORIGIN_X + 1) * UNITE_HORIZONTALE, ORIGIN_Y * UNITE_VERTICALE);
		
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(touffeGaucheMilieu)
		.ajouter(touffeGauche1)
		.ajouter(touffeGauche2);
		
	}
	
	/**
	 * JL et Victor
	 */
	public void dessinerVisage() {
		
	}

}
