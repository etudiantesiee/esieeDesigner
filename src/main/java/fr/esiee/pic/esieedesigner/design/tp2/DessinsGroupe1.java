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

		Point pointeGauche1 = new Point((ORIGINE.getX() + 3) * UNITE_HORIZONTALE, (ORIGINE.getY() + 4) * UNITE_VERTICALE);
		Point pointeGauche2 = new Point(pointeGauche1.getX(), pointeGauche1.getY() + (2 * UNITE_VERTICALE));
		Point pointeGauche3 = new Point(pointeGauche2.getX() - (1 * UNITE_HORIZONTALE), pointeGauche2.getY() + (1 * UNITE_VERTICALE));
		Point pointeGauche4 = new Point(pointeGauche3.getX() - (1 * UNITE_HORIZONTALE), pointeGauche3.getY());
		Point touffeGaucheMilieu = new Point(pointeGauche4.getX() - (1 * UNITE_HORIZONTALE), pointeGauche4.getY() - (4 * UNITE_VERTICALE));
		Point touffeGauche1 = new Point(touffeGaucheMilieu.getX(), touffeGaucheMilieu.getY() - (2 * UNITE_VERTICALE));
		Point touffeGauche2 = new Point(touffeGauche1.getX() + (1 * UNITE_HORIZONTALE), touffeGauche1.getY() - (1 * UNITE_VERTICALE));
		Point touffeDroite1 = new Point(touffeGauche2.getX() + (12 * UNITE_HORIZONTALE), touffeGauche2.getY());
		Point touffeDroite2 = new Point(touffeDroite1.getX() + (1 * UNITE_HORIZONTALE), touffeDroite1.getY() + (1 * UNITE_VERTICALE));
		Point touffeDroiteMilieu = new Point(touffeDroite2.getX(), touffeDroite2.getY() + (2 * UNITE_VERTICALE));
		Point pointeDroite1 = new Point(touffeDroiteMilieu.getX() - (1 * UNITE_HORIZONTALE), touffeDroiteMilieu.getY() + (4 * UNITE_VERTICALE));
		Point pointeDroite2 = new Point(pointeDroite1.getX() - (1 * UNITE_HORIZONTALE), pointeDroite1.getY());
		Point pointeDroite3 = new Point(pointeDroite2.getX() - (1 * UNITE_HORIZONTALE), pointeDroite2.getY() - (1 * UNITE_VERTICALE));
		Point pointeDroite4 = new Point(pointeDroite3.getX(), pointeDroite3.getY() - (2 * UNITE_VERTICALE));		
		
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
		// Bas des lunettes
		Point lunetteBasDroiteBas = new Point(pointeDroite4.getX() - 2 * UNITE_HORIZONTALE, pointeDroite4.getY() + 1 * UNITE_VERTICALE);
		Point lunetteBasGaucheDroite = new Point(lunetteBasDroiteBas.getX() - 2 * UNITE_HORIZONTALE, pointeDroite4.getY());
		Point lunetteBasGaucheBas = new Point(pointeGauche1.getX() + 2 * UNITE_HORIZONTALE, pointeGauche1.getY() + 1 * UNITE_VERTICALE);
		
		// Haut des lunettes
		Point lunetteHautGaucheGauche = new Point(pointeGauche1.getX(), pointeGauche1.getY() - 1 * UNITE_VERTICALE);
		Point lunetteHautGaucheHaut = new Point(lunetteBasGaucheBas.getX(), lunetteBasGaucheBas.getY() - 3 * UNITE_VERTICALE);
		Point lunetteHautGaucheDroite = new Point(lunetteBasGaucheDroite.getX(), lunetteBasGaucheDroite.getY() - 1 * UNITE_VERTICALE);
		Point lunetteHautDroiteHaut = new Point(lunetteBasDroiteBas.getX(), lunetteBasDroiteBas.getY() - 3 * UNITE_VERTICALE);
		Point lunetteHautDroiteDroite = new Point(pointeDroite4.getX(), lunetteBasGaucheDroite.getY() - 1 * UNITE_VERTICALE);
		
		// Dessin des lunettes
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(lunetteHautGaucheGauche)
		.ajouter(lunetteHautGaucheHaut)
		.ajouter(lunetteHautGaucheDroite)
		.ajouter(lunetteHautDroiteHaut)
		.ajouter(lunetteHautDroiteDroite)
		.ajouter(pointeDroite4)
		.ajouter(lunetteBasDroiteBas)
		.ajouter(lunetteBasGaucheDroite)
		.ajouter(lunetteBasGaucheBas)
		.ajouter(pointeGauche1)
		.couleurDeFond(Couleur.GRIS);
		
		// Oeil gauche
		Point centreOeilGauche = new Point(lunetteBasGaucheDroite.getX() - 1 * UNITE_HORIZONTALE, (ORIGIN_Y + 4) * UNITE_VERTICALE);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, DIAMETRE_DES_YEUX, DIAMETRE_DES_YEUX);
		
		// Dessin oeil gauche
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
		// Oeil droit
		Point centreOeilDroit = new Point(lunetteBasGaucheDroite.getX() + 1 * UNITE_HORIZONTALE, centreOeilGauche.getY());
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
		Point visageCote = new Point((pointeGauche2.getX()), (pointeGauche2.getY()));
        Point visageCote2 = new Point(visageCote.getX(), (visageCote.getY()+ UNITE_VERTICALE));
        Point visageCote3 = new Point((visageCote2.getX()+ 3 * UNITE_HORIZONTALE), (visageCote2.getY()+ 3* UNITE_VERTICALE)); 
        Point visageCote4 = new Point ((visageCote3.getX()+ 2 * UNITE_HORIZONTALE), (visageCote3.getY()));
        Point visageCote5 = new Point ((visageCote4.getX()+ 3 * UNITE_HORIZONTALE), (visageCote4.getY()- 3* UNITE_VERTICALE));
        Point visageCote6 = new Point((pointeDroite3.getX()), (pointeDroite3.getY()));
        
        //bouche
        Point bouche = new Point((pointeGauche2.getX()+ 3 * UNITE_HORIZONTALE), (pointeGauche2.getY()+ 2* UNITE_VERTICALE));
        Point bouche2 = new Point((bouche.getX()+ 2 * UNITE_HORIZONTALE), (bouche.getY()));
        
        //nez
        Point nezCentre = new Point((pointeGauche2.getX()+ 4 * UNITE_HORIZONTALE), (pointeGauche2.getY()- 1* UNITE_VERTICALE));
        Point nezGauche = new Point((nezCentre.getX()- 0.25 * UNITE_HORIZONTALE), (nezCentre.getY()+ 0.25* UNITE_VERTICALE));
        Point nezDroite = new Point((nezCentre.getX()+ 0.25 * UNITE_HORIZONTALE), (nezCentre.getY()+ 0.25* UNITE_VERTICALE));

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
	 * Creation du corps 
	 * @author Francois et Daphnee
	 * @param visageCote3
	 * @param visageCote4
	 */
	public void dessinerCorps(Point visageCote3, Point visageCote4) {
		//Creation de tous les points du corps
		// 1er point du corps
		Point corps1 = new Point(visageCote3.getX(), visageCote3.getY());
		// 2e point du corps
		Point corps2 = new Point(corps1.getX() + 2 * UNITE_HORIZONTALE , corps1.getY());
		// 3e point du corps
		Point corps3 = new Point(corps2.getX() + 2 * UNITE_HORIZONTALE, corps2.getY() - 2 * UNITE_HORIZONTALE);
		// 4e point du corps
		Point corps4 = new Point(corps3.getX() + 1 * UNITE_HORIZONTALE, corps3.getY());
		// 5e point du corps
		Point corps5 = new Point(corps4.getX() + 2 * UNITE_HORIZONTALE, corps4.getY() + 2 * UNITE_HORIZONTALE);
		// 6e point du corps
		Point corps6 = new Point(corps5.getX(), corps5.getY() + 2 * UNITE_HORIZONTALE);
		// 7e point du corps
		Point corps7 = new Point(corps6.getX() - 1 * UNITE_HORIZONTALE, corps6.getY());
		// 8e point du corps
		Point corps8 = new Point(corps7.getX(), corps7.getY() - 1 * UNITE_HORIZONTALE);
		// 9e point du corps
		Point corps9 = new Point(corps8.getX() - 1 * UNITE_HORIZONTALE, corps8.getY() - 1 * UNITE_HORIZONTALE);
		// 10e point du corps
		Point corps10 = new Point(corps9.getX() - 2 * UNITE_HORIZONTALE, corps9.getY() + 1 * UNITE_HORIZONTALE);
		// 11e point du corps
		Point corps11 = new Point(corps10.getX() + 1 * UNITE_HORIZONTALE, corps10.getY() + 2 * UNITE_HORIZONTALE);
		// 12e point du corps
		Point corps12 = new Point(corps11.getX() + 1 * UNITE_HORIZONTALE, corps11.getY() + 1 * UNITE_HORIZONTALE);
		// 13e point du corps
		Point corps13 = new Point(corps12.getX() - 3 * UNITE_HORIZONTALE, corps12.getY());
		// 14e point du corps
		Point corps14 = new Point(corps13.getX() + 1 * UNITE_HORIZONTALE, corps13.getY() - 1 * UNITE_HORIZONTALE);
		// 15e point du corps
		Point corps15 = new Point(corps14.getX() - 1 * UNITE_HORIZONTALE, corps14.getY() - 1 * UNITE_HORIZONTALE);
		// 16e point du corps
		Point corps16 = new Point(corps15.getX() - 2 * UNITE_HORIZONTALE, corps15.getY());
		// 17e point du corps
		Point corps17 = new Point(corps16.getX() - 1 * UNITE_HORIZONTALE, corps16.getY() + 1 * UNITE_HORIZONTALE);
		// 18e point du corps
		Point corps18 = new Point(corps17.getX() + 1 * UNITE_HORIZONTALE, corps17.getY() + 1 * UNITE_HORIZONTALE);
		// 19e point du corps
		Point corps19 = new Point(corps18.getX() - 3 * UNITE_HORIZONTALE, corps18.getY());
		// 20e point du corps
		Point corps20 = new Point(corps19.getX() + 1 * UNITE_HORIZONTALE, corps19.getY() - 1 * UNITE_HORIZONTALE);
		// 21e point du corps
		Point corps21 = new Point(corps20.getX() + 1 * UNITE_HORIZONTALE, corps20.getY() - 2 * UNITE_HORIZONTALE);
		// 22e point du corps
		Point corps22 = new Point(corps21.getX() - 2 * UNITE_HORIZONTALE, corps21.getY() - 1 * UNITE_HORIZONTALE);
		// 23e point du corps
		Point corps23 = new Point(corps22.getX() - 1 * UNITE_HORIZONTALE, corps22.getY() + 1 * UNITE_HORIZONTALE);
		// 24e point du corps
		Point corps24 = new Point(corps23.getX(), corps23.getY() + 1 * UNITE_HORIZONTALE);
		// 25e point du corps
		Point corps25 = new Point(corps24.getX() - 1 * UNITE_HORIZONTALE, corps24.getY());
		// 26e point du corps
		Point corps26 = new Point(corps25.getX(), corps25.getY() - 2 * UNITE_HORIZONTALE);
		// 27e point du corps
		Point corps27 = new Point(corps26.getX() + 2 * UNITE_HORIZONTALE, corps26.getY() - 2 * UNITE_HORIZONTALE);
		// 28e point du corps
		Point corps28 = new Point(corps27.getX() + 1 * UNITE_HORIZONTALE, corps27.getY());
		
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
		//corps colorie en gris
		.couleurDeFond(Couleur.GRIS);
		
		dessinerMains(corps25, corps7);
	}
	
	/**
	 *  Dessine Mains
	 */
	public void dessinerMains(Point mainGauche, Point mainDroite) {
		// Main gauche
		dessinerMain(new Point(mainGauche.getX(), mainGauche.getY()));
		// Main droite
		dessinerMain(new Point(mainDroite.getX(), mainDroite.getY()));
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
