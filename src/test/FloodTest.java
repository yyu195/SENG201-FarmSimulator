package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Flood;

public class FloodTest {

	@Test
	public void setHaveFloodTest() {
		Flood testFlood = new Flood();
		testFlood.setHaveFlood(true);
		assertEquals(true, testFlood.getHaveFlood());
	}
}


