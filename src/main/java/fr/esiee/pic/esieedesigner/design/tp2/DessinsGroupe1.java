package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
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
		.ajouter(corps10);
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
		Point lunetteHautGaucheGauche = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point lunetteHautGaucheHaut = new Point((ORIGIN_X + 5) * UNITE_HORIZONTALE, (ORIGIN_Y + 2) * UNITE_VERTICALE);
		Point lunetteHautGaucheDroite = new Point((ORIGIN_X + 7) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point lunetteHautDroiteHaut = new Point((ORIGIN_X + 9) * UNITE_HORIZONTALE, (ORIGIN_Y + 2) * UNITE_VERTICALE);
		Point lunetteHautDroiteDroite = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point lunetteBasDroiteDroite = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Point lunetteBasDroiteBas = new Point((ORIGIN_X + 9) * UNITE_HORIZONTALE, (ORIGIN_Y + 5) * UNITE_VERTICALE);
		Point lunetteBasGaucheDroite = new Point((ORIGIN_X + 7) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Point lunetteBasGaucheBas = new Point((ORIGIN_X + 5) * UNITE_HORIZONTALE, (ORIGIN_Y + 5) * UNITE_VERTICALE);
		Point lunetteBasGaucheGauche = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(lunetteHautGaucheGauche)
		.ajouter(lunetteHautGaucheHaut)
		.ajouter(lunetteHautGaucheDroite)
		.ajouter(lunetteHautDroiteHaut)
		.ajouter(lunetteHautDroiteDroite)
		.ajouter(lunetteBasDroiteDroite)
		.ajouter(lunetteBasDroiteBas)
		.ajouter(lunetteBasGaucheDroite)
		.ajouter(lunetteBasGaucheBas)
		.ajouter(lunetteBasGaucheGauche)
		.couleurDeFond(Couleur.GRIS);
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
