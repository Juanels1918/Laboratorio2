package controlador;

import vista.FrameMapa;
import java.awt.Point;
import java.awt.event.KeyListener;

import modelo.Fruta;
import modelo.HiloComida;
import modelo.HiloPintar;
import modelo.HiloSnake;
import modelo.HiloVida;
import modelo.Mapa;
import modelo.Snake;

public class ControladorMapa {
	
	public static FrameMapa vista;
	public static Mapa modelo;
	public static Fruta frutaModel;
	public static Snake snake;
	ControladorTeclas ct;
	static int tec;
	static HiloComida hc;
	static HiloSnake hs;
	static HiloPintar hp;
	static HiloVida hv;
	
	public ControladorMapa(FrameMapa vista, Mapa modelo, Fruta frutaModel, Snake snake, ControladorTeclas ct) {
		this.vista = vista;
		this.modelo = modelo;
		this.frutaModel = frutaModel;
		this.snake = snake;
		this.vista.addKeyListener((KeyListener) ct);
		this.vista.Pintar(this.snake.getSnake(), frutaModel.getCoo());
		hs = new HiloSnake();
		hc = new HiloComida();
		hp = new HiloPintar();
		hv = new HiloVida();
		hs.start();hp.start();hc.start();hv.start();
	}

	static public void cambiarDireccion(int i) {
		tec = i;
	}
	
	static public int getTecla() {
		return tec;
	}
	
	static public void detenerHilos() {
		hs.detenerHilo();
		hp.detenerHilo();
		hc.detenerHilo();
		hv.detenerHilo();
	}
	
}
