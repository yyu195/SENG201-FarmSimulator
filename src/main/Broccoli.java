package main;
/**
 * This is a class for Broccoli
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Broccoli extends Crops{
	/**
	 * the growing speed of broccoli
	 */
	private double speedBroccoli = 0.25;
	
    /**
     * the price of broccoli in store
     */
    private double buyPriceBroccoli = 3;
    
    /**
     * the quantity of broccoli seed
     */
    private int seedBroccoliQuantity = 0;
    
    /**
     * the quantity of broccoli
     */
    private int broccoliQuantity = 0;
    
    /**
     * the selling price of broccoli 
     */
    private double sellPriceBroccoli = 12;
    
    /**
     * the maturity of broccoli
     */
    private double maturityBroccoli = 0;
    
    /**
     * check broccoli on field
     */
    private boolean flagBroccoli = true;
    /**
     * set a new value to flagBroccoli
     * @param newFlag the new value of flagBroccoli
     */
    public void setFlagBroccoli(boolean newFlag) {
    	flagBroccoli = newFlag;
    }
    
    /**
     * @return the value of flagBroccoli
     */
    public boolean getFlagBroccoli() {
    	return flagBroccoli;
    }
    
    /**
     * increase the value of seedBroccoliQuantity by 1
     */
    public void increaseBroccoliQuantity() {
        seedBroccoliQuantity++;
    }
    
    /**
     * set a new value to speedBroccoli
     * @param newspeedBroccoli the new value of speedBroccoli
     */
    public void setSpeedBroccoli(double newspeedBroccoli) {
    	speedBroccoli = newspeedBroccoli;
    }
    
    /**
     * set a new value to buyPriceBroccoli
     * @param newBuyPriceBroccoli the new value of buyPriceBroccoli
     */
    public void setBuyPriceBroccoli(double newBuyPriceBroccoli) {
    	buyPriceBroccoli = newBuyPriceBroccoli;
    }
    
    /**
     * set a new value to seedBroccoliQuantity
     * @param newseedBroccoliQuantity the new value of seedBroccoliQuantity
     */
    public void setSeedBroccoliQuantity(int newseedBroccoliQuantity) {
    	seedBroccoliQuantity = newseedBroccoliQuantity;
    }
    
    /**
     * set a new value to broccoliQuantity
     * @param newBroccoliQuantity the new value of broccoliQuantity
     */
    public void setBroccoliQuantity(int newBroccoliQuantity) {
    	broccoliQuantity = newBroccoliQuantity;
    }
    
    /**
     * set a new value to sellPriceBroccoli
     * @param newSellPriceBroccoli the new value of sellPriceBroccoli
     */
    public void setSellPriceBroccoli(double newSellPriceBroccoli) {
    	sellPriceBroccoli = newSellPriceBroccoli;
    }
    
    /**
     * set a new value to maturityBroccoli
     * @param newMaturityBroccoli the new value of maturityBroccoli
     */
    public void setMaturityBroccoli(double newMaturityBroccoli) {
    	maturityBroccoli = newMaturityBroccoli;
    }
    
    /**
     * @return the value of speedBroccoli
     */
    public double getSpeedBroccoli() {
    	return speedBroccoli;
    }
    
    /**
     * @return the value of buyPriceBroccoli
     */
    public double getBuyPriceBroccoli() {
    	return buyPriceBroccoli;
    }
    
    /**
     * @return the value of seedBroccoliQuantity
     */
    public int getSeedBroccoliQuantity() {
    	return seedBroccoliQuantity;
    }
    
    /**
     * @return the value of broccoliQuantity
     */
    public int getBroccoliQuantity() {
    	return broccoliQuantity;
    }
    
    /**
     * @return the value of sellPriceBroccoli
     */
    public double getSellPriceBroccoli() {
    	return sellPriceBroccoli;
    }
    
    /**
     * @return the value of maturityBroccoli
     */
    public double getMaturityBroccoli() {
    	return maturityBroccoli;
    }
}
