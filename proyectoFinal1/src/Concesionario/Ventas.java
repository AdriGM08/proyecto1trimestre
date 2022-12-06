package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.UIManager;



public class Ventas extends JFrame {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table_3;
	private JTextField textField_13;
	private JTextField textField_13_2;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_1;
	int xMouse;
	int yMouse;

	  /**
	  * Launch the application.
	  */
	  public static void main(String[] args) {
	  EventQueue.invokeLater(new Runnable() {
	  public void run() {
	  try {
	  Ventas window = new Ventas();
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
	  public Ventas() {
	  initialize();
	  }

	  /**
	  * Initialize the contents of the frame.
	  */
	  private void initialize() {
	  frame = new JFrame();
	  frame.getContentPane().setBackground(new Color(128, 128, 128));
	  frame.setUndecorated(true);
	  frame.setForeground(Color.GREEN);
	  frame.setBounds(100, 100, 701, 478);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.getContentPane().setLayout(null);

	  JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	  tabbedPane.setBorder(null);
	  tabbedPane.setForeground(new Color(255, 255, 255));
	  tabbedPane.setBackground(new Color(0, 204, 204));
	  tabbedPane.setBounds(0, 38, 701, 440);
	  frame.getContentPane().add(tabbedPane);
	  
	  	  JLayeredPane layeredPane = new JLayeredPane();
	  	  layeredPane.setBackground(new Color(255, 255, 255));
	  	  tabbedPane.addTab("INDEX", null, layeredPane, null);
	  	  layeredPane.setOpaque(true);
	  	  
	  	  	  JLabel lblNewLabel = new JLabel("Ventas\r\n");
	  	  	  lblNewLabel.setForeground(new Color(0, 0, 0));
	  	  	  lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  	  	  lblNewLabel.setBounds(10, 11, 160, 67);
	  	  	  layeredPane.add(lblNewLabel);
	  	  	  
	  	  	  JButton btnNewButton_3 = new JButton("Volver al Inicio");
	  	  	  btnNewButton_3.setBackground(new Color(102, 51, 0));
	  	  	  btnNewButton_3.setForeground(new Color(255, 255, 255));
	  	  	  btnNewButton_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  btnNewButton_3.addActionListener(new ActionListener() {
	  	  	  	public void actionPerformed(ActionEvent e) {
	  	  	  		
	  	  	  		Inicio.main(null);
	  	  	  	}
	  	  	  });
	  	  	  btnNewButton_3.setBounds(10, 335, 170, 39);
	  	  	  layeredPane.add(btnNewButton_3);
	  	  	  
	  	  	  JLabel lblAltaDarDe = new JLabel("ALTA: Registar nuevas ventas");
	  	  	  lblAltaDarDe.setForeground(new Color(0, 0, 0));
	  	  	  lblAltaDarDe.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblAltaDarDe.setBounds(10, 89, 346, 45);
	  	  	  layeredPane.add(lblAltaDarDe);
	  	  	  
	  	  	  JLabel lblBajaEliminarProveedores = new JLabel("BAJA: Eliminar ventas");
	  	  	  lblBajaEliminarProveedores.setForeground(new Color(0, 0, 0));
	  	  	  lblBajaEliminarProveedores.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblBajaEliminarProveedores.setBounds(10, 147, 293, 45);
	  	  	  layeredPane.add(lblBajaEliminarProveedores);
	  	  	  
	  	  	  JLabel lblConsultarMuestraTodos = new JLabel("CONSULTAR: Muestra todas las ventas");
	  	  	  lblConsultarMuestraTodos.setForeground(new Color(0, 0, 0));
	  	  	  lblConsultarMuestraTodos.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblConsultarMuestraTodos.setBounds(10, 203, 373, 45);
	  	  	  layeredPane.add(lblConsultarMuestraTodos);
	  	  	  
	  	  	  JLabel lblActualizarModificaLos = new JLabel("ACTUALIZAR: Modifica las ventas");
	  	  	  lblActualizarModificaLos.setForeground(new Color(0, 0, 0));
	  	  	  lblActualizarModificaLos.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblActualizarModificaLos.setBounds(10, 259, 373, 45);
	  	  	  layeredPane.add(lblActualizarModificaLos);
	  	  	  
	  	  	  JLabel lblNewLabel_1 = new JLabel("");
	  	  	  lblNewLabel_1.setIcon(new ImageIcon("img\\inicioproveedor.jpg"));
	  	  	  lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  	  	  lblNewLabel_1.setBounds(331, 0, 365, 412);
	  	  	  layeredPane.add(lblNewLabel_1);

	  JLayeredPane layeredPane_1 = new JLayeredPane();
	  layeredPane_1.setForeground(new Color(255, 255, 255));
	  layeredPane_1.setBackground(new Color(255, 255, 255));
	  tabbedPane.addTab("ALTA", null, layeredPane_1, null);
	  layeredPane_1.setOpaque(true);

	  JButton btnNewButton = new JButton("ALTA");
	  btnNewButton.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {

	  if (e.getSource()==btnNewButton) {
	  final String agmDB_URL = "jdbc:mysql://192.168.1.188/concesionario";
	  final String agmUSER = "root";
	  final String agmPASS = "test";

	  try(Connection agmcon = DriverManager.getConnection(agmDB_URL,agmUSER,agmPASS); Statement agmst = agmcon.createStatement();) {
	  System.out.println("Insertando Datos");

	 
	  String agmb =textField_2.getText().toUpperCase();
	  textField_2.setText(agmb);
	  String agmc =textField_3.getText().toUpperCase();
	  textField_3.setText(agmc);
	  String agmd =textField.getText().toUpperCase();
	  textField.setText(agmd);
	  String agme =textField_14.getText().toUpperCase();
	  textField.setText(agme);
	  String agmf =textField_15.getText().toUpperCase();
	  textField.setText(agmf);

	  String agmsql = "insert into proveedores (id,nombreempresa,direccion,telefono,correo,coche) values(?,?,?,?,?,?)";
	  PreparedStatement agmup = agmcon.prepareStatement(agmsql);
	 
	  agmup.setString(1,null);
	  agmup.setString(2,agmb);
	  agmup.setString(3,agmc);
	  agmup.setString(4,agmd);
	  agmup.setString(5,agme);
	  agmup.setString(6,agmf);
	  agmup.executeUpdate();

	  String agmh="insertando datos";
	             JOptionPane.showMessageDialog(null, agmh);

	             }




	  catch(SQLException z) {
	  z.printStackTrace();
	  }



	  }

	  }



	  });
	  btnNewButton.setForeground(new Color(255, 255, 255));
	  btnNewButton.setBackground(new Color(102, 102, 102));
	  btnNewButton.setBounds(20, 331, 138, 40);
	  btnNewButton.setOpaque(true);
	  layeredPane_1.add(btnNewButton);

	  textField_2 = new JTextField();
	  textField_2.setForeground(Color.BLACK);
	  textField_2.setBackground(new Color(255, 255, 255));
	  textField_2.setBounds(100, 100, 122, 20);
	  layeredPane_1.add(textField_2);
	  textField_2.setColumns(10);

	  textField_3 = new JTextField();
	  textField_3.setBackground(new Color(255, 255, 255));
	  textField_3.setForeground(Color.BLACK);
	  textField_3.setBounds(100, 131, 122, 20);
	  layeredPane_1.add(textField_3);
	  textField_3.setColumns(10);

	  JLabel lblNewLabel_6 = new JLabel("Cliente");
	  lblNewLabel_6.setForeground(new Color(0, 0, 0));
	  lblNewLabel_6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_6.setBounds(20, 103, 81, 14);
	  layeredPane_1.add(lblNewLabel_6);

	  JLabel lblNewLabel_7 = new JLabel("Direcci\u00F3n");
	  lblNewLabel_7.setForeground(new Color(0, 0, 0));
	  lblNewLabel_7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_7.setBounds(20, 134, 95, 14);
	  layeredPane_1.add(lblNewLabel_7);

	  JLabel lblNewLabel_7_1 = new JLabel("Tel\u00E9fono");
	  lblNewLabel_7_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_7_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_7_1.setBounds(20, 165, 95, 17);
	  layeredPane_1.add(lblNewLabel_7_1);

	  textField = new JTextField();
	  textField.setForeground(Color.BLACK);
	  textField.setColumns(10);
	  textField.setBackground(new Color(255, 255, 255));
	  textField.setBounds(100, 162, 122, 20);
	  layeredPane_1.add(textField);
	  
	  textField_14 = new JTextField();
	  textField_14.setForeground(Color.BLACK);
	  textField_14.setColumns(10);
	  textField_14.setBackground(Color.WHITE);
	  textField_14.setBounds(100, 193, 122, 20);
	  layeredPane_1.add(textField_14);
	  
	  JLabel lblNewLabel_7_1_1 = new JLabel("Correo");
	  lblNewLabel_7_1_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_7_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_7_1_1.setBounds(20, 196, 81, 14);
	  layeredPane_1.add(lblNewLabel_7_1_1);
	  
	  textField_15 = new JTextField();
	  textField_15.setForeground(Color.BLACK);
	  textField_15.setColumns(10);
	  textField_15.setBackground(Color.WHITE);
	  textField_15.setBounds(100, 224, 122, 20);
	  layeredPane_1.add(textField_15);
	  
	  JLabel lblNewLabel_7_1_1_1 = new JLabel("Coche");
	  lblNewLabel_7_1_1_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_7_1_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_7_1_1_1.setBounds(20, 227, 81, 14);
	  layeredPane_1.add(lblNewLabel_7_1_1_1);
	  
	  JLabel lblNewLabel_15 = new JLabel("");
	  lblNewLabel_15.setIcon(new ImageIcon("img\\Audi-R8.jpg"));
	  lblNewLabel_15.setBounds(264, 0, 432, 412);
	  layeredPane_1.add(lblNewLabel_15);
	  
	  JLabel lblNewLabel_16 = new JLabel("Nueva Venta");
	  lblNewLabel_16.setForeground(new Color(0, 0, 0));
	  lblNewLabel_16.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  lblNewLabel_16.setBounds(10, 11, 160, 67);
	  layeredPane_1.add(lblNewLabel_16);


	  JLayeredPane layeredPane_2 = new JLayeredPane();
	  layeredPane_2.setBackground(new Color(255, 255, 255));
	  tabbedPane.addTab("BAJA", null, layeredPane_2, null);
	  frame.setVisible(false);
	  layeredPane_2.setOpaque(true);

	  JLabel lblNewLabel_8 = new JLabel("Dar de baja");
	  lblNewLabel_8.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  lblNewLabel_8.setBackground(new Color(0, 0, 0));
	  lblNewLabel_8.setForeground(new Color(0, 0, 0));
	  lblNewLabel_8.setBounds(10, 11, 160, 67);
	  layeredPane_2.add(lblNewLabel_8);

	  JLabel lblNewLabel_9 = new JLabel("id venta a dar de baja");
	  lblNewLabel_9.setForeground(new Color(0, 0, 0));
	  lblNewLabel_9.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_9.setBounds(18, 115, 182, 24);
	  layeredPane_2.add(lblNewLabel_9);

	  JButton btnNewButton_1 = new JButton("CONSULTAR");
	  btnNewButton_1.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {

	  if(e.getSource()==btnNewButton_1){


	  String agmAA =textField_4.getText().toUpperCase();
	  textField_4.setText(agmAA);

	  int agmAAA = Integer.valueOf(agmAA);
	       



	  try {

	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection agmcon = DriverManager.getConnection("jdbc:mysql://192.168.1.188/concesionario", "root", "test");

	             Statement stmt = agmcon.createStatement();

	             ResultSet agmrs = stmt.executeQuery( "SELECT * FROM proveedores WHERE id = " + agmAAA);

	           
	             

	            while(agmrs.next()) {

	           
	            String agmv2 = (agmrs.getString(2));
	           
	            String agmv3 = (agmrs.getString(3));
	           
	            String agmv4 = ( agmrs.getString(4));
	           
	            String agmv5 = ( agmrs.getString(5));
	            
	            String agmv6 = ( agmrs.getString(6));
	           
	     
	       
	  textField_9.setText(agmv2);
	  textField_10.setText(agmv3);
	  textField_11.setText(agmv4);
	  textField_12.setText(agmv5);
	  textField_16.setText(agmv6);

	            }

	           

	             agmcon.close();

	         } catch (Exception z1) {

	             System.out.println(z1);
	         }


	  }}});
	  btnNewButton_1.setForeground(new Color(255, 255, 255));
	  btnNewButton_1.setBackground(new Color(102, 102, 102));
	  btnNewButton_1.setBounds(107, 63, 106, 31);
	  layeredPane_2.add(btnNewButton_1);

	  textField_4 = new JTextField();
	  textField_4.setBounds(193, 117, 106, 20);
	  layeredPane_2.add(textField_4);
	  textField_4.setColumns(10);

	  JLabel lblNewLabel_9_1 = new JLabel("Nombre");
	  lblNewLabel_9_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_9_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_9_1.setBounds(18, 150, 152, 24);
	  layeredPane_2.add(lblNewLabel_9_1);

	  textField_9 = new JTextField();
	  textField_9.setColumns(10);
	  textField_9.setBounds(193, 152, 106, 20);
	  layeredPane_2.add(textField_9);

	  JLabel lblNewLabel_9_1_1 = new JLabel("Direcci\u00F3n");
	  lblNewLabel_9_1_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_9_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_9_1_1.setBounds(18, 185, 152, 24);
	  layeredPane_2.add(lblNewLabel_9_1_1);

	  JLabel lblNewLabel_9_1_1_1 = new JLabel("Correo electr\u00F3nico");
	  lblNewLabel_9_1_1_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_9_1_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_9_1_1_1.setBounds(17, 255, 153, 24);
	  layeredPane_2.add(lblNewLabel_9_1_1_1);

	  textField_10 = new JTextField();
	  textField_10.setColumns(10);
	  textField_10.setBounds(193, 187, 106, 20);
	  layeredPane_2.add(textField_10);

	  textField_11 = new JTextField();
	  textField_11.setColumns(10);
	  textField_11.setBounds(193, 222, 106, 20);
	  layeredPane_2.add(textField_11);

	  textField_12 = new JTextField();
	  textField_12.setColumns(10);
	  textField_12.setBounds(193, 257, 106, 20);
	  layeredPane_2.add(textField_12);

	  JLabel lblNewLabel_9_1_1_1_1 = new JLabel("Tel\u00E9fono");
	  lblNewLabel_9_1_1_1_1.setForeground(new Color(0, 0, 0));
	  lblNewLabel_9_1_1_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));


	  lblNewLabel_9_1_1_1_1.setBounds(18, 220, 152, 24);

	  layeredPane_2.add(lblNewLabel_9_1_1_1_1);


	  JButton btnNewButton_1_1 = new JButton("BORRAR");



	  btnNewButton_1_1.addActionListener(new ActionListener() {

	  public void actionPerformed(ActionEvent e) {

	  if(e.getSource()==btnNewButton_1_1){

	  String agmAA =textField_4.getText().toUpperCase();
	  textField_4.setText(agmAA);
	  int agmAAA = Integer.valueOf(agmAA);
	        

	  try {
	  Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.188/concesionario", "root", "test");
	  Statement comando = conexion.createStatement();
	  int query = comando.executeUpdate("DELETE from proveedores where id = "+ agmAAA);

	  String agmh="proveedor borrado";
	             JOptionPane.showMessageDialog(null, agmh);


	     } catch (Exception e3) {
	         JOptionPane.showMessageDialog(null, "Error al eliminar" + e3.getMessage());
	     }
	   

	  }



	  }});

	             
	             
	           





	  btnNewButton_1_1.setForeground(Color.WHITE);
	  btnNewButton_1_1.setBackground(new Color(102, 102, 102));
	  btnNewButton_1_1.setBounds(18, 340, 139, 31);
	  layeredPane_2.add(btnNewButton_1_1);

	  JButton btnNewButton_1_1_1 = new JButton("BORRAR TODOS");
	  btnNewButton_1_1_1.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {

	  if(e.getSource()==btnNewButton_1_1_1){
	  final String agmDB_URL = "jdbc:mysql://192.168.1.188/concesionario";
	  final String agmUSER = "root";
	  final String agmPASS = "test";

	  try( Connection agmcon = DriverManager.getConnection(agmDB_URL,agmUSER,agmPASS); Statement stmt = agmcon.createStatement(); ) {

	  String agmsql = "TRUNCATE `concesionario`.`proveedores`";
	  stmt.executeUpdate(agmsql);
	  String agmh="bbdd borrada";
	             JOptionPane.showMessageDialog(null, agmh);


	  }catch(SQLException e1) {
	  System.out.println(e1);
	  }
	  }

	  }
	  });
	  btnNewButton_1_1_1.setForeground(Color.WHITE);
	  btnNewButton_1_1_1.setBackground(new Color(102, 102, 102));
	  btnNewButton_1_1_1.setBounds(160, 340, 139, 31);
	  layeredPane_2.add(btnNewButton_1_1_1);
	  
	  textField_16 = new JTextField();
	  textField_16.setColumns(10);
	  textField_16.setBounds(193, 292, 106, 20);
	  layeredPane_2.add(textField_16);
	  
	  JLabel lblNewLabel_9_1_1_1_2 = new JLabel("Coche");
	  lblNewLabel_9_1_1_1_2.setForeground(new Color(0, 0, 0));
	  lblNewLabel_9_1_1_1_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_9_1_1_1_2.setBounds(18, 290, 152, 24);
	  layeredPane_2.add(lblNewLabel_9_1_1_1_2);
	  
	  JLabel lblNewLabel_3 = new JLabel("");
	  lblNewLabel_3.setIcon(new ImageIcon("img\\mercedes.jpg"));
	  lblNewLabel_3.setBounds(319, -2, 377, 414);
	  layeredPane_2.add(lblNewLabel_3);

	  JLayeredPane layeredPane_3 = new JLayeredPane();
	  layeredPane_3.setBackground(UIManager.getColor("Button.background"));
	  tabbedPane.addTab("CONSULTAR", null, layeredPane_3, null);
	  layeredPane_3.setOpaque(true);
	





	             

	         

	  JButton btnNewButton_4 = new JButton("CONSULTAR");
	  btnNewButton_4.setBackground(new Color(128, 128, 128));

	  btnNewButton_4.setBounds(186, 11, 123, 41);
	  layeredPane_3.add(btnNewButton_4);
	  DefaultTableModel modelo = new DefaultTableModel();
	  table_3 = new JTable(modelo);
	  table_3.setBackground(new Color(128, 128, 128));
	  table_3.setBounds(10, 63, 676, 338);
	  layeredPane_3.add(table_3);

	  JButton btnNewButton_5 = new JButton("LIMPIAR");
	  btnNewButton_5.setBackground(new Color(128, 128, 128));
	  btnNewButton_5.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {

	  if(e.getSource()==btnNewButton_5) {


	  int rows = modelo.getRowCount();
	  for(int i = rows - 1; i >=0; i--)
	  {
	    modelo.removeRow(i);
	  }


	  }
	  }
	  });
	  btnNewButton_5.setBounds(360, 11, 123, 41);
	  layeredPane_3.add(btnNewButton_5);






	  btnNewButton_4.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {

	  if(e.getSource()==btnNewButton_4) {



	  try {

	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection agmcon = DriverManager.getConnection("jdbc:mysql://192.168.1.188/concesionario", "root", "test");

	             Statement stmt = agmcon.createStatement();

	             ResultSet agmrs = stmt.executeQuery( "SELECT * FROM proveedores");
	             modelo.setColumnIdentifiers(new Object[] {"id","nombreempresa","direccion","telefono","correo","coche"});


	           
	             while (agmrs.next())
	             {
	             
	              modelo.addRow(new Object[] {agmrs.getString("id"),agmrs.getString("nombreempresa"),agmrs.getString("direccion"),agmrs.getString("telefono"),agmrs.getString("correo"),agmrs.getString("coche")});
	               
	             }

	           
	           

	           

	     

	         } catch (Exception z1) {

	             System.out.println(z1);
	         }


	  }}});



	  
	  


	 


	  JLayeredPane layeredPane_4 = new JLayeredPane();
	  layeredPane_4.setBackground(new Color(255, 255, 255));
	  tabbedPane.addTab("ACTUALIZAR", null, layeredPane_4, null);
	  layeredPane_4.setOpaque(true);

	  JLabel lblNewLabel_10 = new JLabel("Actualizar");
	  lblNewLabel_10.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  lblNewLabel_10.setForeground(new Color(0, 0, 0));
	  lblNewLabel_10.setBounds(10, 29, 135, 30);
	  layeredPane_4.add(lblNewLabel_10);

	  JLabel lblNewLabel_11 = new JLabel("Id a actualizar");
	  lblNewLabel_11.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_11.setBounds(10, 76, 118, 14);
	  layeredPane_4.add(lblNewLabel_11);

	  textField_5 = new JTextField();
	  textField_5.setBounds(121, 73, 102, 20);
	  layeredPane_4.add(textField_5);
	  textField_5.setColumns(10);

	  JLabel lblNewLabel_12 = new JLabel("Cliente");
	  lblNewLabel_12.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_12.setBounds(10, 114, 93, 14);
	  layeredPane_4.add(lblNewLabel_12);

	  textField_6 = new JTextField();
	  textField_6.setBounds(121, 111, 102, 20);
	  layeredPane_4.add(textField_6);
	  textField_6.setColumns(10);

	  textField_7 = new JTextField();
	  textField_7.setBounds(121, 149, 102, 20);
	  layeredPane_4.add(textField_7);
	  textField_7.setColumns(10);

	  textField_8 = new JTextField();
	  textField_8.setBounds(121, 188, 102, 20);
	  layeredPane_4.add(textField_8);
	  textField_8.setColumns(10);

	  JLabel lblNewLabel_13 = new JLabel("Coche");
	  lblNewLabel_13.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_13.setBounds(10, 269, 86, 14);
	  layeredPane_4.add(lblNewLabel_13);

	  JLabel lblNewLabel_14 = new JLabel("Telefono");
	  lblNewLabel_14.setForeground(new Color(0, 0, 0));
	  lblNewLabel_14.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_14.setBounds(10, 191, 86, 14);
	  layeredPane_4.add(lblNewLabel_14);

	  JButton btnNewButton_2 = new JButton("Actualizar datos");
	  btnNewButton_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  btnNewButton_2.setForeground(new Color(255, 255, 255));
	  btnNewButton_2.setBackground(new Color(102, 102, 102));
	  btnNewButton_2.setBounds(10, 327, 213, 51);
	  layeredPane_4.add(btnNewButton_2);
	  
	  textField_13_2 = new JTextField();
	  textField_13_2.setColumns(10);
	  textField_13_2.setBounds(121, 227, 102, 20);
	  layeredPane_4.add(textField_13_2);
	  
	  JLabel lblNewLabel_4 = new JLabel("Correo");
	  lblNewLabel_4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_4.setBounds(10, 233, 93, 14);
	  layeredPane_4.add(lblNewLabel_4);
	  
	  textField_1 = new JTextField();
	  textField_1.setColumns(10);
	  textField_1.setBounds(121, 266, 102, 20);
	  layeredPane_4.add(textField_1);
	  
	  JLabel lblNewLabel_4_1 = new JLabel("Direccion");
	  lblNewLabel_4_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
	  lblNewLabel_4_1.setBounds(10, 152, 93, 14);
	  layeredPane_4.add(lblNewLabel_4_1);
	  
	  JLabel lblNewLabel_17 = new JLabel("New label");
	  lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\proyecto\\img\\actu.jpg"));
	  lblNewLabel_17.setBounds(245, 11, 441, 390);
	  layeredPane_4.add(lblNewLabel_17);
	  
	  JPanel panel = new JPanel();
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
	  panel.setBounds(0, 0, 701, 38);
	  frame.getContentPane().add(panel);
	  panel.setLayout(null);
	  
	  JPanel panel_1 = new JPanel();
	  panel_1.setForeground(new Color(255, 255, 255));
	  panel_1.setBackground(new Color(153, 0, 0));
	  panel_1.setBounds(657, 0, 44, 38);
	  panel.add(panel_1);
	  panel_1.setLayout(null);
	  
	  JLabel lblNewLabel_2 = new JLabel("X");
	  lblNewLabel_2.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2.setBackground(new Color(153, 0, 0));
	  lblNewLabel_2.addMouseListener(new MouseAdapter() {
	  	@Override
	  	public void mouseClicked(MouseEvent e) {
			System.exit(0);
	  	}
	  	@Override
	  	public void mouseEntered(MouseEvent e) {
	  		panel_1.setBackground(Color.red);
			lblNewLabel_2.setForeground(Color.white);
	  	}
	  	@Override
	  	public void mouseExited(MouseEvent e) {
	  		panel_1.setBackground(Color.red);
			lblNewLabel_2.setForeground(Color.white);
	  	}
	  });
	  lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	  lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
	  lblNewLabel_2.setBounds(0, 0, 44, 38);
	  panel_1.add(lblNewLabel_2);
	  
	  JLabel lblNewLabel_5 = new JLabel("");
	  lblNewLabel_5.setIcon(new ImageIcon("img\\LOGOCONCESIONARIO.png"));
	  lblNewLabel_5.setBounds(0, 5, 44, 33);
	  panel.add(lblNewLabel_5);
	  
	  JLabel lblNewLabel_5_1 = new JLabel("CONCESIONARIO LPM");
	  lblNewLabel_5_1.setForeground(Color.BLACK);
	  lblNewLabel_5_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  lblNewLabel_5_1.setBounds(54, 0, 200, 38);
	  panel.add(lblNewLabel_5_1);
	  
	  btnNewButton_2.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {

	  if(e.getSource()==btnNewButton_2) {

	  final String agmDB_URL = "jdbc:mysql://192.168.1.188/concesionario";
	  final String agmUSER = "root";
	  final String agmPASS = "test";

	  try(Connection agmcon = DriverManager.getConnection(agmDB_URL,agmUSER,agmPASS); Statement agmst = agmcon.createStatement();) {
	  System.out.println("Insertando Datos");

	  String agma =textField_5.getText().toUpperCase();
	  textField_5.setText(agma);
	   int agmAAA = Integer.valueOf(agma);  
	  String agmb =textField_6.getText().toUpperCase();
	  textField_6.setText(agmb);
	  String agmc =textField_7.getText().toUpperCase();
	  textField_7.setText(agmc);
	  String agmd =textField_8.getText().toUpperCase();
	  textField_8.setText(agmd);
	  String agme =textField_13_2.getText().toUpperCase();
	  textField_13_2.setText(agme);
	  String agmf =textField_1.getText().toUpperCase();
	  textField_1.setText(agmf);
	  String agmsql = "UPDATE proveedores SET "
	  + "nombreempresa = ?"
	  + ",direccion = ?"
	  + ",telefono = ?"
	  + ",correo = ?"
	  + ",coche = ?"
	  + "WHERE id =" +agmAAA;
	  PreparedStatement agmup = agmcon.prepareStatement(agmsql);
	  agmup.setString(1,agmb);
	  agmup.setString(2,agmc);
	  agmup.setString(3,agmd);
	  agmup.setString(4,agme);
	  agmup.setString(5,agmf);
	  agmup.executeUpdate();
	  String agmh="actualizando datos";
	             JOptionPane.showMessageDialog(null, agmh);
	             }
	  catch(SQLException z) {
	  z.printStackTrace();
	  }
	  }
	  }
	  });


	  }
	  }