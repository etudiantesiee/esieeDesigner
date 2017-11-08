package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
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
		double X = UNITE_VERTICALE;
		double Y = UNITE_HORIZONTALE;
		
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
		.couleurDeFond(Couleur.GRIS)
		.produireTraitDeLiaisonDePetiteTaille();
		
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
		.nePasRelierLesPointsExtreme()
		.produireTraitDeLiaisonDePetiteTaille();
		
		// Ajout des yeux 
		Point ac = new Point (5*X, 2*Y);
		Point bc = new Point (6*X, 2*Y);
		Point cc = new Point (8*X, 4*Y);
		Point dc = new Point (9*X, 4*Y);
		Point ec = new Point (10*X, 3*Y);
		Point fc = new Point (9*X, 2*Y);
		Point gc = new Point (8*X, 2*Y);
		Point hc = new Point (6*X, 4*Y);
		Point ic = new Point (5*X, 4*Y);
		Point jc = new Point (4*X, 3*Y);
		
		// Ajout des points, pas de couleur de fond
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ac)
		.ajouter(bc)
		.ajouter(cc)
		.ajouter(dc)
		.ajouter(ec)
		.ajouter(fc)
		.ajouter(gc)
		.ajouter(hc)
		.ajouter(ic)
		.ajouter(jc)
		.produireTraitDeLiaisonDePetiteTaille();
		
		// Dessin oeil droit
		double abscisseOeilDroit = 6*X;
		double ordonneOeilDroit = 3*Y;
		Point centreOeilDroit = new Point(abscisseOeilDroit, ordonneOeilDroit);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, 10, 10);
				
		ajouterEllipse(oeilDroit, Couleur.NOIR);
				
		// Dessin oeil gauche
		double abscisseOeilGauche = 8*X;
		double ordonneOeilGauche = 3*Y;
		Point centreOeilGauche = new Point(abscisseOeilGauche, ordonneOeilGauche);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, 10, 10);
				
		ajouterEllipse(oeilGauche, Couleur.NOIR);
	
	}
	
	/**
	 * procedure dessinercorps
	 */
	public void dessinerCorps(){
		//création des points pour le début de l'épaule gauche
		Point p1 = new Point(2*UNITE_HORIZONTALE,5*UNITE_VERTICALE);
		Point p2 = new Point(1*UNITE_HORIZONTALE,6*UNITE_VERTICALE);
		//création des points pour le BRAS GAUCHE
		Point p3 = new Point(1*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p4 = new Point(2*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		//création des points pour l'aisselle gauche
		Point p5 = new Point(2*UNITE_HORIZONTALE,7*UNITE_VERTICALE);
		Point p6 = new Point(3*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		//création des points pour l'aisselle droite
		Point p7 = new Point(10*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p8 = new Point(12*UNITE_HORIZONTALE,8*UNITE_VERTICALE);
		//RELIER LES 2 POINTS DE L'ÉPAULE
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		//RELIER LES 2 POINTS DU BRAS
		.ajouter(p3)
		.ajouter(p4)
		//RELIER LES 2 POINTS De l'aisselle gauche
	     .ajouter(p5)
	     .ajouter(p6)
	     //RELIER LES 2 POINTS De l'aisselle droite
	     .ajouter(p7)
	     .ajouter(p8)
		.nePasRelierLesPointsExtreme();
		
		
			
	}
	/**
	 * Méthode dessinant les jambes.
	 */
	public void dessinerJambe(){
		
		// Création de points pour dessiner la culotte
		Point p1 = new Point(3*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p2 = new Point(11*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p3 = new Point(10*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point p4 = new Point(8*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point p5 = new Point(7*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p6 = new Point(6*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point p7 = new Point(4*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		
		// Dessin de la culotte
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7);
		
		
		Point k1 = new Point(6*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		Point k2 = new Point(6*UNITE_HORIZONTALE,14*UNITE_VERTICALE);
		Point k3 = new Point(3*UNITE_HORIZONTALE,14*UNITE_VERTICALE);
		Point k4 = new Point(5*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(k1)
		.ajouter(k2)
		.ajouter(k3)
		.ajouter(k4);

	}
	
	

}
