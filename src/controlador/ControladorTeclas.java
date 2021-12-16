package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorTeclas implements KeyListener{
	@Override
	  public void keyPressed(KeyEvent e){
	    switch (e.getKeyCode()){
	      case KeyEvent.VK_UP:
	    	  ControladorMapa.partida.setDireccion(4);
	        break;
	      case KeyEvent.VK_DOWN:
	    	  ControladorMapa.partida.setDireccion(2);
	        break;
	      case KeyEvent.VK_LEFT:
	    	  ControladorMapa.partida.setDireccion(3);
	        break;
	      case KeyEvent.VK_RIGHT:
	    	  ControladorMapa.partida.setDireccion(1);
	        break;

	    }
	  }

	  @Override
	  public void keyTyped(KeyEvent e){}
	  
	  @Override
	  public void keyReleased(KeyEvent e){}
}
