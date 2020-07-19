package test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Kettle;

public class KettleTest {
	@Test
	public void setKettleQuantityTest() {
		Kettle testKettle = new Kettle();
		testKettle.setKettleQuantity(4);
		assertEquals(4, testKettle.getKettleQuantity());
	}

}


