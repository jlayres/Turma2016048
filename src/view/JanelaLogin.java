package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JanelaLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton btok, btsair, btcadastrar;
	JLabel logotipo, nome, senha;
	JTextField nome1;
	JPasswordField senha1;

	public JanelaLogin(String titulo) {
		super();
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setSize(800, 600);
		this.setLayout(null);
		this.setResizable(false);

		this.btok = new JButton("OK");
		this.btsair = new JButton("Sair");
		this.btcadastrar = new JButton("Cadastrar");

		this.logotipo = new JLabel();
		this.nome = new JLabel("Nome");
		this.senha = new JLabel("Senha");

		this.nome1 = new JTextField();
		this.senha1 = new JPasswordField();

		// criar imageicon para botões e logotipo

		this.getContentPane().add(btok);
		this.getContentPane().add(btsair);
		this.getContentPane().add(btcadastrar);
		this.getContentPane().add(logotipo);
		this.getContentPane().add(nome);
		this.getContentPane().add(nome1);
		this.getContentPane().add(senha);
		this.getContentPane().add(senha1);

		this.btok.setBounds(250, 400, 50, 50);
		this.btsair.setBounds(350, 400, 50, 50);
		this.btcadastrar.setBounds(450, 400, 50, 50);

		btok.addActionListener(this);
		btsair.addActionListener(this);
		btcadastrar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btok) {
			JOptionPane.showMessageDialog(null, "Em construção");
		}
		if (e.getSource() == this.btsair) {
			int option = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");
			if (option == JOptionPane.OK_OPTION) {
				dispose();
			}
		}
		if (e.getSource() == this.btcadastrar) {
			JOptionPane.showMessageDialog(null, "Em construção");
		}

	}

}
