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
		dessinerTete();
	
	}
	
	public void dessinerTete(){
		double X = UNITE_VERTICALE/2;
		double Y = UNITE_HORIZONTALE/2;
		
		Point a = new Point (4*X, 0);
		Point b = new Point (10*X, 0);
		Point c = new Point (12*X, 2*Y);
		Point d = new Point (13*X, 5*Y);
		Point e = new Point (9*X, 1*Y);
		Point f = new Point (7*X, 2*Y);
		Point g = new Point (5*X, 1*Y);
		
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(a)
		.ajouter(b)
		.nePasRelierLesPointsExtreme();
	
	}
	
	public void dessinerCorps(){
		
		
	}
	
	public void dessinerJambe(){
		
		
	}
	
	

}
