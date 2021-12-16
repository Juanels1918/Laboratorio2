package vista;


import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class FrameMapa extends JFrame {

	
	static PanelJuego Panel;
	
	/**  Creación Frame Juego.*/
	public FrameMapa() {
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		setResizable(false);
		setTitle("Partida");
		Panel = new PanelJuego();
		getContentPane().add(Panel);
		Panel.setLayout(null);
		setVisible(true);
	}
	
	public void Pintar(ArrayList<int[]> list, int[] fruta) {
		Panel.setDatos(list, fruta);
		Panel.repaint();
	}

}
