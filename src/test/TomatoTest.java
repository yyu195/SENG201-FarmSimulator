package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Broccoli;
import main.Tomato;

public class TomatoTest {
	
	@Test
	public void increaseBroccoliQuantityTest() {
		Tomato testTomato = new Tomato();
		testTomato.increaseTomatoQuantity();
		assertEquals(1, testTomato.getSeedTomatoQuantity());
	}
	
	@Test
	public void setSellPriceBroccoliTest() {
		Tomato testTomato = new Tomato();
		testTomato.setSellPriceTomato(14);
		assertEquals(14, testTomato.getSellPriceTomato());
	}
	
	@Test
	public void setMaturityBroccoliTest() {
		Tomato testTomato = new Tomato();
		testTomato.setMaturityTomato(5);
		assertEquals(5, testTomato.getMaturityTomato());
	}
	
	@Test
	public void setBuyPriceTest() {
		Tomato testTomato = new Tomato();
		testTomato.setBuyPriceTomato(19);
		assertEquals(19, testTomato.getBuyPriceTomato());
	}
	
	@Test
	public void setTomatoQuantityTest() {
		Tomato testTomato = new Tomato();
		testTomato.setTomatoQuantity(12);
		assertEquals(12, testTomato.getTomatoQuantity());
	}
	
	@Test
	public void setSpeedBroccoliQuantitiyTest() {
		Tomato testTomato = new Tomato();
		testTomato.setSpeedTomato(0.17);
		assertEquals(0.17, testTomato.getSpeedTomato());
	}

}


