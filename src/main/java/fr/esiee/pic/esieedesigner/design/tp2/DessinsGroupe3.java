package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;


/**
 * Le groupe 3 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe3 extends CreateurDeForme {

	
	Point menton = new Point(21*25,15*25);
	// Point du menton
	
	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
	
	}
	
private void dessinerCorps(){
		
	
	Point baseMenton2 = new Point(menton.getX() - 75 , menton.getY()-50);
	Point baseEpauleG = new Point(baseMenton2.getX() - 50, baseMenton2.getY());
	
	
	/**
	 * contrusction du dessin
	 */
	demarrerNouveauDessinAvecDesPoints()
	.ajouter(menton)
	.ajouter(baseMenton2)
	.ajouter(baseEpauleG);
}
}
