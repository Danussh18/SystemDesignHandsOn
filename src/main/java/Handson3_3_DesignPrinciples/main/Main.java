package Handson3_3_DesignPrinciples.main;



import Handson3_3_DesignPrinciples.adapter.MovableAdapterImpl;
import Handson3_3_DesignPrinciples.model.BugattiVeyron;
import Handson3_3_DesignPrinciples.repository.Movable;
import Handson3_3_DesignPrinciples.repository.MovableAdapter;

import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter movAdpt = new MovableAdapterImpl(bugattiVeyron);
		LOGGER.info("The speed of the car is " + movAdpt.getSpeed() + " km/h!");
	}
}
