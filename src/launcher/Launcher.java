package launcher;

import controlador.ControladorInicio;
import vista.FrameInicio;

public class Launcher {

	public static void main(String[] args) {
		try {
			FrameInicio m = new FrameInicio();
			ControladorInicio ci = new ControladorInicio(m);
		} catch (Exception e) {
			System.out.println("Carajo");
		}
	}

}
