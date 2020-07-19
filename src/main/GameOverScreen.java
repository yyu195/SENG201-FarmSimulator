package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * This class is for viewing the gameover information
 * 
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class GameOverScreen {

	private JFrame frmGameOver;
	private FarmManager farmer;
	double profit;

	
	/**
	 * @param incomingfarmer object of farmmanager
	 */
	public GameOverScreen(FarmManager incomingfarmer) {
		farmer = incomingfarmer;
		initialize();
		frmGameOver.setVisible(true);
	}

	/**
	 * Close the GameOverWindow
	 */
	public void closeWindow() {
		frmGameOver.dispose();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOverScreen window = new GameOverScreen();
					window.frmGameOver.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameOverScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameOver = new JFrame();
		frmGameOver.setTitle("Game Over");
		frmGameOver.setBounds(100, 100, 450, 300);
		frmGameOver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameOver.getContentPane().setLayout(null);

		JLabel nameJLable = new JLabel("Name: " + farmer.getName());
		nameJLable.setBounds(45, 56, 147, 16);
		frmGameOver.getContentPane().add(nameJLable);

		JLabel farmNameJLable = new JLabel("Farm's Name: " + farmer.getFarmName());
		farmNameJLable.setBounds(45, 84, 196, 16);
		frmGameOver.getContentPane().add(farmNameJLable);

		JLabel daysJLable = new JLabel("Days: " + farmer.getDays());
		daysJLable.setBounds(45, 112, 172, 16);
		frmGameOver.getContentPane().add(daysJLable);

		JLabel balanceJLable = new JLabel("Balance: " + farmer.getBalance());
		balanceJLable.setBounds(45, 143, 240, 16);
		frmGameOver.getContentPane().add(balanceJLable);

		if (farmer.getType() == 1500) {
			profit = (farmer.getBalance() - 1500);
		} else {
			profit = (farmer.getBalance() - 1000);
		}

		JLabel profitJLable = new JLabel("Profit: " + profit);
		profitJLable.setBounds(45, 171, 215, 16);
		frmGameOver.getContentPane().add(profitJLable);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
			}
		});
		btnNewButton.setBounds(296, 222, 117, 29);
		frmGameOver.getContentPane().add(btnNewButton);
	}

}

