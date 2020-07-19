package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Wrench;

public class WrenchTest {
	@Test
	public void setWrenchTest() {
		Wrench testWrench = new Wrench();
		testWrench.setWrenchQuantity(3);
		assertEquals(3, testWrench.getWrenchQuantity());
	}

}


