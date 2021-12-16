package modelo;

public class Fruta {

	private int[] coo = new int[2];
	private boolean estado;
	public Fruta() {
		setCoo();
		setEstado(true);
	}

	public int[] getCoo() {
		return this.coo;
	}
	
	public boolean getEstado() {
		return this.estado;
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
