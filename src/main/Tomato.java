package main;
/**
 * This is a class for Rice
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Tomato extends Crops{
	
	/**
	 * the growing speed of tomato
	 */
	private double speedTomato = 0.25;
	
    /**
     * the price of tomato in store
     */
    private double buyPriceTomato = 5;
    
    /**
     * the quantity of tomato seed
     */
    private int seedTomatoQuantity = 0;
    
    /**
     * the quantity of tomato
     */
    private int tomatoQuantity = 0;
    
    /**
     * the selling price of tomato
     */
    private double sellPriceTomato = 25;
    
    /**
     * the maturity of tomato
     */
    private double maturityTomato = 0;
    
    /**
     * check tomato in field
     */
    private boolean flagTomato = true;
    
    /**
     * set a new value to flagTomato
     * @param newFlag the new value of flagTomato
     */
    public void setFlagTomato(boolean newFlag) {
    	flagTomato = newFlag;
    }
    
    /**
     * @return the value of flagTomato
     */
    public boolean getFlagTomato() {
    	return flagTomato;
    }
    
    /**
     * increase the value of seedTomatoQuantity by 1
     */
    public void increaseTomatoQuantity() {
        seedTomatoQuantity++;
    }
    
    /**
     * set a new value to speedTomato
     * @param newspeedTomato the new value of speedTomato
     */
    public void setSpeedTomato(double newspeedTomato) {
    	speedTomato = newspeedTomato;
    }
    
    /**
     * set a new value to buyPriceTomato
     * @param newBuyPriceTomato the new value of buyPriceTomato
     */
    public void setBuyPriceTomato(double newBuyPriceTomato) {
    	buyPriceTomato = newBuyPriceTomato;
    }
    
    /**
     * set a new value to seedTomatoQuantity
     * @param newseedTomatoQuantity the new value of seedTomatoQuantity
     */
    public void setSeedTamatoQuantity(int newseedTomatoQuantity) {
    	seedTomatoQuantity = newseedTomatoQuantity;
    }
    
    /**
     * set a new value to tomatoQuantity
     * @param newTomatoQuantity the new value of tomatoQuantity
     */
    public void setTomatoQuantity(int newTomatoQuantity) {
    	tomatoQuantity = newTomatoQuantity;
    }
    
    /**
     * set a new value to sellPriceTomato
     * @param newSellPriceTomato the new value of sellPriceTomato
     */
    public void setSellPriceTomato(double newSellPriceTomato) {
    	sellPriceTomato = newSellPriceTomato;
    }
    
    /**
     * set a new value to maturityTomato
     * @param newMaturityTomato the new value of maturityTomato
     */
    public void setMaturityTomato(double newMaturityTomato) {
    	maturityTomato = newMaturityTomato;
    }
    
    /**
     * @return the value of speedTomato
     */
    public double getSpeedTomato() {
    	return speedTomato;
    }
    
    /**
     * @return the value of buyPriceTomato
     */
    public double getBuyPriceTomato() {
    	return buyPriceTomato;
    }
    
    /**
     * @return the value of seedTomatoQuantity
     */
    public int getSeedTomatoQuantity() {
    	return seedTomatoQuantity;
    }
    
    /**
     * @return the value of tomatoQuantity
     */
    public int getTomatoQuantity() {
    	return tomatoQuantity;
    }
    
    /**
     * @return the value of sellPriceTomato
     */
    public double getSellPriceTomato() {
    	return sellPriceTomato;
    }
    
    /**
     * @return the value of maturityTomato
     */
    public double getMaturityTomato() {
    	return maturityTomato;
    }

}
