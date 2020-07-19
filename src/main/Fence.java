package main;
import java.util.Random;
/**
 * This is a class for Fence
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Fence {
	
	/**
	 * check fence broken
	 */
	private boolean fenceBroken = false;
	
	/**
	 * set the fenceBroken to false
	 */
	public void fixFence() {
		fenceBroken = false;
	}
	
	/**
	 * set a new value to fenceBroken
	 * @param newFenceBroken the new value of fenceBroken
	 */
	public void setFenceBroken(boolean newFenceBroken) {
		fenceBroken = newFenceBroken;
	}
	
    /**
     * @return the value of fenceBroken
     */
    public boolean getFenceBroken() {
    	return fenceBroken;
    }
    
    /**
     * random lost a animals
     * @param cow the cow object
     * @param pig the pig object
     * @param sheep the sheep object
     * @return which animal has been lost
     */
    public String lostAnimal(Cow cow, Pig pig, Sheep sheep) {
    	 int max=3;
         int min=1;
         Random random = new Random();

         int s = random.nextInt(max)%(max-min+1) + min;
         if (s == 1) {
			cow.setCowQuantity(0);
			cow.setHappyCow(0.5);
			cow.setSaturationCow(0.5);
			return "cow";
		} if (s == 2) {
			pig.setPigQuantity(0);
			pig.setHappyPig(0.5);
			pig.setSaturationPig(0.5);
			return "pig";
		} if (s == 3) {
			sheep.setSheepQuantity(0);
			sheep.setHappySheep(0.5);
			sheep.setSaturationSheep(0.5);
			return "sheep";
		}
		return "";
    }
}
