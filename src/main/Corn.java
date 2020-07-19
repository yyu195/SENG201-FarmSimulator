package main;
/**
 * This is a class for Corn
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Corn extends Crops{
	/**
	 * the growing speed of corn
	 */
	private double speedCorn = 0.33;
	
	/**
	 * the price of corn in store
	 */
	private double buyPriceCorn = 3;
	
	/**
	 * the quantity of corn seed
	 */
	private int seedCornQuantity = 0;
	
	/**
	 * the quantity of corn
	 */
	private int cornQuantity = 0;
	
	/**
	 * the selling price of corn
	 */
	private double sellPriceCorn = 10;
	
	/**
	 * the maturity of corn
	 */
	private double maturityCorn = 0;
	
	/**
	 * check corn in field
	 */
	private boolean flagCorn = true;
	
	/**
	 * set a new value to flagCorn
	 * @param newFlag the new value of flagCorn
	 */
	public void setFlagCorn(boolean newFlag) {
		flagCorn = newFlag;
	}
	
	/**
	 * @return a value of flagCorn
	 */
	public boolean getFlagCorn() {
		return flagCorn;
	}
	
	/**
	 * increase the value of seedCornQuantity by 1
	 */
	public void increaseCornQuantity() {
        seedCornQuantity++;
    }
	
	/**
	 * set a new value to speedCorn
	 * @param newspeedCorn the new value of speedCorn
	 */
	public void setSpeedCorn(double newspeedCorn) {
    	speedCorn = newspeedCorn;
    }
	
    /**
     * set a new value to buyPriceCorn
     * @param newBuyPriceCorn the new value of buyPriceCorn
     */
    public void setBuyPriceCorn(double newBuyPriceCorn) {
    	buyPriceCorn = newBuyPriceCorn;
    }
    
    /**
     * set a new value to seedCornQuantity
     * @param newseedCornQuantity the new value of seedCornQuantity
     */
    public void setSeedCornQuantity(int newseedCornQuantity) {
    	seedCornQuantity = newseedCornQuantity;
    }
    
    /**
     * set a new value to cornQuantity
     * @param newCornQuantity the new value of cornQuantity
     */
    public void setCornQuantity(int newCornQuantity) {
    	cornQuantity = newCornQuantity;
    }
    
    /**
     * set a new value to sellPriceCorn
     * @param newSellPriceCorn the new value of sellPriceCorn
     */
    public void setSellPriceCorn(double newSellPriceCorn) {
    	sellPriceCorn = newSellPriceCorn;
    }
    
    /**
     * set a new value to maturityCorn
     * @param newMaturityCorn the new value of maturityCorn
     */
    public void setMaturityCorn(double newMaturityCorn) {
    	maturityCorn = newMaturityCorn;
    }
    
    /**
     * @return the value of speedCorn
     */
    public double getSpeedCorn() {
    	return speedCorn;
    }
    
    /**
     *@return the value of buyPriceCorn
     */
    public double getBuyPriceCorn() {
    	return buyPriceCorn;
    }
    
    /**
     *@return the value of seedCornQuantity
     */
    public int getSeedCornQuantity() {
    	return seedCornQuantity;
    }
    
    /**
     *@return the value of cornQuanity
     */
    public int getCornQuantity() {
    	return cornQuantity;
    }
    
    /**
     *@return the value of sellPriceCorn
     */
    public double getSellPriceCorn() {
    	return sellPriceCorn;
    }
    
    /**
     *@return the value of sellPriceCorn
     */
    public double getMaturityCorn() {
    	return maturityCorn;
    }

}
