package vista;

// CocheView.java
// Vista principal: contiene JComboBox de provincias, botón y área de texto para resultados
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboProvincias;
    private JButton btnMostrar;
    private JTextArea txtResultados;

    public Vista() {
        setTitle("Gestión de coches por provincia (MVC)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null); // Centrar ventana

        // Panel superior con combo y botón
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout(FlowLayout.LEFT));

        comboProvincias = new JComboBox<>();
        comboProvincias.setPreferredSize(new Dimension(150, 25));

        btnMostrar = new JButton("Mostrar coches");

        panelSuperior.add(new JLabel("Provincia:"));
        panelSuperior.add(comboProvincias);
        panelSuperior.add(btnMostrar);

        // Área de resultados
        txtResultados = new JTextArea();
        txtResultados.setEditable(false); // Solo lectura
        JScrollPane scroll = new JScrollPane(txtResultados);

        // Layout principal
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
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
    public void addMostrarCochesListener(ActionListener listener) {
        btnMostrar.addActionListener(listener);
    }

    // Muestra un mensaje de error en un cuadro de diálogo
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
