package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;

import modelo.Fruta;
import modelo.Snake;

public class PanelJuego extends JPanel {

	/** Creacion panel Juego*/
	static List<int []> snakeCopia = new ArrayList<>();
	int[] fruta;
	
	public PanelJuego() {
		this.setBounds(50, 50, 400, 400);
	}
	
	public void setDatos(List<int[]> snakeCopia, int[] frutaCopia){
		this.snakeCopia = snakeCopia;
		this.fruta = frutaCopia;
	}
	
	public void paint(Graphics g) { 
		
        super.paintComponent(g);
        
        for (int i = 0; i < snakeCopia.size(); i++) {
        	g.fillRect(snakeCopia.get(i)[0],snakeCopia.get(i)[1],10,10);
        }
        
        g.setColor(new Color(255,0,0));
        g.fillRect(fruta[0],fruta[1],11,10); 
	}

}
