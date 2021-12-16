package controlador;

import vista.FrameMapa;
import java.awt.event.KeyListener;

import modelo.HiloComida;
import modelo.HiloPintar;
import modelo.HiloSnake;
import modelo.HiloVida;
import modelo.Partida;

public class ControladorMapa {
	
	public static FrameMapa vista;
	public static Partida partida;
	ControladorTeclas ct;

	static HiloComida hc;
	static HiloSnake hs;
	static HiloPintar hp;
	static HiloVida hv;
	
	
	public ControladorMapa(FrameMapa vista, Partida partida, ControladorTeclas ct) {
		
		this.vista = vista;
		this.partida = partida;
		this.vista.addKeyListener((KeyListener) ct);
		hs = new HiloSnake();
		hc = new HiloComida();
		hp = new HiloPintar();
		hv = new HiloVida();
		hs.start();hp.start();hc.start();hv.start();
	}
	
	static public void detenerHilos() {
		hs.detenerHilo();
		hp.detenerHilo();
		hc.detenerHilo();
		hv.detenerHilo();
	}
	
}
