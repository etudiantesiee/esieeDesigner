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

	
	
	@Override
	public void dessiner() {
		formetete();
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
	}
	/**
	 * fonction forme tete
	 */
		public void formetete() {
			Point menton = new Point(37*25,15*25);
			Point unG = new Point(menton.getX()-75, menton.getY()-50);
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(menton);
			
		}
}
