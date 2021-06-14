package Handson4_1_DesignPrinciples.model;

import Handson4_1_DesignPrinciples.repository.Shape;

import java.util.logging.Logger;

public class Rectangle implements Shape {

	private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());

	@Override
	public void draw() {
		LOGGER.info("-----DRAWING RECTANGLE-----");
	}
}
