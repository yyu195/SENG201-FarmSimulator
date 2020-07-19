package main;



/**
 * Run the program from this class
 * 
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class FarmManager {
	
	/**
	 * Farmer's name
	 */
	String name;
	
	/**
	 * Farmer's name
	 */
	String farmName;
	
	/**
	 * How many days the farmer wants to play
	 */
	String days;
	
	/**
	 * The farmer's age
	 */
	String age;
	
	/**
	 * Set the original balance to 1000
	 */
	double balance = 1000;
	
	/**
	 * Set the original crops growing speed
	 */
	double speed = 1;
	
	/**
	 * Set the original animals Happiness
	 */
	double happiness = 1;
	
	/**
	 * Set item with original price
	 */
	double discount = 1;
	
	/**
	 * Set the farm's cleanness
	 */
	double cleanness = 50;
	
	double type;
	
	/**
	 * @return the farmer's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the new name
	 * 
	 * @param newName the farmers' name
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * @return farm's name
	 */
	public String getFarmName() {
		return farmName;
	}

	/**
	 * Set the farm's name
	 * 
	 * @param newFarmName farm's name
	 */
	public void setFarmName(String newFarmName) {
		farmName = newFarmName;
	}

	/**
	 * @return farmer's age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * Set the farmer's age
	 * 
	 * @param newAge farmer's age
	 */
	public void setAge(String newAge) {
		age = newAge;
	}

	/**
	 * @return the days the farmer wants to play
	 */
	public String getDays() {
		return days;
	}

	/**
	 * Set the days
	 * 
	 * @param newdays days the player wants to play
	 */
	public void setDays(String newdays) {
		days = newdays;
	}

	/**
	 * Get the selected type
	 * 
	 * @return the selectedType(double)
	 */
	public double getType() {
		return type;
	}

	/**
	 * Set the new type
	 * 
	 * @param newType the type the player chose
	 */
	public void setType(double newType) {
		type = newType;
	}

	/**
	 * Get the cleanness of the farm
	 * 
	 * @return the cleanness of the farm
	 */
	public double getCleaness() {
		return cleanness;
	}

	/**
	 * @param newCleaness got new cleanness after cleanning
	 */
	public void setCleaness(double newCleaness) {
		cleanness = newCleaness;
	}

	/**
	 * @return the balance of the farmer get
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Set the balance
	 * 
	 * @param newBalance the balance after buying and selling
	 */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	/**
	 * If the farmer chose the faster growing speed type, the new speed 
	 * will be set, The value is from the setupScreen
	 * 
	 * @return the crops growing speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param newSpeed the faster speed of crops growing
	 */
	public void setspeed(double newSpeed) {
		speed = newSpeed;
	}

	/**
	 * If the farmer wants the animals have more happiness, the new happiness 
	 * will be set, The value is from the setupScreen
	 * 
	 * @return happiness
	 */
	public double getHappiness() {
		return happiness;
	}
	
	/**
	 * If the farmer chose the government support, He is going to have 30% off
	 * 
	 * @return discount
	 */
	public double getDiscount() {
		return discount;
	}

	
	/**
	 * @param newDiscount If the player chose the government support type of farm
	 * 
	 */
	public void setdiscount(double newDiscount) {
		discount = newDiscount;
	}

	/**
	 * Launch the mainScreen
	 */
	public void launchMainScreen() {
		FarmMainScreen mainWindow = new FarmMainScreen(this);
	}

	/**
	 * @param mainWindow the window where the player play the game 
	 */
	public void closeMainScreen(FarmMainScreen mainWindow) {
		mainWindow.closeWindow();
	}

	/**
	 * Close the mainScreen and Launch the GameOverScreen
	 * @param mainWindow the window where the player play the game 
	 */
	public void closeMainLaunchGameOverScreen(FarmMainScreen mainWindow) {

		mainWindow.closeWindow();
		launchGameOverScreen();
	}
	
	/**
	 * Launch the profileScreen
	 */
	public void launchProfileScreen() {
		ProfileScreen profileWindow = new ProfileScreen(this);
	}

	/**
	 * Close the profileScreen
	 * @param profileWindow the window shows the player's profile
	 */
	public void closeProfileScreen(ProfileScreen profileWindow) {
		profileWindow.closeWindow();
	}

	/**
	 * Launch the GameOverScreen
	 */
	public void launchGameOverScreen() {
		GameOverScreen gameOverWindow = new GameOverScreen(this);
	}

	/**
	 * Close the GameOverWindow
	 * @param gameOverWindow when the game is over, the window will 
	 * show the balance how much the player got
	 */
	public void closeGameOverScreen(GameOverScreen gameOverWindow) {
		gameOverWindow.closeWindow();
	}

	/**
	 * Launch the setupScreen
	 */
	public void launchSetupScreen() {
		FarmSetupScreen setupWindow = new FarmSetupScreen(this);
	}

	public void closeSetupScreen(FarmSetupScreen setupWindow, double selectedText) {

		name = setupWindow.getFarmerName();
		farmName = setupWindow.getFarmName();
		age = setupWindow.getAge();
		type = setupWindow.getSelectedType();
		if (selectedText == 1500) {
			balance = selectedText;
			speed = 1;
			happiness = 1;
			discount = 1;
		} else if (selectedText == 1.3) {
			balance = 1000.0;
			speed = selectedText;
			happiness = 1;
			discount = 1;
		} else if (selectedText == 1.2) {
			balance = 1000.0;
			speed = 1;
			happiness = selectedText;
			discount = 1;
		} else if (selectedText == 0.7) {
			balance = 1000.0;
			speed = 1;
			happiness = 1;
			discount = selectedText;
		}

		days = setupWindow.getDays();

		setupWindow.closeWindow();
		launchMainScreen();
	}

	public static void main(String[] args) {
		FarmManager farmer = new FarmManager();
		farmer.launchSetupScreen();

	}

}
