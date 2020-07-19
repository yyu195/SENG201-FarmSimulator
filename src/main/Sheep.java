package main;

/**
 * Run the program from this class
 * 
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 *         24/May/2020
 */
public class Sheep extends Animals{
	
	/**
	 * the happiness growing speed of sheep
	 */
	public double speedHappySheep = 1;
	
    /**
     * the price of sheep in store
     */
    public double buyPriceSheep = 50;
    
    /**
     * the saturation of sheep
     */
    public double saturationSheep = 0.5;
    
    /**
     * the happiness of sheep
     */
    public double happySheep = 0.5;
    
    /**
     * the quantity of sheep
     */
    public int sheepQuantity = 0;
    
    /**
     * Set the speed of the happiness growing
     * @param newSpeedHappySheep the new value of speedHappySheep
     */
    public void setSpeedHappySheep(double newSpeedHappySheep) {
    	speedHappySheep = newSpeedHappySheep;
    }
    
    /**
     * Set the buying price of the sheep
     * @param newBuyPriceSheep the new value of buyPriceSheep
     */
    public void setBuyPriceSheep(double newBuyPriceSheep) {
    	buyPriceSheep = newBuyPriceSheep;
    }
    
    /**
     * Set the saturation of the sheep
     * @param newSatrurationSheep the new value of saturationSheep
     */
    public void setSaturationSheep(double newSatrurationSheep) {
    	saturationSheep = newSatrurationSheep;
    }
    
    /**
     * set the happiness of the sheep
     * @param newHappySheep the new value of happySheep
     */
    public void setHappySheep(double newHappySheep) {
    	happySheep = newHappySheep;
    }
    
    /**
     * set the quantity of the sheep
     * @param newSheepQuantity the new value of sheepQuantity
     */
    public void setSheepQuantity(int newSheepQuantity) {
    	sheepQuantity = newSheepQuantity;
    }
    
    /**
     * Increase the sheep quantity by one
     */
    public void increaseSheepQuantity() {
    	sheepQuantity++;
    }
    
    /**
     * Increase the happiness of sheep by 0.2
     */
    public void increaseHappiness() {
    	happySheep += 0.2 * speedHappySheep;
    }
    
    /**
     * Decrease the saturation by 0.3
     * If saturation is less than 0 then set it to 0
     */
    public void decreaseSaturation() {
    	saturationSheep -= 0.3;
    	if (saturationSheep < 0) {
			saturationSheep = 0;
    	}
    	
    }
    
    /**
     * @return the speed of sheep getting happiness
     */
    public double getSpeedHappySheep() {
    	return speedHappySheep;
    }
    
    /**
     * @return the buying price of the sheep
     */
    public double getBuyPriceSheep() {
    	return buyPriceSheep;
    }
    
    /**
     * @return the saturation of the sheep
     */
    public double getSaturationSheep() {
    	return saturationSheep;
    }
    
    /**
     * @return the happiness of the sheep
     */
    public double getHappySheep() {
    	return happySheep;
    }
    
    /**
     * @return the quantity of the sheep
     */
    public int getSheepQuantity() {
    	return sheepQuantity;
    }

}



