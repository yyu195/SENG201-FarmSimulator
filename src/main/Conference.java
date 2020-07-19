package main;
/**
 * This is a class for Conference
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Conference {
	
	/**
	 * conference happened
	 */
	private boolean meeted = false;
	
	/**
	 * @return the value of meeted
	 */
	public boolean getMeeted() {
		return meeted;
	}
	
	/**
	 * set a new value to meeted
	 * @param newMeeted the new value of meeted
	 */
	public void setMeeted(boolean newMeeted) {
		meeted = newMeeted;
	}
	
	/**
	 * count how much money the farmer will be awarded
	 * @param cow the cow object
	 * @param pig the pig object
	 * @param sheep the sheep object
	 * @param farmManager the farmManager object
	 * @return how much money awarded
	 */
	public double award(Cow cow, Pig pig, Sheep sheep, FarmManager farmManager) {
		double money = 0;
		money = cow.getHappyCow()*100 + sheep.getHappySheep()*100 + pig.getHappyPig()*100 + farmManager.getCleaness()*5;
		return money;
	}

}
