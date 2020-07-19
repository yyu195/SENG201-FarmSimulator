package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Sheep;

public class SheepTest {

	@Test
	public void increaseHappinessTest() {
		Sheep testSheep = new Sheep();
		testSheep.increaseHappiness();
		assertEquals(0.7,  testSheep.getHappySheep());
	}
	
	@Test
	public void decreaseSaturationTest() {
		Sheep testSheep = new Sheep();
		testSheep.decreaseSaturation();
		assertEquals(0.2, testSheep.getSaturationSheep());
	}
	
	@Test
	public void setBuyPriceSheepTest() {
		Sheep testSheep = new Sheep();
		testSheep.setBuyPriceSheep(100);
		assertEquals(100, testSheep.getBuyPriceSheep());
	}
}


