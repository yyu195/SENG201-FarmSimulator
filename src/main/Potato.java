package main;
/**
 * This is a class for Potato
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */

public class Potato extends Crops{
	
	/**
	 * the growing speed of potato
	 */
	private double speedPotato = 0.34;
	
    /**
     * the price of potato in store
     */
    private double buyPricePotato = 2;
    
    /**
     * the quantity of potato seed
     */
    private int seedPotatoQuantity = 0;
    
    /**
     * the quantity of potato
     */
    private int potatoQuantity = 0;
    
    /**
     * the selling price of potato
     */
    private double sellPricePotato = 10;
    
    
    /**
     * the maturity of potato
     */
    private double maturityPotato = 0;
    
    /**
     * check potato in field
     */
    private boolean flagPotato = true;
    
    /**
     * set a new value to flagPotato
     * @param newFlag the new value of flagPotato
     */
    public void setFlagPotato(boolean newFlag) {
    	flagPotato = newFlag;
    }
    
    /**
     * @return the value of flagPotato
     */
    public boolean getFlagPotato() {
    	return flagPotato;
    }
    
    /**
     * increase the value of seedPotatoQuantity by 1
     */
    public void increasePotatoQuantity() {
        seedPotatoQuantity++;
    }
    
    /**
     * set a new value to speedPotato
     * @param newspeedPotato the new value of speedPotato
     */
    public void setSpeedPotato(double newspeedPotato) {
    	speedPotato = newspeedPotato;
    }
    
    /**
     * set a new value to buyPricePotato
     * @param newBuyPricePotato the new value of buyPricePotato
     */
    public void setBuyPricePotato(double newBuyPricePotato) {
    	buyPricePotato = newBuyPricePotato;
    }
    
    /**
     * set a new value to seedPotatoQuantity
     * @param newseedPotatoQuantity the new value of seedPotatoQuantity
     */
    public void setSeedPotatoQuantity(int newseedPotatoQuantity) {
    	seedPotatoQuantity = newseedPotatoQuantity;
    }
    
    /**
     * set a new value to potato Quantity
     * @param newPotatoQuantity the new value of potatoQuantity
     */
    public void setPotatoQuantity(int newPotatoQuantity) {
    	potatoQuantity = newPotatoQuantity;
    }
    
    /**
     * set a new value to sellPricePotato
     * @param newSellPricePotato the new value of sellPricePotato
     */
    public void setSellPricePotato(double newSellPricePotato) {
    	sellPricePotato = newSellPricePotato;
    }
    
    /**
     * set a new value to maturityPotato
     * @param newMaturityPotato the new value of maturityPotato
     */
    public void setMaturityPotato(double newMaturityPotato) {
    	maturityPotato = newMaturityPotato;
    }
    
    /**
     * @return the value of speedPotato
     */
    public double getSpeedPotato() {
    	return speedPotato;
    }
    
    /**
     * @return the value of buyPricePotato
     */
    public double getBuyPricePotato() {
    	return buyPricePotato;
    }
    
    /**
     * @return the value of seedPotatoQuantity
     */
    public int getSeedPotatoQuantity() {
    	return seedPotatoQuantity;
    }
    
    /**
     * @return the value of potatoQuantity
     */
    public int getPotatoQuantity() {
    	return potatoQuantity;
    }
    
    /**
     * @return the value of sellPricePotato
     */
    public double getSellPricePotato() {
    	return sellPricePotato;
    }
    
    /**
     * @return the value of maturityPotato
     */
    public double getMaturityPotato() {
    	return maturityPotato;
    }

}
