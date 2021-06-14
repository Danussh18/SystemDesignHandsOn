package Handson4_1_DesignPrinciples.facade;

import Handson4_1_DesignPrinciples.model.Circle;
import Handson4_1_DesignPrinciples.model.Rectangle;
import Handson4_1_DesignPrinciples.repository.Shape;
import Handson4_1_DesignPrinciples.model.Square;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
