package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Rice;

public class RiceTest {

	@Test
	public void increaseRiceQuantityTest() {
		Rice testRice = new Rice();
		testRice.increaseRiceQuantity();
		assertEquals(1, testRice.getSeedRiceQuantity());
	}
	
	@Test
	public void setSellPriceRiceTest() {
		Rice testRice = new Rice();
		testRice.setSellPriceRice(10);
		assertEquals(10, testRice.getSellPriceRice());
	}
	
	@Test
	public void setMaturityRiceTest() {
		Rice testRice = new Rice();
		testRice.setMaturityRice(3);	
		assertEquals(3, testRice.getMaturityRice());
	}
	
	@Test
	public void setBuyPriceTest() {
		Rice testRice = new Rice();
		testRice.setBuyPriceRice(7);
		assertEquals(7, testRice.getBuyPriceRice());
	}
	
	@Test
	public void setRiceQuantityTest() {
		Rice testRice = new Rice();
		testRice.setRiceQuantity(12);
		assertEquals(12, testRice.getRiceQuantity());
	}
	
	@Test
	public void setSpeedRiceQuantitiyTest() {
		Rice testRice = new Rice();
		testRice.setSpeedRice(0.33);
		assertEquals(0.33, testRice.getSpeedRice());
	}
	
}


