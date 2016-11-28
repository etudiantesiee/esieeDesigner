package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
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
	
	/**
	 * Diametre des yeux
	 */
	private static final double DIAMETRE_DES_YEUX = 7;

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
		
		Point centreOeilGauche = new Point((ORIGIN_X + 6) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, DIAMETRE_DES_YEUX, DIAMETRE_DES_YEUX);
		
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
		Point centreOeilDroit = new Point((ORIGIN_X + 8) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, DIAMETRE_DES_YEUX, DIAMETRE_DES_YEUX);
		
		ajouterEllipse(oeilDroit, Couleur.NOIR);
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
		Point visageCote = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
        Point visageCote2 = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
        Point visageCote3 = new Point((ORIGIN_X + 6) * UNITE_HORIZONTALE, (ORIGIN_Y + 10) * UNITE_VERTICALE);
        Point visageCote4 = new Point((ORIGIN_X + 8) * UNITE_HORIZONTALE, (ORIGIN_Y + 10) * UNITE_VERTICALE);
        Point visageCote5 = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
        Point visageCote6 = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);

        
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(visageCote)
        .ajouter(visageCote2);
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(visageCote2)
        .ajouter(visageCote3);
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(visageCote3)
        .ajouter(visageCote4);
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(visageCote4)
        .ajouter(visageCote5);
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(visageCote5)
        .ajouter(visageCote6);
        
	}

}
