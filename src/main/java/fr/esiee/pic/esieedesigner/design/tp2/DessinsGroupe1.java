package fr.esiee.pic.esieedesigner.design.tp2;

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
	private static final double UNITE_HORIZONTALE = 50;
	
	/**
	 * Unité de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
	}
	
	public void dessinerTete(){
		
	
	}
	
	public void dessinerCorps(){
		
		
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
		
	}
	
	

}
