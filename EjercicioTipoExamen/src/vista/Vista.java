package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JComboBox<String> comboProvincias;
	private JButton botonBuscar;
	private JTextArea txtResultados;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		botonBuscar = new JButton("Mostrar Vehiculo");
		botonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonBuscar.setBounds(179, 8, 139, 23);
		contentPane.add(botonBuscar);

		JLabel lblNewLabel = new JLabel("Provincia:");
		lblNewLabel.setBounds(5, 12, 51, 14);
		contentPane.add(lblNewLabel);

		comboProvincias = new JComboBox<>();
		comboProvincias.setBounds(53, 8, 116, 22);
		contentPane.add(comboProvincias);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 37, 434, 224);
		contentPane.add(scrollPane);

		txtResultados = new JTextArea();
		scrollPane.setViewportView(txtResultados);
		
		
	}
	// Método para cargar las provincias en el JComboBox
	public void setProvincias(List<String> provincias) {
		comboProvincias.removeAllItems();
		for (String provincia : provincias) {
			comboProvincias.addItem(provincia);
		}
	}

	// Devuelve la provincia seleccionada actualmente
	public String getProvinciaSeleccionada() {
		return (String) comboProvincias.getSelectedItem();
	}

	// Muestra el texto de resultados en el JTextArea
	public void mostrarResultados(String texto) {
		txtResultados.setText(texto);
	}

	// Permite al controlador registrar un listener para el botón
	public void addMostrarVehiculosListener(ActionListener listener) {
		botonBuscar.addActionListener(listener);
	}

	// Muestra un mensaje de error en un cuadro de diálogo
	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
}
