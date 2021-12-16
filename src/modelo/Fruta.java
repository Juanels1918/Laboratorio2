package modelo;

public class Fruta {

	private static int[] coo = new int[2];
	static boolean estado;
	public Fruta() {
		setCoo();
		setEstado(true);
	}

	public static int[] getCoo() {
		return coo;
	}
	
	public static boolean getEstado() {
		return estado;
	}
	
	public void setCoo() {
		this.coo[0] = (int) (Math.random()*300);
		this.coo[0] -= (this.coo[0]%10); 
		this.coo[1] = (int)(Math.random()*300);
		this.coo[1] -= (this.coo[1]%10);
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
