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



public class proveedor extends JFrame {

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

	  /**
	  * Launch the application.
	  */
	  public static void main(String[] args) {
	  EventQueue.invokeLater(new Runnable() {
	  public void run() {
	  try {
	  proveedor window = new proveedor();
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
	  public proveedor() {
	  initialize();
	  }

	  /**
	  * Initialize the contents of the frame.
	  */
	  private void initialize() {
	  frame = new JFrame();
	  frame.setForeground(Color.GREEN);
	  frame.setBounds(100, 100, 701, 478);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.getContentPane().setLayout(null);

	  JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	  tabbedPane.setBounds(0, 0, 685, 439);
	  frame.getContentPane().add(tabbedPane);
	  
	  	  JLayeredPane layeredPane = new JLayeredPane();
	  	  layeredPane.setBackground(Color.WHITE);
	  	  tabbedPane.addTab("index", null, layeredPane, null);
	  	  layeredPane.setOpaque(true);
	  	  
	  	  	  JLabel lblNewLabel = new JLabel("Proveedores");
	  	  	  lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  	  	  lblNewLabel.setBounds(10, 11, 160, 67);
	  	  	  layeredPane.add(lblNewLabel);
	  	  	  
	  	  	  JButton btnNewButton_3 = new JButton("INICIO\r\n");
	  	  	  btnNewButton_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  btnNewButton_3.addActionListener(new ActionListener() {
	  	  	  	public void actionPerformed(ActionEvent e) {
	  	  	  		
	  	  	  		Inicio.main(null);
	  	  	  	}
	  	  	  });
	  	  	  btnNewButton_3.setBounds(10, 365, 119, 35);
	  	  	  layeredPane.add(btnNewButton_3);
	  	  	  
	  	  	  JLabel lblAltaDarDe = new JLabel("ALTA: Dar de alta a nuevos proveedores");
	  	  	  lblAltaDarDe.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblAltaDarDe.setBounds(10, 89, 293, 45);
	  	  	  layeredPane.add(lblAltaDarDe);
	  	  	  
	  	  	  JLabel lblBajaEliminarProveedores = new JLabel("BAJA: Eliminar proveedores");
	  	  	  lblBajaEliminarProveedores.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblBajaEliminarProveedores.setBounds(10, 145, 293, 45);
	  	  	  layeredPane.add(lblBajaEliminarProveedores);
	  	  	  
	  	  	  JLabel lblConsultarMuestraTodos = new JLabel("CONSULTAR: Muestra todos los proveedores");
	  	  	  lblConsultarMuestraTodos.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblConsultarMuestraTodos.setBounds(10, 201, 307, 45);
	  	  	  layeredPane.add(lblConsultarMuestraTodos);
	  	  	  
	  	  	  JLabel lblActualizarModificaLos = new JLabel("ACTUALIZAR: Modifica los proveedores");
	  	  	  lblActualizarModificaLos.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	  	  	  lblActualizarModificaLos.setBounds(10, 257, 307, 45);
	  	  	  layeredPane.add(lblActualizarModificaLos);
	  	  	  
	  	  	  JLabel lblNewLabel_1 = new JLabel("");
	  	  	  lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mañana_posx\\eclipse-workspace\\ProyectoFinal1\\img\\inicioproveedor.jpg"));
	  	  	  lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	  	  	  lblNewLabel_1.setBounds(321, 0, 362, 411);
	  	  	  layeredPane.add(lblNewLabel_1);

	  JLayeredPane layeredPane_1 = new JLayeredPane();
	  layeredPane_1.setForeground(new Color(255, 255, 255));
	  layeredPane_1.setBackground(new Color(0, 204, 255));
	  tabbedPane.addTab("ALTA", null, layeredPane_1, null);
	  layeredPane_1.setOpaque(true);

	  JLabel lblNewLabel_3 = new JLabel("<html><h2>VENDER</h2></html>");
	  lblNewLabel_3.setForeground(new Color(255, 255, 255));
	  lblNewLabel_3.setBackground(new Color(255, 255, 255));
	  lblNewLabel_3.setBounds(10, 11, 165, 40);
	  layeredPane_1.add(lblNewLabel_3);

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
	  btnNewButton.setBackground(new Color(0, 0, 0));
	  btnNewButton.setBounds(297, 176, 122, 46);
	  btnNewButton.setOpaque(true);
	  layeredPane_1.add(btnNewButton);

	  textField_2 = new JTextField();
	  textField_2.setForeground(Color.BLACK);
	  textField_2.setBackground(new Color(255, 255, 255));
	  textField_2.setBounds(100, 100, 103, 20);
	  layeredPane_1.add(textField_2);
	  textField_2.setColumns(10);

	  textField_3 = new JTextField();
	  textField_3.setBackground(new Color(255, 255, 255));
	  textField_3.setForeground(Color.BLACK);
	  textField_3.setBounds(100, 131, 103, 20);
	  layeredPane_1.add(textField_3);
	  textField_3.setColumns(10);

	  JLabel lblNewLabel_6 = new JLabel("Empresa");
	  lblNewLabel_6.setBounds(20, 103, 59, 14);
	  layeredPane_1.add(lblNewLabel_6);

	  JLabel lblNewLabel_7 = new JLabel("Dirección");
	  lblNewLabel_7.setBounds(20, 134, 70, 14);
	  layeredPane_1.add(lblNewLabel_7);

	  JLabel lblNewLabel_7_1 = new JLabel("Telefono");
	  lblNewLabel_7_1.setBounds(20, 165, 59, 14);
	  layeredPane_1.add(lblNewLabel_7_1);

	  textField = new JTextField();
	  textField.setForeground(Color.BLACK);
	  textField.setColumns(10);
	  textField.setBackground(new Color(255, 255, 255));
	  textField.setBounds(100, 162, 103, 20);
	  layeredPane_1.add(textField);
	  
	  textField_14 = new JTextField();
	  textField_14.setForeground(Color.BLACK);
	  textField_14.setColumns(10);
	  textField_14.setBackground(Color.WHITE);
	  textField_14.setBounds(100, 193, 103, 20);
	  layeredPane_1.add(textField_14);
	  
	  JLabel lblNewLabel_7_1_1 = new JLabel("Correo");
	  lblNewLabel_7_1_1.setBounds(20, 196, 59, 14);
	  layeredPane_1.add(lblNewLabel_7_1_1);
	  
	  textField_15 = new JTextField();
	  textField_15.setForeground(Color.BLACK);
	  textField_15.setColumns(10);
	  textField_15.setBackground(Color.WHITE);
	  textField_15.setBounds(100, 224, 103, 20);
	  layeredPane_1.add(textField_15);
	  
	  JLabel lblNewLabel_7_1_1_1 = new JLabel("Coche");
	  lblNewLabel_7_1_1_1.setBounds(20, 227, 59, 14);
	  layeredPane_1.add(lblNewLabel_7_1_1_1);


	  JLayeredPane layeredPane_2 = new JLayeredPane();
	  layeredPane_2.setBackground(new Color(0, 204, 255));
	  tabbedPane.addTab("BAJA", null, layeredPane_2, null);
	  frame.setVisible(false);
	  layeredPane_2.setOpaque(true);

	  JLabel lblNewLabel_8 = new JLabel("<html><h2>Dar de baja</h2></html>");
	  lblNewLabel_8.setForeground(new Color(255, 255, 255));
	  lblNewLabel_8.setBounds(10, 11, 130, 24);
	  layeredPane_2.add(lblNewLabel_8);

	  JLabel lblNewLabel_9 = new JLabel("Empresa a dar de baja");
	  lblNewLabel_9.setBounds(10, 44, 116, 24);
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
	  btnNewButton_1.setBackground(new Color(102, 0, 0));
	  btnNewButton_1.setBounds(299, 0, 130, 42);
	  layeredPane_2.add(btnNewButton_1);

	  textField_4 = new JTextField();
	  textField_4.setBounds(136, 46, 86, 20);
	  layeredPane_2.add(textField_4);
	  textField_4.setColumns(10);

	  JLabel lblNewLabel_9_1 = new JLabel("nombre");
	  lblNewLabel_9_1.setBounds(20, 79, 95, 24);
	  layeredPane_2.add(lblNewLabel_9_1);

	  textField_9 = new JTextField();
	  textField_9.setColumns(10);
	  textField_9.setBounds(94, 81, 86, 20);
	  layeredPane_2.add(textField_9);

	  JLabel lblNewLabel_9_1_1 = new JLabel("direccion");
	  lblNewLabel_9_1_1.setBounds(10, 112, 95, 24);
	  layeredPane_2.add(lblNewLabel_9_1_1);

	  JLabel lblNewLabel_9_1_1_1 = new JLabel("correo");
	  lblNewLabel_9_1_1_1.setBounds(10, 182, 95, 24);
	  layeredPane_2.add(lblNewLabel_9_1_1_1);

	  textField_10 = new JTextField();
	  textField_10.setColumns(10);
	  textField_10.setBounds(71, 114, 86, 20);
	  layeredPane_2.add(textField_10);

	  textField_11 = new JTextField();
	  textField_11.setColumns(10);
	  textField_11.setBounds(81, 147, 86, 20);
	  layeredPane_2.add(textField_11);

	  textField_12 = new JTextField();
	  textField_12.setColumns(10);
	  textField_12.setBounds(54, 184, 86, 20);
	  layeredPane_2.add(textField_12);

	  JLabel lblNewLabel_9_1_1_1_1 = new JLabel("telefono");


	  lblNewLabel_9_1_1_1_1.setBounds(10, 145, 95, 24);

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
	  btnNewButton_1_1.setBackground(new Color(102, 0, 0));
	  btnNewButton_1_1.setBounds(299, 47, 130, 42);
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
	  btnNewButton_1_1_1.setBackground(new Color(102, 0, 0));
	  btnNewButton_1_1_1.setBounds(299, 98, 130, 42);
	  layeredPane_2.add(btnNewButton_1_1_1);
	  
	  textField_16 = new JTextField();
	  textField_16.setColumns(10);
	  textField_16.setBounds(94, 219, 86, 20);
	  layeredPane_2.add(textField_16);
	  
	  JLabel lblNewLabel_9_1_1_1_2 = new JLabel("Coche");
	  lblNewLabel_9_1_1_1_2.setBounds(20, 217, 95, 24);
	  layeredPane_2.add(lblNewLabel_9_1_1_1_2);

	  JLayeredPane layeredPane_3 = new JLayeredPane();
	  layeredPane_3.setBackground(new Color(0, 204, 255));
	  tabbedPane.addTab("CONSULTAR", null, layeredPane_3, null);
	  layeredPane_3.setOpaque(true);
	





	             

	         

	  JButton btnNewButton_4 = new JButton("Consultar");

	  btnNewButton_4.setBounds(0, 11, 89, 23);
	  layeredPane_3.add(btnNewButton_4);
	  DefaultTableModel modelo = new DefaultTableModel();
	  table_3 = new JTable(modelo);
	  table_3.setBounds(0, 62, 680, 349);
	  layeredPane_3.add(table_3);

	  JButton btnNewButton_5 = new JButton("LIMPIAR");
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
	  btnNewButton_5.setBounds(99, 11, 89, 23);
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
	  layeredPane_4.setBackground(new Color(0, 204, 255));
	  tabbedPane.addTab("ACTUALIZAR", null, layeredPane_4, null);
	  layeredPane_4.setOpaque(true);

	  JLabel lblNewLabel_10 = new JLabel("<html><h2>Actualizar</h2></html>");
	  lblNewLabel_10.setForeground(new Color(255, 255, 255));
	  lblNewLabel_10.setBounds(10, 11, 135, 30);
	  layeredPane_4.add(lblNewLabel_10);

	  JLabel lblNewLabel_11 = new JLabel("id a actualizar");
	  lblNewLabel_11.setBounds(10, 70, 85, 14);
	  layeredPane_4.add(lblNewLabel_11);

	  textField_5 = new JTextField();
	  textField_5.setBounds(101, 67, 86, 20);
	  layeredPane_4.add(textField_5);
	  textField_5.setColumns(10);

	  JLabel lblNewLabel_12 = new JLabel("marca");
	  lblNewLabel_12.setBounds(10, 98, 46, 14);
	  layeredPane_4.add(lblNewLabel_12);

	  textField_6 = new JTextField();
	  textField_6.setBounds(101, 95, 86, 20);
	  layeredPane_4.add(textField_6);
	  textField_6.setColumns(10);

	  textField_7 = new JTextField();
	  textField_7.setBounds(101, 126, 86, 20);
	  layeredPane_4.add(textField_7);
	  textField_7.setColumns(10);

	  textField_8 = new JTextField();
	  textField_8.setBounds(101, 157, 86, 20);
	  layeredPane_4.add(textField_8);
	  textField_8.setColumns(10);

	  JLabel lblNewLabel_13 = new JLabel("modelo");
	  lblNewLabel_13.setBounds(10, 129, 46, 14);
	  layeredPane_4.add(lblNewLabel_13);

	  JLabel lblNewLabel_14 = new JLabel("cv");
	  lblNewLabel_14.setBounds(10, 160, 46, 14);
	  layeredPane_4.add(lblNewLabel_14);

	  JButton btnNewButton_2 = new JButton("Actualizar datos");
	  btnNewButton_2.setForeground(new Color(255, 255, 255));
	  btnNewButton_2.setBackground(new Color(102, 0, 0));
	  btnNewButton_2.setBounds(254, 171, 135, 51);
	  layeredPane_4.add(btnNewButton_2);
	  
	  textField_13_2 = new JTextField();
	  textField_13_2.setColumns(10);
	  textField_13_2.setBounds(101, 188, 86, 20);
	  layeredPane_4.add(textField_13_2);
	  
	  JLabel lblNewLabel_4 = new JLabel("precio\r\n");
	  lblNewLabel_4.setBounds(10, 189, 46, 14);
	  layeredPane_4.add(lblNewLabel_4);
	  
	  textField_1 = new JTextField();
	  textField_1.setColumns(10);
	  textField_1.setBounds(101, 219, 86, 20);
	  layeredPane_4.add(textField_1);
	  
	  JLabel lblNewLabel_4_1 = new JLabel("coche");
	  lblNewLabel_4_1.setBounds(10, 222, 46, 14);
	  layeredPane_4.add(lblNewLabel_4_1);
	  
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
