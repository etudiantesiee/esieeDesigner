package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.CheminDePoints;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 3 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe3 extends CreateurDeForme {
	public Point ment= new Point(21*25, 15*25);
	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
	

		
	}
	/**
	 * méthode pour les yeux
	 */
	private void yeux()
	{
		Point baseLunette = new Point(ment.getX(), ment.getY() +6*25);
		Point baseLunette2 = new Point(ment.getX()-25, ment.getY() -25);
		Point baseLunette3 = new Point(ment.getX()- 25*4, ment.getY());
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseLunette)
		.ajouter(baseLunette2)
		.ajouter(baseLunette3);
	}
		
}

