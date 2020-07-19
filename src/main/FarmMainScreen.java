package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


/**
 * Run the program from this class
 * 
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 *         24/May/2020
 */
public class FarmMainScreen {
	private JFrame frame;
	private FarmManager farmer;
	private Broccoli broccoli = new Broccoli();
	private Carrot carrot = new Carrot();
	private Corn corn = new Corn();
	private Potato potato = new Potato();
	private Rice rice = new Rice();
	private Tomato tomato = new Tomato();
	private Pig pig = new Pig();
	private Cow cow = new Cow();
	private Sheep sheep = new Sheep();
	private JLabel lblBalance;
	private MainActions mainActions = new MainActions();
	private Fence fence = new Fence();
	private Conference conference = new Conference();
	private RandomEvents randomEvents = new RandomEvents();
	private Flood flood = new Flood();
	private Kettle kettle = new Kettle();
	private Food food = new Food();

	/**
	 * count down the days
	 */
	int count = 1;
	
	/**
	 * The Farmer only has two actions everyday
	 */
	int buttonTimes = 2;

	/**
	 * The formula uses maturity and speed to calculate how many days left for  harvesting the crops
	 * @param speed the crops' growing speed
	 * @param maturity the crops's maturity
	 * @return days the left days till harvest
	 */
	public int harvestableTime(double speed, double maturity) {
		int days = (int) ((1 - maturity) / speed);
		if (days < 0) {
			return 0;
		} else {
			return days;
		}
	}

	/**
	 * Calculate the money got from the harvestCrops
	 * 
	 * @return money
	 */
	public double harvestThecrops() {
		double money = 0;
		double money1 = 0;
		double money2 = 0;
		double money3 = 0;
		double money4 = 0;
		double money5 = 0;
		if (harvestableTime(broccoli.getSpeedBroccoli(), broccoli.getMaturityBroccoli()) == 0) {
			money = broccoli.getSellPriceBroccoli() * broccoli.getSeedBroccoliQuantity();
			broccoli.setSeedBroccoliQuantity(0);
			broccoli.setFlagBroccoli(true);
			lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance() + money));

		}
		if (harvestableTime(carrot.getSpeedCarrot(), carrot.getMaturityCarrot()) == 0) {
			money1 = carrot.getSellPriceCarrot() * carrot.getSeedCarrotQuantity();
			carrot.setSeedCarrotQuantity(0);
			carrot.setFlagCarrot(true);
			lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance() + money1));

		}
		if (harvestableTime(corn.getSpeedCorn(), corn.getMaturityCorn()) == 0) {
			money2 = corn.getSellPriceCorn() * corn.getSeedCornQuantity();
			corn.setSeedCornQuantity(0);
			corn.setFlagCorn(true);
			lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance() + money2));

		}
		if (harvestableTime(potato.getSpeedPotato(), potato.getMaturityPotato()) == 0) {
			money3 = potato.getSellPricePotato() * potato.getSeedPotatoQuantity();
			potato.setSeedPotatoQuantity(0);
			potato.setFlagPotato(true);
			lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance() + money3));

		}
		if (harvestableTime(rice.getSpeedRice(), rice.getMaturityRice()) == 0) {
			money4 = rice.getSellPriceRice() * rice.getSeedRiceQuantity();
			rice.setSeedRiceQuantity(0);
			rice.setFlagRice(true);
			lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance() + money4));

		}
		if (harvestableTime(tomato.getSpeedTomato(), tomato.getMaturityTomato()) == 0) {
			money5 = tomato.getSellPriceTomato() * tomato.getSeedTomatoQuantity();
			tomato.setSeedTamatoQuantity(0);
			tomato.setFlagTomato(true);
			lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance() + money5));
			;
		}
		return money + money1 + money2 + money3 + money4 + money5;
	}

	
	/**
	 * @param incomingfarmer a object of Farmmanager
	 */
	public FarmMainScreen(FarmManager incomingfarmer) {
		farmer = incomingfarmer;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Close the mainScreen
	 */
	public void closeWindow() {
		frame.dispose();
	}

	/**
	 * Closet the mainScreen
	 */
	public void finishedWindow() {
		farmer.closeMainScreen(this);
	}

	/**
	 * Launch the profileScreen from the mainScreen
	 */
	public void launchProfileWindow() {
		farmer.launchProfileScreen();
	}

	/**
	 * Launch the GameOverScreen from the mainScreen
	 */
	public void lanuchGameoverWindow() {
		farmer.closeMainLaunchGameOverScreen(this);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmMainScreen window = new FarmMainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FarmMainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		DecimalFormat df1 = new DecimalFormat("0.00");
		JLabel helloJLabel = new JLabel("Hello " + farmer.getName() + " This is your " + farmer.getFarmName() + "!");
		helloJLabel.setBounds(25, 46, 324, 16);
		frame.getContentPane().add(helloJLabel);
		JLabel storeJLabel = new JLabel("Store");
		storeJLabel.setBounds(796, 46, 32, 16);
		frame.getContentPane().add(storeJLabel);
		storeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
//store        vegetable
		JPanel vegetableJPanel = new JPanel();
		vegetableJPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		vegetableJPanel.setBounds(635, 92, 359, 119);
		frame.getContentPane().add(vegetableJPanel);
		vegetableJPanel.setLayout(null);

//field
		JPanel fieldJPanel = new JPanel();
		fieldJPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		fieldJPanel.setBounds(25, 92, 598, 233);
		frame.getContentPane().add(fieldJPanel);
		fieldJPanel.setLayout(null);

//broccoli
		JLabel broccoliJLabel = new JLabel();
		broccoliJLabel.setBounds(10, 26, 75, 79);
		broccoliJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/Broccoli.jpg")));

		JLabel broccoliquantityJLabel = new JLabel("Quantity: ");
		broccoliquantityJLabel.setVerticalAlignment(SwingConstants.TOP);
		broccoliquantityJLabel.setBounds(91, 29, 110, 16);
		broccoliquantityJLabel.setHorizontalAlignment(SwingConstants.LEFT);
		fieldJPanel.add(broccoliquantityJLabel);
		fieldJPanel.add(broccoliJLabel);

		JLabel broccoliGrowSpeedJLabel = new JLabel("GrowSpeed:");
		broccoliGrowSpeedJLabel.setVerticalAlignment(SwingConstants.TOP);
		broccoliGrowSpeedJLabel.setBounds(91, 57, 110, 16);
		fieldJPanel.add(broccoliGrowSpeedJLabel);

		JLabel broccoliLefttimeJLabel = new JLabel("HarvesTime: ");
		broccoliLefttimeJLabel.setBounds(91, 85, 116, 16);
		fieldJPanel.add(broccoliLefttimeJLabel);

		broccoli.setBuyPriceBroccoli(broccoli.getBuyPriceBroccoli() * farmer.getDiscount());
		broccoli.setSpeedBroccoli(broccoli.getSpeedBroccoli() * farmer.getSpeed());
		JButton broccoliButton = new JButton("Broccoli $" + df1.format(broccoli.getBuyPriceBroccoli()));
		broccoliButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - broccoli.getBuyPriceBroccoli() > 0 && broccoli.getFlagBroccoli() == true) {
					farmer.setBalance(farmer.getBalance() - broccoli.getBuyPriceBroccoli());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a broccoli, your balance is " + farmer.getBalance());
					broccoli.increaseBroccoliQuantity();
					broccoliquantityJLabel.setText("Quantity: " + broccoli.getSeedBroccoliQuantity());
					broccoliGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(broccoli.getSpeedBroccoli()));
					broccoliLefttimeJLabel.setText("HaverstTime :"
							+ harvestableTime(broccoli.getSpeedBroccoli(), broccoli.getMaturityBroccoli()));
				} if(broccoli.getFlagBroccoli() == false) {
					JOptionPane.showMessageDialog(frame, "You can not grow this crops while they are growing", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		broccoliButton.setBounds(6, 19, 117, 29);
		vegetableJPanel.add(broccoliButton);

//carrot
		JLabel carrotJLabel = new JLabel();
		carrotJLabel.setBounds(201, 17, 75, 88);
		carrotJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/carrot.jpg")));
		fieldJPanel.add(carrotJLabel);

		JLabel carrotquantityJLabel = new JLabel("Quantity: ");
		carrotquantityJLabel.setBounds(279, 27, 98, 21);
		fieldJPanel.add(carrotquantityJLabel);

		JLabel carrotGrowSpeedJLabel = new JLabel("GrowSpeed:");
		carrotGrowSpeedJLabel.setBounds(279, 57, 110, 16);
		fieldJPanel.add(carrotGrowSpeedJLabel);

		JLabel carrotLeftTimeJLabel = new JLabel("HarvesTime: ");
		carrotLeftTimeJLabel.setBounds(279, 85, 119, 16);
		fieldJPanel.add(carrotLeftTimeJLabel);

		carrot.setBuyPriceCarrot(carrot.getBuyPriceCarrot() * farmer.getDiscount());
		carrot.setSpeedCarrot(carrot.getSpeedCarrot() * farmer.getSpeed());
		JButton carrotButton = new JButton("Carrot $" + df1.format(carrot.getBuyPriceCarrot()));
		carrotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - carrot.getBuyPriceCarrot() > 0 && carrot.getFlagCarrot() == true) {
					farmer.setBalance(farmer.getBalance() - carrot.getBuyPriceCarrot());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a carrot, your balance is " + farmer.getBalance());
					carrot.increaseCarrotQuantity();
					carrotquantityJLabel.setText("Quantity: " + carrot.getSeedCarrotQuantity());
					carrotGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(carrot.getSpeedCarrot()));
					carrotLeftTimeJLabel.setText(
							"HaverstTime :" + harvestableTime(carrot.getSpeedCarrot(), carrot.getMaturityCarrot()));
				}if(carrot.getFlagCarrot() == false) {
					JOptionPane.showMessageDialog(frame, "You can not grow this crops while they are growing", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		carrotButton.setBounds(121, 19, 117, 29);
		vegetableJPanel.add(carrotButton);

//corn		
		JLabel cornJLabel = new JLabel();
		cornJLabel.setBounds(389, 17, 75, 88);
		cornJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/corn.jpg")));
		fieldJPanel.add(cornJLabel);

		JLabel cornquantityJLabel = new JLabel("Quantity: ");
		cornquantityJLabel.setBounds(473, 27, 98, 21);
		fieldJPanel.add(cornquantityJLabel);

		JLabel cornGrowSpeedJLabel = new JLabel("GrowSpeed:");
		cornGrowSpeedJLabel.setBounds(473, 60, 116, 16);
		fieldJPanel.add(cornGrowSpeedJLabel);

		JLabel cornLefttimeJLabel = new JLabel("HarvesTime: ");
		cornLefttimeJLabel.setBounds(473, 85, 125, 16);
		fieldJPanel.add(cornLefttimeJLabel);

		corn.setBuyPriceCorn(corn.getBuyPriceCorn() * farmer.getDiscount());
		corn.setSpeedCorn(corn.getSpeedCorn() * farmer.getSpeed());
		JButton cornButton = new JButton("Corn $" + df1.format(corn.getBuyPriceCorn()));
		cornButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - corn.getBuyPriceCorn() > 0 && corn.getFlagCorn() == true) {
					farmer.setBalance(farmer.getBalance() - corn.getBuyPriceCorn());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a corn, your balance is " + farmer.getBalance());
					corn.increaseCornQuantity();
					cornquantityJLabel.setText("Quantity: " + corn.getSeedCornQuantity());
					cornGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(corn.getSpeedCorn()));
					cornLefttimeJLabel
							.setText("HaverstTime :" + harvestableTime(corn.getSpeedCorn(), corn.getMaturityCorn()));
				} if(corn.getFlagCorn() == false) {
					JOptionPane.showMessageDialog(frame, "You can not grow this crops while they are growing", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		cornButton.setBounds(236, 19, 117, 29);
		vegetableJPanel.add(cornButton);

//rice
		JLabel riceJLabel = new JLabel();
		riceJLabel.setBounds(10, 133, 70, 79);
		riceJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/rice.jpg")));
		fieldJPanel.add(riceJLabel);

		JLabel ricequantityJLabel = new JLabel("Quantity: ");
		ricequantityJLabel.setBounds(91, 133, 98, 21);
		fieldJPanel.add(ricequantityJLabel);

		JLabel riceGrowSpeedJLabel = new JLabel("GrowSpeed:");
		riceGrowSpeedJLabel.setBounds(91, 160, 110, 16);
		fieldJPanel.add(riceGrowSpeedJLabel);

		JLabel riceLefttimeJLabel = new JLabel("HarvesTime: ");
		riceLefttimeJLabel.setBounds(91, 188, 110, 16);
		fieldJPanel.add(riceLefttimeJLabel);

		rice.setBuyPriceRice(rice.getBuyPriceRice() * farmer.getDiscount());
		rice.setSpeedRice(rice.getSpeedRice() * farmer.getSpeed());
		JButton riceButton = new JButton("Rice $" + df1.format(rice.getBuyPriceRice()));
		riceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - rice.getBuyPriceRice() > 0 && rice.getFlagRice() == true) {
					farmer.setBalance(farmer.getBalance() - rice.getBuyPriceRice());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a rice, your balance is " + farmer.getBalance());
					rice.increaseRiceQuantity();
					ricequantityJLabel.setText("Quantity: " + rice.getSeedRiceQuantity());
					riceGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(rice.getSpeedRice()));
					riceLefttimeJLabel
							.setText("HaverstTime :" + harvestableTime(rice.getSpeedRice(), rice.getMaturityRice()));
				} if(rice.getFlagRice() == false) {
					JOptionPane.showMessageDialog(frame, "You can not grow this crops while they are growing", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		riceButton.setBounds(6, 48, 117, 29);
		vegetableJPanel.add(riceButton);

//potato
		JLabel potatoJLabel = new JLabel();
		potatoJLabel.setBounds(201, 133, 75, 84);
		potatoJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/potato.jpg")));
		fieldJPanel.add(potatoJLabel);

		JLabel potatoquantityJLabel = new JLabel("Quantity: ");
		potatoquantityJLabel.setBounds(279, 131, 98, 21);
		fieldJPanel.add(potatoquantityJLabel);

		JLabel potatoGrowSpeedJLabel = new JLabel("GrowSpeed:");
		potatoGrowSpeedJLabel.setBounds(279, 160, 110, 16);
		fieldJPanel.add(potatoGrowSpeedJLabel);

		JLabel potatoLefttimeJLabel = new JLabel("HarvesTime: ");
		potatoLefttimeJLabel.setBounds(279, 188, 130, 16);
		fieldJPanel.add(potatoLefttimeJLabel);

		potato.setBuyPricePotato(potato.getBuyPricePotato() * farmer.getDiscount());
		potato.setSpeedPotato(potato.getSpeedPotato() * farmer.getSpeed());
		JButton potatoButton = new JButton("Potato $" + df1.format(potato.getBuyPricePotato()));
		potatoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - potato.getBuyPricePotato() > 0 && potato.getFlagPotato() == true) {
					farmer.setBalance(farmer.getBalance() - potato.getBuyPricePotato());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a potato, your balance is " + farmer.getBalance());
					potato.increasePotatoQuantity();
					potatoquantityJLabel.setText("Quantity: " + potato.getSeedPotatoQuantity());
					potatoGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(potato.getSpeedPotato()));
					potatoLefttimeJLabel.setText(
							"HaverstTime :" + harvestableTime(potato.getSpeedPotato(), potato.getMaturityPotato()));
				} if(potato.getFlagPotato() == false) {
					JOptionPane.showMessageDialog(frame, "You can not grow this crops while they are growing", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		potatoButton.setBounds(121, 48, 117, 29);
		vegetableJPanel.add(potatoButton);

//tomato
		JLabel tomatoJLabel = new JLabel();
		tomatoJLabel.setBounds(397, 133, 82, 79);
		tomatoJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/tomato.jpg")));
		fieldJPanel.add(tomatoJLabel);

		JLabel tomatoquantityJLabel = new JLabel("Quantity: ");
		tomatoquantityJLabel.setBounds(473, 133, 98, 16);
		fieldJPanel.add(tomatoquantityJLabel);

		JLabel tomatoGrowSpeedJLabel = new JLabel("GrowSpeed:");
		tomatoGrowSpeedJLabel.setBounds(473, 160, 119, 16);
		fieldJPanel.add(tomatoGrowSpeedJLabel);

		JLabel tomatoleftTimeJLabel = new JLabel("HarvesTime: ");
		tomatoleftTimeJLabel.setBounds(473, 188, 116, 16);
		fieldJPanel.add(tomatoleftTimeJLabel);

		tomato.setBuyPriceTomato(tomato.getBuyPriceTomato() * farmer.getDiscount());
		tomato.setSpeedTomato(tomato.getSpeedTomato() * farmer.getSpeed());
		JButton tomatoButton = new JButton("Tomato $" + df1.format(tomato.getBuyPriceTomato()));
		tomatoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - tomato.getBuyPriceTomato() > 0 && tomato.getFlagTomato() == true) {
					farmer.setBalance(farmer.getBalance() - tomato.getBuyPriceTomato());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a tomato, your balance is " + farmer.getBalance());
					tomato.increaseTomatoQuantity();
					tomatoquantityJLabel.setText("Quantity: " + tomato.getSeedTomatoQuantity());
					tomatoGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(tomato.getSpeedTomato()));
					tomatoleftTimeJLabel.setText(
							"HaverstTime :" + harvestableTime(tomato.getSpeedTomato(), tomato.getMaturityTomato()));
				} if(tomato.getFlagTomato() == false) {
					JOptionPane.showMessageDialog(frame, "You can not grow this crops while they are growing", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		tomatoButton.setBounds(236, 48, 117, 29);
		vegetableJPanel.add(tomatoButton);

		JLabel lblFood = new JLabel("Food: 0");
		lblFood.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblFood.setBounds(682, 588, 279, 16);
		frame.getContentPane().add(lblFood);

		JButton btnFood = new JButton("Food $10.0");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				food.setFoodQuantity(food.getFoodQuantity() + 1);
				lblFood.setText("Food: " + food.getFoodQuantity());
				farmer.setBalance(farmer.getBalance() - 10);
				lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
			}
		});
		btnFood.setBounds(6, 82, 117, 29);
		vegetableJPanel.add(btnFood);

// actions with crops
		JLabel leftActionTimesJLabel = new JLabel("Left action times: " + buttonTimes);
		leftActionTimesJLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		leftActionTimesJLabel.setBounds(682, 509, 317, 16);
		frame.getContentPane().add(leftActionTimesJLabel);

		JButton harvestTheCropJButton = new JButton("Harvest the crops");
		harvestTheCropJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (broccoli.getSeedBroccoliQuantity() != 0 || carrot.getSeedCarrotQuantity() != 0
						|| corn.getSeedCornQuantity() != 0 || potato.getSeedPotatoQuantity() != 0
						|| rice.getSeedRiceQuantity() != 0 || tomato.getSeedTomatoQuantity() != 0) {
					if (buttonTimes > 0) {
						double money = harvestThecrops();
						if (buttonTimes >= 0) {

							leftActionTimesJLabel.setText("Left action times: " + (buttonTimes - 1));
						}
						if (harvestableTime(broccoli.getSpeedBroccoli(), broccoli.getMaturityBroccoli()) == 0) {
							broccoliquantityJLabel.setText("Quantity: ");
							broccoliGrowSpeedJLabel.setText("GrowSpeed: ");
							broccoliLefttimeJLabel.setText("HaverstTime :");
						}
						if (harvestableTime(carrot.getSpeedCarrot(), carrot.getMaturityCarrot()) == 0) {
							carrotquantityJLabel.setText("Quantity: ");
							carrotGrowSpeedJLabel.setText("GrowSpeed: ");
							carrotLeftTimeJLabel.setText("HaverstTime :");
						}
						if (harvestableTime(corn.getSpeedCorn(), corn.getMaturityCorn()) == 0) {
							cornquantityJLabel.setText("Quantity: ");
							cornGrowSpeedJLabel.setText("GrowSpeed: ");
							cornLefttimeJLabel.setText("HaverstTime :");
						}
						if (harvestableTime(potato.getSpeedPotato(), potato.getMaturityPotato()) == 0) {
							potatoquantityJLabel.setText("Quantity: ");
							potatoGrowSpeedJLabel.setText("GrowSpeed: ");
							potatoLefttimeJLabel.setText("HaverstTime :");
						}
						if (harvestableTime(rice.getSpeedRice(), rice.getMaturityRice()) == 0) {
							ricequantityJLabel.setText("Quantity: ");
							riceGrowSpeedJLabel.setText("GrowSpeed: ");
							riceLefttimeJLabel.setText("HaverstTime :");
						}
						if (harvestableTime(tomato.getSpeedTomato(), tomato.getMaturityTomato()) == 0) {
							tomatoquantityJLabel.setText("Quantity: ");
							tomatoGrowSpeedJLabel.setText("GrowSpeed: ");
							tomatoleftTimeJLabel.setText("HaverstTime :");
						}
						JOptionPane.showMessageDialog(frame, "You got $" + money + " in harvesting", "",
								JOptionPane.WARNING_MESSAGE);
						buttonTimes--;
					}

				}

			}
		});
		harvestTheCropJButton.setBounds(351, 380, 155, 29);
		frame.getContentPane().add(harvestTheCropJButton);

		JButton waterCropsJButton = new JButton("Water the crops");
		waterCropsJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (broccoli.getSeedBroccoliQuantity() != 0 || carrot.getSeedCarrotQuantity() != 0
						|| corn.getSeedCornQuantity() != 0 || potato.getSeedPotatoQuantity() != 0
						|| rice.getSeedRiceQuantity() != 0 || tomato.getSeedTomatoQuantity() != 0) {
					if (buttonTimes > 0 && kettle.getKettleQuantity() > 0) {
						String msg = mainActions.watering(broccoli, carrot, corn, potato, rice, tomato, kettle);
						JOptionPane.showMessageDialog(frame, msg, "", JOptionPane.WARNING_MESSAGE);
						if (buttonTimes >= 0) {
							leftActionTimesJLabel.setText("Left action times: " + (buttonTimes - 1));
						}
						if (broccoli.getSeedBroccoliQuantity() > 0) {
							broccoliGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(broccoli.getSpeedBroccoli()));
							broccoliLefttimeJLabel.setText("HaverstTime :"
									+ harvestableTime(broccoli.getSpeedBroccoli(), broccoli.getMaturityBroccoli()));
						}
						if (carrot.getSeedCarrotQuantity() > 0) {
							carrotGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(carrot.getSpeedCarrot()));
							carrotLeftTimeJLabel.setText("HaverstTime :"
									+ harvestableTime(carrot.getSpeedCarrot(), carrot.getMaturityCarrot()));
						}
						if (corn.getSeedCornQuantity() > 0) {
							cornGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(corn.getSpeedCorn()));
							cornLefttimeJLabel.setText(
									"HaverstTime :" + harvestableTime(corn.getSpeedCorn(), corn.getMaturityCorn()));
						}
						if (potato.getSeedPotatoQuantity() > 0) {
							potatoGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(potato.getSpeedPotato()));
							potatoLefttimeJLabel.setText("HaverstTime :"
									+ harvestableTime(potato.getSpeedPotato(), potato.getMaturityPotato()));
						}
						if (rice.getSeedRiceQuantity() > 0) {
							riceGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(rice.getSpeedRice()));
							riceLefttimeJLabel.setText(
									"HaverstTime :" + harvestableTime(rice.getSpeedRice(), rice.getMaturityRice()));
						}
						if (tomato.getSeedTomatoQuantity() > 0) {
							tomatoGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(tomato.getSpeedTomato()));
							tomatoleftTimeJLabel.setText("HaverstTime :"
									+ harvestableTime(tomato.getSpeedTomato(), tomato.getMaturityTomato()));
						}
						buttonTimes--;
					} if (kettle.getKettleQuantity() <= 0) {
						JOptionPane.showMessageDialog(frame, "You do not have a kettle.", "", JOptionPane.WARNING_MESSAGE);
					}

				}
			}
		});
		waterCropsJButton.setBounds(108, 380, 168, 29);
		frame.getContentPane().add(waterCropsJButton);

// store animal
		JPanel animalJPanel = new JPanel();
		animalJPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		animalJPanel.setBounds(635, 222, 359, 59);
		frame.getContentPane().add(animalJPanel);
		animalJPanel.setLayout(null);

//farm
		JPanel farmJPanel = new JPanel();
		farmJPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		farmJPanel.setBounds(25, 438, 598, 116);
		frame.getContentPane().add(farmJPanel);
		farmJPanel.setLayout(null);
// --pig---
		JLabel pigJLabel = new JLabel("New label");
		pigJLabel.setBounds(6, 21, 66, 75);
		pigJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/pig.jpg")));
		farmJPanel.add(pigJLabel);

		JLabel pigquantityJLabel = new JLabel("Quantity:");
		pigquantityJLabel.setBounds(79, 28, 111, 16);
		farmJPanel.add(pigquantityJLabel);

		JLabel pigHappinessJLabel = new JLabel("Happiness: ");
		pigHappinessJLabel.setBounds(79, 50, 130, 16);
		farmJPanel.add(pigHappinessJLabel);

		JLabel pigSaturationJLabel = new JLabel("Saturation: ");
		pigSaturationJLabel.setBounds(79, 72, 112, 16);
		farmJPanel.add(pigSaturationJLabel);

		pig.setBuyPricePig(pig.getBuyPricePig() * farmer.getDiscount());
		pig.setHappyPig(pig.getHappyPig() * farmer.getHappiness());
		JButton pigButton = new JButton("Pig $" + df1.format(pig.getBuyPricePig()));
		pigButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - pig.getBuyPricePig() > 0) {
					farmer.setBalance(farmer.getBalance() - pig.getBuyPricePig());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a pig, your balance is " + farmer.getBalance());
					pig.increasePigQuantity();
					pigquantityJLabel.setText("Quantity: " + pig.getPigQuantity());
					pigHappinessJLabel.setText("Happyness: " + df1.format(pig.getHappyPig()));
					pigSaturationJLabel.setText("Saturation: " + df1.format(pig.getSaturationPig()));
				}
			}
		});
		pigButton.setBounds(6, 16, 117, 29);
		animalJPanel.add(pigButton);

//--cow--      
		JLabel cowJLabel = new JLabel("New label");
		cowJLabel.setBounds(202, 28, 74, 60);
		cowJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/cow.jpg")));
		farmJPanel.add(cowJLabel);

		JLabel cowQuantityJLabel = new JLabel("Quantity:");
		cowQuantityJLabel.setBounds(279, 28, 104, 16);
		farmJPanel.add(cowQuantityJLabel);

		JLabel cowHappinessJLabel = new JLabel("Happiness:");
		cowHappinessJLabel.setBounds(279, 50, 122, 16);
		farmJPanel.add(cowHappinessJLabel);

		JLabel cowSaturationJLabel = new JLabel("Saturation: ");
		cowSaturationJLabel.setBounds(279, 72, 122, 16);
		farmJPanel.add(cowSaturationJLabel);

		cow.setBuyPriceCow(cow.getBuyPriceCow() * farmer.getDiscount());
		cow.setHappyCow(cow.getHappyCow() * farmer.getHappiness());
		JButton cowButton = new JButton("Cow $" + df1.format(cow.getBuyPriceCow()));
		cowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - cow.getBuyPriceCow() > 0) {
					farmer.setBalance(farmer.getBalance() - cow.getBuyPriceCow());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a cow, your balance is " + farmer.getBalance());
					cow.increaseCowQuantity();
					cowQuantityJLabel.setText("Quantity: " + cow.getCowQuantity());
					cowHappinessJLabel.setText("Happyness: " + df1.format(cow.getHappyCow()));
					cowSaturationJLabel.setText("Saturation: " + df1.format(cow.getSaturationCow()));
				}
			}
		});
		cowButton.setBounds(120, 16, 117, 29);
		animalJPanel.add(cowButton);

//--sheep--      
		JLabel sheepJLabel = new JLabel("New label");
		sheepJLabel.setBounds(399, 28, 66, 60);
		sheepJLabel.setIcon(new ImageIcon(FarmMainScreen.class.getResource("/image/sheep.jpg")));
		farmJPanel.add(sheepJLabel);

		JLabel sheepQuantityJLabel = new JLabel("Quantity:");
		sheepQuantityJLabel.setBounds(477, 28, 104, 16);
		farmJPanel.add(sheepQuantityJLabel);

		JLabel sheepHappinessJLabel = new JLabel("Happiness:");
		sheepHappinessJLabel.setBounds(477, 50, 115, 16);
		farmJPanel.add(sheepHappinessJLabel);

		JLabel sheepSaturationJLabel = new JLabel("Saturation: ");
		sheepSaturationJLabel.setBounds(477, 72, 115, 16);
		farmJPanel.add(sheepSaturationJLabel);

		sheep.setBuyPriceSheep(sheep.getBuyPriceSheep() * farmer.getDiscount());
		sheep.setHappySheep(sheep.getHappySheep() * farmer.getHappiness());
		JButton sheepButton = new JButton("Sheep $" + df1.format(sheep.getBuyPriceSheep()));
		sheepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (farmer.getBalance() - sheep.getBuyPriceSheep() > 0) {
					farmer.setBalance(farmer.getBalance() - sheep.getBuyPriceSheep());
					lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
					System.out.println("You bought a sheep, your balance is " + farmer.getBalance());
					sheep.increaseSheepQuantity();
					sheepQuantityJLabel.setText("Quantity: " + sheep.getSheepQuantity());
					sheepHappinessJLabel.setText("Happyness: " + df1.format(sheep.getHappySheep()));
					sheepSaturationJLabel.setText("Saturation: " + df1.format(sheep.getSaturationSheep()));
				}
			}
		});
		sheepButton.setBounds(236, 16, 117, 29);
		animalJPanel.add(sheepButton);

//--actions with animals--
		JButton playWithAnimalsJButton = new JButton("Play with animals");
		playWithAnimalsJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pig.getPigQuantity() != 0 || cow.getCowQuantity() != 0 || sheep.getSheepQuantity() != 0) {
					if (buttonTimes > 0) {
						mainActions.playWithAnimals(pig, cow, sheep);
						if (buttonTimes >= 0) {
							leftActionTimesJLabel.setText("Left action times: " + (buttonTimes - 1));
						}
						if (pig.getPigQuantity() != 0) {
							pigHappinessJLabel.setText("Happiness: " + df1.format(pig.getHappyPig()));
						}
						if (cow.getCowQuantity() != 0) {
							cowHappinessJLabel.setText("Happiness: " + df1.format(cow.getHappyCow()));
						}
						if (sheep.getSheepQuantity() != 0) {
							sheepHappinessJLabel.setText("Happiness: " + df1.format(sheep.getHappySheep()));
						}
						buttonTimes--;
					}

				} else {
					JOptionPane.showMessageDialog(frame, "You do not have animals to play, Go but some animals",
							"message", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		playWithAnimalsJButton.setBounds(108, 607, 168, 29);
		frame.getContentPane().add(playWithAnimalsJButton);

		JButton feedAnimalsJButton = new JButton("Feed animals");
		feedAnimalsJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pig.getPigQuantity() != 0 || cow.getCowQuantity() != 0 || sheep.getSheepQuantity() != 0) {
					if (buttonTimes > 0) {
						if (food.getFoodQuantity() >= 3) {
							mainActions.feedAnimals(pig, cow, sheep, food);

							leftActionTimesJLabel.setText("Left action times: " + (buttonTimes - 1));

							if (pig.getPigQuantity() != 0) {
								pigSaturationJLabel.setText("Saturation: " + df1.format(pig.getSaturationPig()));
								lblFood.setText("Food: " + food.getFoodQuantity());
							}
							if (cow.getCowQuantity() != 0) {
								cowSaturationJLabel.setText("Saturation: " + df1.format(cow.getSaturationCow()));
								lblFood.setText("Food: " + food.getFoodQuantity());
							}
							if (sheep.getSheepQuantity() != 0) {
								sheepSaturationJLabel.setText("Saturation: " + df1.format(sheep.getSaturationSheep()));
								lblFood.setText("Food: " + food.getFoodQuantity());
							}
							buttonTimes--;
						} else {
							JOptionPane.showMessageDialog(frame, "You don't have enough food.\n it must be 3 at least.",
									"", JOptionPane.WARNING_MESSAGE);
						}

					}

				} else {
					JOptionPane.showMessageDialog(frame, "You do not have animals to feed, Go but some animals",
							"message", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		feedAnimalsJButton.setBounds(351, 607, 117, 29);
		frame.getContentPane().add(feedAnimalsJButton);

//store item
		JPanel itemJPanel = new JPanel();
		itemJPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		itemJPanel.setBounds(635, 318, 360, 91);
		frame.getContentPane().add(itemJPanel);
		itemJPanel.setLayout(null);

		JButton wrenchJButton = new JButton("Wrench $20");
		wrenchJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				farmer.setBalance(farmer.getBalance() - 20);
				lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
				fence.fixFence();
				JOptionPane.showMessageDialog(frame, "Your fence is fixed", "Congratulation!",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		wrenchJButton.setBounds(26, 20, 117, 29);
		itemJPanel.add(wrenchJButton);

		JLabel helpFixFenceJLabel = new JLabel("Help fix the fence!");
		helpFixFenceJLabel.setBounds(26, 50, 137, 29);
		itemJPanel.add(helpFixFenceJLabel);

		JButton kettleJButton = new JButton("Kettle $5");
		kettleJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				farmer.setBalance(farmer.getBalance() - 5);
				kettle.setKettleQuantity(1);
				lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
			}
		});
		kettleJButton.setBounds(207, 20, 117, 29);
		itemJPanel.add(kettleJButton);

		JLabel waterCropsJLabel = new JLabel("Water the crops");
		waterCropsJLabel.setBounds(217, 53, 109, 23);
		itemJPanel.add(waterCropsJLabel);

		lblBalance = new JLabel("Balance: $" + farmer.getBalance());
		lblBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblBalance.setBounds(682, 548, 279, 16);
		frame.getContentPane().add(lblBalance);

		JLabel cleannessJLabel = new JLabel("Cleanness: " + farmer.getCleaness());
		cleannessJLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		cleannessJLabel.setBounds(682, 468, 253, 16);
		frame.getContentPane().add(cleannessJLabel);
		JLabel dayJLabel = new JLabel("Day 1");
		dayJLabel.setBounds(562, 46, 61, 16);
		frame.getContentPane().add(dayJLabel);

		JButton profileJButton = new JButton("Profile");
		profileJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launchProfileWindow();
			}
		});
		profileJButton.setBounds(868, 6, 117, 29);
		frame.getContentPane().add(profileJButton);

		JButton nextDayJButton = new JButton("Next Day");
		nextDayJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int i = Integer.parseInt(farmer.getDays());
				if (count < i) {
					farmer.setCleaness(farmer.getCleaness() - 10);
					buttonTimes = 2;
					leftActionTimesJLabel.setText("Left action times: " + buttonTimes);
					count++;
					dayJLabel.setText("Day " + count);
					if (cow.getCowQuantity() > 0) {
						cow.setSaturationCow(cow.getSaturationCow() + 0.2);
						cowSaturationJLabel.setText("Saturation: " + df1.format(cow.getSaturationCow()));
						if (cow.getSaturationCow() >= 1) {
							JOptionPane.showMessageDialog(frame, "Your cow died because of too hungry", "",
									JOptionPane.WARNING_MESSAGE);
							cow.setCowQuantity(0);
							cow.setHappyCow(0.5);
							cow.setSaturationCow(0.5);
							cowQuantityJLabel.setText("Quantity: ");
							cowHappinessJLabel.setText("Happyness: ");
							cowSaturationJLabel.setText("Saturation: ");
						}

					}
					if (pig.getPigQuantity() > 0) {
						pig.setSaturationPig(pig.getSaturationPig() + 0.2);
						pigSaturationJLabel.setText("Saturation: " + df1.format(pig.getSaturationPig()));
						if (pig.getSaturationPig() >= 1) {
							JOptionPane.showMessageDialog(frame, "Your pig died because of too hungry", "",
									JOptionPane.WARNING_MESSAGE);
							pig.setPigQuantity(0);
							pig.setHappyPig(0.5);
							pig.setSaturationPig(0.5);
							pigquantityJLabel.setText("Quantity: ");
							pigHappinessJLabel.setText("Happyness: ");
							pigSaturationJLabel.setText("Saturation: ");
						}

					}
					if (sheep.getSheepQuantity() > 0) {
						sheep.setSaturationSheep(sheep.getSaturationSheep() + 0.2);
						sheepSaturationJLabel.setText("Saturation: " + df1.format(sheep.getSaturationSheep()));
						if (sheep.getSaturationSheep() >= 1) {
							JOptionPane.showMessageDialog(frame, "Your sheep died because of too hungry", "",
									JOptionPane.WARNING_MESSAGE);
							sheep.setSheepQuantity(0);
							sheep.setHappySheep(0.5);
							sheep.setSaturationSheep(0.5);
							sheepQuantityJLabel.setText("Quantity: ");
							sheepHappinessJLabel.setText("Happyness: ");
							sheepSaturationJLabel.setText("Saturation: ");
						}

					}
					if (broccoli.getSeedBroccoliQuantity() > 0) {
						broccoli.setMaturityBroccoli(broccoli.getMaturityBroccoli() + broccoli.getSpeedBroccoli());
						broccoliquantityJLabel.setText("Quantity: " + broccoli.getSeedBroccoliQuantity());
						broccoliGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(broccoli.getSpeedBroccoli()));
						broccoliLefttimeJLabel.setText("HaverstTime :"
								+ harvestableTime(broccoli.getSpeedBroccoli(), broccoli.getMaturityBroccoli()));
					}

					if (carrot.getSeedCarrotQuantity() > 0) {
						carrot.setMaturityCarrot(carrot.getMaturityCarrot() + carrot.getSpeedCarrot());
						carrotquantityJLabel.setText("Quantity: " + carrot.getSeedCarrotQuantity());
						carrotGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(carrot.getSpeedCarrot()));
						carrotLeftTimeJLabel.setText(
								"HaverstTime :" + harvestableTime(carrot.getSpeedCarrot(), carrot.getMaturityCarrot()));
					}

					if (corn.getSeedCornQuantity() > 0) {
						corn.setMaturityCorn(corn.getMaturityCorn() + corn.getSpeedCorn());
						cornquantityJLabel.setText("Quantity: " + corn.getSeedCornQuantity());
						cornGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(corn.getSpeedCorn()));
						cornLefttimeJLabel.setText(
								"HaverstTime :" + harvestableTime(corn.getSpeedCorn(), corn.getMaturityCorn()));
					}

					if (potato.getSeedPotatoQuantity() > 0) {
						potato.setMaturityPotato(potato.getMaturityPotato() + potato.getSpeedPotato());
						potatoquantityJLabel.setText("Quantity: " + potato.getSeedPotatoQuantity());
						potatoGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(potato.getSpeedPotato()));
						potatoLefttimeJLabel.setText(
								"HaverstTime :" + harvestableTime(potato.getSpeedPotato(), potato.getMaturityPotato()));
					}

					if (rice.getSeedRiceQuantity() > 0) {
						rice.setMaturityRice(rice.getMaturityRice() + rice.getSpeedRice());
						ricequantityJLabel.setText("Quantity: " + rice.getSeedRiceQuantity());
						riceGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(rice.getSpeedRice()));
						riceLefttimeJLabel.setText(
								"HaverstTime :" + harvestableTime(rice.getSpeedRice(), rice.getMaturityRice()));
					}

					if (tomato.getSeedTomatoQuantity() > 0) {
						tomato.setMaturityTomato(tomato.getMaturityTomato() + tomato.getSpeedTomato());
						tomatoquantityJLabel.setText("Quantity: " + tomato.getSeedTomatoQuantity());
						tomatoGrowSpeedJLabel.setText("GrowSpeed: " + df1.format(tomato.getSpeedTomato()));
						tomatoleftTimeJLabel.setText(
								"HaverstTime :" + harvestableTime(tomato.getSpeedTomato(), tomato.getMaturityTomato()));
					}

					randomEvents.RandomEve(conference, fence, flood);
					if (flood.getHaveFlood() == true) {
						JOptionPane.showMessageDialog(frame, "You meeted flood, you will lose a crop", "",
								JOptionPane.WARNING_MESSAGE);
						String lostcrops = flood.lostCrops(broccoli, carrot, corn, potato, rice, tomato);
						if (lostcrops == "broccoli") {
							broccoliquantityJLabel.setText("Quantity: ");
							broccoliGrowSpeedJLabel.setText("GrowSpeed: ");
							broccoliLefttimeJLabel.setText("HaverstTime :");
						}
						if (lostcrops == "carrot") {
							carrotquantityJLabel.setText("Quantity: ");
							carrotGrowSpeedJLabel.setText("GrowSpeed: ");
							carrotLeftTimeJLabel.setText("HaverstTime :");
						}
						if (lostcrops == "corn") {
							cornquantityJLabel.setText("Quantity: ");
							cornGrowSpeedJLabel.setText("GrowSpeed: ");
							cornLefttimeJLabel.setText("HaverstTime :");
						}
						if (lostcrops == "potato") {
							potatoquantityJLabel.setText("Quantity: ");
							potatoGrowSpeedJLabel.setText("GrowSpeed: ");
							potatoLefttimeJLabel.setText("HaverstTime :");
						}
						if (lostcrops == "rice") {
							ricequantityJLabel.setText("Quantity: ");
							riceGrowSpeedJLabel.setText("GrowSpeed: ");
							riceLefttimeJLabel.setText("HaverstTime :");
						}
						if (lostcrops == "tomato") {
							tomatoquantityJLabel.setText("Quantity: ");
							tomatoGrowSpeedJLabel.setText("GrowSpeed: ");
							tomatoleftTimeJLabel.setText("HaverstTime :");
						}
						flood.setHaveFlood(false);
					}
					if (fence.getFenceBroken() == true) {
						JOptionPane.showMessageDialog(frame, "Your animal escaped , please buy a wrench fix your fence",
								"", JOptionPane.WARNING_MESSAGE);
						String lostanimal = fence.lostAnimal(cow, pig, sheep);
						if (lostanimal == "cow") {
							cowQuantityJLabel.setText("Quantity: ");
							cowHappinessJLabel.setText("Happiness: ");
							cowSaturationJLabel.setText("Saturation: ");
						}
						if (lostanimal == "pig") {
							pigquantityJLabel.setText("Quantity: ");
							pigHappinessJLabel.setText("Happiness: ");
							pigSaturationJLabel.setText("Saturation: ");
						}
						if (lostanimal == "Sheep") {
							sheepQuantityJLabel.setText("Quantity: ");
							sheepHappinessJLabel.setText("Happiness: ");
							sheepSaturationJLabel.setText("Saturation: ");
						}
					}
					if (conference.getMeeted() == true) {
						farmer.setBalance(farmer.getBalance() + conference.award(cow, pig, sheep, farmer));
						lblBalance.setText("Balance: $" + String.valueOf(farmer.getBalance()));
						JOptionPane.showMessageDialog(frame,
								"You got " + conference.award(cow, pig, sheep, farmer) + "awards", "",
								JOptionPane.WARNING_MESSAGE);
						conference.setMeeted(false);
					}
					if (broccoli.getSeedBroccoliQuantity() > 0) {
						broccoli.setFlagBroccoli(false);
					}
					if (carrot.getSeedCarrotQuantity() > 0) {
						carrot.setFlagCarrot(false);
					}
					if (corn.getSeedCornQuantity() > 0) {
						corn.setFlagCorn(false);
					}
					if (potato.getSeedPotatoQuantity() > 0) {
						potato.setFlagPotato(false);
					}
					if (rice.getSeedRiceQuantity() > 0) {
						rice.setFlagRice(false);
					}
					if (tomato.getSeedTomatoQuantity() > 0) {
						tomato.setFlagTomato(false);
					}
				}
				if (count == i) {
					lanuchGameoverWindow();
				}

			}
		});
		nextDayJButton.setBounds(882, 652, 117, 29);
		frame.getContentPane().add(nextDayJButton);

		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnQuit.setBounds(882, 693, 117, 29);
		frame.getContentPane().add(btnQuit);

		JButton btnClean = new JButton("Clean");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonTimes > 0) {
					mainActions.Clean(farmer);
					leftActionTimesJLabel.setText("Left action times: " + (buttonTimes - 1));
					cleannessJLabel.setText("Cleanness: " + farmer.getCleaness());
					buttonTimes--;
				}
			}
		});
		btnClean.setBounds(868, 461, 89, 23);
		frame.getContentPane().add(btnClean);

	}
}

