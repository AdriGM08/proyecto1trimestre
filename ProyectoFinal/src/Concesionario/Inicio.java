package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("\\ProyectoFinal\\img\\LOGOCONCESIONARIO.png"));
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton.setBounds(30, 104, 140, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Concesionario LPM");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 24, 237, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Opciones:");
		lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 67, 86, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Almacen");
		btnNewButton_1.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton_1.setBounds(30, 217, 140, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ventas");
		btnNewButton_2.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton_2.setBounds(30, 274, 140, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("compras");
		btnNewButton_3.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton_3.setBounds(30, 331, 140, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Proveedores");
		btnNewButton_4.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton_4.setBounds(30, 161, 140, 45);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("\\ProyectoFinal\\img\\911.jpeg"));
		lblNewLabel_2.setBounds(212, 0, 473, 439);
		contentPane.add(lblNewLabel_2);
	}
}
