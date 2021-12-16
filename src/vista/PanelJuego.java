package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class PanelJuego extends JPanel {
	
	private ArrayList<int []> snakeCopia = new ArrayList<>();
	int[] fruta;
	
	/** Creacion panel Juego*/
	public PanelJuego() {
		setBackground(new Color(32, 178, 170));
	}
	
	public void setDatos(ArrayList<int[]> snakeCopia, int[] frutaCopia){
		this.snakeCopia = snakeCopia;
		this.fruta = frutaCopia;
	}
	
	public void paint(Graphics g) { 
		
        super.paintComponent(g);
        
        try {
        	for (int i = 0; i < snakeCopia.size(); i++) {
            	g.fillRect(snakeCopia.get(i)[0],snakeCopia.get(i)[1],10,10);
            }
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        g.setColor(new Color(255,0,0));
        g.fillRect(fruta[0],fruta[1],11,10); 
	}

}
