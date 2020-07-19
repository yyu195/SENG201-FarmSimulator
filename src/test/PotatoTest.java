package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Potato;

public class PotatoTest {

	@Test
	public void increasePotatoQuantityTest() {
		Potato testPotato = new Potato();
		testPotato.increasePotatoQuantity();
		assertEquals(1, testPotato.getSeedPotatoQuantity());
	}
	
	@Test
	public void setSellPricePotatoTest() {
		Potato testPotato = new Potato();
		testPotato.setSellPricePotato(13);
		assertEquals(13, testPotato.getSellPricePotato());
	}
	
	@Test
	public void setMaturityPotatoTest() {
		Potato testPotato = new Potato();
		testPotato.setMaturityPotato(4);	
		assertEquals(4, testPotato.getMaturityPotato());
	}
	
	@Test
	public void setBuyPriceTest() {
		Potato testPotato = new Potato();
		testPotato.setBuyPricePotato(13);
		assertEquals(13, testPotato.getBuyPricePotato());
	}
	
	@Test
	public void setPotatoQuantityTest() {
		Potato testPotato = new Potato();
		testPotato.setPotatoQuantity(11);
		assertEquals(11, testPotato.getPotatoQuantity());
	}
	
	@Test
	public void setSpeedPotatoQuantitiyTest() {
		Potato testPotato = new Potato();
		testPotato.setSpeedPotato(0.32);
		assertEquals(0.32, testPotato.getSpeedPotato());
	}
}


