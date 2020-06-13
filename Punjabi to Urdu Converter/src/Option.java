import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Option extends JFrame {

	private JPanel contentPane;
	private ButtonGroup rbgroup;
	public static Option frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Option();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Option() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Option.class.getResource("/img/logo with background.png")));
		setTitle("Gurmukhi to Shahmukhi Transliteration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel label_3 = new JLabel("");
		
		label_3.setBounds(35, 11, 116, 102);
		ImageIcon MyImage3 = new ImageIcon(Option.class.getResource("/img/eeeeeeeeeee.png"));
		Image img3= MyImage3.getImage();
		Image newimg3= img3.getScaledInstance(label_3.getWidth(), label_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image3=new ImageIcon(newimg3);
		label_3.setIcon(image3);
	
		contentPane.add(label_3);
		
		JLabel lblPunjabiToUrdu = new JLabel("Gurmukhi to Shahmukhi Transliteration\r\n");
		lblPunjabiToUrdu.setForeground(Color.DARK_GRAY);
		lblPunjabiToUrdu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lblPunjabiToUrdu.setBounds(171, 22, 631, 69);
		contentPane.add(lblPunjabiToUrdu);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(405, 127, 414, 276);
		ImageIcon MyImage4 = new ImageIcon(Option.class.getResource("/img/punjab-partitioncrop.png"));
		Image img4= MyImage4.getImage();
		Image newimg4= img4.getScaledInstance(label_4.getWidth(), label_4.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image4=new ImageIcon(newimg4);
		label_4.setIcon(image4);
	
		contentPane.add(label_4);
		
		JLabel lblChooseDesiredConversion = new JLabel("Choose desired transliteration:");
		lblChooseDesiredConversion.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblChooseDesiredConversion.setBounds(25, 147, 298, 34);
		contentPane.add(lblChooseDesiredConversion);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DRChatrikWeb  To  GIST-UROTNabeel",true);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBackground(SystemColor.menu);
		rdbtnNewRadioButton.setBounds(35, 188, 273, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Raavi  To  Urdu");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBackground(SystemColor.menu);
		rdbtnNewRadioButton_1.setBounds(35, 214, 224, 23);
	    contentPane.add(rdbtnNewRadioButton_1);
		
		rbgroup= new ButtonGroup();
    	rbgroup.add(rdbtnNewRadioButton);
    	rbgroup.add(rdbtnNewRadioButton_1);   
		rdbtnNewRadioButton.setActionCommand("1");
		rdbtnNewRadioButton_1.setActionCommand("2");
    	
		
		JLabel lblNote = new JLabel("* NOTE : For Raavi you have to select Punjabi keyboard. ");
		lblNote.setForeground(new Color(204, 51, 51));
		lblNote.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNote.setBounds(25, 280, 339, 34);
		contentPane.add(lblNote);
		
		JLabel lblInstallPunjabi = new JLabel("1. Install Punjabi keyboard");
		lblInstallPunjabi.setForeground(new Color(204, 51, 51));
		lblInstallPunjabi.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblInstallPunjabi.setBounds(68, 310, 230, 23);
		contentPane.add(lblInstallPunjabi);
		
		JLabel lblSelectPunjabi = new JLabel("2. Select Punjabi keyboard before input.");
		lblSelectPunjabi.setForeground(new Color(204, 51, 51));
		lblSelectPunjabi.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblSelectPunjabi.setBounds(68, 340, 273, 23);
		contentPane.add(lblSelectPunjabi);
	
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					nextActionPerformed(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBounds(new Rectangle(150, 245, 72, 29));
		contentPane.add(btnNewButton);
		
		
		JPanel label_2 = new JPanel();
		label_2.setBackground(SystemColor.menu);
		label_2.setBounds(10, 127, 385, 276);
		contentPane.add(label_2);
	
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 829, 119);
		ImageIcon MyImage1 = new ImageIcon(Option.class.getResource("/img/bgimages.jpg"));
		Image img1= MyImage1.getImage();
		Image newimg1= img1.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1=new ImageIcon(newimg1);
		label.setIcon(image1);
		
		contentPane.add(label);
		 
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 102, 829, 312);
		ImageIcon MyImage2 = new ImageIcon(Option.class.getResource("/img/Light-Grey-Background-Hd-5.jpg"));
		Image img2= MyImage2.getImage();
		Image newimg2= img2.getScaledInstance(label_1.getWidth(), label_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2=new ImageIcon(newimg2);
		label_1.setIcon(image2);
		contentPane.add(label_1);
	 
		
		
	}
	 
    public void nextActionPerformed(java.awt.event.ActionEvent ca) throws IOException
	{
    	String cmd = rbgroup.getSelection().getActionCommand();
    	if(cmd.equalsIgnoreCase("1"))
    	{
    		Main1 main1=new Main1();
    		main1.frame.setVisible(true);
    		frame.setVisible(false);
    	}
    	else if(cmd.equalsIgnoreCase("2"))
    	{
    		Main2 main2=new Main2();
       		main2.frame.setVisible(true);
    		frame.setVisible(false);
    	}
	}
}
