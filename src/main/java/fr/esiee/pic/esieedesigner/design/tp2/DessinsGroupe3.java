package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
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
	
	/**
	 * Longueur des yeux
	 */
	private static final double LONGUEUR_DES_YEUX = 10;
	
	/**
	 * Largeur des yeux
	 */
	private static final double LARGEUR_DES_YEUX = 10;
	
	/**
	 * @author philippe et harrison
	 * Dessin du contour des yeux
	 */
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
	
	/**
	 * @author philippe et harrison
	 * Dessin des yeux
	 */
	public void dessinYeux(){
		// Dessin oeil droit
		Point centreOeilDroit = new Point(BASE_GAUCHE + 8*PIXEL, BASE_HAUT + 6*PIXEL);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX);
		
		ajouterEllipse(oeilDroit, Couleur.NOIR);
		
		// Dessin oeil gauche
		Point centreOeilGauche = new Point(BASE_GAUCHE + 6*PIXEL, BASE_HAUT + 6*PIXEL);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX);
		
		ajouterEllipse(oeilGauche, Couleur.JAUNE);
	}
	
	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerTete();
		dessinerCheveux();
		
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
		dessinYeux();
	}
	
	public void dessinerCheveux(){
		dessinerCheveux1();
		dessinerCheveux2();
		dessinerCheveux3();

	}
	
	public void dessinerCheveux1(){
		Point cheveux1 = new Point(BASE_GAUCHE+4*PIXEL, BASE_HAUT+3*PIXEL);
		Point cheveux2 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+4*PIXEL);
		Point cheveux3 = new Point(BASE_GAUCHE+5*PIXEL, BASE_HAUT+2.5*PIXEL);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(cheveux1)
		.ajouter(cheveux2)
		.ajouter(cheveux3)
		.couleurDeFond(Couleur.GRIS);
	}
	
	public void dessinerCheveux2(){
		Point cheveux1 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+2*PIXEL);
		Point cheveux2 = new Point(BASE_GAUCHE+7*PIXEL, BASE_HAUT+4*PIXEL);
		Point cheveux3 = new Point(BASE_GAUCHE+8*PIXEL, BASE_HAUT+2*PIXEL);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(cheveux1)
		.ajouter(cheveux2)
		.ajouter(cheveux3)
		.couleurDeFond(Couleur.GRIS);
	}
	
	public void dessinerCheveux3(){
		Point cheveux1 = new Point(BASE_DROITE-4*PIXEL, BASE_HAUT+3*PIXEL);
		Point cheveux2 = new Point(BASE_DROITE-6*PIXEL, BASE_HAUT+4*PIXEL);
		Point cheveux3 = new Point(BASE_DROITE-5*PIXEL, BASE_HAUT+2.5*PIXEL);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(cheveux1)
		.ajouter(cheveux2)
		.ajouter(cheveux3)
		.couleurDeFond(Couleur.GRIS);
	}
	

	
	/**
	 * @author mathieu
	 * Dessine le bras Droit
	 */
	public void DessineBrasDroit(){
	}
}
