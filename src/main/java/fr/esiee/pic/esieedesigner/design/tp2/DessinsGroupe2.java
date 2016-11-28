package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
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
	private static final double ORIGIN = 1400;
	
	/**
	 * Nombre de pixel d'une case
	 */
	private static final double CASE = 25;
	
	@Override
	public void dessiner() {
		dessiner_cheveux();
	}

	public void dessiner_cheveux() {
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

}
