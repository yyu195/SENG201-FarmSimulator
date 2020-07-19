package main;
/**
 * This is a class for Pig
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Pig extends Animals{
	
	/**
	 * the happiness growing speed of pig
	 */
	private double speedHappyPig = 1;
	
    /**
     * the price of pig in store
     */
    private double buyPricePig = 20;
    
    /**
     * the saturation of pig
     */
    private double saturationPig = 0.5;
    
    /**
     * the happiness of pig
     */
    private double happyPig = 0.5;
    
    /**
     * the quantity of pig
     */
    private int pigQuantity = 0;
    
    
    /**
     * set a new value to speedHappyPig
     * @param newSpeedHappyPig the new value of speedHappyPig
     */
    public void setSpeedHappyPig(double newSpeedHappyPig) {
    	speedHappyPig = newSpeedHappyPig;
    }
    
    /**
     * set a new value to buyPrice
     * @param newBuyPricePig the new value of buyPricePig
     */
    public void setBuyPricePig(double newBuyPricePig) {
    	buyPricePig = newBuyPricePig;
    }
    
    /**
     * set a new value to saturationPig
     * @param newSatrurationPig the new value of saturationPig
     */
    public void setSaturationPig(double newSatrurationPig) {
    	saturationPig = newSatrurationPig;
    }
    
    /**
     * set a new value to happyPig
     * @param newHappyPig the new value of happyPig
     */
    public void setHappyPig(double newHappyPig) {
    	happyPig = newHappyPig;
    }
    
    /**
     * set a new value to pigQuantity
     * @param newPigQuantity the new value of pigQuantity
     */
    public void setPigQuantity(int newPigQuantity) {
    	pigQuantity = newPigQuantity;
    }
    
    /**
     * increase the value of pigQuantity by 1
     */
    public void increasePigQuantity() {
    	pigQuantity++;
    }
    
    /**
     * increase the value of happyPig by 0.2 times speedHappyPig
     */
    public void increaseHappiness() {
    	happyPig += 0.2 * speedHappyPig;
    }
    
    /**
     * decrease the value of saturationPig by 0.3
     */
    public void decreaseSaturation() {
    	saturationPig -= 0.3;
    	if (saturationPig < 0) {
			saturationPig = 0;
    	}
		
    	
    }
    
    /**
     * @return the value of speedHappyPig
     */
    public double getSpeedHappyPig() {
    	return speedHappyPig;
    }
    
    /**
     * @return the value of buyPricePig
     */
    public double getBuyPricePig() {
    	return buyPricePig;
    }
    
    /**
     * @return the value of saturationPig
     */
    public double getSaturationPig() {
    	return saturationPig;
    }
    
    /**
     * @return the value of happyPig
     */
    public double getHappyPig() {
    	return happyPig;
    }
    
    /**
     * @return the value of pigQuantity
     */
    public int getPigQuantity() {
    	return pigQuantity;
    }
}

