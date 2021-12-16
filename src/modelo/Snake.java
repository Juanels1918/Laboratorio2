package modelo;

import java.util.ArrayList;
import java.util.List;

public class Snake {

	private List<int []> Snake = new ArrayList<>(); //Cuerpo del snake
	private int[] cabeza = new int[2];;
	
	public Snake() {
		this.cabeza[0] = (int) (Math.random()*300);
		this.cabeza[0] -= (this.cabeza[0] %10); 
		this.cabeza[1] = (int) (Math.random()*300);
		this.cabeza[1] -= (this.cabeza[1] %10); 
		this.Snake.add(cabeza);
	}

	public List<int[]> getSnake() {
		return this.Snake;
	}

	public void setSnake(List<int[]> snake) {
		this.Snake = snake;
	}
	
	public boolean  avanzar(int i) {
		int[] ultimo = this.Snake.get(this.Snake.size()-1);
		int avX = 0;
		int avY = 0;
		
		switch (i) {
		case 1 -> avX+=10; //Derecha
		case 3 -> avX-=10; //Izquierda
		case 2 -> avY+=10; //Bajar
		case 4 -> avY-=10; //Subir
		}
		
		int[] nuevo = {Math.floorMod(ultimo[0]+avX, 400),Math.floorMod(ultimo[1]+avY, 300)};
		
		boolean muerte = false;
		if (this.Snake.size()>1) {
			for (int j = 0; j < this.Snake.size()-1; j++) { //Recorre el tamaño de la serpiente por cada espacio que avance
				if (nuevo[0] == this.Snake.get(j)[0] && nuevo[1] == this.Snake.get(j)[1]) {
					muerte = true;
					return muerte;
				}
			}
		}
		
		this.Snake.add(nuevo);
		this.Snake.remove(0);
		return muerte;
	}
	
	public boolean comer(int[] fruta) {
		if (this.Snake.get(0)[0] == fruta[0] && this.Snake.get(0)[1] == fruta[1]) {
			this.Snake.add(0, this.Snake.get(0));
			return true;
		}  
		return false;
	}
	
}
