package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Broccoli;
import main.Carrot;

public class CarrotTest {
	
	@Test
	public void increaseCarrotQuantityTest() {
		Carrot testCarrot = new Carrot();
		testCarrot.increaseCarrotQuantity();
		assertEquals(1, testCarrot.getSeedCarrotQuantity());
	}
	
	@Test
	public void setSellPriceCarrotTest() {
		Carrot testCarrot = new Carrot();
		testCarrot.setSellPriceCarrot(8);
		assertEquals(8, testCarrot.getSellPriceCarrot());
	}
	
	@Test
	public void setMaturityCarrotTest() {
		Carrot testCarrot = new Carrot();
		testCarrot.setMaturityCarrot(4);
		assertEquals(4, testCarrot.getMaturityCarrot());
	}
	
	@Test
	public void setBuyPriceTest() {
		Carrot testCarrot = new Carrot();
		testCarrot.setBuyPriceCarrot(6);
		assertEquals(6, testCarrot.getBuyPriceCarrot());
	}
	
	@Test
	public void setCarrotQuantitytest() {
		Carrot testCarrot = new Carrot();
		testCarrot.setCarrotQuantity(11);
		assertEquals(11, testCarrot.getCarrotQuantity());
	}
	
	@Test
	public void setSpeedCarrotQuantitiyTest() {
		Carrot testCarrot = new Carrot();
		testCarrot.setSpeedCarrot(0.22);
		assertEquals(0.22, testCarrot.getSpeedCarrot());
	}

}


