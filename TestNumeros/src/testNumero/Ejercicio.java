package testNumero;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ejercicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio frame = new Ejercicio();
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
	public Ejercicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton boton1 = new JButton("ParImpar");
		boton1.setBounds(171, 115, 89, 23);
		contentPane.add(boton1);

		JButton boton2 = new JButton("PositivoNegativo");
		boton2.setBounds(96, 81, 116, 23);
		contentPane.add(boton2);

		JButton boton3 = new JButton("PrimoNoPrimo");
		boton3.setBounds(222, 81, 97, 23);
		contentPane.add(boton3);

		texto = new JTextField();
		texto.setBounds(96, 40, 223, 20);
		contentPane.add(texto);
		texto.setColumns(10);

		boton1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try{double numero=Double.parseDouble(texto.getText());
				if(numero%2==0.0) {
					JOptionPane.showMessageDialog(null, "Es par");
				}else {
					JOptionPane.showMessageDialog(null, "Es impar");
				}
				}catch(Exception a){
					JOptionPane.showMessageDialog(null, "Error, intenta punto");
				}
			}
		});

		boton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double numero=Double.parseDouble(texto.getText());
				if(numero>=0.0) {
					JOptionPane.showMessageDialog(null, "Es positivo");
				}else {
					JOptionPane.showMessageDialog(null, "Es negativo");
				}

			}
		});

		boton3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double numero=Double.parseDouble(texto.getText()), cont=0;
				for (int i = 1; i <= numero; i++) {
					if (numero % i == 0) {
						cont++;
					}
				}
				if(cont>2) {
					JOptionPane.showMessageDialog(null, "No es primo");
				}else{
					JOptionPane.showMessageDialog(null, "Es primo");
				}

			}
		});

	}
}
