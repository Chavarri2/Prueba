package vista;

import javax.swing.*;
import java.awt.*;

/**
 * Vista principal de la aplicación.
 * Contiene los componentes gráficos y métodos para mostrar mensajes.
 */
public class Vista extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField campoNumero;
    private final JButton btnAgregar;
    private final JButton btnContar;
    private final JTextArea areaTexto;
    private final JLabel lblEstado;

    public Vista() {
        setTitle("Gestión de Números - MVC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel superior
        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Número:"));
        campoNumero = new JTextField(10);
        panelSuperior.add(campoNumero);

        btnAgregar = new JButton("Añadir número");
        panelSuperior.add(btnAgregar);

        btnContar = new JButton("Contar múltiplos de 3");
        panelSuperior.add(btnContar);

        // Área de texto
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);

        // Estado
        lblEstado = new JLabel("Listo.");

        // Layout
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(lblEstado, BorderLayout.SOUTH);
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnContar() {
        return btnContar;
    }

    public void mostrarMensaje(String mensaje) {
        lblEstado.setText(mensaje);
    }

    public void mostrarResultado(String texto) {
        areaTexto.append(texto + "\n");
        lblEstado.setText("Operación completada.");
    }
}
