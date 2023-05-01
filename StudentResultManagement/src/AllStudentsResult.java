import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




import javax.swing.JScrollPane;

public class AllStudentsResult {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllStudentsResult window = new AllStudentsResult();
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
	public AllStudentsResult() {
		initialize();
		frame.setVisible(true);
		frame.setVisible(true);
		frame.setVisible(true);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 214, 469);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton addNewStudentsbtnNewButton = new JButton("Add New Students");
		addNewStudentsbtnNewButton.setBounds(57, 94, 89, 23);
		panel.add(addNewStudentsbtnNewButton);
		addNewStudentsbtnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        frame.dispose();
		    }
		});
		
		JButton insertNewResultbtnNewButton_1 = new JButton("Insert New Result");
		insertNewResultbtnNewButton_1.setBounds(57, 161, 89, 23);
		panel.add(insertNewResultbtnNewButton_1);
		insertNewResultbtnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        frame.dispose();
		    }
		});
		
		JButton btnNewButton_2 = new JButton("Registered Students");
		btnNewButton_2.setBounds(57, 238, 89, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		       
		        frame.dispose();
		    }
		});
		
		JButton allStudentsResultbtn = new JButton("All Students Result");
		allStudentsResultbtn.setForeground(new Color(255, 0, 0));
		allStudentsResultbtn.setBounds(57, 316, 89, 23);
		panel.add(allStudentsResultbtn);
		
		
		JButton logoutbtnNewButton_4 = new JButton("Logout");
		logoutbtnNewButton_4.setBounds(57, 391, 89, 23);
		panel.add(logoutbtnNewButton_4);
		logoutbtnNewButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        frame.dispose();
		    }
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 0, 294, 469);
		frame.getContentPane().add(scrollPane);
	
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
	}
}