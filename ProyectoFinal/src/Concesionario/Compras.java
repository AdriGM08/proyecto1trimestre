package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compras {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras window = new Compras();
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
	public Compras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 685, 439);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Index", null, layeredPane, null);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(null);
			}
		});
		btnNewButton.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnNewButton.setBounds(10, 360, 115, 40);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Compras");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 165, 40);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ALTA: Dar de alta a nuevos proveedores");
		lblNewLabel_1.setBounds(10, 62, 387, 34);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BAJA: Eliminar proveedores");
		lblNewLabel_2.setBounds(10, 107, 365, 34);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONSULTAR: Muestra todos los proveedores");
		lblNewLabel_3.setBounds(10, 152, 381, 34);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ACTUALIZAR: Modifica los proveedores");
		lblNewLabel_4.setBounds(10, 197, 403, 34);
		layeredPane.add(lblNewLabel_4);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Alta", null, tabbedPane_1, null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Baja", null, layeredPane_1, null);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("Consultar", null, layeredPane_3, null);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Actualizar", null, layeredPane_2, null);
	}
}
