package Handson4_1_DesignPrinciples.model;


import Handson4_1_DesignPrinciples.repository.Shape;

import java.util.logging.Logger;

public class Circle implements Shape {

	private static final Logger LOGGER = Logger.getLogger(Circle.class.getName());

	@Override
	public void draw() {
		LOGGER.info("-----DRAWING CIRCLE-----");
	}
}
