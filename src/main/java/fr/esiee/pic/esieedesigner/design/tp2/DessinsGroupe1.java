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
		double x = UNITE_VERTICALE;
		double y = UNITE_HORIZONTALE;
		//Nous utilisons les variables pour faciliter l'écriture
		
		// Dessin des cheveux
		Point a = new Point (4*x, 0);
		Point b = new Point (10*x, 0);
		Point c = new Point (12*x, 2*y);
		Point d = new Point (13*x, 5*y);
		Point e = new Point (9*x, 1*y);
		Point f = new Point (7*x, 2*y);
		Point g = new Point (5*x, 1*y);
		Point h = new Point (1*x, 5*y);
		Point i = new Point (2*x, 2*y);
		
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
		
		//Nous avons fait des traits de petites taille
		
		// Dessin du contour du visage
		Point ab = new Point (3*x, 3*y);
		Point bb = new Point (3*x, 5*y);
		Point cb = new Point (5*x, 7*y);
		Point db = new Point (9*x, 7*y);
		Point eb = new Point (11*x, 5*y);
		Point fb = new Point (11*x, 3*y);
		
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
		
		//Nous ne devons pas relier les points extreme : utilisation de la méthode de l'API
		
		// Ajout des yeux 
		Point ac = new Point (5*x, 2*y);
		Point bc = new Point (6*x, 2*y);
		Point cc = new Point (8*x, 4*y);
		Point dc = new Point (9*x, 4*y);
		Point ec = new Point (10*x, 3*y);
		Point fc = new Point (9*x, 2*y);
		Point gc = new Point (8*x, 2*y);
		Point hc = new Point (6*x, 4*y);
		Point ic = new Point (5*x, 4*y);
		Point jc = new Point (4*x, 3*y);
		
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
		.couleurDeFond(Couleur.GRIS)
		.produireTraitDeLiaisonDePetiteTaille();
		
		// Dessin oeil droit
		double abscisseOeilDroit = 6*x;
		double ordonneOeilDroit = 3*y;
		Point centreOeilDroit = new Point(abscisseOeilDroit, ordonneOeilDroit);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, 10, 10);
		// Remplissage noir		
		ajouterEllipse(oeilDroit, Couleur.NOIR);
				
		// Dessin oeil gauche
		double abscisseOeilGauche = 8*x;
		double ordonneOeilGauche = 3*y;
		Point centreOeilGauche = new Point(abscisseOeilGauche, ordonneOeilGauche);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, 10, 10);
		// Remplissage noir				
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
		//Nous avons réutilisé une méthode déjà codée (trouvée dans l'exemple)
		
		
		
		// Dessin du nez
		Point ad = new Point (6*x + 20, 4*y + 10 );
		Point bd = new Point (7*x, 4*y +5);
		Point cd = new Point (7*x + 5, 4*y +10);
		
		//Traits non complets, qui ne sont pas sur des carreaux
		
		// Ajout des points du nez, pas de couleur de fond
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ad)
		.ajouter(bd)
		.ajouter(cd)
		.nePasRelierLesPointsExtreme()
		.produireTraitDeLiaisonDePetiteTaille();
		
		//On ne ferme pas le nez
		
		//Petit nez
	
		// Dessin de la bouche
		Point ae = new Point (6*x, 6*y);
		Point be = new Point (9*x, 5*y);
		Point ce = new Point (7*x, 6*y);
		
		
		
		// Ajout des points de la bouche, pas de couleur de fond
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ae)
		.ajouter(be)
		.ajouter(ce)
		.couleurDeFond(Couleur.JAUNE)
		.produireTraitDeLiaisonDePetiteTaille();
		
		//Personnalisation de la bouche en jaune
					
		
	}
	
	/**
	 * procedure dessinercorps
	 */
	public void dessinerCorps(){
		//création des points pour le début de l'épaule gauche
		Point p1 = new Point(2*UNITE_HORIZONTALE,5*UNITE_VERTICALE);
		Point p2 = new Point(1*UNITE_HORIZONTALE,6*UNITE_VERTICALE);
		Point pbo = new Point(3*UNITE_HORIZONTALE,5*UNITE_VERTICALE);

		//création des points pour le BRAS GAUCHE
		Point p3 = new Point(1*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p4 = new Point(2*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		//création des points pour l'aisselle gauche
		Point p5 = new Point(2*UNITE_HORIZONTALE,7*UNITE_VERTICALE);
		Point p6 = new Point(3*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		//création des points pour l'aisselle droite
		Point p7 = new Point(11*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p8 = new Point(12*UNITE_HORIZONTALE,8*UNITE_VERTICALE);
		//création des points pour le bras droit
		Point p9 = new Point(12*UNITE_HORIZONTALE,8*UNITE_VERTICALE);
		Point p10 = new Point(12*UNITE_HORIZONTALE,12*UNITE_VERTICALE);

		//création des points pour le bras droit
		Point p11= new Point(13*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p12= new Point(13*UNITE_HORIZONTALE, 6*UNITE_VERTICALE);
		//création des points pour l'épaule
		Point p13= new Point(12*UNITE_HORIZONTALE,5*UNITE_VERTICALE);
		Point p14= new Point(11*UNITE_HORIZONTALE, 5*UNITE_VERTICALE);		
		//RELIER LES 2 POINTS DE L'ÉPAULE
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pbo)
		.ajouter(p1)
		.ajouter(p2)
		//RELIER LES 2 POINTS DU BRAS gauche
		.ajouter(p3)
		.ajouter(p4)
		//RELIER LES 2 POINTS De l'aisselle gauche
	     .ajouter(p5)
	     .ajouter(p6)
	     //RELIER LES 2 POINTS De l'aisselle droite
	     .ajouter(p7)
	     .ajouter(p8)
		//RELIER LES 2 POINTS DU BRAS droit
		.ajouter(p9)
		.ajouter(p10)

		//RELIER LES 2 POINTS DU BRAS gauche ext
		.ajouter(p11)
		.ajouter(p12)
		//RELIER LES 2 POINTS De l'épaule
		.ajouter(p13)
		.ajouter(p14)
		.nePasRelierLesPointsExtreme();
		
		
		//création des points pour la manche droite
		Point p15=new Point(1*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p16=new Point(2*UNITE_HORIZONTALE, 11*UNITE_VERTICALE);
		//RELIER LES 2 POINTS De l'épaule
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p15)
		.ajouter(p16);
		
		//création des points pour la manche gauche
		Point p19= new Point(12*UNITE_HORIZONTALE,11*UNITE_VERTICALE);
		Point p20= new Point(13*UNITE_HORIZONTALE, 11*UNITE_VERTICALE);
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p19)
		.ajouter(p20);
		
		//création de la main droite
		Point p21= new Point(1.3*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p22= new Point(1.3*UNITE_HORIZONTALE, 11.3*UNITE_VERTICALE);
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p21)
		.ajouter(p22);
		
		//création de la main droite
		Point p23= new Point(1.6*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p24= new Point(1.6*UNITE_HORIZONTALE, 11.6*UNITE_VERTICALE);
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p23)
		.ajouter(p24);
		
		//création de la main droite
		Point p25= new Point(1.9*UNITE_HORIZONTALE,12*UNITE_VERTICALE);
		Point p26= new Point(1.9*UNITE_HORIZONTALE, 11.9*UNITE_VERTICALE);
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p25)
		.ajouter(p26);
		

			
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
        .ajouter(p7)
        .couleurDeFond(Couleur.GRIS); 
        //culotte de couleur grise
		
		// Création de points pour dessiner le pied gauche
        Point k1 = new Point(6*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
        Point k2 = new Point(6*UNITE_HORIZONTALE,14*UNITE_VERTICALE);
        Point k3 = new Point(3*UNITE_HORIZONTALE,14*UNITE_VERTICALE);
        Point k4 = new Point(5*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
		
        // Dessin du pied gauche
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(k1)
        .ajouter(k2)
        .ajouter(k3)
        .ajouter(k4);
         
        // création des points pour le pied droit 
        Point d1 = new Point(8*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
        Point d2 = new Point(8*UNITE_HORIZONTALE,14*UNITE_VERTICALE);
        Point d3 = new Point(11*UNITE_HORIZONTALE,14*UNITE_VERTICALE);
        Point d4 = new Point(9*UNITE_HORIZONTALE,13*UNITE_VERTICALE);
        
        // Dessin du pied droit
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(d1)
        .ajouter(d2)
        .ajouter(d3)
        .ajouter(d4);
	}
	
	

}
