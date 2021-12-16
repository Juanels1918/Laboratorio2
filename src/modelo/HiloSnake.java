package modelo;

import controlador.ControladorMapa;

public class HiloSnake  extends Thread{
	
	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			if(ControladorMapa.partida.getObjSnake().avanzar(ControladorMapa.partida.getDireccion()) == true) {
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
