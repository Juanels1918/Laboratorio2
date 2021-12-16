package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Snake {

	static List<int []> Snake = new ArrayList<>(); //Cuerpo del snake
	static int[] cabeza;
	
	public Snake() {
		int[] a = {50,50};
		Snake.add(a);
	}

	public static List<int[]> getSnake() {
		return Snake;
	}

	public void setSnake(List<int[]> snake) {
		Snake = snake;
	}
	
	public static void avanzar(int i) {
		int[] ultimo = Snake.get(Snake.size()-1);
		int avX = 0;
		int avY = 0;
		
		switch (i) {
		case 1 -> avX+=10; //Derecha
		case 3 -> avX-=10; //Izquierda
		case 2 -> avY+=10; //Bajar
		case 4 -> avY-=10; //Subir
		}
		int[] nuevo = {Math.floorMod(ultimo[0]+avX, 400),Math.floorMod(ultimo[1]+avY, 300)};
		Snake.add(nuevo);
		cabeza = nuevo;
		Snake.remove(0);
	}
	
	public boolean vida() {
		boolean muerte = false;
		if (Snake.size()>1) {
			for (int j = 0; j < Snake.size()-1; j++) { //Recorre el tamaño de la serpiente por cada espacio que avance
				if (cabeza[0] == Snake.get(j)[0] && cabeza[1] == Snake.get(j)[1]) {
					muerte = true;
					break;
				}
			}
		}
		return muerte;
	}
	
	public boolean comer(int[] fruta) {
		if (Snake.get(0)[0] == fruta[0] && Snake.get(0)[1] == fruta[1]) {
			Snake.add(0, Snake.get(0));
			return true;
		}  
		return false;
	}
	
	
}
