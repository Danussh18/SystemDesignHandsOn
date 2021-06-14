package Handson3_3_DesignPrinciples.adapter;


import Handson3_3_DesignPrinciples.repository.Movable;
import Handson3_3_DesignPrinciples.repository.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {

	Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}
