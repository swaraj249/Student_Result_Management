import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Index {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
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
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.setBounds(100, 100, 738, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\swara\\Downloads\\OIP (1).jpg"));
		lblNewLabel.setBounds(140, 45, 403, 287);
		frame.getContentPane().add(lblNewLabel);
		
		JButton studentbtn = new JButton("Student");
		studentbtn.setBackground(new Color(192, 192, 192));
		studentbtn.setBounds(150, 457, 89, 23);
		frame.getContentPane().add(studentbtn);
		
		
		JButton adminbtn1 = new JButton("Admin");
		adminbtn1.setBounds(454, 457, 89, 23);
		frame.getContentPane().add(adminbtn1);
		adminbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	                frame.dispose();
			}
		});
	}

	
	
	
		
}