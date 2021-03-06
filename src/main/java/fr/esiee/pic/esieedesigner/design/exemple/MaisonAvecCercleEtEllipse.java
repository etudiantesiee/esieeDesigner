package fr.esiee.pic.esieedesigner.design.exemple;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;


/**
 * Cette classe une Démo qui présente comment créer des formes graphiques
 * 
 * @author etudiant
 *
 */
public class MaisonAvecCercleEtEllipse extends CreateurDeForme {
	
	/**
	 * Point en bas à gauche de la maison
	 */
	private static final Point BASE_BAS_GAUCHE_MAISON = new Point(400, 750);
	
	/**
	 * Largeur de la maison
	 */
	private static final int LONGUEUR_MAISON = 400;
	
	/**
	 * Longueur de la maison
	 */
	private static final int LARGEUR_MAISON = 350;
	
	/**
	 * Longueur de la base du toit
	 * Doit être supérieure ou égale à la longueur de la masison
	 */
	private static final int LONGUEUR_BASE_TOIT = LONGUEUR_MAISON + 100;
	
	/**
	 * Hauteur du toit
	 */
	private static final int HAUTEUR_BASE_TOIT = LARGEUR_MAISON - 100;
	
	/**
	 * Ecart sur l'axe des abscisses entre 
	 * le point gauche de la base du toit de la maison et le point du haut du toit de la maison
	 */
	private static final int ECART_X_TOIT_MAISON_POINT_HAUT_BASE_GAUCHE = (LONGUEUR_BASE_TOIT / 2);
	
	/**
	 * Longueur de la porte
	 */
	private static final int LONGUEUR_PORTE = (LONGUEUR_MAISON / 3);
	
	/**
	 * Largeur de la porte
	 */
	private static final double LARGEUR_PORTE = (LARGEUR_MAISON / 2.5);
	
	/**
	 * Hauteur du toit de la porte (forme triangle)
	 */
	private static final double HAUTEUR_TOIT_PORTE = LARGEUR_PORTE / 2;
	
	/**
	 * Diametre de la serrure
	 */
	private static final double DIAMETRE_SERRURE = LONGUEUR_PORTE / 10;
	
	/**
	 * Ecart sur l'axe des abscisse entre le point base gauche de la base du toit
	 * et le centre de la serrure.
	 * 
	 */
	private static final double ECART_X_BASE_GAUCHE_PORTE_SERRURE = LONGUEUR_PORTE * 0.80;
	
	/**
	 * Centre du cercle jaune
	 */
	private static final Point CENTRE_CERCLE_JAUNE = new Point(150, 200);
	
	/**
	 * Rayon du cercle jaune
	 */
	private static final double DIAMETRE_DU_CERCLE_JAUNE = 200; 
	
	
	/**
	 * Centre de la forme ovale
	 */
	private static final Point CENTRE_FORME_OVALE = new Point(150, 600);
	
	/**
	 * Longueur de la forme ovale
	 */
	private static final double LONGUEUR_FORME_OVALE = 200;
	
	/**
	 * Largeur de la forme ovale
	 */
	private static final double LARGEUR_FORME_OVALE = 300;
	
	@Override
	public void dessiner() {
		// Dessi du cercle jaune
		dessinerCercleJaune();
		
		// Dessin de la forme ovale
		dessinerFormeOvale();
		
		// Dessin de la maison
		dessinerMaison();
	}
	
	/**l
	 * Exemple de dessin d'un cercle de couleur jaune
	 */
	private void dessinerCercleJaune() {

		// Pour un clercle la largeur et la hauteur de l'ellipse sont égales.
		Ellipse cercleJaune = new Ellipse(CENTRE_CERCLE_JAUNE, DIAMETRE_DU_CERCLE_JAUNE, DIAMETRE_DU_CERCLE_JAUNE);
		
		// On ajout à la liste des composants à déssiner
		ajouterEllipse(cercleJaune, Couleur.JAUNE);
	}
	
	/**
	 * Exemple de dessin d'une forme ovale
	 */
	private void dessinerFormeOvale() {
		// Pour une forme ovale, la longueur doit différer de la largeur
		Ellipse formeOvale = new Ellipse(CENTRE_FORME_OVALE, LONGUEUR_FORME_OVALE, LARGEUR_FORME_OVALE);
		
		// On ajoute à la liste des composants à déssiner
		ajouterEllipse(formeOvale, Couleur.BLANC);
	}
	
	/**
	 * Exemple de dessin de maison
	 */
	private void dessinerMaison() {
		// Dessin du cadre de la maison
		Point baseBasGauche = BASE_BAS_GAUCHE_MAISON;
		Point baseBasDroit = new Point(baseBasGauche.getX() + LONGUEUR_MAISON, baseBasGauche.getY());
		Point baseHautDroit = new Point(baseBasDroit.getX(), baseBasDroit.getY() - LARGEUR_MAISON);
		Point baseHautGauche = new Point(baseBasGauche.getX(), baseBasDroit.getY() - LARGEUR_MAISON);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseBasGauche)
		.ajouter(baseBasDroit)
		.ajouter(baseHautDroit)
		.ajouter(baseHautGauche);
		
		// Construction du toit
		// Les points du toit sont construit à partir des points du haut de la base de la maison
		double ecartLongueurToitMaison = ((LONGUEUR_BASE_TOIT - LONGUEUR_MAISON) / 2);
		Point toitBaseGauche = new Point(baseHautGauche.getX() - ecartLongueurToitMaison, baseHautGauche.getY());
		Point toitBaseDroit = new Point(baseHautDroit.getX() + ecartLongueurToitMaison, baseHautDroit.getY());
		Point toitHaut = new Point(toitBaseGauche.getX() + ECART_X_TOIT_MAISON_POINT_HAUT_BASE_GAUCHE, toitBaseGauche.getY() - HAUTEUR_BASE_TOIT);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(toitBaseGauche)
		.ajouter(toitBaseDroit)
		.ajouter(toitHaut);
		
		// Constuction de la porte
		double ecartBaseGaucheMaisonPorte = ((LONGUEUR_MAISON - LONGUEUR_PORTE) / 2);
		Point baseGauchePorte = new Point(baseBasGauche.getX() + ecartBaseGaucheMaisonPorte, baseBasGauche.getY());
		Point baseDroitePorte = new Point(baseGauchePorte.getX() + LONGUEUR_PORTE, baseGauchePorte.getY());
		Point hautDroitPorte = new Point(baseDroitePorte.getX(), baseDroitePorte.getY() - LARGEUR_PORTE);
		Point hautGauchePorte = new Point(baseGauchePorte.getX(), baseGauchePorte.getY() - LARGEUR_PORTE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseGauchePorte)
		.ajouter(baseDroitePorte)
		.ajouter(hautDroitPorte)
		.ajouter(hautGauchePorte);
		
		// Construction du toit de la porte
		double ecartBaseGaucheToitPoitHautToit = LONGUEUR_PORTE / 2;
		Point hautToitPorte = new Point(hautGauchePorte.getX() + ecartBaseGaucheToitPoitHautToit, hautGauchePorte.getY() - HAUTEUR_TOIT_PORTE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautGauchePorte)
		.ajouter(hautDroitPorte)
		.ajouter(hautToitPorte);
		
		// Construction de la serrure
		double xSerrure = baseGauchePorte.getX() + ECART_X_BASE_GAUCHE_PORTE_SERRURE;
		double ySerrure = baseGauchePorte.getY() - (LARGEUR_PORTE/2);
		Point centreSerrure = new Point(xSerrure, ySerrure);
		Ellipse serrure = new Ellipse(centreSerrure, DIAMETRE_SERRURE, DIAMETRE_SERRURE);
		
		// On ajout à la liste des composants à déssiner
		ajouterEllipse(serrure, Couleur.GRIS);
	}

}
