package main;
import java.util.Random;
/**
 * This is a class for Flood
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class Flood {
	
    /**
     * check flood happened
     */
    private boolean haveFlood = false;

	/**
	 * set a new value to haveFlood
	 * @param newHaveFlood the new value of haveFlood
	 */
	public void setHaveFlood(boolean newHaveFlood) {
		haveFlood = newHaveFlood;
	}
	
    /**
     * @return the value of have Flood
     */
    public boolean getHaveFlood() {
    	return haveFlood;
    }
    
    /**
     * random lost a crop
     * @param broccoli the broccoli object
     * @param carrot the carrot object
     * @param corn the corn object
     * @param potato the potato object
     * @param rice the rice object
     * @param tomato the tomato object
     * @return which crop has been lost
     */
    public String lostCrops(Broccoli broccoli, Carrot carrot, Corn corn, Potato potato, Rice rice, Tomato tomato) {
    	 int max=6;
         int min=1;
         Random random = new Random();

         int s = random.nextInt(max)%(max-min+1) + min;
         if (s == 1) {
			broccoli.setSeedBroccoliQuantity(0);
			broccoli.setSpeedBroccoli(0.25);
			broccoli.setMaturityBroccoli(0);
			return "broccoli";
		} if (s == 2) {
			carrot.setSeedCarrotQuantity(0);
			carrot.setSpeedCarrot(0.25);
			carrot.setMaturityCarrot(0);
			return "carrot";
		} if (s == 3) {
			corn.setSeedCornQuantity(0);
			corn.setSpeedCorn(0.33);
			corn.setMaturityCorn(0);
			return "corn";
		} if (s == 4) {
			potato.setSeedPotatoQuantity(0);
			potato.setSpeedPotato(0.34);
			potato.setMaturityPotato(0);
			return "potato";
		} if (s == 5) {
			rice.setSeedRiceQuantity(0);
			rice.setSpeedRice(0.34);
			rice.setMaturityRice(0);
			return "rice";
		} if (s == 6) {
			tomato.setSeedTamatoQuantity(0);;
			tomato.setSpeedTomato(0.25);
			tomato.setMaturityTomato(0);
			return "tomato";
		}
		return "";
    }

}
