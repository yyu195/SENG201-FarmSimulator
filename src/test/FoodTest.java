package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Food;

public class FoodTest {
	@Test
	public void setFoodQuantityTest() {
		Food testFood = new Food();
		testFood.setFoodQuantity(5);
		assertEquals(5, testFood.getFoodQuantity());
	}

}


