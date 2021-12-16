package modelo;

import controlador.ControladorMapa;

public class HiloPintar extends Thread{
	
	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			ControladorMapa.vista.Pintar(ControladorMapa.partida.getObjSnake().getSnake(), ControladorMapa.partida.getObjFruta().getCoo());
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
