package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Pig;

public class PigTest {
	
	@Test
	public void increaseHappinessTest() {
		Pig testPig = new Pig();
		testPig.increaseHappiness();	
		assertEquals(0.7, testPig.getHappyPig());
	}
	
	@Test
	public void decreaseSaturationTest() {
		Pig testPig = new Pig();
		testPig.decreaseSaturation();
		assertEquals(0.2, testPig.getSaturationPig());
	}
	
	@Test void setBuyPricePigTest() {
		Pig testPig = new Pig();
		testPig.setBuyPricePig(40);
		assertEquals(40, testPig.getBuyPricePig());
	}

}


