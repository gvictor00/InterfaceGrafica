package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField TxtdtNasc;
	private JLabel lbldtNasc;
	private JTextField txtRg;
	private JTextField txtCPF;
	private JTextField txtdtpris;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public View() throws IOException {
		// ========= INFORMACOES FIXAS DO PRESO =========
		String textoOUT = "Subtrair coisa móvel alheia, para si ou para outrem, mediante grave ameaça ou violência ou a pessoa, ou depois de havê-la por quealquer meio, reduzido à impossibilidade de resistência.";
		String nome = "George Victor de Souza Alves";
		String dt_nasc = "29/01/1992";
		String cpf = "08686721494";
		String dt_pris = "31/12/1963";
		ImageIcon img = new ImageIcon("foto.jpg");

		// ==============================================
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Trecho de coleta de dados

		txtNome = new JTextField();
		txtNome.setBounds(10, 50, 300, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 35, 46, 14);
		contentPane.add(lblNome);

		TxtdtNasc = new JTextField();
		TxtdtNasc.setBounds(428, 50, 112, 20);
		contentPane.add(TxtdtNasc);
		TxtdtNasc.setColumns(10);

		lbldtNasc = new JLabel("Data de Nascimento:");
		lbldtNasc.setBounds(428, 35, 112, 14);
		contentPane.add(lbldtNasc);

		txtRg = new JTextField();
		txtRg.setBounds(550, 50, 112, 20);
		contentPane.add(txtRg);
		txtRg.setColumns(10);

		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(550, 35, 46, 14);
		contentPane.add(lblRg);

		JComboBox sexoBox = new JComboBox();
		sexoBox.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		sexoBox.setBounds(320, 50, 98, 20);
		contentPane.add(sexoBox);

		JLabel lblNewLabel = new JLabel("Sexo:");
		lblNewLabel.setBounds(320, 35, 46, 14);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 137, 764, 2);
		contentPane.add(separator);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 91, 46, 14);
		contentPane.add(lblCpf);

		txtCPF = new JTextField();
		txtCPF.setBounds(10, 106, 136, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JLabel lbldtpris = new JLabel("Data da pris\u00E3o:");
		lbldtpris.setBounds(166, 91, 98, 14);
		contentPane.add(lbldtpris);

		txtdtpris = new JTextField();
		txtdtpris.setBounds(166, 106, 136, 20);
		contentPane.add(txtdtpris);
		txtdtpris.setColumns(10);

		// OUTPUT ITENS

		JLabel outputNAMElbl = new JLabel();
		outputNAMElbl.setText("New Text");
		outputNAMElbl.setBounds(166, 150, 360, 14);
		contentPane.add(outputNAMElbl);

		JLabel nmLabel = new JLabel("New Text");
		nmLabel.setBounds(20, 150, 46, 14);
		contentPane.add(nmLabel);

		JLabel outputCPFlbl = new JLabel("New Text");
		outputCPFlbl.setBounds(166, 175, 136, 14);
		contentPane.add(outputCPFlbl);

		JLabel cpflbl = new JLabel("New Text");
		cpflbl.setBounds(20, 175, 46, 14);
		contentPane.add(cpflbl);

		JLabel rglbl = new JLabel("New Text");
		rglbl.setBounds(20, 200, 46, 14);
		contentPane.add(rglbl);

		JLabel outputRGlbl = new JLabel("New Text");
		outputRGlbl.setBounds(166, 200, 112, 14);
		contentPane.add(outputRGlbl);

		JLabel lblNasc = new JLabel("New Text");
		lblNasc.setBounds(20, 225, 80, 14);
		contentPane.add(lblNasc);

		JLabel outputNASClbl = new JLabel("New Text");
		outputNASClbl.setBounds(166, 225, 98, 14);
		contentPane.add(outputNASClbl);

		JLabel sxlbl = new JLabel("New Text");
		sxlbl.setBounds(20, 250, 46, 14);
		contentPane.add(sxlbl);

		JLabel outputsxlbl = new JLabel("New Text");
		outputsxlbl.setBounds(166, 250, 98, 14);
		contentPane.add(outputsxlbl);

		JLabel dtprislbl = new JLabel("New Text");
		dtprislbl.setBounds(20, 275, 126, 14);
		contentPane.add(dtprislbl);

		JLabel outputCRIMElbl = new JLabel("Texto");
		outputCRIMElbl.setVerticalAlignment(SwingConstants.TOP);
		outputCRIMElbl.setBounds(20, 350, 480, 180);
		contentPane.add(outputCRIMElbl);

		JLabel artigolbl = new JLabel("New Text");
		artigolbl.setBounds(20, 300, 80, 14);
		contentPane.add(artigolbl);

		JLabel artigolbl1 = new JLabel("New Text");
		artigolbl1.setVerticalAlignment(SwingConstants.TOP);
		artigolbl1.setBounds(166, 300, 331, 43);
		contentPane.add(artigolbl1);

		JLabel outputdtprislbl = new JLabel("New Text");
		outputdtprislbl.setBounds(166, 275, 98, 14);
		contentPane.add(outputdtprislbl);

		JLabel imagelbl = new JLabel();
		imagelbl.setBounds(550, 150, 210, 240);
		contentPane.add(imagelbl);
				
		// BOTAO DE PESQUISAR
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{

				if (nome.toLowerCase().equals(txtNome.getText().toLowerCase())
						&& cpf.equals(txtCPF.getText())
						&& dt_nasc.equals(TxtdtNasc.getText())
						&& dt_pris.equals(txtdtpris.getText())
						){

					nmLabel.setText("Nome: ");
					outputNAMElbl.setText(txtNome.getText());
					cpflbl.setText("CPF: ");
					outputCPFlbl.setText(txtCPF.getText());
					rglbl.setText("RG: ");
					outputRGlbl.setText(txtRg.getText());
					lblNasc.setText("Dt. Nasc.: ");
					outputNASClbl.setText(TxtdtNasc.getText());
					sxlbl.setText("Sexo: ");
					outputsxlbl.setText((String) sexoBox.getSelectedItem());
					dtprislbl.setText("Dt. de Prisão: ");
					outputdtprislbl.setText(txtdtpris.getText());
					artigolbl.setText("Artigo:");
					artigolbl1.setText("Art. 157");
					outputCRIMElbl.setText("<html>" + textoOUT + "</html>");
					
					imagelbl.setIcon(img);
				} else {
					JOptionPane.showMessageDialog(null, "Informação invalida!");
				}
			}
		});
		btnPesquisar.setBounds(638, 500, 136, 50);
		contentPane.add(btnPesquisar);
	}
}
