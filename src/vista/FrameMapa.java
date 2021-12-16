package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


import modelo.Snake;

public class FrameMapa extends JFrame {

	
	static PanelJuego Panel;
	
	/**  Creación Frame Juego.*/
	public FrameMapa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setResizable(false);
		setTitle("Partida");
		Panel = new PanelJuego();
		getContentPane().add(Panel);
		Panel.setLayout(null);
		setVisible(true);
	}
	
	public static void Pintar(List<int[]> list, int[] fruta) {
		Panel.setDatos(list, fruta);
		Panel.repaint();
	}
	
	
	

}
