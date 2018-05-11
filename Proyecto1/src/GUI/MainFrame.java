package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JSpinner;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 482, 284);
		contentPane.add(tabbedPane);
		
		JPanel servidores = new JPanel();
		tabbedPane.addTab("Inicio", null, servidores, null);
		servidores.setLayout(null);
		
		JLabel lblNodo = new JLabel("Nodo");
		lblNodo.setBounds(12, 12, 48, 15);
		servidores.add(lblNodo);
		
		textField = new JTextField();
		textField.setBounds(66, 10, 307, 19);
		servidores.add(textField);
		textField.setColumns(10);
		
		JButton btnAadir_2 = new JButton("A\u00F1adir");
		btnAadir_2.setBounds(385, 7, 80, 25);
		servidores.add(btnAadir_2);
		
		JList list_1 = new JList();
		list_1.setBounds(12, 38, 453, 177);
		servidores.add(list_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(12, 220, 80, 25);
		servidores.add(btnEditar);
		
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setBounds(104, 220, 104, 25);
		servidores.add(btnEliminar_1);
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.setBounds(376, 220, 89, 25);
		servidores.add(btnAceptar_1);
		
		JPanel operaciones = new JPanel();
		tabbedPane.addTab("Inicio", null, operaciones, null);
		operaciones.setLayout(null);
		
		JLabel lblOperaciones = new JLabel("Operaciones");
		lblOperaciones.setBounds(12, 12, 107, 15);
		operaciones.add(lblOperaciones);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Resta", "Suma", "Multiplicacion", "Division"}));
		comboBox.setBounds(22, 31, 132, 24);
		operaciones.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Pares"}));
		comboBox_1.setBounds(22, 185, 132, 24);
		operaciones.add(comboBox_1);
		
		JLabel lblFiltros = new JLabel("Restricciones");
		lblFiltros.setBounds(12, 158, 107, 15);
		operaciones.add(lblFiltros);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(31, 221, 117, 25);
		operaciones.add(btnAadir);
		
		JList list = new JList();
		list.setBounds(173, 13, 292, 160);
		operaciones.add(list);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(84, 60, 70, 20);
		operaciones.add(spinner);
		
		JButton btnSubir = new JButton("subir");
		btnSubir.setBounds(182, 184, 70, 25);
		operaciones.add(btnSubir);
		
		JButton btnBajar = new JButton("bajar");
		btnBajar.setBounds(256, 184, 88, 25);
		operaciones.add(btnBajar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(356, 184, 97, 25);
		operaciones.add(btnEliminar);
		
		JButton btnAadir_1 = new JButton("A\u00F1adir");
		btnAadir_1.setBounds(31, 81, 117, 25);
		operaciones.add(btnAadir_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(336, 221, 117, 25);
		operaciones.add(btnAceptar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Resultados", null, panel_1, null);
		
		table = new JTable();
		panel_1.add(table);
	}
}
