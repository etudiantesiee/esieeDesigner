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

	

	// Point du menton
	/**
	 * Permet l'instanciation des dessins
	 */

	@Override
	public void dessiner() {
		formetete();
		 dessinerCorps();
		yeux();
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal


		
	}
	/**
	 * méthode pour les yeux
	 */
	public void yeux()
	{
		Point baseLunette = new Point(menton.getX(), menton.getY() +6*25);
		Point baseLunette2 = new Point(menton.getX()-25, menton.getY() -25);
		Point baseLunette3 = new Point(menton.getX()- 25*4, menton.getY());
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseLunette)
		.ajouter(baseLunette2)
		.ajouter(baseLunette3);
	}
		


	   
	
	
/**
 * Fonction pour dessiner le corps
 */
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

	/**
	 * Permet le dessin de la forme de la tête et du visage
	 */
		public void formetete() {
			Point unG = new Point(menton.getX()-75, menton.getY()-50);
			Point deuxG = new Point(unG.getX()-25, unG.getY()-75);
			Point troisG = new Point(deuxG.getX(), deuxG.getY()-50);
			Point quatreG = new Point(troisG.getX(), troisG.getY()-50);
			Point cinqG = new Point(quatreG.getX()+75, quatreG.getY()-25);
			Point sixG = new Point(cinqG.getX()+25, cinqG.getY()+25);
			
	
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(menton)
			.ajouter(unG)
			.ajouter(deuxG)
			.ajouter(troisG)
			.ajouter(quatreG)
			.ajouter(cinqG)
			.ajouter(sixG);

		}
		}

