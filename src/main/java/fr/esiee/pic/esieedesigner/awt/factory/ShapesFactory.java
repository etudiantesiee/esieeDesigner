package fr.esiee.pic.esieedesigner.awt.factory;

import java.awt.Component;

import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;

/**
 * 
 * Factory de production des figures à dessinner via le moteur d'exécution
 * 
 * @author etudiant
 *
 */
public interface ShapesFactory {
	
	/**
	 * Construit une ellipse AWT 2D
	 * 
	 * @param ellipse
	 * @return
	 */
	Component produceEllipse(Ellipse ellipse);
	
	/**
	 * Construit une figure géométrique à partir de points
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points);
}
