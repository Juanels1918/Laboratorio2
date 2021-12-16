package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Fruta;
import modelo.Mapa;
import modelo.Snake;
import vista.FrameInicio;
import vista.FrameMapa;

public class ControladorInicio implements ActionListener{

	private FrameInicio vista;
	
	public ControladorInicio(FrameInicio vista) {
		vista.btnIniciar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FrameMapa mapaFrame = new FrameMapa();
		Mapa mapaModel = new Mapa();
		Fruta frutaModel = new Fruta();
		Snake snake = new Snake();
		ControladorTeclas ct = new ControladorTeclas();
		ControladorMapa cm = new ControladorMapa(mapaFrame,mapaModel,frutaModel, snake, ct);
		System.out.println("Se crea el mapa");
	}

	
}
