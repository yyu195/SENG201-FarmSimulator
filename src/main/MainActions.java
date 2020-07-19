package main;
/**
 * This is a class for Mainactions
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class MainActions {
	
	/**
	 * increase the cleanness of farm by 20
	 * @param farmer the farmer object
	 */
	public void Clean(FarmManager farmer) {
		farmer.setCleaness(farmer.getCleaness()+20);
	}
	
	
	/**
	 * increase the speed of crops by watering action
	 * @param broccoli the broccoli object
	 * @param carrot the carrot object
	 * @param corn the corn object
	 * @param potato the potato object
	 * @param rice the rice object
	 * @param tomato the tomato object
	 * @param kettle the kettle object
	 * @return a string which tell player what they did.
	 */
	public String watering(Broccoli broccoli, Carrot carrot, Corn corn, Potato potato, Rice rice, Tomato tomato, Kettle kettle) {
		if (kettle.getKettleQuantity() > 0) {
			if (broccoli.getSeedBroccoliQuantity() > 0) {
			    broccoli.setSpeedBroccoli(broccoli.getSpeedBroccoli()*1.2);
			}
			if (carrot.getSeedCarrotQuantity() > 0) {
			    carrot.setSpeedCarrot(carrot.getSpeedCarrot()*1.2);
			}
			if (corn.getSeedCornQuantity() > 0) {
			    corn.setSpeedCorn(corn.getSpeedCorn()*1.2);
			}
			if (potato.getSeedPotatoQuantity() > 0) {
			    potato.setSpeedPotato(potato.getSpeedPotato()*1.2);
			}
			if (rice.getSeedRiceQuantity() > 0) {
			    rice.setSpeedRice(rice.getSpeedRice()*1.2);
			}
			if (tomato.getSeedTomatoQuantity() > 0) {
			    tomato.setSpeedTomato(tomato.getSpeedTomato()*1.2);
			}
			return "You have watered your crops.";
		}
		else {
			return "You don't have kettle.";
		}
		

	}
	
	/**
	 * increase the saturation of animals and decrease the quantity of food by feeding action.
	 * @param pig the pig object 
	 * @param cow the cow object
	 * @param sheep the sheep object
	 * @param food the food object
	 */
	public void feedAnimals(Pig pig, Cow cow, Sheep sheep, Food food) {
		if (pig.getPigQuantity() > 0) {
			food.setFoodQuantity(food.getFoodQuantity()-1);
			pig.decreaseSaturation();
		}
		if (cow.getCowQuantity() > 0) {
			food.setFoodQuantity(food.getFoodQuantity()-1);
			cow.decreaseSaturation();
		}
		if (sheep.getSheepQuantity() > 0) {
			food.setFoodQuantity(food.getFoodQuantity()-1);
			sheep.decreaseSaturation();
		}
	}
	
	/**
	 * increase the happiness of animals by playing action.
	 * @param pig the pig object
	 * @param cow the cow object
	 * @param sheep the sheep object
	 */
	public void playWithAnimals(Pig pig, Cow cow, Sheep sheep) {
		if (pig.getPigQuantity() > 0) {
			pig.increaseHappiness();
		}
		if (cow.getCowQuantity() > 0) {
			cow.increaseHappiness();
		}
		if (sheep.getSheepQuantity() > 0) {
			sheep.increaseHappiness();
		}
	}

	
}

