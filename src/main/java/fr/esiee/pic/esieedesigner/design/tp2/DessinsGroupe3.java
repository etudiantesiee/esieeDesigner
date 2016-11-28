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
    private static final int BASE_DROITE = LONGUEUR_PAGE/2 + LONGUEUR_PERSO/2;
    
    /**
     * Base Gauche représente la composante x du cadre à partir du gauche
     */
    private static final int BASE_GAUCHE = LONGUEUR_PAGE/2 - LONGUEUR_PERSO/2;
    
    /**
     * Longueur des yeux
     */
    private static final double LONGUEUR_DES_YEUX = 10;
    
    /**
     * Largeur des yeux
     */
    private static final double LARGEUR_DES_YEUX = 10;
    
    
    /**
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
        dessinerJambe();


        dessineBrasDroit(); //Ajout du bras droit au dessin
        dessinYeuxContour();

        dessinYeux();
        dessinBouche();
        dessinNez();
        dessinMenton();
        dessinerTete();
        dessinerCheveux();
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
        Point ptYeux1 = new Point(BASE_GAUCHE + 4*PIXEL, BASE_HAUT + 5*PIXEL);
        Point ptYeux2 = new Point(BASE_GAUCHE + 4*PIXEL, BASE_HAUT + 6*PIXEL);
        Point ptYeux3 = new Point(BASE_GAUCHE + 5*PIXEL, BASE_HAUT + 7*PIXEL);
        Point ptYeux4 = new Point(BASE_GAUCHE + 6*PIXEL, BASE_HAUT + 7*PIXEL);
        Point ptYeux5 = new Point(BASE_GAUCHE + 7*PIXEL, BASE_HAUT + 6*PIXEL);
        Point ptYeux6 = new Point(BASE_GAUCHE + 8*PIXEL, BASE_HAUT + 7*PIXEL);
        Point ptYeux7 = new Point(BASE_GAUCHE + 9*PIXEL, BASE_HAUT + 7*PIXEL);
        Point ptYeux8 = new Point(BASE_GAUCHE + 10*PIXEL, BASE_HAUT + 6*PIXEL);
        Point ptYeux9 = new Point(BASE_GAUCHE + 10*PIXEL, BASE_HAUT + 5*PIXEL);
        
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
        Point centreOeilDroit = new Point(BASE_GAUCHE + 8*PIXEL, BASE_HAUT + 6*PIXEL);
        Ellipse oeilDroit = new Ellipse(centreOeilDroit, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX);
        
        ajouterEllipse(oeilDroit, Couleur.NOIR);
        
        // Dessin oeil gauche
        Point centreOeilGauche = new Point(BASE_GAUCHE + 6*PIXEL, BASE_HAUT + 6*PIXEL);
        Ellipse oeilGauche = new Ellipse(centreOeilGauche, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX);
        
        ajouterEllipse(oeilGauche, Couleur.NOIR);
    }
    
    /**
     * @author philippe et harrison
     * Dessin de la bouche
     */
    public void dessinBouche(){
        // Initialisation des points
        Point ptBouche1 = new Point(BASE_GAUCHE + 5*PIXEL, BASE_HAUT + 9*PIXEL);
        Point ptBouche2 = new Point(BASE_GAUCHE + 6*PIXEL, BASE_HAUT + 11*PIXEL);
        Point ptBouche3 = new Point(BASE_GAUCHE + 8*PIXEL, BASE_HAUT + 11*PIXEL);
        Point ptBouche4 = new Point(BASE_GAUCHE + 9*PIXEL, BASE_HAUT + 9*PIXEL);
        
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
        Point ptNez1 = new Point(BASE_GAUCHE + 6*PIXEL+20, BASE_HAUT + 8*PIXEL+5);
        Point ptNez2 = new Point(BASE_GAUCHE + 7*PIXEL, BASE_HAUT + 8*PIXEL);
        Point ptNez3 = new Point(BASE_GAUCHE + 7*PIXEL+5, BASE_HAUT + 8*PIXEL+5);
        
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
        Point ptMenton1 = new Point(BASE_GAUCHE + 6*PIXEL+20, BASE_HAUT + 11*PIXEL+15);
        Point ptMenton2 = new Point(BASE_GAUCHE + 7*PIXEL+5, BASE_HAUT + 11*PIXEL+15);
        
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
     * Method pour la jambe.
     */
    public void dessinerJambe() {
        // Jambe a gauche
        Point ja4 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+12*PIXEL);
        Point ja3 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+13*PIXEL);
        Point ja2 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+14*PIXEL);
        Point ja1 = new Point(BASE_GAUCHE+3*PIXEL,BASE_HAUT+14*PIXEL);
        Point ja6 = new Point(BASE_GAUCHE+4*PIXEL,BASE_HAUT+13*PIXEL);
        Point ja5 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+11*PIXEL);

        // Jambe a droite
        Point jb4 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+11*PIXEL);
        Point jb3 = new Point(BASE_GAUCHE+10*PIXEL,BASE_HAUT+13*PIXEL);
        Point jb2 = new Point(BASE_GAUCHE+11*PIXEL,BASE_HAUT+14*PIXEL);
        Point jb1 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+14*PIXEL);
        Point jb6 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+13*PIXEL);
        Point jb5 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+12*PIXEL);
        
        // Creer la forme ja
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(ja1)
        .ajouter(ja2)
        .ajouter(ja3)
        .ajouter(ja4)
        .ajouter(ja5)
        .ajouter(ja6)
        .couleurDeFond(Couleur.GRIS);
            
        // Creer la forme jb
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(jb1)
        .ajouter(jb2)
        .ajouter(jb3)
        .ajouter(jb4)
        .ajouter(jb5)
        .ajouter(jb6)
        .couleurDeFond(Couleur.GRIS);
    }
    
    /**
     * @author mathieu
     * Dessine le bras Droit
     */
    public void dessineBrasDroit(){
        
        //Création des points du bras droit
        Point epaule1 = new Point(BASE_DROITE - 3*PIXEL, BASE_BAS - 7*PIXEL);
        Point coude1 = new Point(BASE_DROITE - 2*PIXEL, BASE_BAS - 5*PIXEL);
        Point poignet1 = new Point(BASE_DROITE - 2*PIXEL, BASE_BAS - 4*PIXEL);
        Point main1 = new Point(BASE_DROITE - 1*PIXEL, BASE_BAS - 3*PIXEL);
        Point main2 = new Point(BASE_DROITE - 4*PIXEL, BASE_BAS - 3*PIXEL);
        Point poignet2 = new Point(BASE_DROITE - 3*PIXEL, BASE_BAS - 4*PIXEL);
        Point aisselle = new Point(BASE_DROITE - 3*PIXEL, BASE_BAS - 5*PIXEL);
        Point epaule2 = new Point(BASE_DROITE - 3.6*PIXEL, BASE_BAS - 5*PIXEL);
        
        
        // On ajoute à la liste des composants à déssiner
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(epaule1)
        .ajouter(coude1)
        .ajouter(poignet1)
        .ajouter(main1)
        .ajouter(main2)
        .ajouter(poignet2)
        .ajouter(aisselle)
        .ajouter(epaule2);
        
    }
    
    /**
     * @author mathieu
     * Dessine le bras Gauche
     */
    public void dessineBrasGauche(){
            
        //Création des points du bras gauche    
        Point epaule1 = new Point(BASE_GAUCHE + 3*PIXEL, BASE_BAS - 7*PIXEL);
        Point coude1 = new Point(BASE_GAUCHE + 2*PIXEL, BASE_BAS - 5*PIXEL);
        Point poignet1 = new Point(BASE_GAUCHE + 2*PIXEL, BASE_BAS - 4*PIXEL);
        Point main1 = new Point(BASE_GAUCHE + 1*PIXEL, BASE_BAS - 3*PIXEL);
        Point main2 = new Point(BASE_GAUCHE + 4*PIXEL, BASE_BAS - 3*PIXEL);
        Point poignet2 = new Point(BASE_GAUCHE + 3*PIXEL, BASE_BAS - 4*PIXEL);
        Point aisselle = new Point(BASE_GAUCHE + 3*PIXEL, BASE_BAS - 5*PIXEL);
        Point epaule2 = new Point(BASE_GAUCHE + 3.6*PIXEL, BASE_BAS - 5*PIXEL);
        
        // On ajoute à la liste des composants à déssiner
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(epaule1)
        .ajouter(coude1)
        .ajouter(poignet1)
        .ajouter(main1)
        .ajouter(main2)
        .ajouter(poignet2)
        .ajouter(aisselle)
        .ajouter(epaule2);
    }
}
