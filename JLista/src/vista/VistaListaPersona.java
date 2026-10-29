package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class VistaListaPersona extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaListaPersona frame = new VistaListaPersona();
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
	public VistaListaPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(64, 80, 290, 170);
		contentPane.add(list);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(265, 11, 89, 23);
		contentPane.add(btnAgregar);
		
		textField = new JTextField();
		textField.setBounds(117, 12, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 43, 130, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(265, 42, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(64, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(64, 46, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(342, 80, 12, 170);
		contentPane.add(scrollPane);

	}
}
