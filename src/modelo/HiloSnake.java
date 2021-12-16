package modelo;

import controlador.ControladorMapa;

public class HiloSnake  extends Thread{
	
	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			ControladorMapa.snake.avanzar(ControladorMapa.getTecla());
			try {
				Thread.sleep(250);
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
	}
	
	  public void detenerHilo(){
	        estado = false;
	    }
}
