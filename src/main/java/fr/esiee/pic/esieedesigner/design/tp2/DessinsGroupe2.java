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
		Point pt1 = new Point(12, 12);
	}
	
	public void dessinerCheveux(){
		
	}
	
	public void dessinerInterieurVisage(){
		dessinerYeux();
		dessinerMasque();
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
	
	public void dessinerMasque(){
		//Dessin des yeux du bonhomme

		Point YEUX_GAUCHE_EXTERIEURE_SUPERIEUR_MANGA = new Point(DECALAGE + pixels(3), pixels(3));		
		Point YEUX_GAUCHE_EXTERIEURE_INFERIEUR_MANGA = new Point(DECALAGE + pixels(3), pixels(4));
		Point YEUX_SUPERIEUR_MANGA = new Point(DECALAGE + pixels(7), pixels(3));
		Point YEUX_INFERIEUR_MANGA = new Point(DECALAGE + pixels(7), pixels(4));
		Point YEUX_DROIT_EXTERIEURE_SUPERIEUR_MANGA = new Point(DECALAGE + pixels(11), pixels(3));
		Point YEUX_DROIT_EXTERIEURE_INFERIEUR_MANGA = new Point(DECALAGE + pixels(11), pixels(4));
		
		//ON trace les traits avec les points prédéfinis
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(YEUX_GAUCHE_EXTERIEURE_SUPERIEUR_MANGA)
		.ajouter(YEUX_GAUCHE_EXTERIEURE_INFERIEUR_MANGA)
		.ajouter(new Point(YEUX_GAUCHE_EXTERIEURE_INFERIEUR_MANGA.getX() + pixels(2), YEUX_GAUCHE_EXTERIEURE_INFERIEUR_MANGA.getY()+ pixels(1) ))
		.ajouter(YEUX_INFERIEUR_MANGA)
		.ajouter(new Point(YEUX_INFERIEUR_MANGA.getX() + pixels(2), YEUX_INFERIEUR_MANGA.getY()+ pixels(1) ))
		.ajouter(YEUX_DROIT_EXTERIEURE_INFERIEUR_MANGA)
		.ajouter(YEUX_DROIT_EXTERIEURE_SUPERIEUR_MANGA)
		.ajouter(new Point(YEUX_SUPERIEUR_MANGA.getX() + pixels(2), YEUX_SUPERIEUR_MANGA.getY()- pixels(1) ))
		.ajouter(YEUX_SUPERIEUR_MANGA)
		.ajouter(new Point(YEUX_GAUCHE_EXTERIEURE_SUPERIEUR_MANGA.getX() + pixels(2), YEUX_GAUCHE_EXTERIEURE_SUPERIEUR_MANGA.getY()- pixels(1) ))
		//REMPLISSAGE GRIS
		.couleurDeFond(Couleur.GRIS);
	}

}
