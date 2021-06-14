package Handson3_3_DesignPrinciples.test;


import Handson3_3_DesignPrinciples.adapter.MovableAdapterImpl;
import Handson3_3_DesignPrinciples.model.BugattiVeyron;
import Handson3_3_DesignPrinciples.repository.Movable;
import Handson3_3_DesignPrinciples.repository.MovableAdapter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTests {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {

		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}


}
