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
	private static final double ORIGIN_X = 30;
	
	/**
	 * Origine Y
	 */
	private static final double ORIGIN_Y = 2;
	
	/**
	 * Origine X
	 */
	private static final Point ORIGINE = new Point(30, 2);
	
	/**
	 * Diametre des yeux
	 */
	private static final double DIAMETRE_DES_YEUX = 7;
	
	/**
	 * Nombre de doigts, permet de calculer le nombre de traits séparant les doigts
	 */
	private static final double NOMBRE_DE_DOIGT = 4;
	
	/**
	 * Longueur des doigts du manga
	 */
	private static final double LARGEUR_DOIGT = 10;

	@Override
	public void dessiner() {
		// Dessin des cheveux
		dessinerCheveux();
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
		.ajouter(pointeDroite4)
		.nePasRelierLesPointsExtreme();
		
		dessinerLunettes(pointeGauche1, pointeDroite4, pointeGauche2, pointeDroite3);
	}
	
	/**
	 * Naji et Baptiste
	 */
	public void dessinerLunettes(Point pointeGauche1, Point pointeDroite4, Point pointeGauche2, Point pointeDroite3) {
		// Haut des lunettes
		Point lunetteHautGaucheGauche = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point lunetteHautGaucheHaut = new Point((ORIGIN_X + 5) * UNITE_HORIZONTALE, (ORIGIN_Y + 2) * UNITE_VERTICALE);
		Point lunetteHautGaucheDroite = new Point((ORIGIN_X + 7) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		Point lunetteHautDroiteHaut = new Point((ORIGIN_X + 9) * UNITE_HORIZONTALE, (ORIGIN_Y + 2) * UNITE_VERTICALE);
		Point lunetteHautDroiteDroite = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 3) * UNITE_VERTICALE);
		
		// Bas des lunettes
		Point lunetteBasDroiteDroite = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Point lunetteBasDroiteBas = new Point((ORIGIN_X + 9) * UNITE_HORIZONTALE, (ORIGIN_Y + 5) * UNITE_VERTICALE);
		Point lunetteBasGaucheDroite = new Point((ORIGIN_X + 7) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Point lunetteBasGaucheBas = new Point((ORIGIN_X + 5) * UNITE_HORIZONTALE, (ORIGIN_Y + 5) * UNITE_VERTICALE);
		Point lunetteBasGaucheGauche = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		
		// Dessin des lunettes
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
		
		// Oeil gauche
		Point centreOeilGauche = new Point((ORIGIN_X + 6) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, DIAMETRE_DES_YEUX, DIAMETRE_DES_YEUX);
		
		// Dessin oeil gauche
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
		// Oeil droit
		Point centreOeilDroit = new Point((ORIGIN_X + 8) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, DIAMETRE_DES_YEUX, DIAMETRE_DES_YEUX);
		
		// Oeil droit
		ajouterEllipse(oeilDroit, Couleur.NOIR);
		
		dessinerVisage(pointeGauche2, pointeDroite3);
	}
	
	/**
	 * JL et Victor
	 */
	public void dessinerVisage(Point pointeGauche2, Point pointeDroite3) {
		//menton
		Point visageCote = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
        Point visageCote2 = new Point((ORIGIN_X + 3) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
        Point visageCote3 = new Point((ORIGIN_X + 6) * UNITE_HORIZONTALE, (ORIGIN_Y + 10) * UNITE_VERTICALE);
        Point visageCote4 = new Point((ORIGIN_X + 8) * UNITE_HORIZONTALE, (ORIGIN_Y + 10) * UNITE_VERTICALE);
        Point visageCote5 = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 7) * UNITE_VERTICALE);
        Point visageCote6 = new Point((ORIGIN_X + 11) * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
        
        //bouche
        Point bouche = new Point((ORIGIN_X + 6) * UNITE_HORIZONTALE, (ORIGIN_Y + 8) * UNITE_VERTICALE);
        Point bouche2 = new Point((ORIGIN_X + 8) * UNITE_HORIZONTALE, (ORIGIN_Y + 8) * UNITE_VERTICALE);
        
        //nez
        Point nezCentre = new Point((ORIGIN_X + 7) * UNITE_HORIZONTALE, (ORIGIN_Y + 5) * UNITE_VERTICALE);
        Point nezGauche = new Point((ORIGIN_X + 6.8) * UNITE_HORIZONTALE, (ORIGIN_Y + 5.2) * UNITE_VERTICALE);
        Point nezDroite = new Point((ORIGIN_X + 7.2) * UNITE_HORIZONTALE, (ORIGIN_Y + 5.2) * UNITE_VERTICALE);

        //dessin menton
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(visageCote)
        .ajouter(visageCote2)
        .ajouter(visageCote3)
        .ajouter(visageCote4)
        .ajouter(visageCote5)
        .ajouter(visageCote6)
        .nePasRelierLesPointsExtreme();
        
        //dessin bouche
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(bouche)
        .ajouter(bouche2);
        
        //dessin nez
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nezGauche)
		.ajouter(nezCentre)
		.ajouter(nezDroite)
		.nePasRelierLesPointsExtreme();
        
		dessinerCorps(visageCote3, visageCote4);
	}
	
	/**
	 * François et Daphnée
	 */
	public void dessinerCorps(Point visageCote3, Point visageCote4) {
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
		
		//Trace du dessin 
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
		.ajouter(corps28)
		.couleurDeFond(Couleur.GRIS);
		
		dessinerMains(corps7, corps17);
	}
	
	/**
	 *  Dessine Mains
	 */
	public void dessinerMains(Point mainGauche, Point mainDroite) {
		// Main gauche
		dessinerMain(new Point((ORIGIN_X + 1) * UNITE_HORIZONTALE, (ORIGIN_Y + 12) * UNITE_VERTICALE));
		// Main droite
		dessinerMain(new Point((ORIGIN_X + 12) * UNITE_HORIZONTALE, (ORIGIN_Y + 12) * UNITE_VERTICALE));
	}
	
	/**
	 * @param pointHautGauche
	 */
	public void dessinerMain(Point pointHautGauche) {
		// Points de la main
		Point pointHautDroite = new Point(pointHautGauche.getX() + (1 * UNITE_HORIZONTALE), pointHautGauche.getY());
		Point pointBasDroite = new Point(pointHautGauche.getX() + (1 * UNITE_HORIZONTALE), pointHautGauche.getY() + (1 * UNITE_HORIZONTALE));
		Point pointBasGauche = new Point(pointHautGauche.getX(), pointHautGauche.getY() + (1 * UNITE_HORIZONTALE));
		
		// Dessin de la main
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pointHautGauche)
		.ajouter(pointHautDroite)
		.ajouter(pointBasDroite)
		.ajouter(pointBasGauche);
		
		double longueurDoigt = (pointHautDroite.getX() - pointHautGauche.getX()) / NOMBRE_DE_DOIGT;
		for (int i = 0; i < NOMBRE_DE_DOIGT; i++) {
			// Points des doigts
			Point separateurDoigtDroitBas = new Point(pointBasGauche.getX() + (longueurDoigt * i), pointBasGauche.getY());
			Point separateurDoigtDRoitHaut = new Point(separateurDoigtDroitBas.getX(), separateurDoigtDroitBas.getY() - LARGEUR_DOIGT);
			
			// Dessin du doigt courant droit
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(separateurDoigtDroitBas)
			.ajouter(separateurDoigtDRoitHaut);
		}
	}
}
