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
	
	Point menton = new Point(21*25,15*25);
	
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
			Point unG = new Point(menton.getX()-75, menton.getY()-50);
			Point deuxG = new Point(unG.getX()-25, unG.getY()-75);
			Point troisG = new Point(deuxG.getX(), deuxG.getY()-50);
			Point quatreG = new Point(troisG.getX()+75, troisG.getY()-25);
			Point cinqG = new Point(quatreG.getX()+25, quatreG.getY()+25);
			Point septD = new Point(cinqG.getX()+25, cinqG.getY()-25);
			Point huitD = new Point(septD.getX()+75, septD.getY()+25);
			Point neufD = new Point(huitD.getX(), huitD.getY()+50);
			Point dixD = new Point(neufD.getX()-25, neufD.getY()+75);
	
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(menton)
			.ajouter(unG)
			.ajouter(deuxG)
			.ajouter(troisG)
			.ajouter(quatreG)
			.ajouter(cinqG)
			.ajouter(septD)
			.ajouter(huitD)
			.ajouter(neufD)
			.ajouter(dixD);

		}
}
