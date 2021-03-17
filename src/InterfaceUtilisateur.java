import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class InterfaceUtilisateur {

	private JFrame frame;
	private JTextField textFieldAddTask;

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
		frame.setBounds(100, 100, 507, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setTitle("To Do List");
		JPanel panel = new JPanel();
		panel.setBounds(54, 0, 387, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnAddTask = new JButton("Ajouter une t\u00E2che");
		btnAddTask.setMargin(new Insets(0, 0, 0, 0));
		btnAddTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!textFieldAddTask.getText().equals(""))
				{
					JCheckBox c1 = new JCheckBox(textFieldAddTask.getText());
					panel.add(c1);
					textFieldAddTask.setText("");
					frame.revalidate();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Vous n'avez pas saisi de tâche à accomplir !");
				}
				
			}
		});
		btnAddTask.setBounds(221, 277, 108, 23);
		frame.getContentPane().add(btnAddTask);
		
		textFieldAddTask = new JTextField();
		textFieldAddTask.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAddTask.setBounds(10, 278, 189, 20);
		frame.getContentPane().add(textFieldAddTask);
		textFieldAddTask.setColumns(10);
		
		JButton btnClear = new JButton("Retirer t\u00E2ches finies");
		btnClear.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				for (Component panelComponent : panel.getComponents())
				{
					JCheckBox checkBox = (JCheckBox)panelComponent;
					
					if (checkBox.isSelected())
					{
						System.out.println(checkBox.getLabel());
						panel.remove(checkBox);
						panel.revalidate();
						panel.repaint();
					}
					
				}
				
				//System.out.println("Tester");
			}
		});
		btnClear.setMargin(new Insets(0, 0, 0, 0));
		btnClear.setBounds(339, 277, 128, 23);
		frame.getContentPane().add(btnClear);
		
		
		
		
		
		
		
		
	}
}
