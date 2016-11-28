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
		
	}
	
	/**
	 * JL et Victor
	 */
	public void dessinerVisage() {
		
	}

}
