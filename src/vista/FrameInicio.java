package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameInicio extends JFrame {

	private JPanel panel1;
	public JButton btnIniciar;

	/**
	 * Create the frame.
	 */
	public FrameInicio() {

		setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("El melhor Snake del mundinhio :3");
		setLocationRelativeTo(null);
		setResizable(false);
		panel1 = new JPanel();
		panel1.setLayout(null);
		setContentPane(panel1);
		panel1.setBackground(new Color(32, 178, 170));
		panel1.add(imagen());
		panel1.add(btnIniciar());
		setVisible(true);
	}

	public JButton btnIniciar() {
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(161, 200, 117, 25);
		return btnIniciar;
	}
	
	public void setbtnIniciar(JButton boton) {
		this.btnIniciar = boton;
	}
	
	public JPanel imagen() {
		JPanel PImagen =  new JPanel();
		PImagen.setBackground(new Color(102, 205, 170));
		PImagen.setLayout(null);
		PImagen.setBounds(30, 0, 374 , 189);
		
		JLabel LImagen = new JLabel();
		ImageIcon foto = new ImageIcon(this.getClass().getResource("/imagenes/baner.jpeg"));
			Image imagen = foto.getImage() ;
			Image imagen2 = imagen.getScaledInstance(350, 160, Image.SCALE_SMOOTH);
		foto = new ImageIcon(imagen2);
		LImagen.setIcon(foto);
		
		LImagen.setBounds(12, 13, 350, 160);
		PImagen.add(LImagen);
		PImagen.setVisible(true);
		return PImagen;
	}
	

}
