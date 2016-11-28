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

	/**
	 * Point cheveux extremité gauche
	 */
	private static final Point CHEVEUX_EXTREMITE_GAUCHE = new Point(TORSE_HAUT_GAUCHE.getX() - CASE*2, TORSE_HAUT_GAUCHE.getY());
	
	/**
	 * Point joue extremité gauche exterieur
	 */
	private static final Point JOUE_EXTREMITE_GAUCHE_EXTERIEUR = new Point(TORSE_HAUT_GAUCHE.getX(), TORSE_HAUT_GAUCHE.getY() - CASE);
	
	/**
	 * Point joue extremité droite exterieur
	 */
	private static final Point JOUE_EXTREMITE_DROITE_EXTERIEUR = new Point(TORSE_HAUT_GAUCHE.getX() + CASE*8, TORSE_HAUT_GAUCHE.getY() - CASE);
	
	@Override
	/**
	 * Fonction main qui dessine toutes les parties du corps du personnage du dessin #16.
	 */
	public void dessiner() {
		
		// Dessin des cheveux
		dessinerCheveux();
		
		// Dessin du torse
		dessinerTorse();
		
		// Dessin des parties du visage (bouche, nez et yeux)
		dessinerVisage();
		
		// Dessin de la jupe
		dessinerJupe();
		
		// Dessin des joues
		dessinerJoueDroite();
		dessinerJoueGauche();
		
		// Dessin des mains
		dessinerMainDroite();
		dessinerMainGauche();
		
		// Dessin des pieds
		dessinerPiedGauche();
		dessinerPiedDroit();
	}

	/**
	 * Fonction qui dessine la joue droite
	 */
	public void dessinerJoueDroite() {
		
		// == Objetive 3 Dessin de la joue droite
		
		// Déclaration des points
		Point jd1 = JOUE_EXTREMITE_DROITE_EXTERIEUR;
		Point jd2 = new Point(JOUE_EXTREMITE_DROITE_EXTERIEUR.getX() - CASE, JOUE_EXTREMITE_DROITE_EXTERIEUR.getY() + CASE);
		
		// Dessin de la joue droite
	    demarrerNouveauDessinAvecDesPoints()
		.ajouter(jd1)
		.ajouter(jd2);
	}
	
	/**
	 * Fonction qui dessine la joue gauche
	 */
	public void dessinerJoueGauche() {
		
		// == Objetive 3 Dessin de la joue droite
		
		// Déclaration des points
		Point jg1 = JOUE_EXTREMITE_GAUCHE_EXTERIEUR;
		Point jg2 = new Point(JOUE_EXTREMITE_GAUCHE_EXTERIEUR.getX() + CASE, JOUE_EXTREMITE_GAUCHE_EXTERIEUR.getY() + CASE);

		// Dessin de la joue gauche
	    demarrerNouveauDessinAvecDesPoints()
		.ajouter(jg1)
		.ajouter(jg2);
	}
	
	/**
	 * Fonction qui dessine les cheveux
	 */
	public void dessinerCheveux() {
		
		// == Objetive 3 Dessin des cheveux
		
		// Déclaration des points
		Point p1 = CHEVEUX_EXTREMITE_GAUCHE;
		Point p2 = new Point(CHEVEUX_EXTREMITE_GAUCHE.getX(), CHEVEUX_EXTREMITE_GAUCHE.getY() - CASE*5);
		Point p3 = new Point(p2.getX() + CASE*2, p2.getY() - CASE*2);
		Point p4 = new Point(p3.getX() + CASE*2, p3.getY() - CASE*1);
		Point p5 = new Point(p4.getX() + CASE*4, p4.getY());
		Point p6 = new Point(p5.getX() + CASE*2, p5.getY() + CASE);
		Point p7 = new Point(p6.getX() + CASE*2, p6.getY() + CASE*2);
		Point p8 = new Point(p7.getX(), p7.getY() + CASE*5);
		Point p9 = new Point(p8.getX() - CASE, p8.getY() - CASE*2);
		Point p10 = new Point(p9.getX(), p9.getY() - CASE*2);
		Point p11 = new Point(p10.getX(), p10.getY() + CASE*4);
		Point p12 = new Point(p11.getX() - CASE, p11.getY() - CASE*2);
		Point p13 = new Point(p12.getX(), p12.getY() - CASE);
		Point p14 = new Point(p13.getX(), p13.getY() + CASE*2);
		Point p15 = new Point(p14.getX() - CASE, p14.getY() - CASE*2);
		Point p16 = new Point(p15.getX(), p15.getY() - CASE);
		Point p17 = new Point(p16.getX() - CASE, p16.getY() - CASE);
		Point p18 = new Point(p17.getX() - CASE, p17.getY());
		Point p19 = new Point(p18.getX() - CASE, p18.getY() - CASE);
		Point p20 = new Point(p19.getX() - CASE, p19.getY() + CASE);
		Point p21 = new Point(p20.getX() - CASE, p20.getY());
		Point p22 = new Point(p21.getX() - CASE, p21.getY() + CASE);
		Point p23 = new Point(p22.getX(), p22.getY() + CASE);
		Point p24 = new Point(p23.getX() - CASE, p23.getY() + CASE*2);
		Point p25 = new Point(p24.getX(), p24.getY() - CASE*2);
		Point p26 = new Point(p25.getX(), p25.getY() + CASE);
		Point p27 = new Point(p26.getX() - CASE, p26.getY() + CASE*2);
		Point p28 = new Point(p27.getX(), p27.getY() - CASE*4);
		Point p29 = new Point(p28.getX(), p28.getY() + CASE*2);
		Point p30 = new Point(p29.getX() - CASE, p29.getY() + CASE*2);

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
		Point p3 = new Point(p2.getX() + CASE*2, p2.getY() + CASE*1);
		Point p4 = new Point(p3.getX() + CASE*2, p3.getY());
		Point p5 = new Point(p4.getX() + CASE*2, p4.getY() - CASE*1);
		Point p6 = new Point(p5.getX() + CASE*1, p5.getY());
		Point p7 = new Point(p6.getX() + CASE*2, p6.getY() + CASE*2);
		Point p8 = new Point(p7.getX() - CASE*1, p7.getY() + CASE*1);
		Point p9 = new Point(p8.getX() - CASE*1, p8.getY() - CASE*1);
		Point p10 = new Point(p9.getX(), p9.getY() + CASE*1);
		Point p11 = new Point(p10.getX() - CASE*8, p10.getY());
		Point p12 = new Point(p11.getX(), p11.getY() - CASE*1);
		Point p13 = new Point(p12.getX() - CASE*1, p12.getY() + CASE*1);
		Point p14 = new Point(p13.getX() - CASE*1, p13.getY() - CASE*1);
		Point p15 = new Point(p14.getX() + CASE*2, p14.getY() - CASE*2);
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
	 * Ordre torse_haut_gauche --> bouche --> nez --> yeux
	 */
	public void dessinerVisage() {
		
		// == Dessin de la bouche - point initial = torse haut gauche

		// Déclaration des points
		// Déclaration du point bouche1 à partir du point d'origine TORSE_HAUT_GAUCHE
		Point bouche1 = new Point(TORSE_HAUT_GAUCHE.getX()+ CASE * 1, TORSE_HAUT_GAUCHE.getY() + CASE * (-2));
		
		// Dessin des points de la bouche à partir du point bouche1
		Point bouche2 = new Point(bouche1.getX() + CASE * 0, bouche1.getY() + CASE * 1);
		Point bouche3 = new Point(bouche2.getX() + CASE * 2, bouche2.getY() + CASE * 1);
		Point bouche4 = new Point(bouche3.getX() + CASE * 2, bouche3.getY() + CASE * 0);
		Point bouche5 = new Point(bouche4.getX() + CASE * 2, bouche4.getY() + CASE * (-1));
		Point bouche6 = new Point(bouche5.getX() + CASE * 0, bouche5.getY() + CASE * (-1));
		
		// Dessin trait de la bouche
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(bouche1)
		.ajouter(bouche2)
		.ajouter(bouche3)
		.ajouter(bouche4)
		.ajouter(bouche5)
		.ajouter(bouche6);
		
		// ==========================================
		
		// == Dessin du nez - point initial = bouche1
		
		// Déclaration des points
		Point nez1 = new Point(bouche1.getX() + CASE * 2.8, bouche1.getY() + CASE * (-0.8));
		Point nez2 = new Point(nez1.getX() + CASE * 0.2, nez1.getY() - CASE * 0.2);
		Point nez3 = new Point(nez2.getX() + CASE * 0.2, nez2.getY() + CASE * 0.2);
		
		// Premier trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez1)
		.ajouter(nez2);
		
		// Deuxième trait
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(nez2)
		.ajouter(nez3);
		
		// ==============================================
		
		// == Dessin des deux yeux - point initial = nez2
		
		// Dessin du premier oeil (gauche)
		Point oeil1 = new Point(nez2.getX() + CASE * (-1), nez2.getY() + CASE * (-1));
		Ellipse ellipseOeil1 = new Ellipse(oeil1, CASE * 0.3, CASE * 0.6);
		ajouterEllipse(ellipseOeil1, Couleur.NOIR);
		
		// Dessin du second oeil (gauche)
		Point oeil2 = new Point(nez2.getX() + CASE * 1, nez2.getY() + CASE * (-1));
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
		Point p0 = new Point(TORSE_HAUT_GAUCHE.getX() - CASE*2, TORSE_HAUT_GAUCHE.getY() + CASE*2);
		Point p1 = new Point(p0.getX() - CASE*1, p0.getY() + CASE*1);
		Point p2 = new Point(p1.getX() + CASE*1, p1.getY());
		Point p3 = new Point(p2.getX(), p2.getY() + CASE*1);
		Point p4 = new Point(p3.getX() + CASE*1, p3.getY() - CASE*1);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p0)
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4);
	}

	/**
	 * Dessiner main droite
	 */
	public void dessinerMainDroite() {
		// Dessin main droite.
		Point p1 = new Point(TORSE_HAUT_GAUCHE.getX() + CASE*10, TORSE_HAUT_GAUCHE.getY() + CASE*2);
		Point p2 = new Point(p1.getX() + CASE*1, p1.getY() + CASE*1);
		Point p3 = new Point(p2.getX() - CASE*1, p2.getY());
		Point p4 = new Point(p3.getX(), p3.getY() + CASE*1);
		Point p5 = new Point(p4.getX() - CASE*1, p4.getY() - CASE*1);
		
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
		Point p1 = new Point(TORSE_HAUT_GAUCHE.getX() + CASE*3, TORSE_HAUT_GAUCHE.getY() + CASE*5);
		Point p2 = new Point(p1.getX() - CASE*1, p1.getY() + CASE*1);
		Point p3 = new Point(p2.getX() + CASE*2, p2.getY());
		Point p4 = new Point(p3.getX(), p3.getY() - CASE*1);
		
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
		Point p1 = new Point(TORSE_HAUT_GAUCHE.getX() + CASE*4, TORSE_HAUT_GAUCHE.getY() + CASE*5);
		Point p2 = new Point(p1.getX() + CASE*1, p1.getY());
		Point p3 = new Point(p2.getX() + CASE*1, p2.getY() + CASE*1);
		Point p4 = new Point(p3.getX() - CASE*2, p3.getY());
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4);
	}

}
