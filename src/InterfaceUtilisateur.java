import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class InterfaceUtilisateur {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceUtilisateur window = new InterfaceUtilisateur();
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
	public InterfaceUtilisateur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(80, 0, 289, 218);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		//panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Ajouter une t\u00E2che");
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField newArea = new JTextField("test",0);
				newArea.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
				panel.add(newArea);
				frame.revalidate();
			}
		});
		btnNewButton.setBounds(169, 238, 117, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
	}
}
