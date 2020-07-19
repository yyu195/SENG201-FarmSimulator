package main;
/**
 * This is a class for Animals
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Animals {
	
	/**
	 * the happiness growing speed of animals
	 */
	private double speedHappyAnimals;
	
    /**
     * the price of animals in store
     */
    private double buyPriceAnimals;
    
    /**
     * the saturation of animals
     */
    private double saturationAnimals;
    
    /**
     * the happiness of animals
     */
    private double happyAnimals;
    
    /**
     * the quantity of animals
     */
    private int animalsQuantity;
    
    
    /**
     * set a new value to speedHappyAnimals
     * @param newSpeedHappyAnimals the new value of speedHappyAnimals
     */
    public void setSpeedHappyAnimals(double newSpeedHappyAnimals) {
    	speedHappyAnimals = newSpeedHappyAnimals;
    }
    
    /**
     * set a new value to buyPriceAnimals
     * @param newBuyPriceAnimals the new value of buyPriceAnimals
     */
    public void setBuyPriceAnimals(double newBuyPriceAnimals) {
    	buyPriceAnimals = newBuyPriceAnimals;
    }
    
    /**
     * set a new value to saturationAnimals
     * @param newSatrurationAnimals the new value of saturationAnimals
     */
    public void setSaturationAnimals(double newSatrurationAnimals) {
    	saturationAnimals = newSatrurationAnimals;
    }
    
    /**
     * set a new value to happyAnimals
     * @param newHappyAnimals the new value of happyAnimals
     */
    public void setHappyAnimals(double newHappyAnimals) {
    	happyAnimals = newHappyAnimals;
    }
    
    /**
     * set a new value to animalsQuantity
     * @param newAnimalsQuantity the new value of animalsQuantity
     */
    public void setAnimalsQuantity(int newAnimalsQuantity) {
    	animalsQuantity = newAnimalsQuantity;
    }
    /**
     * increase the value of animalsQuantity by 1
     */
    public void increaseAnimalsQuantity() {
    	animalsQuantity++;
    }
   
    
    /**
     * @return the value of speedHappyAnimals
     */
    public double getSpeedHappyAnimals() {
    	return speedHappyAnimals;
    }
    
    /**
     * @return the value of buyPriceAnimals
     */
    public double getBuyPriceAnimals() {
    	return buyPriceAnimals;
    }
    
    /**
     * @return the value of saturationAnimals
     */
    public double getSaturationAnimals() {
    	return saturationAnimals;
    }
    
    /**
     * @return the value of happyAnimals
     */
    public double getHappyAnimals() {
    	return happyAnimals;
    }
    
    /**
     * @return the value of animalsQuantity
     */
    public int getAnimalsQuantity() {
    	return animalsQuantity;
    }

}
