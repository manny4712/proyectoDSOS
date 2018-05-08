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
	private JTextField txtFf;
	private JTable table;

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
		setBounds(100, 100, 488, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 482, 315);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Inicio", null, panel, null);
		panel.setLayout(null);
		
		txtFf = new JTextField();
		txtFf.setBounds(31, 12, 266, 19);
		panel.add(txtFf);
		txtFf.setColumns(10);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(310, 9, 117, 25);
		panel.add(btnAbrir);
		
		JLabel lblOperaciones = new JLabel("Operaciones");
		lblOperaciones.setBounds(12, 42, 107, 15);
		panel.add(lblOperaciones);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Resta", "Suma", "Multiplicacion", "Division"}));
		comboBox.setBounds(22, 61, 132, 24);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Pares"}));
		comboBox_1.setBounds(22, 215, 132, 24);
		panel.add(comboBox_1);
		
		JLabel lblFiltros = new JLabel("Restricciones");
		lblFiltros.setBounds(12, 188, 107, 15);
		panel.add(lblFiltros);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(31, 251, 117, 25);
		panel.add(btnAadir);
		
		JList list = new JList();
		list.setBounds(173, 43, 292, 160);
		panel.add(list);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(84, 90, 70, 20);
		panel.add(spinner);
		
		JButton btnSubir = new JButton("subir");
		btnSubir.setBounds(182, 214, 70, 25);
		panel.add(btnSubir);
		
		JButton btnBajar = new JButton("bajar");
		btnBajar.setBounds(256, 214, 88, 25);
		panel.add(btnBajar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(356, 214, 97, 25);
		panel.add(btnEliminar);
		
		JButton btnAadir_1 = new JButton("A\u00F1adir");
		btnAadir_1.setBounds(31, 111, 117, 25);
		panel.add(btnAadir_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(336, 251, 117, 25);
		panel.add(btnAceptar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Resultados", null, panel_1, null);
		
		table = new JTable();
		panel_1.add(table);
	}
}
