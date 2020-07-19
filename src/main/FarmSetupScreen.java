package main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;

/**
 * Run the program from this class
 * 
 * @author Yaxian Yu (25468326)
 * @author Jiaqi Li (75766881)
 * 
 * 24/May/2020
 */
public class FarmSetupScreen {

    private JFrame frmFarmSetupScreen;
    /**
     * Famrer's name
     */
    private JTextField txtName;
    
    /**
     * Farm's name
     */
    private JTextField txtFarmName;
    
    /**
     * How many days the farmer wants to play
     */
    private JTextField txtDays;
    
    /**
     * Farmer's age
     */
    private JTextField txtAge;
    private FarmManager farmer;
    private double selectedType;

    
    
    /**
     * @param incomingfarmer a object of Farmmanager
     */
    public FarmSetupScreen(FarmManager incomingfarmer) {
        farmer = incomingfarmer;
        initialize();
        frmFarmSetupScreen.setVisible(true);
    }

    /**
     * @return the farmer's name
     */
    public String getFarmerName() {
        return txtName.getText();
    }

    /**
     * @return the farm's name
     */
    public String getFarmName() {
        return txtFarmName.getText();
    }
    
    /**
     * @return days the farmer chose to play
     */
    public String getDays() {
    	return txtDays.getText();
    }
    
    /**
     * @return farmer's age
     */
    public String getAge() {
    	return txtAge.getText();
    }
    
    /**
     * @return the type the farmer chose
     */
    public double getSelectedType() {
        return selectedType;
    }

    /**
     * @param newSelectedType the player click those buttons to 
     * find the type he wants.
     */
    public void setSelectedType(double newSelectedType) {
        selectedType = newSelectedType;
    }

    /**
     * close the setupScreen
     */
    public void closeWindow() {
        frmFarmSetupScreen.dispose();
    }

    /**
     * farmer close the setupScreen and get the selected type from it
     */
    public void finishedWindow()
    {
        farmer.closeSetupScreen(this, getSelectedType());
    }
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FarmSetupScreen window = new FarmSetupScreen();
                    window.frmFarmSetupScreen.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public FarmSetupScreen() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmFarmSetupScreen = new JFrame();
        frmFarmSetupScreen.setTitle("Farm Setup Screen");
        frmFarmSetupScreen.setBounds(100, 100, 820, 560);
        frmFarmSetupScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmFarmSetupScreen.getContentPane().setLayout(null);
        
        JLabel lblWelcome = new JLabel("Welcome to Farm Simulator!");
        lblWelcome.setBounds(40, 34, 213, 16);
        frmFarmSetupScreen.getContentPane().add(lblWelcome);
        
        JLabel lblAskName = new JLabel("What is your name?");
        lblAskName.setBounds(40, 62, 155, 16);
        frmFarmSetupScreen.getContentPane().add(lblAskName);
        
        txtName = new JTextField();
        txtName.setBounds(383, 57, 130, 26);
        frmFarmSetupScreen.getContentPane().add(txtName);
        txtName.setColumns(10);
        
        JLabel lblAskAge = new JLabel("How old are you?");
        lblAskAge.setBounds(40, 90, 155, 16);
        frmFarmSetupScreen.getContentPane().add(lblAskAge);
        
        txtAge = new JTextField();
        txtAge.setBounds(383, 85, 130, 26);
        frmFarmSetupScreen.getContentPane().add(txtAge);
        txtAge.setColumns(10);
        
        JLabel lblAskFarmName = new JLabel("What is your farm's name?");
        lblAskFarmName.setBounds(40, 118, 183, 16);
        frmFarmSetupScreen.getContentPane().add(lblAskFarmName);
        
        txtFarmName = new JTextField();
        txtFarmName.setBounds(383, 113, 130, 26);
        frmFarmSetupScreen.getContentPane().add(txtFarmName);
        txtFarmName.setColumns(10);
        
        JLabel lblAskDays = new JLabel("How many days do you want to paly?(5-10)");
        lblAskDays.setBounds(36, 146, 293, 16);
        frmFarmSetupScreen.getContentPane().add(lblAskDays);
        
        
        
        txtDays = new JTextField();
        txtDays.setBounds(383, 141, 130, 26);
        frmFarmSetupScreen.getContentPane().add(txtDays);
        txtDays.setColumns(10);        

//--------------------------
        JLabel lblChooseType = new JLabel("Which type of farm do you want to choose?");
        lblChooseType.setBounds(40, 176, 339, 16);
        frmFarmSetupScreen.getContentPane().add(lblChooseType);
        
        JButton btnSelectedType = new JButton("");
        btnSelectedType.setBounds(28, 417, 305, 29);
        frmFarmSetupScreen.getContentPane().add(btnSelectedType);
//type
        JButton btnFirstType = new JButton("1.More Money(balance*1.5)");
        btnFirstType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setSelectedType(1500);
                btnSelectedType.setText("1.More Money(balance*1.5)");
                
            }
        });
        btnFirstType.setHorizontalAlignment(SwingConstants.LEFT);
        btnFirstType.setBounds(28, 204, 220, 29);
        frmFarmSetupScreen.getContentPane().add(btnFirstType);
        
        JButton btnSecondType = new JButton("2.Faster Crop Growing Speed(Speed*1.3)");
        btnSecondType.setHorizontalAlignment(SwingConstants.LEFT);
        btnSecondType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setSelectedType(1.3);
                btnSelectedType.setText("2.Faster Crop Growing Speed(Speed*1.3)");
            }
        });
        btnSecondType.setBounds(28, 245, 301, 29);
        frmFarmSetupScreen.getContentPane().add(btnSecondType);
        
        JButton thirdTypeButton = new JButton("3.More Animal happiness(*1.2) ");
        thirdTypeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setSelectedType(1.2);
                btnSelectedType.setText("3.More Animal happiness(*1.2) ");
            }
        });
        thirdTypeButton.setHorizontalAlignment(SwingConstants.LEFT);
        thirdTypeButton.setBounds(28, 286, 242, 29);
        frmFarmSetupScreen.getContentPane().add(thirdTypeButton);
        
        JButton btnFourthType = new JButton("4.Goverment Support (Shopping 30% Off)");
        btnFourthType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setSelectedType(0.7);
                btnSelectedType.setText("4.Goverment Support (Shopping 30% Off)");
            }
        });
        btnFourthType.setBounds(28, 327, 305, 29);
        frmFarmSetupScreen.getContentPane().add(btnFourthType);
        
        JLabel lblSelected = new JLabel("Selected:");
        lblSelected.setBounds(40, 389, 61, 16);
        frmFarmSetupScreen.getContentPane().add(lblSelected);
        
        JLabel lblWarningName = new JLabel("");
        lblWarningName.setForeground(Color.RED);
        lblWarningName.setBounds(512, 62, 322, 29);
        frmFarmSetupScreen.getContentPane().add(lblWarningName);
        
        JLabel lblWarningDays = new JLabel("");
        lblWarningDays.setForeground(Color.RED);
        lblWarningDays.setBounds(523, 146, 291, 16);
        frmFarmSetupScreen.getContentPane().add(lblWarningDays);
        
        JLabel lblWarningAge = new JLabel("");
        lblWarningAge.setForeground(Color.RED);
        lblWarningAge.setBounds(525, 90, 289, 16);
        frmFarmSetupScreen.getContentPane().add(lblWarningAge);
        

        JButton acceptButton = new JButton("Accept");
        acceptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(txtName.getText().length() == 0 || txtAge.getText().length() == 0 || txtDays.getText().length() == 0 || txtFarmName.getText().length() == 0 || selectedType == 0) {
            		JOptionPane.showMessageDialog(frmFarmSetupScreen, "Please fill all the txtfield", "Message", JOptionPane.WARNING_MESSAGE);
            	} 
            	else {
                	int i = Integer.parseInt(txtDays.getText());
                	boolean allLetters = txtName.getText().matches("[a-zA-Z]+");
            		if (txtName.getText().length() > 15 || txtName.getText().length() < 3) { 
            			System.out.println(allLetters);
            			if(allLetters == false) {
            				if (i > 10 || i < 5){
                				lblWarningName.setText("3-15 characters, no numbers/special characters");
                        		lblWarningDays.setText("5-10 days only");
                        	} else {
                        		lblWarningName.setText("3-15 characters, no numbers/special characters");
                        		lblWarningDays.setText("");
                        	}    
            			} else {
            				if (i > 10 || i < 5){
                				lblWarningName.setText("3-15 characters");
                        		lblWarningDays.setText("5-10 days only");
                        	} else {
                        		lblWarningName.setText("3-15 characters");
                        		lblWarningDays.setText("");
                        	}  
            			}
       
                	} else {
                		if(allLetters == false) {
                			if (i > 10 || i < 5){
                				lblWarningName.setText("No numbers/special characters");
                        		lblWarningDays.setText("5-10 days only");
                        	} else {
                				System.out.println(allLetters);
                        		lblWarningName.setText("No numbers/special characters");
                        		lblWarningDays.setText("");
                        	}      
                		} else {
                			if (i > 10 || i < 5){
                				lblWarningName.setText("");
                        		lblWarningDays.setText("5-10 days only");
                        	} else {
                        	
                        		lblWarningName.setText("");
                        		lblWarningDays.setText("");
                        		finishedWindow();
                        	}      
                		}
                		         		
                	}      
            	}
            }
        });
        acceptButton.setBounds(602, 417, 117, 29);
        frmFarmSetupScreen.getContentPane().add(acceptButton);
        
    }
}



