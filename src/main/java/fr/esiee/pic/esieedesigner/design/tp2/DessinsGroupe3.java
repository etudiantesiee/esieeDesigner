package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
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
		dessinerJambe();
		dessinerTete();
		
	}
	
	public void dessinerTete(){
		Point tete1 = new Point(BASE_GAUCHE+3*PIXEL, BASE_HAUT+5*PIXEL);
		Point tete2 = new Point(BASE_GAUCHE+4*PIXEL, BASE_HAUT+3*PIXEL);
		Point tete3 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+2*PIXEL);
		Point tete4 = new Point(BASE_GAUCHE+8*PIXEL, BASE_HAUT+2*PIXEL);
		Point tete5 = new Point(BASE_GAUCHE+10*PIXEL, BASE_HAUT+3*PIXEL);
		Point tete6 = new Point(BASE_GAUCHE+11*PIXEL, BASE_HAUT+5*PIXEL);
		Point tete7 = new Point(BASE_GAUCHE+11*PIXEL, BASE_HAUT+7*PIXEL);
		Point tete8 = new Point(BASE_GAUCHE+10*PIXEL, BASE_HAUT+10*PIXEL);
		Point tete9 = new Point(BASE_GAUCHE+8*PIXEL, BASE_HAUT+12*PIXEL);
		Point tete10 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+12*PIXEL);
		Point tete11 = new Point(BASE_GAUCHE+4*PIXEL, BASE_HAUT+10*PIXEL);
		Point tete12 = new Point(BASE_GAUCHE+3*PIXEL, BASE_HAUT+7*PIXEL);
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(tete1)
		.ajouter(tete2)
		.ajouter(tete3)
		.ajouter(tete4)
		.ajouter(tete5)
		.ajouter(tete6)
		.ajouter(tete7)
		.ajouter(tete8)
		.ajouter(tete9)
		.ajouter(tete10)
		.ajouter(tete11)
		.ajouter(tete12);
		dessinYeuxContour();
		
	}
	
	/**
	 * Method pour la jambe.
	 */
	public void dessinerJambe() {
		// Jambe a gauche
		Point ja4 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+12*PIXEL);
		Point ja3 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+13*PIXEL);
		Point ja2 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+14*PIXEL);
		Point ja1 = new Point(BASE_GAUCHE+3*PIXEL,BASE_HAUT+14*PIXEL);
		Point ja6 = new Point(BASE_GAUCHE+4*PIXEL,BASE_HAUT+13*PIXEL);
		Point ja5 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+11*PIXEL);

		// Jambe a droite
		Point jb4 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+11*PIXEL);
		Point jb3 = new Point(BASE_GAUCHE+10*PIXEL,BASE_HAUT+13*PIXEL);
		Point jb2 = new Point(BASE_GAUCHE+11*PIXEL,BASE_HAUT+14*PIXEL);
		Point jb1 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+14*PIXEL);
		Point jb6 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+13*PIXEL);
		Point jb5 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+12*PIXEL);
		
		// Creer la forme ja
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ja1)
		.ajouter(ja2)
		.ajouter(ja3)
		.ajouter(ja4)
		.ajouter(ja5)
		.ajouter(ja6)
		.couleurDeFond(Couleur.GRIS);
			
		// Creer la forme jb
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(jb1)
		.ajouter(jb2)
		.ajouter(jb3)
		.ajouter(jb4)
		.ajouter(jb5)
		.ajouter(jb6)
		.couleurDeFond(Couleur.GRIS);
	}
	
	/**
	 * @author mathieu
	 * Dessine le bras Droit
	 */
	public void DessineBrasDroit(){
	}
}
