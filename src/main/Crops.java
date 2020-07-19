package main;
/**
 * This is a class for Crops
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Crops {
	
	/**
	 * the growing speed of crops
	 */
	private double speedCrops;
	
    /**
     * the price of crops in store
     */
    private double buyPriceCrops;
    
    /**
     * the quantity of crops seed
     */
    private int seedCropsQuantity;
    
    /**
     * the quantity of crops
     */
    private int cropsQuantity;
    
    /**
     * the selling price of crops
     */
    private double sellPriceCrops;
    
    /**
     * the maturity of crops
     */
    private double maturityCrops;
    
    /**
     * check crops in field
     */
    private boolean flagCrops = true;
    
    /**
     * set a new value to flagCrops
     * @param newFlag new value of flagCrops
     */
    public void setFlagCrops(boolean newFlag) {
		flagCrops = newFlag;
	}
    
	/**
	 * @return the value of flagCrops
	 */
	public boolean getFlagCrops() {
		return flagCrops;
	}
	
	/**
	 * increase the value of seedCropsQuantity by 1
	 */
	public void increaseCropsQuantity() {
        seedCropsQuantity++;
    }
	
	/**
	 * set a new value to speedCrops
	 * @param newspeedCrops the new value of speedCrops
	 */
	public void setSpeedCrops(double newspeedCrops) {
    	speedCrops = newspeedCrops;
    }
	
    /**
     * set a new value to buyPriceCrops
     * @param newBuyPriceCrops the new value of buyPriceCrops
     */
    public void setBuyPriceCrops(double newBuyPriceCrops) {
    	buyPriceCrops = newBuyPriceCrops;
    }
    
    /**
     * set a new value to seedCropsQuantity
     * @param newseedCropsQuantity the new value of seedCropsQuantity
     */
    public void setSeedCropsQuantity(int newseedCropsQuantity) {
    	seedCropsQuantity = newseedCropsQuantity;
    }
    
    /**
     * set a new value to cropsQuantity
     * @param newCropsQuantity the new value of cropsQuantity
     */
    public void setCropsQuantity(int newCropsQuantity) {
    	cropsQuantity = newCropsQuantity;
    }
    
    /**
     * set a new value to sellPriceCrops
     * @param newSellPriceCrops the new value of sellPriceCrops
     */
    public void setSellPriceCrops(double newSellPriceCrops) {
    	sellPriceCrops = newSellPriceCrops;
    }
    
    /**
     * set a new value to maturityCrops
     * @param newMaturityCrops the new value of maturityCrops
     */
    public void setMaturityCrops(double newMaturityCrops) {
    	maturityCrops = newMaturityCrops;
    }
    
    /**
     * @return the value of speedCrops
     */
    public double getSpeedCrops() {
    	return speedCrops;
    }
    
    /**
     * @return the value of buyPriceCrops
     */
    public double getBuyPriceCrops() {
    	return buyPriceCrops;
    }
    
    /**
     * @return the value of seedCropsQuanity
     */
    public int getSeedCropsQuantity() {
    	return seedCropsQuantity;
    }
    
    /**
     * @return the value of cropsQuantity
     */
    public int getCropsQuantity() {
    	return cropsQuantity;
    }
    
    /**
     * @return the value of sellPriceCrops
     */
    public double getSellPriceCrops() {
    	return sellPriceCrops;
    }
    
    /**
     * @return the value of maturityCrops
     */
    public double getMaturityCrops() {
    	return maturityCrops;
    }

}


