package fr.esiee.pic.esieedesigner.design.tp2;

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
	private static final int decalageEnY = 28;
	
	@Override
	public void dessiner() {
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
