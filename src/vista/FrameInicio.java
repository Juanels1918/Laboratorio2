package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

public class FrameInicio extends JFrame {

	private JPanel panel1;

	public JButton btnIniciar;
	
	/**  Creación Frame principal.*/
	public FrameInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel1 = new JPanel();
		panel1.setLayout(null);
		setContentPane(panel1);
		setVisible(true);
		setTitle("El melhor Snake del mundinhio :3");
		setLocationRelativeTo(null);
		setContentPane(panel1);
		setResizable(false);
		panel1.setBackground(new Color(32, 178, 170));
		panel1.add(btnIniciar());
	}
	
	public JButton btnIniciar() {
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(161, 169, 117, 25);
		return btnIniciar;
	}

	public void setbtnIniciar(JButton boton) {
		this.btnIniciar = boton;
	}
	
}
