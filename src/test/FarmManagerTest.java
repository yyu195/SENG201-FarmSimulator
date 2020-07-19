package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.FarmManager;

public class FarmManagerTest {
	@Test
	public void setNameTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setName("yyu");
		assertEquals("yyu", testFarmManager.getName());
	}
	
	@Test
	public void setFarmNameTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setFarmName("HappyFarm");
		assertEquals("HappyFarm", testFarmManager.getFarmName());
	}
	
	@Test
	public void setAgeTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setAge("33");
		assertEquals("33", testFarmManager.getAge());
	}
	
	@Test
	public void setDaysTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setDays("5");
		assertEquals("5",testFarmManager.getDays());
	}
	
	@Test
	public void setTypeTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setType(1500);
		assertEquals(1500, testFarmManager.getType());
	}
	
	@Test
	public void setCleanessTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setCleaness(100);
		assertEquals(100, testFarmManager.getCleaness());;
	}
	
	@Test
	public void setBalanceTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setBalance(998);
		assertEquals(998, testFarmManager.getBalance());
	}
	
	@Test
	public void setDiscountTest() {
		FarmManager testFarmManager = new FarmManager();
		testFarmManager.setdiscount(0.6);
		assertEquals(0.6, testFarmManager.getDiscount());
	}
	

}


