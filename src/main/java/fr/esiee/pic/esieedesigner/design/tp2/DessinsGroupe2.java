package fr.esiee.pic.esieedesigner.design.tp2;

import java.lang.reflect.Array;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
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
	private static final int NBRPIXELCARREAU = 25;
	/** 
	 * Permet de connaitre la taille de déplacement en X de la figure
	 * Exemple : Il doit être à 28 (2 x 14) pour l'étape 1
	 */
	private static final int DECALAGEENX = 28;
	/** 
	 * Permet de connaitre la taille de déplacement en Y de la figure
	 * Exemple : Il doit être à 28 (2 x 14) pour l'étape 1
	 */
	private static final int DECALAGEENY = 0;
	
	@Override
	public void dessiner() {
		//Dessin des jambes
		dessinJambes();
		//Dessin de la poche
		dessinPoche();
		//Dessin du haut du corps
		dessinHautCorps();
		//Dessin du visage
		interieurTete();
		//Dessin de la tete
		contourVisage();
		
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
		// Création de l'ensemble des points pour le verre de la lunette de gauche
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
		// Dessin de la lunette de gauche 
		suitePointDessin(pointsLunetteGauche);
		// Création de l'ensemble des points pour le verre de la lunette de droite
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
		// Dessin de la lunette de droite
		suitePointDessin(pointsLunetteDroite);
	}
	/**
	 * Dessin des yeux
	 * Ne retourne rien
	 */
	private void yeux(){
		Point oeilGauchePoint = new Point(vraiePositionEnX(5), vraiePositionEnY(5));
		Ellipse oeilGauche = new Ellipse(oeilGauchePoint, 7,20);
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
		Point oeilDroitPoint = new Point(vraiePositionEnX(9), vraiePositionEnY(5));
		Ellipse oeilDroit = new Ellipse(oeilDroitPoint, 7,20);
		ajouterEllipse(oeilDroit, Couleur.NOIR);
	}
	/** 
	 * Dessin du nez et de la bouche.
	 */
	private void nezEtBouche(){
		// Declaration du tableau contenant les points pour le nez
		Point[] pointsPourLeNez = {
				new Point(this.vraiePositionEnX(6.8), this.vraiePositionEnY(6.1)),
				new Point(this.vraiePositionEnX(7), this.vraiePositionEnY(6)),
				new Point(this.vraiePositionEnX(7.2), this.vraiePositionEnY(6.1))
		};
		// Dessin de la lunette de droite
		suitePointDessin(pointsPourLeNez).nePasRelierLesPointsExtreme();
		
		// Creation de la bouche
		Point[] pointsPourLaBouche = {
				new Point(this.vraiePositionEnX(5), this.vraiePositionEnY(8)),
				new Point(this.vraiePositionEnX(9), this.vraiePositionEnY(8))
		};
		// Dessin de la lunette de droite
		suitePointDessin(pointsPourLaBouche);
	}
	/**
	 * Contour du visage
	 */
	public void contourVisage(){
		
	mentonVisage();	
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
		Point hautDroite=new Point(vraiePositionEnX(12),vraiePositionEnY(7));
		//Creation des points
		Point basDroite=new Point(vraiePositionEnX(9),vraiePositionEnY(10));
		//Dessiner 
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautGauche)
		.ajouter(basGauche);
		
		demarrerNouveauDessinAvecDesPoints().ajouter(basGauche)
.ajouter(basDroite);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(basDroite).ajouter(hautDroite);
	
	}
	
	/**
<<<<<<< HEAD
	 * cheveux meches
	 */
	public void cheveux(){
	
		//Creation des points du cheveux
				Point basChGauche=new Point(vraiePositionEnX(2),vraiePositionEnY(1));
				//Creation des points
				Point hautChGauche=new Point(vraiePositionEnX(5),vraiePositionEnY(0));
				//Creation des points
				Point hautChDroite=new Point(vraiePositionEnX(9),vraiePositionEnY(0));
				//Creation des points
				Point basChDroite=new Point(vraiePositionEnX(12),vraiePositionEnY(1));
				
				// creer points meches
				Point hautM1=new Point(vraiePositionEnX(7),vraiePositionEnY(0));
				Point basM1=new Point(vraiePositionEnX(6),vraiePositionEnY(1));
				Point hautM2=new Point(vraiePositionEnX(8),vraiePositionEnY(0));
				Point basM2=new Point(vraiePositionEnX(7),vraiePositionEnY(2));
				
	}
	
	/**
	 * Dessiner jambes
	 */
	private void dessinJambes(){
		//Création des points des jambes
		Point orteilGauche = new Point(vraiePositionEnX(12),vraiePositionEnY(14));
		Point talonGauche = new Point(vraiePositionEnX(10),vraiePositionEnY(14));
		Point talonGauche2 = new Point(vraiePositionEnX(10),vraiePositionEnY(13));
		Point fesses = new Point(vraiePositionEnX(4),vraiePositionEnY(13));
		Point talonDroit = new Point(vraiePositionEnX(4),vraiePositionEnY(14));
		Point orteilDroit = new Point(vraiePositionEnX(2),vraiePositionEnY(14));
		Point piedDroit = new Point(vraiePositionEnX(3),vraiePositionEnY(13));
		Point jambeDroite = new Point(vraiePositionEnX(3),vraiePositionEnY(12));
		Point ventre = new Point(vraiePositionEnX(11),vraiePositionEnY(12));
		Point jambeGauche = new Point(vraiePositionEnX(11),vraiePositionEnY(13));
		
		//Dessin des jambes
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(orteilGauche)
		.ajouter(talonGauche)
		.ajouter(talonGauche2)
		.ajouter(fesses)
		.ajouter(talonDroit)
		.ajouter(orteilDroit)
		.ajouter(piedDroit)
		.ajouter(jambeDroite)
		.ajouter(ventre)
		.ajouter(jambeGauche)
		.couleurDeFond(Couleur.GRIS)
		;
		
	}
	/*
	 * Dessin haut du corps
	 */
	private void dessinHautCorps(){
		//Création des points du haut du corps
		Point epauleDroite = new Point(vraiePositionEnX(3),vraiePositionEnY(8));
		Point coudeDroite = new Point(vraiePositionEnX(2),vraiePositionEnY(10));
		Point mancheDroite2 = new Point(vraiePositionEnX(1),vraiePositionEnY(11));
		Point mancheDroite1 = new Point(vraiePositionEnX(2),vraiePositionEnY(12));
		Point aisselleDroite = new Point(vraiePositionEnX(3),vraiePositionEnY(11));
		Point hancheDroite = new Point(vraiePositionEnX(3),vraiePositionEnY(12));
		Point hancheGauche = new Point(vraiePositionEnX(11),vraiePositionEnY(12));
		Point aisselleGauche = new Point(vraiePositionEnX(11),vraiePositionEnY(11));
		Point mancheGauche1 = new Point(vraiePositionEnX(12),vraiePositionEnY(12));
		Point mancheGauche2 = new Point(vraiePositionEnX(13),vraiePositionEnY(11));
		Point coudeGauche = new Point(vraiePositionEnX(12),vraiePositionEnY(10));
		Point epauleGauche = new Point(vraiePositionEnX(11),vraiePositionEnY(8));
		Point mentonGauche = new Point(vraiePositionEnX(9),vraiePositionEnY(10));
		Point mentonDroite = new Point(vraiePositionEnX(5),vraiePositionEnY(10));
		
		//Dessin du haut du corps
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(epauleDroite)
		.ajouter(coudeDroite)
		.ajouter(mancheDroite2)
		.ajouter(mancheDroite1)
		.ajouter(aisselleDroite)
		.ajouter(hancheDroite)
		.ajouter(hancheGauche)
		.ajouter(aisselleGauche)
		.ajouter(mancheGauche1)
		.ajouter(mancheGauche2)
		.ajouter(coudeGauche)
		.ajouter(epauleGauche)
		.ajouter(mentonGauche)
		.ajouter(mentonDroite)
		.couleurDeFond(Couleur.GRIS)
		;
	}
	
	private void dessinPoche(){
		//Création des points de la poche
		Point hautDroit = new Point(vraiePositionEnX(9),vraiePositionEnY(10.5));
		Point basDroit = new Point(vraiePositionEnX(9),vraiePositionEnY(11));
		Point basGauche = new Point(vraiePositionEnX(10),vraiePositionEnY(11));
		Point hautGauche = new Point(vraiePositionEnX(10),vraiePositionEnY(10.5));
		
		//Dessin de la poche
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautDroit)
		.ajouter(basDroit)
		.ajouter(basGauche)
		.ajouter(hautGauche)
		.nePasRelierLesPointsExtreme();
		
	}
    /**
	 * Permet de relier plusieurs points
	 * @param points Les points à relier dans l'ordre de reliement
	 * @return CheminDePoints le chemin de points formé par les points relié
     */
    private CheminDePoints suitePointDessin(Point[] points){
		CheminDePoints cdp = demarrerNouveauDessinAvecDesPoints();
		for(int i = 0; i < points.length; i++){
			cdp.ajouter(points[i]);
		}
		return cdp;
	}
	/**
	 * Permet de connaitre la vraie position en X
	 * Pour un nbCarreau entier donné
	 * @param nbCarreau Entier indiquant le décalage vers la droite (en X)
	 * @return La réel position en X, comprenant le décalage et le nombre de pixel
	 */
	private int vraiePositionEnX(int nbCarreau){
		return (DessinsGroupe2.DECALAGEENX + nbCarreau)*DessinsGroupe2.NBRPIXELCARREAU;
	}
	/**
	 * Permet de connaitre la vraie position en X
	 * Pour un nbCarreau double donné
	 * @param nbCarreau double indiquant le décalage vers la droite (en X)
	 * @return La réel position en X, comprenant le décalage et le nombre de pixel
	 */
	private double vraiePositionEnX(double nbCarreau){
		return (DessinsGroupe2.DECALAGEENX + nbCarreau)*DessinsGroupe2.NBRPIXELCARREAU;
	}
	/**
	 * Permet de connaitre la vraie position en Y
	 * Pour un nbCarreau entier donné
	 * @param nbCarreau entier indiquant le décalage vers le bas (en Y)
	 * @return La réel position en Y, comprenant le décalage et le nombre de pixel
	 */
	private int vraiePositionEnY(int nbCarreau){
		return (DessinsGroupe2.DECALAGEENY + nbCarreau)*DessinsGroupe2.NBRPIXELCARREAU;
	}
	/**
	 * Permet de connaitre la vraie position en Y
	 * Pour un nbCarreau double donné
	 * @param nbCarreau double indiquant le décalage vers le bas (en Y)
	 * @return La réel position en Y, comprenant le décalage et le nombre de pixel
	 */
	private double vraiePositionEnY(double nbCarreau){
		return (DessinsGroupe2.DECALAGEENY + nbCarreau)*DessinsGroupe2.NBRPIXELCARREAU;
	}
}
