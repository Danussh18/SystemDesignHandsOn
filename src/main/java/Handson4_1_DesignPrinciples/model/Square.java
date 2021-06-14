package Handson4_1_DesignPrinciples.model;

import Handson4_1_DesignPrinciples.repository.Shape;

import java.util.logging.Logger;

public class Square implements Shape {

	private static final Logger LOGGER = Logger.getLogger(Square.class.getName());

	@Override
	public void draw() {
		LOGGER.info("-----DRAWING SQUARE-----");
	}
}
