package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Fence;

public class FenceTest {
	
	@Test
	public void fixFenceTest() {
		Fence testFence = new Fence();
		testFence.fixFence();
		assertEquals(false, testFence.getFenceBroken());
	}
	


}


