package fr.esiee.pic.esieedesigner.design.tp2;
//On importe les api nécessaires
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
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
		//On lance toutes les fonctions permettant la création des divers éléments du corps
		formetete();
		formeCheveux();
		dessinerCorps();
		yeux();
		nez();
		bouche();
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal

	}
	/**
	 * méthode pour les yeux
	 */
	public void yeux()
	{
		//début yeux
		Point baseLunette = new Point(menton.getX(), menton.getY() - 6*25); 
		Point baseLunette2 = new Point(menton.getX()-25, menton.getY()  - 5*25);
		Point baseLunette3 = new Point(menton.getX()- 25*4, menton.getY() - 6*25);
		Point baseLunette4 = new Point(menton.getX()-25*4, menton.getY() - 7*25);
		Point baseLunette5 = new Point(menton.getX()-25, menton.getY() - 8*25);
		Point baseLunette6 = new Point(menton.getX() , menton.getY() - 7*25);
		Point baseLunette7 = new Point(menton.getX()+25, menton.getY() - 8*25); 
		Point baseLunette8 = new Point(menton.getX()+25*4, menton.getY()  - 7*25);
		Point baseLunette9 = new Point(menton.getX()+ 25*4, menton.getY() - 6*25);
		Point baseLunette10 = new Point(menton.getX()+25, menton.getY() - 5*25);
		
		double abscisseOeilDroit = menton.getX()+1*25;
		double ordonneOeilDroit = menton.getY()-6*25;
		double abscisseOeilGauche = menton.getX()-1*25;
		double ordonneOeilGauche  = menton.getY()-6*25;
		
		// création des yeux
		Point centreOeilDroit = new Point(abscisseOeilDroit, ordonneOeilDroit);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, 10, 10);
		
		Point centreOeilGauche = new Point(abscisseOeilGauche, ordonneOeilGauche);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, 10, 10);
		
		
		//ajout des yeux et des points pour création de la lunette
		ajouterEllipse(oeilDroit, Couleur.NOIR);
		ajouterEllipse(oeilGauche, Couleur.NOIR);
	
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseLunette)
		.ajouter(baseLunette2)
		.ajouter(baseLunette3)
		.ajouter(baseLunette4)
		.ajouter(baseLunette5)
		.ajouter(baseLunette6)		
		.ajouter(baseLunette7)
		.ajouter(baseLunette8)	
		.ajouter(baseLunette9)
		.ajouter(baseLunette10);
		
		
	}
		
/**
 * méthode bouche
 */
	public void bouche(){
		//bouche
		Point b1 = new Point(menton.getX()-25, menton.getY() - 1*25); 
		Point b2 = new Point(menton.getX()-50, menton.getY()  - 2*25);
		Point b3 = new Point(menton.getX()-50, menton.getY()  - 4*25);
		Point b4 = new Point(menton.getX()+50, menton.getY()  - 4*25);
		Point b5 = new Point(menton.getX()+50, menton.getY()  - 2*25);
		Point b6 = new Point(menton.getX()+25, menton.getY()  - 1*25);
		
		//ajout des points pour la création des mains
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(b1)
		.ajouter(b2)
		.ajouter(b3)
		.ajouter(b4)
		.ajouter(b5)
		.ajouter(b6);
	}
	   /**
	    * méthode nez
	    */
 public void nez(){
	 Point n1 = new Point(menton.getX()-0.20*25, menton.getY() - 4.75*25);
	 Point n2 = new Point(menton.getX() , menton.getY() - 5*25);
	 Point n3 = new Point(menton.getX()+0.20*25, menton.getY() - 4.75*25);
	
	 //ajout des points pour création du nez
	 demarrerNouveauDessinAvecDesPoints()
		.ajouter(n1)
		.ajouter(n2)
	    .ajouter(n3)
	    .nePasRelierLesPointsExtreme();
 }
	
	
/**
 * Fonction pour dessiner le corps
 */
private void dessinerCorps(){
		
	
	Point baseMenton2 = new Point(menton.getX() - 75 , menton.getY()-50);
	Point baseEpauleG = new Point(baseMenton2.getX() - 50, baseMenton2.getY());
	Point baseBrasG = new Point(baseEpauleG.getX(),baseEpauleG.getY()+100);
	Point baseMainG = new Point(baseBrasG.getX()+25,baseBrasG.getY()+25);
	Point baseBrasG2 = new Point(baseMainG.getX(),baseMainG.getY()-75);
	Point basePiedG = new Point(baseMainG.getX()-50,baseMainG.getY()+25);
	Point basePiedG2 = new Point(basePiedG.getX()+75,basePiedG.getY());
	Point basePiedG3 = new Point(basePiedG2.getX(),basePiedG2.getY()-25);
	Point baseCorps = new Point(basePiedG3.getX()+150,basePiedG3.getY());
	Point basePiedD = new Point(baseCorps.getX(),baseCorps.getY()+25);
	Point basePiedD2 = new Point(basePiedD.getX()+75,basePiedD.getY());
	Point basePiedD3 = new Point(basePiedD2.getX()-50,basePiedD2.getY()-25);
	Point baseCorps2 = new Point(basePiedD3.getX(),basePiedD3.getY()-25);
	Point baseCorps3 = new Point(baseCorps2.getX()-200,baseCorps2.getY());
	

	
	/**
	 * Construction du dessin
	 */
	demarrerNouveauDessinAvecDesPoints()
	.ajouter(menton)
	.ajouter(baseMenton2)
	.ajouter(baseEpauleG)
	.ajouter(baseBrasG)
	.ajouter(baseMainG)
	.ajouter(baseBrasG2)
	.ajouter(baseMainG)
	.ajouter(basePiedG)
	.ajouter(basePiedG2)
	.ajouter(basePiedG3)
	.ajouter(baseCorps)
	.ajouter(basePiedD)
	.ajouter(basePiedD2)
	.ajouter(basePiedD3)
	.ajouter(baseCorps2)
	.ajouter(baseCorps3)
	.nePasRelierLesPointsExtreme();
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
			.ajouter(dixD)
			.nePasRelierLesPointsExtreme();

		}

		/**
		 * Construction de la forme des cheveux
		 */
		public void formeCheveux() {
			//Point 1 Cheveux
			Point unC = new Point(menton.getX()-83.3, menton.getY()-75);
			//Point 2 Cheveux
			Point deuxC = new Point(menton.getX()-150, unC.getY());
			//Point 3 Cheveux
			Point troisC = new Point(deuxC.getX(), deuxC.getY()-125);
			//Point 4 Cheveux
			Point quatreC = new Point(troisC.getX()+50, troisC.getY()-50);
			//Point 5 Cheveux
			Point cinqC = new Point(quatreC.getX()+200, quatreC.getY());
			//Point 6 Cheveux
			Point sixC = new Point(cinqC.getX()+50, cinqC.getY()+50);
			//Point 7 Cheveux
			Point septC = new Point(sixC.getX(), sixC.getY()+125);
			//Point 8 Cheveux
			Point huitC = new Point(menton.getX()+83.3, septC.getY());
			
			
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(unC)
			.ajouter(deuxC)
			.ajouter(troisC)
			.ajouter(quatreC)
			.ajouter(cinqC)
			.ajouter(sixC)
			.ajouter(septC)
			.ajouter(huitC)
			.couleurDeFond(Couleur.GRIS)
			.nePasRelierLesPointsExtreme();
		}
}
		
