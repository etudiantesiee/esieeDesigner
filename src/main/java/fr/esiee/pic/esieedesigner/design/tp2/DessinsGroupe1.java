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

	@Override
	public void dessiner() {
		binome1();
		binome2();
		binome3();
	}
	
	/**
	 * Dessin binome 1
	 */
	public void binome1() {
		
		
	}
	/**
	 *  Dessin binome 2
	 */
	public void binome2() {
				
			Point p1 = new Point(200, 250);
			Point p2 = new Point(500, 250);
			Point p3 = new Point(500, 300);
			Point p4 = new Point(450, 350);
			Point p5 = new Point(400, 350);
			Point p6 = new Point(350, 300);
			Point p7 = new Point(300, 350);
			Point p8 = new Point(250, 350);
			Point p9 = new Point(200, 300);
			
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(p1)
			.ajouter(p2)
			.ajouter(p3)
			.ajouter(p4)
			.ajouter(p5)
			.ajouter(p6)
			.ajouter(p7)
			.ajouter(p8)
			.ajouter(p9);	
	}
	/**
	 *  Dessin binome 3
	 */
	public void binome3() {
		
	}
}

