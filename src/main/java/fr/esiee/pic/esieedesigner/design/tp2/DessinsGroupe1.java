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
		//création des points pour le début de l'épaule gauche
		Point p1 = new Point(2*UNITE_HORIZONTALE,5*UNITE_VERTICALE);
		Point p2 = new Point(1*UNITE_HORIZONTALE,6*UNITE_VERTICALE);
		//RELIER LES 2 POINTS DE L'ÉPAULE
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2);
			
	}
	
	public void dessinerJambe(){
		
		
	}
	
	

}
