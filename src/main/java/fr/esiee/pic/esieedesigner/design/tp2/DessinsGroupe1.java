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
		Point pointeGauche1 = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Point pointeGauche2 = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 6) * UNITE_VERTICALE);
		Point pointeGauche3 = new Point((ORIGIN_X + 2) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
		Point pointeGauche4 = new Point((ORIGIN_X + 1) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
		Point touffeGaucheMilieu = new Point(ORIGIN_X * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point touffeGauche1 = new Point(ORIGIN_X * UNITE_HORIZONTALE, (ORIGIN_Y + 1) * UNITE_VERTICALE);
		Point touffeGauche2 = new Point((ORIGIN_X + 1) * UNITE_HORIZONTALE, ORIGIN_Y * UNITE_VERTICALE);
		Point touffeDroite1 = new Point((ORIGIN_X + 13) * UNITE_HORIZONTALE, ORIGIN_Y * UNITE_VERTICALE);
		Point touffeDroite2 = new Point((ORIGIN_X + 14) * UNITE_HORIZONTALE, (ORIGIN_Y + 1) * UNITE_VERTICALE);
		Point touffeDroiteMilieu = new Point((ORIGIN_X + 14) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point pointeDroite1 = new Point((ORIGIN_X + 13) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
		Point pointeDroite2 = new Point((ORIGIN_X + 12) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
		Point pointeDroite3 = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 6) * UNITE_VERTICALE);
		Point pointeDroite4 = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pointeGauche1)
		.ajouter(pointeGauche2)
		.ajouter(pointeGauche3)
		.ajouter(pointeGauche4)
		.ajouter(touffeGaucheMilieu)
		.ajouter(touffeGauche1)
		.ajouter(touffeGauche2)
		.ajouter(touffeDroite1)
		.ajouter(touffeDroite2)
		.ajouter(touffeDroiteMilieu)
		.ajouter(pointeDroite1)
		.ajouter(pointeDroite2)
		.ajouter(pointeDroite3)
		.ajouter(pointeDroite4);
		
	}
	
	/**
	 * JL et Victor
	 */
	public void dessinerVisage() {
		
	}

}
