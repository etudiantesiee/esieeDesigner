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
	 * Unité de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 25;
	
	/**
	 * Unité de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 25;
	

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal

		dessinerCorps();

		dessinerTete();
		dessinerJambe();
	

	}
	
	/**
	 * Méthode pour dessiner la tête en plusieurs parties : les cheveux, le visage, les yeux, le nez, la bouche
	 */
	public void dessinerTete(){
		
		// Unité des carreaux pour faciliter les calculs
		double X = UNITE_VERTICALE/2;
		double Y = UNITE_HORIZONTALE/2;
		
		// Dessin des cheveux
		Point a = new Point (4*X, 0);
		Point b = new Point (10*X, 0);
		Point c = new Point (12*X, 2*Y);
		Point d = new Point (13*X, 5*Y);
		Point e = new Point (9*X, 1*Y);
		Point f = new Point (7*X, 2*Y);
		Point g = new Point (5*X, 1*Y);
		Point h = new Point (1*X, 5*Y);
		Point i = new Point (2*X, 2*Y);
		
		//Ajout des points, couleur de fond grise
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(a)
		.ajouter(b)
		.ajouter(c)
		.ajouter(d)
		.ajouter(e)
		.ajouter(f)
		.ajouter(g)
		.ajouter(h)
		.ajouter(i)
		.couleurDeFond(Couleur.GRIS);
		
		// Dessin du contour du visage
		Point ab = new Point (3*X, 3*Y);
		Point bb = new Point (3*X, 5*Y);
		Point cb = new Point (5*X, 7*Y);
		Point db = new Point (9*X, 7*Y);
		Point eb = new Point (11*X, 5*Y);
		Point fb = new Point (11*X, 3*Y);
		
		// Ajout des points, pas de couleur de fond
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ab)
		.ajouter(bb)
		.ajouter(cb)
		.ajouter(db)
		.ajouter(eb)
		.ajouter(fb)
		.nePasRelierLesPointsExtreme();
	
	}
	
	public void dessinerCorps(){
		//création des points pour le début de l'épaule gauche
		Point p1 = new Point(2*UNITE_HORIZONTALE,5*UNITE_VERTICALE);
		Point p2 = new Point(1*UNITE_HORIZONTALE,6*UNITE_VERTICALE);
		//création des points pour le BRAS GAUCHE
		Point p3 = new Point(1*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p4 = new Point(2*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		//RELIER LES 2 POINTS DE L'ÉPAULE
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		//RELIER LES 2 POINTS DU BRAS
		.ajouter(p3)
		.ajouter(p4);
		
		
		
			
	}
	/**
	 * Méthode dessinant les jambes.
	 */
	public void dessinerJambe(){
		Point p1 = new Point(3*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p2 = new Point(11*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p3 = new Point(10*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point p4 = new Point(8*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point p5 = new Point(7*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p6 = new Point(6*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point p7 = new Point(4*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7);
	}
	
	

}
