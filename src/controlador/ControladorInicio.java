package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Partida;
import vista.FrameInicio;
import vista.FrameMapa;

public class ControladorInicio implements ActionListener{

	private FrameInicio vista;
	
	public ControladorInicio(FrameInicio vista) {
		this.vista = vista;
		this.vista.btnIniciar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FrameMapa mapaFrame = new FrameMapa();
		Partida mapaModel = new Partida();
		ControladorTeclas ct = new ControladorTeclas();
		ControladorMapa cm = new ControladorMapa(mapaFrame,mapaModel, ct);
	}
	
	public void activar( ) {
		this.vista.setVisible(true);
	}

	
}
