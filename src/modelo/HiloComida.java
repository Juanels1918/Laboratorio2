package modelo;

import controlador.ControladorMapa;

public class HiloComida extends Thread{
	
	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			
			
			if(ControladorMapa.partida.getObjSnake().comer(ControladorMapa.partida.getObjFruta().getCoo()) == true) {
				ControladorMapa.partida.getObjFruta().setCoo();
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
