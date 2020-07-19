package main;
/**
 * This is a class for Rice
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Rice extends Crops{
	
	/**
	 * the growing speed of rice
	 */
	public double speedRice = 0.34;
	
    /**
     * the price of rice in store
     */
    public double buyPriceRice = 2;
    
    /**
     * the quantity of rice seed
     */
    public int seedRiceQuantity = 0;
    
    /**
     * the quantity of rice
     */
    public int riceQuantity = 0;
    
    /**
     * the selling price of rice
     */
    public double sellPriceRice = 10;
    
    /**
     * the maturity of rice
     */
    public double maturityRice = 0;
    
    /**
     * check rice in field
     */
    private boolean flagRice = true;
    
    /**
     * set a new value to flagRice
     * @param newFlag the new value of flagRice
     */
    public void setFlagRice(boolean newFlag) {
    	flagRice = newFlag;
    }
    
    /**
     * @return the value of flagRice
     */
    public boolean getFlagRice() {
    	return flagRice;
    }
    
    /**
     * increase the value of seedRiceQuantity by 1
     */
    public void increaseRiceQuantity() {
        seedRiceQuantity++;
    }
    
    /**
     * set a new value to speedRice
     * @param newspeedRice the new value of speedRice
     */
    public void setSpeedRice(double newspeedRice) {
    	speedRice = newspeedRice;
    }
    
    /**
     * set a new value to buyPriceRice
     * @param newBuyPriceRice the new value of buyPriceRice
     */
    public void setBuyPriceRice(double newBuyPriceRice) {
    	buyPriceRice = newBuyPriceRice;
    }
    
    /**
     * set a new value to seedRiceQuantity
     * @param newseedRiceQuantity the new value of seedRiceQuantity
     */
    public void setSeedRiceQuantity(int newseedRiceQuantity) {
    	seedRiceQuantity = newseedRiceQuantity;
    }
    
    /**
     * set a new value to riceQuantity
     * @param newRiceQuantity the new value of riceQuantity
     */
    public void setRiceQuantity(int newRiceQuantity) {
    	riceQuantity = newRiceQuantity;
    }
    
    /**
     * set a new value to sellPriceRice
     * @param newSellPriceRice the new value of sellPriceRice
     */
    public void setSellPriceRice(double newSellPriceRice) {
    	sellPriceRice = newSellPriceRice;
    }
    
    /**
     * set a new value
     * @param newMaturityRice the new value of maturityRice
     */
    public void setMaturityRice(double newMaturityRice) {
    	maturityRice = newMaturityRice;
    }
    
    /**
     * @return the value of speedRice
     */
    public double getSpeedRice() {
    	return speedRice;
    }
    
    /**
     * @return the value of buyPriceRice
     */
    public double getBuyPriceRice() {
    	return buyPriceRice;
    }
    
    /**
     * @return the value of seedRiceQuantity
     */
    public int getSeedRiceQuantity() {
    	return seedRiceQuantity;
    }
    
    /**
     * @return the value of riceQuantity
     */
    public int getRiceQuantity() {
    	return riceQuantity;
    }
    
    /**
     * @return the value of sellPriceRice
     */
    public double getSellPriceRice() {
    	return sellPriceRice;
    }
    
    /**
     * @return the value of maturityRice
     */
    public double getMaturityRice() {
    	return maturityRice;
    }

}
