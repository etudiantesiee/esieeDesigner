package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;


/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe2 extends CreateurDeForme {
	
	private static int DECALAGE = 750;

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerCorps();
		dessinerCheveux();
		dessinerInterieurVisage();
		dessinerExterieurVisage();
		dessinerMains();
	}
	
	public void dessinerCorps(){
		Point pt1 = new Point(DECALAGE + pixels(3), pixels(14));
		Point pt2 = new Point(DECALAGE + pixels(6), pixels(14));
		Point pt3 = new Point(DECALAGE + pixels(5), pixels(13));
		Point pt4 = new Point(DECALAGE + pixels(6), pixels(12));
		Point pt5 = new Point(DECALAGE + pixels(8), pixels(12));
		Point pt6 = new Point(DECALAGE + pixels(9), pixels(13));
		Point pt7 = new Point(DECALAGE + pixels(8), pixels(14));
		Point pt8 = new Point(DECALAGE + pixels(11), pixels(14));
		Point pt9 = new Point(DECALAGE + pixels(10), pixels(13));
		Point pt10 = new Point(DECALAGE + pixels(9), pixels(11));
		Point pt11 = new Point(DECALAGE + pixels(11), pixels(10));
		Point pt12 = new Point(DECALAGE + pixels(12), pixels(11));
		Point pt13 = new Point(DECALAGE + pixels(12), pixels(12));
		Point pt14 = new Point(DECALAGE + pixels(13), pixels(12));
		Point pt15 = new Point(DECALAGE + pixels(13), pixels(10));
		Point pt16 = new Point(DECALAGE + pixels(11), pixels(8));
		Point pt17 = new Point(DECALAGE + pixels(10), pixels(8));
		Point pt18 = new Point(DECALAGE + pixels(8), pixels(10));
		Point pt19 = new Point(DECALAGE + pixels(6), pixels(10));
		Point pt20 = new Point(DECALAGE + pixels(4), pixels(8));
		Point pt21 = new Point(DECALAGE + pixels(3), pixels(8));
		Point pt22 = new Point(DECALAGE + pixels(1), pixels(10));
		Point pt23 = new Point(DECALAGE + pixels(1), pixels(12));
		Point pt24 = new Point(DECALAGE + pixels(2), pixels(12));
		Point pt25 = new Point(DECALAGE + pixels(2), pixels(11));
		Point pt26 = new Point(DECALAGE + pixels(3), pixels(10));
		Point pt27 = new Point(DECALAGE + pixels(5), pixels(11));
		Point pt28 = new Point(DECALAGE + pixels(4), pixels(13));
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pt1)
		.ajouter(pt2)
		.ajouter(pt3)
		.ajouter(pt4)
		.ajouter(pt5)
		.ajouter(pt6)
		.ajouter(pt7)
		.ajouter(pt8)
		.ajouter(pt9)
		.ajouter(pt10)
		.ajouter(pt11)
		.ajouter(pt12)
		.ajouter(pt13)
		.ajouter(pt14)
		.ajouter(pt15)
		.ajouter(pt16)
		.ajouter(pt17)
		.ajouter(pt18)
		.ajouter(pt19)
		.ajouter(pt20)
		.ajouter(pt21)
		.ajouter(pt22)
		.ajouter(pt23)
		.ajouter(pt24)
		.ajouter(pt25)
		.ajouter(pt26)
		.ajouter(pt27)
		.ajouter(pt28)
		
		.couleurDeFond(Couleur.GRIS);
		
	}
	
	public void dessinerCheveux(){
		
	}
	
	public void dessinerInterieurVisage(){
		dessinerYeux();
	}
	
	public void dessinerExterieurVisage(){
		
	}
	
	public void dessinerMains(){
		
	}	
	
	public int pixels(int carreau){
		return carreau*50;
	}
	
	public void dessinerYeux(){
		
		//Dessin des yeux du bonhomme
		// UN cercle pour les yeux
		Ellipse yeuxGauche = new Ellipse(new Point(DECALAGE + pixels(6), pixels(4)), 10, 10);
		Ellipse yeuxDroit = new Ellipse(new Point(DECALAGE + pixels(8), pixels(4)), 10, 10);
			
		// On ajout à la liste des composants à déssiner
		ajouterEllipse(yeuxGauche, Couleur.NOIR);	
		ajouterEllipse(yeuxDroit, Couleur.NOIR);
}

}
