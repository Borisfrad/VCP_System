package gui;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.util.Vector;

	public class VcpMainFrame extends JFrame {

		private UserGUI loginPanel;
		private JPanel FirstPanel = null;
		private JButton StudentsButton = null;

		/**
		 * This method initializes StudentsButton	
		 */
		private JButton getStudentsButton() {
			if (StudentsButton == null) {
				StudentsButton = new JButton();
				StudentsButton.setBounds(new Rectangle(45, 43, 172, 29));
				StudentsButton.setText("Student info");
				StudentsButton.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						System.out.println("actionPerformed()"); 
						setContentPane(sf);
					}
				});
			}
			return StudentsButton;
		}
		
		/**
		 * This is the default constructor
		 */
		public VcpMainFrame() {
			super();
			initialize();
		}

		/**
		 * This method initializes VcpMainFrame 
		 */
		private void initialize() {
			this.setSize(300, 230);
			this.setContentPane(getFirstPanel());
			this.setTitle("Academic Managment Tool");
			this.sf=new StudentForm();
		}

		/**
		 * This method initializes FirstPanel
		 */
		public JPanel getFirstPanel() {
			if (FirstPanel == null) {
				FirstPanel = new JPanel();
				FirstPanel.setLayout(null);
				FirstPanel.add(getStudentsButton(), null);
			}
			return FirstPanel; 
		}

}
