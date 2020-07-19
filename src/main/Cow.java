package main;
/**
 * This is a class for Cow
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Cow extends Animals{
	
	/**
	 * the happiness growing speed of cow
	 */
	private double speedHappyCow = 1;
	
	/**
	 * the price of cow in store
	 */
	private double buyPriceCow = 60;
	
    /**
     * the saturation of cow
     */
    private double saturationCow = 0.5;
    
    /**
     * the happiness of cow
     */
    private double happyCow = 0.5;
    
    /**
     * the quantity of cow
     */
    private int cowQuantity = 0;
    
    /**
     * set a new value to speedHappyCow
     * @param newSpeedHappyCow the new value of speedHappyCow
     */
    public void setSpeedHappyCow(double newSpeedHappyCow) {
    	speedHappyCow = newSpeedHappyCow;
    }
    
    /**
     * set a new value to buyPriceCow
     * @param newBuyPriceCow the new value of buyPriceCow
     */
    public void setBuyPriceCow(double newBuyPriceCow) {
    	buyPriceCow = newBuyPriceCow;
    }
    
    /**
     * set a new value to saturationCow
     * @param newSatrurationCow the new value of saturationCow
     */
    public void setSaturationCow(double newSatrurationCow) {
    	saturationCow = newSatrurationCow;
    }
    
    /**
     * set a new value to happyCow
     * @param newHappyCow the new value of happyCow
     */
    public void setHappyCow(double newHappyCow) {
    	happyCow = newHappyCow;
    }
    
    /**
     * set a new value to cowQuantity
     * @param newCowQuantity the new value of cowQuantity
     */
    public void setCowQuantity(int newCowQuantity) {
    	cowQuantity = newCowQuantity;
    }
    
    /**
     * increase the value of cowQuantity by 1
     */
    public void increaseCowQuantity() {
    	cowQuantity++;
    }
    
    /**
     * increase the value of happyCow by 0.2 times speedHappyCow
     */
    public void increaseHappiness() {
    	happyCow += 0.2 * speedHappyCow;
    }
    
    /**
     * decrease the value of saturation by 0.3 if it
     */
    public void decreaseSaturation() {
    	saturationCow -= 0.3;
    	if (saturationCow < 0) {
			saturationCow = 0;
    	}
    	
    	
    }
    
    /**
     * @return the value of speedHappyCow
     */
    public double getSpeedHappyCow() {
    	return speedHappyCow;
    }
    
    /**
     * @return the value of buyPriceCow
     */
    public double getBuyPriceCow() {
    	return buyPriceCow;
    }
    
    /**
     * @return the value of saturationCow
     */
    public double getSaturationCow() {
    	return saturationCow;
    }
    
    /**
     * @return the value of happyCow
     */
    public double getHappyCow() {
    	return happyCow;
    }
    
    /**
     * @return the value of cowQuantity
     */
    public int getCowQuantity() {
    	return cowQuantity;
    }
    
    
}

