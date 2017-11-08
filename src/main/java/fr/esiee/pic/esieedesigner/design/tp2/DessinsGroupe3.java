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

	/**
	 * Permet l'instanciation des dessins
	 */
	@Override
	public void dessiner() {
		formetete();
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
	}
	/**
	 * Permet le dessin de la forme de la tête et du visage
	 */
		public void formetete() {
			Point menton = new Point(37*25,15*25);
			Point unG = new Point(menton.getX()-75, menton.getY()-50);
			Point deuxG = new Point(unG.getX()-25, unG.getY()-75);
			
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(menton)
			.ajouter(unG)
			.ajouter(deuxG);
			
		}
}
