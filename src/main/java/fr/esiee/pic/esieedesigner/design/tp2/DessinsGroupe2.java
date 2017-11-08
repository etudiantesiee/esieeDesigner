package fr.esiee.pic.esieedesigner.design.tp2;

import java.lang.reflect.Array;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.*;

/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * @author Nuzha
 * @author Marwa
 * @author Giles
 * @author Lamia
 * @author Jérémy
 * @date 2017
 */
public class DessinsGroupe2 extends CreateurDeForme {
	/**
	 * La variable représente la taille d'un carreau
	 * elle permet de calculer la taille en pixel
	 * Utilisé dans les méthode {@link vraieTailleEnX} et {@link vraieTailleEnY}
	 */
	private static final int nbrPixelCarreau = 25;
	/** 
	 * Permet de connaitre la taille de déplacement en X de la figure
	 * Exemple : Il doit être à 28 (2 x 14) pour l'étape 1
	 */
	private static final int decalageEnX = 28;
	/** 
	 * Permet de connaitre la taille de déplacement en Y de la figure
	 * Exemple : Il doit être à 28 (2 x 14) pour l'étape 1
	 */
	private static final int decalageEnY = 0;
	
	@Override
	public void dessiner() {
		dessinCorps();
		interieurTete();
	}
	/**
	 * Permet de dessin l'interieur de la tête
	 * Nous ne dessinons pas les contours de la tête
	 */
	private void interieurTete(){
		lunette();
		yeux();
		nezEtBouche();
	}
	/**
	 * Dessin des lunettes 
	 * Ne retourne rien
	 */
	private void lunette(){
		Point[] pointsLunetteGauche = {
				new Point(this.vraiePositionEnX(2), this.vraiePositionEnY(3)),
				new Point(this.vraiePositionEnX(3), this.vraiePositionEnY(2)),
				new Point(this.vraiePositionEnX(6), this.vraiePositionEnY(2)),
				new Point(this.vraiePositionEnX(7), this.vraiePositionEnY(3)),
				new Point(this.vraiePositionEnX(7), this.vraiePositionEnY(5)),
				new Point(this.vraiePositionEnX(6), this.vraiePositionEnY(6)),
				new Point(this.vraiePositionEnX(3), this.vraiePositionEnY(6)),
				new Point(this.vraiePositionEnX(2), this.vraiePositionEnY(5))
		};
		suitePointDessin(pointsLunetteGauche);
		Point[] pointsLunetteDroite = {
				new Point(this.vraiePositionEnX(2+5), this.vraiePositionEnY(3)),
				new Point(this.vraiePositionEnX(3+5), this.vraiePositionEnY(2)),
				new Point(this.vraiePositionEnX(6+5), this.vraiePositionEnY(2)),
				new Point(this.vraiePositionEnX(7+5), this.vraiePositionEnY(3)),
				new Point(this.vraiePositionEnX(7+5), this.vraiePositionEnY(5)),
				new Point(this.vraiePositionEnX(6+5), this.vraiePositionEnY(6)),
				new Point(this.vraiePositionEnX(3+5), this.vraiePositionEnY(6)),
				new Point(this.vraiePositionEnX(2+5), this.vraiePositionEnY(5))
		};
		suitePointDessin(pointsLunetteDroite);
	}
	/**
	 * Dessin des yeux
	 * Ne retourne rien
	 */
	private void yeux(){
		
	}
	/** 
	 * Dessin du nez et de la bouche.
	 */
	private void nezEtBouche(){

		
		
	}
	/**
	 * Contour du visage
	 */
	public void ContourVisage(){
		
		
	}
	/**
	 * menton
	 */
	public void mentonVisage(){
		//Creation des points
		Point hautGauche=new Point(vraiePositionEnX(2),vraiePositionEnY(7));
		//Creation des points
		Point basGauche=new Point(vraiePositionEnX(5),vraiePositionEnY(10));
		//Creation des points
		Point hautDroite=new Point(vraiePositionEnX(10),vraiePositionEnY(10));
		//Creation des points
		Point basDroite=new Point(vraiePositionEnX(12),vraiePositionEnY(7));
		//Dessiner 
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautGauche)
		.ajouter(basGauche)
		.ajouter(basDroite).ajouter(hautDroite);
	
	}
	
	private void dessinCorps(){
		Point orteilGauche = new Point(vraiePositionEnX(12),vraiePositionEnY(14));
		Point talonGauche = new Point(vraiePositionEnX(10),vraiePositionEnY(14));
		Point talonGauche2 = new Point(vraiePositionEnX(10),vraiePositionEnY(13));
		Point fesses = new Point(vraiePositionEnX(4),vraiePositionEnY(13));

		Point talonDroit = new Point(vraiePositionEnX(4),vraiePositionEnY(14));
		Point orteilDroit = new Point(vraiePositionEnX(2),vraiePositionEnY(14));
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(orteilGauche)
		.ajouter(talonGauche)
		.ajouter(talonGauche2)
		.ajouter(fesses)
		.ajouter(talonDroit)
		.ajouter(orteilDroit);
		
	}
	
	private void suitePointDessin(Point[] points){
		CheminDePoints cdp = demarrerNouveauDessinAvecDesPoints();
		for(int i = 0; i < points.length; i++){
			cdp.ajouter(points[i]);
		}
	}
	/**
	 * Permet de connaitre la vraie position en X
	 * Pour un nbCarreau entier donné
	 * @param nbCarreau Entier indiquant le décalage vers la droite (en X)
	 * @return La réel position en X, comprenant le décalage et le nombre de pixel
	 */
	private int vraiePositionEnX(int nbCarreau){
		return (DessinsGroupe2.decalageEnX + nbCarreau)*DessinsGroupe2.nbrPixelCarreau;
	}
	/**
	 * Permet de connaitre la vraie position en X
	 * Pour un nbCarreau double donné
	 * @param nbCarreau double indiquant le décalage vers la droite (en X)
	 * @return La réel position en X, comprenant le décalage et le nombre de pixel
	 */
	private double vraiePositionEnX(double nbCarreau){
		return (DessinsGroupe2.decalageEnX + nbCarreau)*DessinsGroupe2.nbrPixelCarreau;
	}
	/**
	 * Permet de connaitre la vraie position en Y
	 * Pour un nbCarreau entier donné
	 * @param nbCarreau entier indiquant le décalage vers le bas (en Y)
	 * @return La réel position en Y, comprenant le décalage et le nombre de pixel
	 */
	private int vraiePositionEnY(int nbCarreau){
		return (DessinsGroupe2.decalageEnY + nbCarreau)*DessinsGroupe2.nbrPixelCarreau;
	}
	/**
	 * Permet de connaitre la vraie position en Y
	 * Pour un nbCarreau double donné
	 * @param nbCarreau double indiquant le décalage vers le bas (en Y)
	 * @return La réel position en Y, comprenant le décalage et le nombre de pixel
	 */
	private double vraiePositionEnY(double nbCarreau){
		return (DessinsGroupe2.decalageEnY + nbCarreau)*DessinsGroupe2.nbrPixelCarreau;
	}
}
