package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

import fr.esiee.pic.esieedesigner.api.shapes.Point;


/**
 * Le groupe 3 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe3 extends CreateurDeForme {
	
	private static final int PIXEL = 25;
	
	private static final int LONGUEUR_PAGE = 77 * PIXEL;
	
	private static final int LARGEUR_PAGE = 41 * PIXEL;
	
	private static final int LARGEUR_PERSO = 14 * PIXEL;
	
	private static final int LONGUEUR_PERSO = 14 * PIXEL;

	private static final int BASE_HAUT = LARGEUR_PAGE/2-LARGEUR_PERSO/2;
	
	private static final int BASE_BAS = LARGEUR_PAGE/2 + LARGEUR_PERSO/2;
	
	private static final int BASE_DROITE = LONGUEUR_PAGE/2 + LONGUEUR_PERSO/2;
	
	private static final int BASE_GAUCHE = LONGUEUR_PAGE/2 - LONGUEUR_PERSO/2;
	
	/*Cette fonction dessine le contour des yeux*/
	public void dessinYeuxContour(){
		// Initialisation des points
		Point ptYeux1 = new Point(BASE_GAUCHE + 4*PIXEL, BASE_HAUT + 5*PIXEL);
		Point ptYeux2 = new Point(BASE_GAUCHE + 4*PIXEL, BASE_HAUT + 6*PIXEL);
		Point ptYeux3 = new Point(BASE_GAUCHE + 5*PIXEL, BASE_HAUT + 7*PIXEL);
		Point ptYeux4 = new Point(BASE_GAUCHE + 6*PIXEL, BASE_HAUT + 7*PIXEL);
		Point ptYeux5 = new Point(BASE_GAUCHE + 7*PIXEL, BASE_HAUT + 6*PIXEL);
		Point ptYeux6 = new Point(BASE_GAUCHE + 8*PIXEL, BASE_HAUT + 7*PIXEL);
		Point ptYeux7 = new Point(BASE_GAUCHE + 9*PIXEL, BASE_HAUT + 7*PIXEL);
		Point ptYeux8 = new Point(BASE_GAUCHE + 10*PIXEL, BASE_HAUT + 6*PIXEL);
		Point ptYeux9 = new Point(BASE_GAUCHE + 10*PIXEL, BASE_HAUT + 5*PIXEL);
		
		// Création de la forme
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ptYeux1)
		.ajouter(ptYeux2)
		.ajouter(ptYeux3)
		.ajouter(ptYeux4)
		.ajouter(ptYeux5)
		.ajouter(ptYeux6)
		.ajouter(ptYeux7)
		.ajouter(ptYeux8)
		.ajouter(ptYeux9);
		
	}
	
	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal

		dessineBrasDroit();
		dessinYeuxContour();
	}
	
	/**
	 * @author mathieu
	 * Dessine le bras Droit
	 */
	public void dessineBrasDroit(){
		
		Point epaule = new Point(BASE_DROITE - 3*PIXEL, BASE_BAS - 7*PIXEL);
		Point coude1 = new Point(BASE_DROITE - 2*PIXEL, BASE_BAS - 4*PIXEL);
		Point poignet1 = new Point(BASE_DROITE - 2*PIXEL, BASE_BAS - 3*PIXEL);
		Point main1 = new Point(BASE_DROITE - 1*PIXEL, BASE_BAS - 2*PIXEL);
		
		
		// On ajoute à la liste des composants à déssiner
    	demarrerNouveauDessinAvecDesPoints()
        .ajouter(epaule)
        .ajouter(coude1)
        .ajouter(poignet1)
        .ajouter(main1);
		
	}
}
