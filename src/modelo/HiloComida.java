package modelo;

import controlador.ControladorMapa;

public class HiloComida extends Thread{
	
	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			
			
			if(ControladorMapa.snake.comer(ControladorMapa.frutaModel.getCoo()) == true) {
				ControladorMapa.frutaModel.setCoo();
			}
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
