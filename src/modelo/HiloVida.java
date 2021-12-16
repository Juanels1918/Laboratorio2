package modelo;

import javax.swing.JOptionPane;

import controlador.ControladorMapa;

public class HiloVida extends Thread {

	boolean estado = true;

	@Override
	public void run() {
		while (estado) {
			if(ControladorMapa.snake.vida() == true) {
				ControladorMapa.detenerHilos();
				JOptionPane.showMessageDialog(null, "Te moriste :C");
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
