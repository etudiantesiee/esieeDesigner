package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

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
		
	}
	
	public void dessinerCheveux(){
		
	}
	
	public void dessinerInterieurVisage(){
		
	}
	
	public void dessinerExterieurVisage(){
		
	}
	
	public void dessinerMains(){
		
	}	
	
	public int pixels(int carreau){
		return carreau*50;
	}

}
