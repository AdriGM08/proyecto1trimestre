package ProyectoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextField;

public class Login extends JFrame {

	int xMouse, yMouse;

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtIngreseSuNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

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

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 37, 400, 441);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mañana_posx\\Desktop\\login.jpg"));
		contentPane.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(400, 37, 301, 441);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Iniciar Sesión");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(0, 77, 301, 43);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("USUARIO");
		lblNewLabel_3.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setToolTipText("Ingrese su nombre de usuario");
		lblNewLabel_3.setBounds(21, 158, 258, 23);
		panel_2.add(lblNewLabel_3);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 204, 204));
		separator.setBounds(21, 213, 258, 2);
		panel_2.add(separator);

		JLabel lblNewLabel_3_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_3_1.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3_1.setBounds(21, 252, 258, 23);
		panel_2.add(lblNewLabel_3_1);

		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBorder(null);
		passwordField.setBounds(21, 278, 258, 20);
		panel_2.add(passwordField);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 204, 204));
		separator_1.setBounds(21, 298, 258, 2);
		panel_2.add(separator_1);

		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 204, 204));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 204, 204));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtIngreseSuNombre.getText();
				String password = passwordField.getText();
				if (usuario.equals("lpm") && password.equals("lpm")) {
					JOptionPane.showMessageDialog(null, "Iniciando Sesión");
					JFrame a = new JFrame();
					a.setBounds(100,100,1000,600);
					a.setVisible(true);
					a.setDefaultCloseOperation(EXIT_ON_CLOSE);
					JLabel fondo = new JLabel();
					JLabel bienvenida = new JLabel("Bienvenido");
					fondo.setBounds(0,0,1000,500);
					fondo.setIcon(new ImageIcon("C:\\Users\\Mañana_posx\\eclipse-workspace\\JFrame2\\src\\JFrame2\\img\\bienvenido.jpg"));
				}else {
				JOptionPane.showMessageDialog(null, "Error!! Contraseña o usuario incorrecto!!");
			}}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(51, 102, 153));
		btnNewButton.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setForeground(new Color(204, 0, 0));
		btnNewButton.setBounds(21, 334, 125, 33);
		panel_2.add(btnNewButton);
		
		txtIngreseSuNombre = new JTextField();
		txtIngreseSuNombre.setToolTipText("");
		txtIngreseSuNombre.setBorder(null);
		txtIngreseSuNombre.setBounds(21, 192, 258, 20);
		panel_2.add(txtIngreseSuNombre);
		txtIngreseSuNombre.setColumns(10);
	}
}
