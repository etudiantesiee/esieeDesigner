package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;

/**
 * Le groupe 3 ajoutera ses dessins dans cette classe.
 * 
 * @author Groupe 3
 *
 */
public class DessinsGroupe3 extends CreateurDeForme {
	
    
    /**
     * Longueur une case
     */
    private static final int PIXEL = 25;
    
    /**
     * Longueur page entière
     */
    private static final int LONGUEUR_PAGE = 77 * PIXEL;
    
    /**
     * Largeur page entière
     */
    private static final int LARGEUR_PAGE = 41 * PIXEL;
    
    /**
     * Largeur du personnage (cadre)
     */
    private static final int LARGEUR_PERSO = 14 * PIXEL;
    
    /**
     * Longueur du personnage (cadre)
     */
    private static final int LONGUEUR_PERSO = 14 * PIXEL;
    
    /**
     * Base Haut représente la composante y du cadre à partir du haut
     */
    private static final int BASE_HAUT = LARGEUR_PAGE/2-LARGEUR_PERSO/2;
    
    /**
     * Base Bas représente la composante y du cadre à partir du bas
     */
    private static final int BASE_BAS = LARGEUR_PAGE/2 + LARGEUR_PERSO/2;
    
    /**
     * Base Droite représente la composante x du cadre à partir du droite
     */
    private static final int BASE_DROITE = LONGUEUR_PAGE ;
    
    /**
     * Base Gauche représente la composante x du cadre à partir du gauche
     */
    private static final int BASE_GAUCHE = LONGUEUR_PAGE - LONGUEUR_PERSO;
    
    /**
     * Longueur des yeux
     */
    private static final double LONGUEUR_DES_YEUX = 10;
    
    /**
     * Largeur des yeux
     */
    private static final double LARGEUR_DES_YEUX = 10;
    
    /**
     * Point de départ
     */
    private static final Point POINT_BAS_BRAS_GAUCHE = new Point(64*PIXEL, 30*PIXEL);

    
    /*
    * 
    * Override method from the extended class
    *
    * @author  Groupe 3
    * @version 1.0
    * @since   2016-11-28 
    */

    @Override
    public void dessiner() {
        // Ajout vos dessins ici
        // Pensez à désactiver les dessins de la démo 
        // en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal

        
		 
		// Ajout du bras gauche au dessin
		Point brasgauche = dessineBrasGauche(POINT_BAS_BRAS_GAUCHE); 
		//add eyes 
		dessinYeuxContour();

		Point brasHautDroit = dessinerTeteHaut(brasgauche);
		Point brasBasGauche = dessineBrasDroit(brasHautDroit); 
		//Ajout du bras droit au dessin
		Point jambeHautDroit = dessinerTeteBasDroit(brasBasGauche);
		Point jambebasDroit = dessinerJambeDroite(jambeHautDroit);
		Point jambeBasGauche = dessinerBasTete(jambebasDroit);
		Point jambeHautgauche = dessinerJambeGauche(jambeBasGauche);
		Point finalPoint = dessinerTeteBasGauche(jambeHautgauche);

	

		// add eyes
        dessinYeux();
        // add mouth
        dessinBouche();
        // add nose
        dessinNez();
        // add chin
        dessinMenton();
    }
    
    /**
    * 
    * Method used to draw head top of manga
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public Point dessinerTeteHaut(Point pBase){
    	//Define points
        Point tete1 = new Point(pBase.getX(), pBase.getY()-2*PIXEL);
        Point tete2 = new Point(tete1.getX()+PIXEL, tete1.getY()-2*PIXEL);
        Point tete3 = new Point(tete2.getX()+2*PIXEL, tete2.getY()-1*PIXEL);
        Point tete4 = new Point(tete3.getX()+2*PIXEL, tete3.getY()-0*PIXEL);
        Point tete5 = new Point(tete4.getX()+2*PIXEL, tete4.getY()+1*PIXEL);
        Point tete6 = new Point(tete5.getX()+1*PIXEL, tete5.getY()+2*PIXEL);
        Point tete7 = new Point(tete6.getX()+0*PIXEL, tete6.getY()+2*PIXEL);
        //Draw left side
        demarrerNouveauDessinAvecDesPoints()
	        .ajouter(pBase)
	        .ajouter(tete1)
	        .ajouter(tete2)
	        .ajouter(tete3)
	        .ajouter(tete4)
	        .ajouter(tete5)
	        .ajouter(tete6)
	        .ajouter(tete7)
	        .nePasRelierLesPointsExtreme();
        
        //draw left hair
    	//Define points

        Point cheveux2 = new Point(tete2.getX()+2*PIXEL, tete2.getY()+1*PIXEL);
        Point cheveux3 = new Point(cheveux2.getX()-1*PIXEL, cheveux2.getY()-1.5*PIXEL);
        demarrerNouveauDessinAvecDesPoints()
	        .ajouter(tete2)
	        .ajouter(cheveux2)
	        .ajouter(cheveux3)
	        .couleurDeFond(Couleur.GRIS);
        //draw center hair
        Point cheveux4 = new Point(tete3.getX()+1*PIXEL, tete3.getY()+2*PIXEL);
        Point cheveux5 = new Point(cheveux4.getX()+1*PIXEL, cheveux4.getY()-2*PIXEL);
        demarrerNouveauDessinAvecDesPoints()
	        .ajouter(tete3)
	        .ajouter(cheveux4)
	        .ajouter(cheveux5)
	        .couleurDeFond(Couleur.GRIS);
        
        //draw right hair
        Point cheveux6 = new Point(tete5.getX()-2*PIXEL, tete5.getY()+1*PIXEL);
        Point cheveux7 = new Point(cheveux6.getX()+1*PIXEL, cheveux6.getY()-1.5*PIXEL);
        demarrerNouveauDessinAvecDesPoints()
	        .ajouter(tete5)
	        .ajouter(cheveux6)
	        .ajouter(cheveux7)
	        .couleurDeFond(Couleur.GRIS);

        return tete7;

    }
    
    /**
    * 
    * Method used to draw head right bottom of manga
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public Point dessinerTeteBasDroit(Point pBase){
    	
    	Point tete1 = new Point(pBase.getX()-1*PIXEL, pBase.getY()+3*PIXEL);
    	Point tete2 = new Point(tete1.getX()-1*PIXEL, tete1.getY()+1*PIXEL);
    	demarrerNouveauDessinAvecDesPoints()
	        .ajouter(pBase)
	        .ajouter(tete1)
	    	.ajouter(tete2)
	    	.nePasRelierLesPointsExtreme();
    	
    	return tete2;
    }
    
    /**
    * 
    * Method used to draw head bottom of manga
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public Point dessinerBasTete(Point pBase){
    	Point tete1 = new Point(pBase.getX()-2*PIXEL, pBase.getY());
    	demarrerNouveauDessinAvecDesPoints()
	        .ajouter(pBase)
	        .ajouter(tete1);
    	return tete1;
    }
    

    
    /**
    * 
    * Method used to draw head of manga
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public void dessinerTete(){
        Point tete1 = new Point(BASE_GAUCHE+3*PIXEL, BASE_HAUT+5*PIXEL);
        Point tete2 = new Point(BASE_GAUCHE+4*PIXEL, BASE_HAUT+3*PIXEL);
        Point tete3 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+2*PIXEL);
        Point tete4 = new Point(BASE_GAUCHE+8*PIXEL, BASE_HAUT+2*PIXEL);
        Point tete5 = new Point(BASE_GAUCHE+10*PIXEL, BASE_HAUT+3*PIXEL);
        Point tete6 = new Point(BASE_GAUCHE+11*PIXEL, BASE_HAUT+5*PIXEL);
        Point tete7 = new Point(BASE_GAUCHE+11*PIXEL, BASE_HAUT+7*PIXEL);
        Point tete8 = new Point(BASE_GAUCHE+10*PIXEL, BASE_HAUT+10*PIXEL);
        Point tete9 = new Point(BASE_GAUCHE+8*PIXEL, BASE_HAUT+12*PIXEL);
        Point tete10 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+12*PIXEL);
        Point tete11 = new Point(BASE_GAUCHE+4*PIXEL, BASE_HAUT+10*PIXEL);
        Point tete12 = new Point(BASE_GAUCHE+3*PIXEL, BASE_HAUT+7*PIXEL);


        demarrerNouveauDessinAvecDesPoints()
        .ajouter(tete1)
        .ajouter(tete2)
        .ajouter(tete3)
        .ajouter(tete4)
        .ajouter(tete5)
        .ajouter(tete6)
        .ajouter(tete7)
        .ajouter(tete8)
        .ajouter(tete9)
        .ajouter(tete10)
        .ajouter(tete11)
        .ajouter(tete12);
        dessinYeuxContour();
        dessinYeux();
    }

	/**
	 * @author philippe et harrison
	 * Dessin du contour des yeux
	 */
	public void dessinYeuxContour(){
		// Initialisation des points
		Point ptYeux1 = new Point(POINT_BAS_BRAS_GAUCHE.getX()+3*PIXEL,POINT_BAS_BRAS_GAUCHE.getY()-6*PIXEL);
		Point ptYeux2 = new Point(ptYeux1.getX(),ptYeux1.getY()+1*PIXEL);
		Point ptYeux3 = new Point(ptYeux2.getX()+1*PIXEL,ptYeux2.getY()+1*PIXEL);
		Point ptYeux4 = new Point(ptYeux3.getX()+1*PIXEL,ptYeux3.getY());
		Point ptYeux5 = new Point(ptYeux4.getX()+1*PIXEL,ptYeux4.getY()-1*PIXEL);
		Point ptYeux6 = new Point(ptYeux5.getX()+1*PIXEL,ptYeux5.getY()+1*PIXEL);
		Point ptYeux7 = new Point(ptYeux6.getX()+1*PIXEL,ptYeux6.getY());
		Point ptYeux8 = new Point(ptYeux7.getX()+1*PIXEL,ptYeux7.getY()-1*PIXEL);
		Point ptYeux9 = new Point(ptYeux8.getX(),ptYeux8.getY()-1*PIXEL);
		
		// Création de la forme
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ptYeux1)
		.ajouter(ptYeux2)
		.ajouter(ptYeux3)
		.ajouter(ptYeux4)
		.ajouter(ptYeux5)
		.ajouter(ptYeux6)
		.ajouter(ptYeux7)
		.ajouter(ptYeux8)
		.ajouter(ptYeux9);
	}
	
	/**
	 * @author philippe et harrison
	 * Dessin des yeux
	 */
	public void dessinYeux(){
		// Dessin oeil droit
		Point centreOeilDroit = new Point(POINT_BAS_BRAS_GAUCHE.getX()+7*PIXEL,POINT_BAS_BRAS_GAUCHE.getY()-5*PIXEL);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX);
		
		ajouterEllipse(oeilDroit, Couleur.NOIR);
		
		// Dessin oeil gauche
		Point centreOeilGauche = new Point(POINT_BAS_BRAS_GAUCHE.getX()+5*PIXEL,POINT_BAS_BRAS_GAUCHE.getY()-5*PIXEL);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX);
		
		ajouterEllipse(oeilGauche, Couleur.NOIR);
	}
	
	/**
	 * @author philippe et harrison
	 * Dessin de la bouche
	 */
	public void dessinBouche(){
		// Initialisation des points
		Point ptBouche1 = new Point(POINT_BAS_BRAS_GAUCHE.getX()+4*PIXEL,POINT_BAS_BRAS_GAUCHE.getY()-2*PIXEL);
		Point ptBouche2 = new Point(ptBouche1.getX()+1*PIXEL,ptBouche1.getY()+2*PIXEL);
		Point ptBouche3 = new Point(ptBouche2.getX()+2*PIXEL,ptBouche2.getY());
		Point ptBouche4 = new Point(ptBouche3.getX()+1*PIXEL,ptBouche3.getY()-2*PIXEL);
		
		// Création de la forme
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ptBouche1)
		.ajouter(ptBouche2)
		.ajouter(ptBouche3)
		.ajouter(ptBouche4);
	}
	
	/**
	 * @author philippe et harrison
	 * Dessin du nez
	 */
	public void dessinNez(){
		// Initialisation des points
		Point ptNez1 = new Point(POINT_BAS_BRAS_GAUCHE.getX()+5*PIXEL+20,POINT_BAS_BRAS_GAUCHE.getY()-2*PIXEL-20);
		Point ptNez2 = new Point(ptNez1.getX()+5,ptNez1.getY()-5);
		Point ptNez3 = new Point(ptNez2.getX()+5,ptNez2.getY()+5);
		
		// Création de la forme
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ptNez1)
		.ajouter(ptNez2)
		.ajouter(ptNez3)
		.nePasRelierLesPointsExtreme();
	}
	
	/**
	 * @author philippe et harrison
	 * Dessin du menton
	 */
	public void dessinMenton(){
		// Initialisation des points
		Point ptMenton1 = new Point(POINT_BAS_BRAS_GAUCHE.getX()+5*PIXEL+20,POINT_BAS_BRAS_GAUCHE.getY()+15);
		Point ptMenton2 = new Point(ptMenton1.getX()+10,ptMenton1.getY());
		
		// Création de la forme
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ptMenton1)
		.ajouter(ptMenton2)
		.nePasRelierLesPointsExtreme();
	}

    /**
    * 
    * Method used to draw hairs of manga
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public void dessinerCheveux(){
        dessinerCheveux1();
        dessinerCheveux2();
        dessinerCheveux3();
    }
    
    /**
    * 
    * Method used to draw hair on the left side
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public void dessinerCheveux1(){
        Point cheveux1 = new Point(BASE_GAUCHE+4*PIXEL, BASE_HAUT+3*PIXEL);
        Point cheveux2 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+4*PIXEL);
        Point cheveux3 = new Point(BASE_GAUCHE+5*PIXEL, BASE_HAUT+2.5*PIXEL);

        demarrerNouveauDessinAvecDesPoints()
        .ajouter(cheveux1)
        .ajouter(cheveux2)
        .ajouter(cheveux3)
        .couleurDeFond(Couleur.GRIS);
    }
    
    /**
    * 
    * Method used to draw hair on the center
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public void dessinerCheveux2(){
        Point cheveux1 = new Point(BASE_GAUCHE+6*PIXEL, BASE_HAUT+2*PIXEL);
        Point cheveux2 = new Point(BASE_GAUCHE+7*PIXEL, BASE_HAUT+4*PIXEL);
        Point cheveux3 = new Point(BASE_GAUCHE+8*PIXEL, BASE_HAUT+2*PIXEL);

        demarrerNouveauDessinAvecDesPoints()
        .ajouter(cheveux1)
        .ajouter(cheveux2)
        .ajouter(cheveux3)
        .couleurDeFond(Couleur.GRIS);
    }
    
    /**
    * 
    * Method used to draw hair on the right side
    *
    * @author  DaRa ChauCour
    * @version 1.0
    * @since   2016-11-28 
    */
    public void dessinerCheveux3(){
        Point cheveux1 = new Point(BASE_DROITE-4*PIXEL, BASE_HAUT+3*PIXEL);
        Point cheveux2 = new Point(BASE_DROITE-6*PIXEL, BASE_HAUT+4*PIXEL);
        Point cheveux3 = new Point(BASE_DROITE-5*PIXEL, BASE_HAUT+2.5*PIXEL);

        demarrerNouveauDessinAvecDesPoints()
        .ajouter(cheveux1)
        .ajouter(cheveux2)
        .ajouter(cheveux3)
        .couleurDeFond(Couleur.GRIS);
    }
    

    /**
    * 
    * Method used to draw the legs
    *
    * @author  idom inigo
    * @version 1.0
    * @since   2016-11-28 
    */
    public Point dessinerJambeGauche(final  Point paramPoint ) {
        // Jambe a gauche
    	
        Point ja4 = new Point(paramPoint.getX(),paramPoint.getY());
        Point ja3 = new Point(paramPoint.getX()-1*PIXEL,paramPoint.getY()+1*PIXEL);
        Point ja2 = new Point(paramPoint.getX(),paramPoint.getY()+2*PIXEL);
        Point ja1 = new Point(paramPoint.getX()-3*PIXEL,paramPoint.getY()+2*PIXEL);
        Point ja6 = new Point(paramPoint.getX()-2*PIXEL,paramPoint.getY()+1*PIXEL);
        Point ja5 = new Point(paramPoint.getX()-1*PIXEL,paramPoint.getY()-1*PIXEL);
        
		// Creer la forme ja
		demarrerNouveauDessinAvecDesPoints().ajouter(ja1).ajouter(ja2).ajouter(ja3).ajouter(ja4).ajouter(ja5).ajouter(ja6).couleurDeFond(Couleur.GRIS);
    
        return ja5;

    }
    /**
    * 
    * Method used to draw the left under corner of the head
    *
    * @author  idom inigo
    * @version 1.0
    * @since   2016-11-28 
    */
    public Point dessinerTeteBasGauche(final  Point paramPoint ) {
        // Point definition
    	
        Point je = new Point(paramPoint.getX(),paramPoint.getY());
        Point je1 = new Point(paramPoint.getX()-1*PIXEL,paramPoint.getY()-1*PIXEL);
        Point je2 = new Point(paramPoint.getX()-2*PIXEL,paramPoint.getY()-4*PIXEL);
       
        
		// Create the form
		demarrerNouveauDessinAvecDesPoints().ajouter(je).ajouter(je1);
		demarrerNouveauDessinAvecDesPoints().ajouter(je1).ajouter(je2);
    
        return je2;

    }
    /**
     * 
     * Method used to draw the legs
     *
     * @author  idom inigo
     * @version 1.0
     * @since   2016-11-28 
     */
     public Point dessinerJambeDroite(final  Point paramPoint ) {
 		// Jambe a droite
 		Point jb4 = new Point(paramPoint.getX(),paramPoint.getY());
 		Point jb3 = new Point(paramPoint.getX()+1*PIXEL,paramPoint.getY()+2*PIXEL);
 		Point jb2 = new Point(paramPoint.getX()+2*PIXEL,paramPoint.getY()+3*PIXEL);
 		Point jb1 = new Point(paramPoint.getX()-1*PIXEL,paramPoint.getY()+3*PIXEL);
 		Point jb6 = new Point(paramPoint.getX(),paramPoint.getY()+2*PIXEL);
 		Point jb5 = new Point(paramPoint.getX()-1*PIXEL,paramPoint.getY()+1*PIXEL);
 		
 		// Creer la forme jb
 		demarrerNouveauDessinAvecDesPoints().ajouter(jb1).ajouter(jb2).ajouter(jb3).ajouter(jb4).ajouter(jb5).ajouter(jb6).couleurDeFond(Couleur.GRIS);
 		
 		return jb5;
 	}

	
	/**
	 * @author mathieu
	 * @version 1.0
     * @since   2016-11-28 
     * @param pointDepart le point d'où on commence à dessiner
	 * Dessine le bras Droit
	 */
	public Point dessineBrasDroit(Point pointDepart){
		
		//Création des points du bras gauche
		
		//Point 1 du coude
		Point coude1 = new Point(pointDepart.getX() + 1*PIXEL, pointDepart.getY() + 2*PIXEL);
		//Point 1 du poignet
		Point poignet1 = new Point(coude1.getX(), coude1.getY() + 1*PIXEL);
		//Point 1 de la main
		Point main1 = new Point(poignet1.getX() + 1*PIXEL, poignet1.getY() + 1*PIXEL);
		//Point  de la main
		Point main2 = new Point(main1.getX() - 3*PIXEL, main1.getY());
		//Point 2 du poignet
		Point poignet2 = new Point(main2.getX() + 1*PIXEL, main2.getY() - 1*PIXEL);
		//Point 2 du coude
		Point coude2 = new Point(poignet2.getX(), poignet2.getY() - 1*PIXEL);
		//Point 2 de l'epauleBASE_BAS
		Point epaule2 = new Point(coude2.getX() - 0.6*PIXEL, coude2.getY());
		
		
		
		
		
		// On ajoute à la liste des composants à déssiner
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pointDepart)
		.ajouter(coude1)
	    .ajouter(poignet1)
	    .ajouter(main1)
	    .ajouter(main2)
	    .ajouter(poignet2)
	    .ajouter(coude2)
	    .ajouter(epaule2)
	    .couleurDeFond(Couleur.GRIS);
		//On ajoute la couleur de fond à la fin
		
		//On retourne le point de l'épaule
		return pointDepart;
		
	}
	
	/**
	 * @author mathieu
	 * @version 1.0
     * @since   2016-11-28 
     * @param pointDepart le point d'où on commence à dessiner
	 * Dessine le bras Gauche
	 */
	public Point dessineBrasGauche(Point pointDepart){

		
	//Création des points du bras gauche
	
	//Point 2 de la main
	Point main2 = new Point(pointDepart.getX() + 3*PIXEL, pointDepart.getY());
	//Point 1 du poignet
	Point poignet1 = new Point(main2.getX() - 1*PIXEL, main2.getY() - 1*PIXEL);
	//Point 1 du coude
	Point coude1 = new Point(poignet1.getX(), poignet1.getY() - 1*PIXEL);
	//Point 1 de l'épaule
	Point epaule1 = new Point(coude1.getX() + 0.6*PIXEL, coude1.getY()); 
	//Point 2 de l'epauleBASE_BAS
	Point epaule2 = new Point(epaule1.getX() - 0.6*PIXEL, epaule1.getY() - 2*PIXEL);
	//Point 2 du coude
	Point coude2 = new Point(epaule2.getX() - 1*PIXEL, epaule2.getY() + 2*PIXEL);
	//Point 2 du poignet
	Point poignet2 = new Point(coude2.getX(), coude2.getY() + 1*PIXEL);
	
	
	
	// On ajoute à la liste des composants à déssiner
	//les points sont ajoutés dans l'ordre qu'ils sont déssinés.
	demarrerNouveauDessinAvecDesPoints()
	.ajouter(pointDepart)
	.ajouter(main2)
    .ajouter(poignet1)
    .ajouter(coude1)
    .ajouter(epaule1)
    .ajouter(epaule2)
    .ajouter(coude2)
    .ajouter(poignet2)
    .couleurDeFond(Couleur.GRIS);
	//On ajoute la couleur de fond à la fin
	
	//On retourne le point de l'épaule
	return epaule2;
}
   
}
