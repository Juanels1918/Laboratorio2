package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorTeclas implements KeyListener{
	@Override
	  public void keyPressed(KeyEvent e){
	    switch (e.getKeyCode()){
	      case KeyEvent.VK_UP:
	    	  ControladorMapa.cambiarDireccion(4);
	        break;
	      case KeyEvent.VK_DOWN:
	    	  ControladorMapa.cambiarDireccion(2);
	        break;
	      case KeyEvent.VK_LEFT:
	    	  ControladorMapa.cambiarDireccion(3);
	        break;
	      case KeyEvent.VK_RIGHT:
	    	  ControladorMapa.cambiarDireccion(1);
	        break;

	    }
	  }

	  @Override
	  public void keyTyped(KeyEvent e){}
	  
	  @Override
	  public void keyReleased(KeyEvent e){}
}
