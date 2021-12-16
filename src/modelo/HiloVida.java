package modelo;

import controlador.ControladorMapa;

public class HiloVida extends Thread {

	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			if(ControladorMapa.partida.getObjSnake().vida() == true) {
				ControladorMapa.partida.reiniciar();
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
