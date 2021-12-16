package launcher;

import controlador.ControladorInicio;
import vista.FrameInicio;

public class Launcher {

	
	public static void main(String[] args) {
		try {
			
			System.out.println("In");
			FrameInicio m = new FrameInicio();
			ControladorInicio ci = new ControladorInicio(m);
			System.out.println("Out");
		} catch (Exception e) {
			System.out.println("Carajo");
		}
	}

}
