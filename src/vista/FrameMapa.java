package vista;


import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameMapa extends JFrame {

	
	static PanelJuego Panel;
	
	/**  Creación Frame Juego.*/
	public FrameMapa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		setResizable(false);
		setTitle("Partida");
		Panel = new PanelJuego();
		getContentPane().add(Panel);
		Panel.setLayout(null);
		setVisible(true);
	}
	
	public void Pintar(List<int[]> list, int[] fruta) {
		Panel.setDatos(list, fruta);
		Panel.repaint();
	}

}
