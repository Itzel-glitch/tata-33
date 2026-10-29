package PaqueteCalculos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculos extends JFrame {

	public static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero2;
	private JMenu menuCalcular;
	private JMenuItem menuSumar;
	private JMenuItem menuRestar;
	private JMenuItem menuBorrar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel etiResultado;
	private JTextField txtNumero1;
	private JButton btnSumar;
	private JButton btnRestar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculos frame = new VentanaCalculos();
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
	public VentanaCalculos() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 270, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBarra = new JMenuBar();
		menuBarra.setBounds(0, 0, 311, 27);
		contentPane.add(menuBarra);
		
		menuCalcular = new JMenu("Calcular");
		menuCalcular.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBarra.add(menuCalcular);
		
		menuSumar = new JMenuItem("Sumar");
		menuSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar ();
			}
		});
		menuSumar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuCalcular.add(menuSumar);
		
		menuRestar = new JMenuItem("Restar");
		menuRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar ();
			}
		});
		menuRestar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuCalcular.add(menuRestar);
		
		menuBorrar = new JMenuItem("Borrar");
		menuBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar ();
			}
		});
		menuBorrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuCalcular.add(menuBorrar);
		
		lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(35, 57, 76, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(34, 87, 76, 20);
		contentPane.add(lblNewLabel_1);
		
		txtNumero1 = new JTextField();
		txtNumero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar ();
			}
		});
		txtNumero1.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNumero1.setText("0");
		txtNumero1.setBounds(117, 58, 129, 18);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar ();
			}
		});
		txtNumero2.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNumero2.setText("0");
		txtNumero2.setBounds(117, 88, 129, 18);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar ();
			}
		});
		btnSumar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSumar.setBounds(31, 179, 215, 27);
		contentPane.add(btnSumar);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(31, 132, 215, 27);
		contentPane.add(etiResultado);
		
		btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar ();
			}
		});
		btnRestar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRestar.setBounds(31, 219, 215, 27);
		contentPane.add(btnRestar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar ();
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(31, 256, 215, 27);
		contentPane.add(btnBorrar);

	}
	void Sumar() {
	    String cad1, cad2;
	    int a, b, s;

	    cad1 = txtNumero1.getText();
	    cad2 = txtNumero2.getText();
	    a = Integer.parseInt(cad1);
	    b = Integer.parseInt(cad2);
	    s = a + b;
	    etiResultado.setText("" + s);
	}
	    void Restar() {
	        String cad1, cad2;
	        int a, b, r;

	        cad1 = txtNumero1.getText();
	        cad2 = txtNumero2.getText();
	        a = Integer.parseInt(cad1);
	        b = Integer.parseInt(cad2);
	        r = a - b;
	        etiResultado.setText("" + r);
	    }
	    void Borrar() {
	        txtNumero1.setText("");
	        txtNumero2.setText("");
	    
	}
}
