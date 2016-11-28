package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;

/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe2 extends CreateurDeForme {

	/**
	 * Point de départ groupe 2
	 */
	private static final double ORIGIN = 0;
	
	/**
	 * Nombre de pixel d'une case
	 */
	private static final double CASE = 25;
	
	/**
	 * Point torse_haut_gauche
	 */
	private static final Point TORSE_HAUT_GAUCHE = new Point(ORIGIN + CASE*3, CASE*8);
	
	
	@Override
	public void dessiner() {
		dessinerCheveux();
		dessinerTorse();
		dessinerVisage();
		dessinerJupe();
		dessinerJoueDroite();
		dessinerJoueGauche();
		dessinerMainDroite();
		dessinerMainGauche();
		dessinerPiedGauche();
		dessinerPiedDroit();
	}

	/**
	 * Fonction qui dessine la joue droite
	 */
	public void dessinerJoueDroite() {
		
		// == Dessin de la joue droite
		
		// Déclaration des points
		Point jd1 = new Point(ORIGIN + CASE*10, CASE*8);
		Point jd2 = new Point(ORIGIN + CASE*11, CASE*7);

		// Dessin de la joue droite
	    demarrerNouveauDessinAvecDesPoints()
		.ajouter(jd1)
		.ajouter(jd2);
	}
	
	/**
	 * Fonction qui dessine la joue gauche
	 */
	public void dessinerJoueGauche() {
		
		// == Dessin de la joue gauche
		
		// Déclaration des points
		Point jg1 = new Point(ORIGIN + CASE*3, CASE*7);
		Point jg2 = new Point(ORIGIN + CASE*4, CASE*8);

		// Dessin de la joue gauche
	    demarrerNouveauDessinAvecDesPoints()
		.ajouter(jg1)
		.ajouter(jg2);
	}
	
	/**
	 * Fonction qui dessine les cheveux
	 */
	public void dessinerCheveux() {
		
		// == Dessin des cheveux
		
		// Déclaration des points
		Point p1 = new Point(ORIGIN + CASE*1, CASE*8);
		Point p2 = new Point(ORIGIN + CASE*1, CASE*3);
		Point p3 = new Point(ORIGIN + CASE*3, CASE*1);
		Point p4 = new Point(ORIGIN + CASE*5, CASE*0);
		Point p5 = new Point(ORIGIN + CASE*9, CASE*0);
		Point p6 = new Point(ORIGIN + CASE*11, CASE*1);
		Point p7 = new Point(ORIGIN + CASE*13, CASE*3);
		Point p8 = new Point(ORIGIN + CASE*13, CASE*8);
		Point p9 = new Point(ORIGIN + CASE*12, CASE*6);
		Point p10 = new Point(ORIGIN + CASE*12, CASE*4);
		Point p11 = new Point(ORIGIN + CASE*12, CASE*8);
		Point p12 = new Point(ORIGIN + CASE*11, CASE*6);
		Point p13 = new Point(ORIGIN + CASE*11, CASE*5);
		Point p14 = new Point(ORIGIN + CASE*11, CASE*7);
		Point p15 = new Point(ORIGIN + CASE*10, CASE*5);
		Point p16 = new Point(ORIGIN + CASE*10, CASE*4);
		Point p17 = new Point(ORIGIN + CASE*9, CASE*3);
		Point p18 = new Point(ORIGIN + CASE*8, CASE*3);
		Point p19 = new Point(ORIGIN + CASE*7, CASE*2);
		Point p20 = new Point(ORIGIN + CASE*6, CASE*3);
		Point p21 = new Point(ORIGIN + CASE*5, CASE*3);
		Point p22 = new Point(ORIGIN + CASE*4, CASE*4);
		Point p23 = new Point(ORIGIN + CASE*4, CASE*5);
		Point p24 = new Point(ORIGIN + CASE*3, CASE*7);
		Point p25 = new Point(ORIGIN + CASE*3, CASE*5);
		Point p26 = new Point(ORIGIN + CASE*3, CASE*6);
		Point p27 = new Point(ORIGIN + CASE*2, CASE*8);
		Point p28 = new Point(ORIGIN + CASE*2, CASE*4);
		Point p29 = new Point(ORIGIN + CASE*2, CASE*6);
		Point p30 = new Point(ORIGIN + CASE*1, CASE*8);

		// == Dessin des cheveux
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10)
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15)
		.ajouter(p16)
		.ajouter(p17)
		.ajouter(p18)
		.ajouter(p19)
		.ajouter(p20)
		.ajouter(p21)
		.ajouter(p22)
		.ajouter(p23)
		.ajouter(p24)
		.ajouter(p25)
		.ajouter(p26)
		.ajouter(p27)
		.ajouter(p28)
		.ajouter(p29)
		.ajouter(p30)
		.couleurDeFond(Couleur.GRIS);
	}
	
	/**
	 * Dessin torse
	 */
	public void dessinerTorse() {
		// Dessin torse
		Point p1 = TORSE_HAUT_GAUCHE;
		Point p2 = new Point(TORSE_HAUT_GAUCHE.getX() + CASE*1, TORSE_HAUT_GAUCHE.getY());
		Point p3 = new Point(ORIGIN + CASE*6, CASE*9);
		Point p4 = new Point(ORIGIN + CASE*8, CASE*9);
		Point p5 = new Point(ORIGIN + CASE*10, CASE*8);
		Point p6 = new Point(ORIGIN + CASE*11, CASE*8);
		Point p7 = new Point(ORIGIN + CASE*13, CASE*10);
		Point p8 = new Point(ORIGIN + CASE*12, CASE*11);
		Point p9 = new Point(ORIGIN + CASE*11, CASE*10);
		Point p10 = new Point(ORIGIN + CASE*11, CASE*11);
		Point p11 = new Point(ORIGIN + CASE*3, CASE*11);
		Point p12 = new Point(ORIGIN + CASE*3, CASE*10);
		Point p13 = new Point(ORIGIN + CASE*2, CASE*11);
		Point p14 = new Point(ORIGIN + CASE*1, CASE*10);
		Point p15 = new Point(ORIGIN + CASE*3, CASE*8);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10)
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15);
	}
	
	/**
	 * Fonction pour dessiner le visage
	 */
	public void dessinerVisage() {
		
		// == Dessin du nez
		
		// Déclaration des points
		Point nez1 = new Point(ORIGIN + CASE * 6.8, CASE * 5.2);
		Point nez2 = new Point(ORIGIN + CASE * 7, CASE * 5);
		Point nez3 = new Point(ORIGIN + CASE * 7.2, CASE * 5.2);
		
		// Premier trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez1)
		.ajouter(nez2);
		
		// Deuxième trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez2)
		.ajouter(nez3);
		
		// == Dessin de la bouche
		
		// Déclaration des points
		Point bouche1 = new Point(ORIGIN + CASE * 4, CASE * 6);
		Point bouche2 = new Point(ORIGIN + CASE * 4, CASE * 7);
		Point bouche3 = new Point(ORIGIN + CASE * 6, CASE * 8);
		Point bouche4 = new Point(ORIGIN + CASE * 8, CASE * 8);
		Point bouche5 = new Point(ORIGIN + CASE * 10, CASE * 7);
		Point bouche6 = new Point(ORIGIN + CASE * 10, CASE * 6);
		
		// Dessin trait de la bouche
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(bouche1)
		.ajouter(bouche2)
		.ajouter(bouche3)
		.ajouter(bouche4)
		.ajouter(bouche5)
		.ajouter(bouche6);
		
		// == Dessin des deux yeux
		
		// Dessin du premier oeil (gauche)
		Point oeil1 = new Point(ORIGIN + CASE * 6, CASE * 4);
		Ellipse ellipseOeil1 = new Ellipse(oeil1, CASE * 0.3, CASE * 0.6);
		ajouterEllipse(ellipseOeil1, Couleur.NOIR);
		
		// Dessin du second oeil (gauche)
		Point oeil2 = new Point(ORIGIN + CASE * 8, CASE * 4);
		Ellipse ellipseOeil2 = new Ellipse(oeil2, CASE * 0.3, CASE * 0.6);
		ajouterEllipse(ellipseOeil2, Couleur.NOIR);
	}
	
	/**
	 * Dessiner jupe
	 */
	public void dessinerJupe() {
		// Dessin Jupe
		Point p1 = new Point(ORIGIN + CASE*3, CASE*11);
		Point p2 = new Point(ORIGIN + CASE*11, CASE*11);
		Point p3 = new Point(ORIGIN + CASE*12, CASE*13);
		Point p4 = new Point(ORIGIN + CASE*2, CASE*13);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.couleurDeFond(Couleur.GRIS);
	}
	
	/**
	 * Dessiner main gauche
	 */
	public void dessinerMainGauche() {
		// Dessin main gauche
		Point p1 = new Point(ORIGIN + CASE*1, CASE*10);
		Point p2 = new Point(ORIGIN + CASE*0, CASE*11);
		Point p3 = new Point(ORIGIN + CASE*1, CASE*11);
		Point p4 = new Point(ORIGIN + CASE*1, CASE*12);
		Point p5 = new Point(ORIGIN + CASE*2, CASE*11);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5);
	}

	/**
	 * Dessiner main droite
	 */
	public void dessinerMainDroite() {
		// Dessin main droite
		Point p1 = new Point(ORIGIN + CASE*13, CASE*10);
		Point p2 = new Point(ORIGIN + CASE*14, CASE*11);
		Point p3 = new Point(ORIGIN + CASE*13, CASE*11);
		Point p4 = new Point(ORIGIN + CASE*13, CASE*12);
		Point p5 = new Point(ORIGIN + CASE*12, CASE*11);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5);
	}
	
	/**
	 * Dessiner pied gauche
	 */
	public void dessinerPiedGauche() {
		// Dessin pied gauche
		Point p1 = new Point(ORIGIN + CASE*6, CASE*13);
		Point p2 = new Point(ORIGIN + CASE*5, CASE*14);
		Point p3 = new Point(ORIGIN + CASE*7, CASE*14);
		Point p4 = new Point(ORIGIN + CASE*7, CASE*13);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4);
	}

	/**
	 * Dessiner pied droit
	 */
	public void dessinerPiedDroit() {
		// Dessin pied droit
		Point p1 = new Point(ORIGIN + CASE*7, CASE*13);
		Point p2 = new Point(ORIGIN + CASE*8, CASE*13);
		Point p3 = new Point(ORIGIN + CASE*9, CASE*14);
		Point p4 = new Point(ORIGIN + CASE*7, CASE*14);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4);
	}

}
