package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Cow;
import main.Pig;

public class CowTest {
	@Test
	public void increaseHappinessTest() {
		Cow testCow = new Cow();
		testCow.increaseHappiness();	
		assertEquals(0.7, testCow.getHappyCow());
	}
	
	@Test
	public void decreaseSaturationTest() {
		Cow testCow = new Cow();
		testCow.decreaseSaturation();
		assertEquals(0.2, testCow.getSaturationCow());
	}
	
	@Test void setBuyPricePigTest() {
		Cow testCow = new Cow();
		testCow.setBuyPriceCow(70);
		assertEquals(70, testCow.getBuyPriceCow());
	}

}


