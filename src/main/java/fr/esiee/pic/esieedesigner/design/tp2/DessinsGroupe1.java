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
