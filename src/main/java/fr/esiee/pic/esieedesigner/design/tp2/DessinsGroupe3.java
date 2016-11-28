package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

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
	
	//private static final int BASE_BAS = LARGEUR_PAGE/2 + LARGEUR_PERSO/2;
	
	//private static final int BASE_DROITE = LONGUEUR_PAGE/2 + LONGUEUR_PERSO/2;
	
	private static final int BASE_GAUCHE = LONGUEUR_PAGE/2 - LONGUEUR_PERSO/2;
	
	
	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerJambe();
	}

	public void dessinerJambe() {
	
			// Pour le corp
		

		Point ja4 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+12*PIXEL);
		Point ja3 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+13*PIXEL);
		Point ja2 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+14*PIXEL);
		Point ja1 = new Point(BASE_GAUCHE+3*PIXEL,BASE_HAUT+14*PIXEL);
		Point ja6 = new Point(BASE_GAUCHE+4*PIXEL,BASE_HAUT+13*PIXEL);
		Point ja5 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+11*PIXEL);

		Point jb4 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+11*PIXEL);
		Point jb3 = new Point(BASE_GAUCHE+10*PIXEL,BASE_HAUT+13*PIXEL);
		Point jb2 = new Point(BASE_GAUCHE+11*PIXEL,BASE_HAUT+14*PIXEL);
		Point jb1 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+14*PIXEL);
		Point jb6 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+13*PIXEL);
		Point jb5 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+12*PIXEL);
			
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ja1)
		.ajouter(ja2)
		.ajouter(ja3)
		.ajouter(ja4)
		.ajouter(ja5)
		.ajouter(ja6)
		.couleurDeFond(Couleur.GRIS);
			
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(jb1)
		.ajouter(jb2)
		.ajouter(jb3)
		.ajouter(jb4)
		.ajouter(jb5)
		.ajouter(jb6)
		.couleurDeFond(Couleur.GRIS);

	}
}
