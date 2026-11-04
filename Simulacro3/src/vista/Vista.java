package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtId = new JTextField(5);
    public JTextField txtNombre = new JTextField(15);
    public JTextField txtMarca = new JTextField(15);
    public JTextField txtPrecio = new JTextField(10);
    public JTextField txtStock = new JTextField(5);
    public JTextField txtCategoria = new JTextField(6);
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnBuscarId = new JButton("Buscar por ID");
    public JButton btnBuscarMarca = new JButton("Buscar por marca");
    public JButton btnBuscarCategoria = new JButton("Buscar por categoría energética");
    public JButton btnMostrarTodos = new JButton("Mostrar todos");

    public JTextArea txtResultados = new JTextArea(12, 50);

    public Vista() {
        setTitle("Gestión de Electrodomésticos");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(6, 2, 5, 5));
        form.setBorder(BorderFactory.createTitledBorder("Datos"));

        form.add(new JLabel("ID:"));
        form.add(txtId);
        form.add(new JLabel("Nombre:"));
        form.add(txtNombre);
        form.add(new JLabel("Marca:"));
        form.add(txtMarca);
        form.add(new JLabel("Precio:"));
        form.add(txtPrecio);
        form.add(new JLabel("Stock:"));
        form.add(txtStock);
        form.add(new JLabel("Categoría energética:"));
        form.add(txtCategoria);

        JPanel botones = new JPanel(new GridLayout(2, 3, 5, 5));
        botones.setBorder(BorderFactory.createTitledBorder("Acciones"));
        botones.add(btnInsertar);
        botones.add(btnActualizar);
        botones.add(btnEliminar);
        botones.add(btnBuscarId);
        botones.add(btnBuscarMarca);
        botones.add(btnBuscarCategoria);

        JPanel abajo = new JPanel(new BorderLayout());
        abajo.add(btnMostrarTodos, BorderLayout.NORTH);
        abajo.add(new JScrollPane(txtResultados), BorderLayout.CENTER);

        setLayout(new BorderLayout(10, 10));
        add(form, BorderLayout.NORTH);
        add(botones, BorderLayout.CENTER);
        add(abajo, BorderLayout.SOUTH);
    }

    public void addListener(ActionListener l) {
        btnInsertar.addActionListener(l);
        btnActualizar.addActionListener(l);
        btnEliminar.addActionListener(l);
        btnBuscarId.addActionListener(l);
        btnBuscarMarca.addActionListener(l);
        btnBuscarCategoria.addActionListener(l);
        btnMostrarTodos.addActionListener(l);
    }
}
