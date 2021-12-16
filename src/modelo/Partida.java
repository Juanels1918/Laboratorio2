package modelo;

import javax.swing.JOptionPane;

import controlador.ControladorMapa;

public class Partida {
	
	private int direccion;
	private Fruta fruta;
	private Snake snake;
	
	
	public Partida() {
		this.fruta = new Fruta();
		this.snake = new Snake();
	}
	
	public void reiniciar() {
		ControladorMapa.detenerHilos();
		JOptionPane.showMessageDialog(null, "Te moriste :C");
	}
	
	 public void setDireccion(int i) {
		this.direccion = i;
	}
	
	public int getDireccion() {
		return this.direccion;
	}

	public Fruta getObjFruta() {
		return this.fruta;
	}

	public void setObjFruta(Fruta fruta) {
		this.fruta = fruta;
	}

	public Snake getObjSnake() {
		return this.snake;
	}

	public void setObjSnake(Snake snake) {
		this.snake = snake;
	}
	
	
	
}
