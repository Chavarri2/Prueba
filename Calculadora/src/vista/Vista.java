package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import modelo.ModeloCalculadora;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl1;
	private double num1,num2;
	private String operador;
	double resultado;

	public Vista(ModeloCalculadora calculo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton boton1 = new JButton("1");
		boton1.setBounds(37, 77, 52, 25);

		lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl1.setBounds(37, 11, 231, 25);

		JButton boton2 = new JButton("2");
		boton2.setBounds(99, 77, 51, 25);

		JButton boton3 = new JButton("3");
		boton3.setBounds(160, 77, 52, 25);

		JButton boton4 = new JButton("4");
		boton4.setBounds(37, 106, 52, 25);

		JButton boton5 = new JButton("5");
		boton5.setBounds(99, 106, 51, 25);

		JButton boton6 = new JButton("6");
		boton6.setBounds(160, 106, 51, 25);

		JButton boton7 = new JButton("7");
		boton7.setBounds(98, 135, 52, 25);

		JButton boton8 = new JButton("8");
		boton8.setBounds(37, 135, 52, 25);

		JButton boton9 = new JButton("9");
		boton9.setBounds(160, 135, 52, 25);

		JButton boton0 = new JButton("0");
		boton0.setBounds(37, 165, 113, 25);

		JButton botonPunto = new JButton(".");
		botonPunto.setBounds(160, 165, 52, 25);
		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton botonIgual = new JButton("=");

		botonIgual.setBounds(217, 135, 51, 55);

		JButton botonSuma = new JButton("+");

		botonSuma.setBounds(217, 77, 51, 54);

		JButton botonResta = new JButton("-");
		botonResta.setBounds(217, 47, 51, 25);

		JButton botonMultiplicacion = new JButton("x");
		botonMultiplicacion.setBounds(160, 47, 52, 25);


		JButton botonDivision = new JButton("/");
		botonDivision.setBounds(99, 47, 51, 25);
		contentPane.setLayout(null);
		contentPane.add(boton1);
		contentPane.add(lbl1);
		contentPane.add(boton2);
		contentPane.add(boton3);
		contentPane.add(boton4);
		contentPane.add(boton5);
		contentPane.add(boton6);
		contentPane.add(boton7);
		contentPane.add(boton8);
		contentPane.add(boton9);
		contentPane.add(boton0);
		contentPane.add(botonPunto);
		contentPane.add(botonIgual);
		contentPane.add(botonSuma);
		contentPane.add(botonResta);
		contentPane.add(botonMultiplicacion);
		contentPane.add(botonDivision);

		JButton botonBorrar = new JButton("C");
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=0;
				num2=0;
				lbl1.setText("0");
			}
		});
		botonBorrar.setBounds(37, 47, 52, 25);
		contentPane.add(botonBorrar);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"1");
			}
		});
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"2");
			}
		});
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"3");
			}
		});
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"4");
			}
		});
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"5");
			}
		});
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"6");
			}
		});
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"7");
			}
		});
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"8");
			}
		});
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(lbl1.getText()+"9");
			}
		});
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!lbl1.getText().equals("0")||lbl1.getText()==null) {
					lbl1.setText(lbl1.getText()+"0");
				}
				
			}
		});

		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!lbl1.getText().contains(".")) {
					lbl1.setText(lbl1.getText()+".");
				}
			}});

		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lbl1.getText());
				operador="+";
				lbl1.setText("");
			}
		});
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lbl1.getText());
				operador="-";
				lbl1.setText("");
			}
		});
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lbl1.getText());
				operador="x";
				lbl1.setText("");
			}
		});
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lbl1.getText());
				operador="/";
				lbl1.setText("");
			}
		});

		botonIgual.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try{
					if(operador.equals(""))return;// si no hay operador no hace nada
					num2=Double.parseDouble(lbl1.getText());
					switch(operador) {
				case "+":
					lbl1.setText(calculo.suma(num1, num2));
					break;
				case "-":
					lbl1.setText(calculo.resta(num1, num2));
					break;
				case "x":
					lbl1.setText(calculo.multiplicacion(num1, num2));
					break;
				case "/":
					lbl1.setText(calculo.division(num1, num2));
					break;
				}}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Operacion no valida","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
