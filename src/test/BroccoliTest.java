package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Broccoli;

public class BroccoliTest {
	
	@Test
	public void increaseBroccoliQuantityTest() {
		Broccoli testBroccoli = new Broccoli();
		testBroccoli.increaseBroccoliQuantity();
		assertEquals(1, testBroccoli.getSeedBroccoliQuantity());
	}
	
	@Test
	public void setSellPriceBroccoliTest() {
		Broccoli testBroccoli = new Broccoli();
		testBroccoli.setSellPriceBroccoli(10);
		assertEquals(10, testBroccoli.getSellPriceBroccoli());
	}
	
	@Test
	public void setMaturityBroccoliTest() {
		Broccoli testBroccoli = new Broccoli();
		testBroccoli.setMaturityBroccoli(3);	
		assertEquals(3, testBroccoli.getMaturityBroccoli());
	}
	
	@Test
	public void setBuyPriceTest() {
		Broccoli testBroccoli = new Broccoli();
		testBroccoli.setBuyPriceBroccoli(7);
		assertEquals(7, testBroccoli.getBuyPriceBroccoli());
	}
	
	@Test
	public void setBroccoliQuantityTest() {
		Broccoli testBroccoli = new Broccoli();
		testBroccoli.setBroccoliQuantity(12);
		assertEquals(12, testBroccoli.getBroccoliQuantity());
	}
	
	@Test
	public void setSpeedBroccoliQuantitiyTest() {
		Broccoli testBroccoli = new Broccoli();
		testBroccoli.setSpeedBroccoli(0.33);
		assertEquals(0.33, testBroccoli.getSpeedBroccoli());
	}
	
}


