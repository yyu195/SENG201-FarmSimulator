package main;
import java.util.Random;
/**
 * This is a class for RandomEvents
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class RandomEvents {
	/**
	 * random select a event to happen
	 * @param conference the conference object
	 * @param fence the fence object
	 * @param flood the flood object
	 */
	public void RandomEve(Conference conference, Fence fence, Flood flood) {
		int max=3;
        int min=1;
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
        if (s == 1) {
			conference.setMeeted(true);
		}
        if (s == 3) {
			flood.setHaveFlood(true);
		}
        else {
			fence.setFenceBroken(true);
		}
	}

}
