package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Broccoli;
import main.Corn;

public class CornTest {

	@Test
	public void increaseCornQuantityTest() {
		Corn testCorn = new Corn();
		testCorn.increaseCornQuantity();
		assertEquals(1, testCorn.getSeedCornQuantity());
	}
	
	@Test
	public void setSellPriceCornTest() {
		Corn testCorn = new Corn();
		testCorn.setSellPriceCorn(6);
		assertEquals(6, testCorn.getSellPriceCorn());
	}
	
	@Test
	public void setMaturityCornTest() {
		Corn testCorn = new Corn();
		testCorn.setMaturityCorn(4);
		assertEquals(4, testCorn.getMaturityCorn());
	}
	
	@Test
	public void setBuyPriceTest() {
		Corn testCorn = new Corn();
		testCorn.setBuyPriceCorn(14);
		assertEquals(14, testCorn.getBuyPriceCorn());
	}
	
	@Test
	public void setCornQuantityTest() {
		Corn testCorn = new Corn();
		testCorn.setCornQuantity(11);
		assertEquals(11, testCorn.getCornQuantity());
	}
	
	@Test
	public void setSpeedCornQuantitiyTest() {
		Corn testCorn = new Corn();
		testCorn.setSpeedCorn(0.16);
		assertEquals(0.16, testCorn.getSpeedCorn());
	}
	
}


