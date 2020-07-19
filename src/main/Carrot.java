package main;
/**
 * This is a class for Carrot
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Carrot extends Crops{
	/**
	 * the speed of carrot
	 */
	private double speedCarrot = 0.25;
	
	/**
	 * the price of carrot in store
	 */
	private double buyPriceCarrot =3;
	
	/**
	 * the quantity of carrot seed
	 */
	private int seedCarrotQuantity = 0;
	
	/**
	 * the quantity of carrot
	 */
	private int carrotQuantity = 0;
	
	/**
	 * the selling price of carrot
	 */
	private double sellPriceCarrot = 12;
	
	/**
	 * the maturity of carrot
	 */
	private double maturityCarrot = 0;
	
	/**
	 * check carrot on field
	 */
	private boolean flagCarrot = true;
	
	/**
	 * set a new value to flagCarrot
	 * @param newFlag the new value of flagCarrot
	 */
	public void setFlagCarrot(boolean newFlag) {
		flagCarrot = newFlag;
	}
	
	/**
	 * @return the value of flagCarrot
	 */
	public boolean getFlagCarrot() {
		return flagCarrot;
	}
	
	/**
	 * increase the value of seedCarrotQuantity by 1
	 */
	public void increaseCarrotQuantity() {
        seedCarrotQuantity++;
    }
	
	/**
	 * set a new value to speedCarrot
	 * @param newspeedCarrot the new value of speedCarrot
	 */
	public void setSpeedCarrot(double newspeedCarrot) {
    	speedCarrot = newspeedCarrot;
    }
	
    /**
     * set a new value to buyPriceCarrot
     * @param newBuyPriceCarrot the new value of buyPriceCarrot
     */
    public void setBuyPriceCarrot(double newBuyPriceCarrot) {
    	buyPriceCarrot = newBuyPriceCarrot;
    }
    
    /**
     * set a new value to seedCarrotQuantity
     * @param newseedCarrotQuantity the new value of seedCarrotQuantity
     */
    public void setSeedCarrotQuantity(int newseedCarrotQuantity) {
    	seedCarrotQuantity = newseedCarrotQuantity;
    }
    
    /**
     * set a new value to carrotQuantity
     * @param newCarrotQuantity the new value of carrotQuantity
     */
    public void setCarrotQuantity(int newCarrotQuantity) {
    	carrotQuantity = newCarrotQuantity;
    }
    
    /**
     * set a new value to sellPriceCarrot
     * @param newSellPriceCarrot the new value of sellPriceCarrot
     */
    public void setSellPriceCarrot(double newSellPriceCarrot) {
    	sellPriceCarrot = newSellPriceCarrot;
    }
    
    /**
     * set a new value to maturityCarrot
     * @param newMaturityCarrot the new value of maturityCarrot
     */
    public void setMaturityCarrot(double newMaturityCarrot) {
    	maturityCarrot = newMaturityCarrot;
    }
    
    /**
     * @return the value of speedCarrot
     */
    public double getSpeedCarrot() {
    	return speedCarrot;
    }
    
    /**
     * @return the value of buyPriceCarrot
     */
    public double getBuyPriceCarrot() {
    	return buyPriceCarrot;
    }
    
    /**
     * @return the value of seedCarrotQuantity
     */
    public int getSeedCarrotQuantity() {
    	return seedCarrotQuantity;
    }
    
    /**
     * @return the value of carrotQuantity
     */
    public int getCarrotQuantity() {
    	return carrotQuantity;
    }
    
    /**
     * @return the value of sellPriceCarrot
     */
    public double getSellPriceCarrot() {
    	return sellPriceCarrot;
    }
    
    /**
     * @return the value of maturityCarrot
     */
    public double getMaturityCarrot() {
    	return maturityCarrot;
    }

}
