package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/**
 * This screen is viewing the farmer's profile
 * 
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class ProfileScreen {

	private JFrame frmYourProfile;
	private FarmManager farmer;

	/**
	 * Launch the application.
	 * 
	 *
	 * @param incomingfarmer object of farmmanager
	 */
	public ProfileScreen(FarmManager incomingfarmer) {
		farmer = incomingfarmer;
		initialize();
		frmYourProfile.setVisible(true);
	}

	/**
	 * close the profile window
	 */
	public void closeWindow() {
		frmYourProfile.dispose();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileScreen window = new ProfileScreen();
					window.frmYourProfile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfileScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmYourProfile = new JFrame();
		frmYourProfile.setTitle("Your profile");
		frmYourProfile.setBounds(100, 100, 384, 283);
		frmYourProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmYourProfile.getContentPane().setLayout(null);

		JLabel nameJLable = new JLabel("Name: " + farmer.getName());
		nameJLable.setBounds(33, 47, 205, 16);
		frmYourProfile.getContentPane().add(nameJLable);

		JLabel ageJLable = new JLabel("Age: " + farmer.getAge());
		ageJLable.setBounds(33, 74, 228, 16);
		frmYourProfile.getContentPane().add(ageJLable);

		JLabel farmNameJLable = new JLabel("Farm Name: " + farmer.getFarmName());
		farmNameJLable.setBounds(33, 102, 207, 16);
		frmYourProfile.getContentPane().add(farmNameJLable);

		JLabel daysJLable = new JLabel("Days: " + farmer.getDays());
		daysJLable.setBounds(33, 129, 228, 16);
		frmYourProfile.getContentPane().add(daysJLable);

		JButton okJButton = new JButton("OK");
		okJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
			}
		});
		okJButton.setBounds(261, 208, 117, 29);
		frmYourProfile.getContentPane().add(okJButton);

		JLabel farmerPhotoJLable = new JLabel("");
		farmerPhotoJLable.setIcon(new ImageIcon(ProfileScreen.class.getResource("/image/farmer.jpg")));
		farmerPhotoJLable.setBounds(239, 6, 184, 186);
		frmYourProfile.getContentPane().add(farmerPhotoJLable);
	}

}


