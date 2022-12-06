package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	int xMouse;
	int yMouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setLocationRelativeTo(null);
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
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\LOGOCONCESIONARIO.png"));
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 701, 38);
		panel.setBackground(new Color(0, 204, 204));
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				this.setLocation(x - xMouse, y - yMouse);
			}

			private void setLocation(int i, int j) {
				// TODO Auto-generated method stub

			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Concesionario LPM");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_6.setBounds(228, 402, 473, 76);
		contentPane.add(lblNewLabel_6);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(204, 0, 0));
		panel_1.setBounds(657, 0, 44, 38);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(Color.red);
				lblNewLabel.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(Color.red);
				lblNewLabel.setForeground(Color.white);
			}
		});
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(0, 0, 44, 38);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("img\\LOGOCONCESIONARIO.png"));
		lblNewLabel_4.setBounds(0, 5, 44, 33);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("INICIO");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		lblNewLabel_5.setBounds(50, 0, 162, 38);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente.main(null);
			}
		});
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnNewButton.setBounds(30, 370, 140, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Opciones:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		lblNewLabel_1.setBounds(30, 100, 86, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Almacén");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Almacen.main(null);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnNewButton_1.setBounds(30, 256, 140, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ventas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas.main(null);
			}
		});
		btnNewButton_2.setBackground(new Color(153, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnNewButton_2.setBounds(30, 313, 140, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Compras");
		btnNewButton_3.setBackground(new Color(153, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compras.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnNewButton_3.setBounds(30, 199, 140, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Proveedores");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proveedor.main(null);
				
			}
		});
		btnNewButton_4.setBackground(new Color(153, 0, 0));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btnNewButton_4.setBounds(30, 143, 140, 45);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("img\\911.jpeg"));
		lblNewLabel_2.setBounds(228, 38, 473, 440);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cocesionario LPM");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel_3.setBounds(30, 64, 202, 32);
		contentPane.add(lblNewLabel_3);
	}
}
