
public class Enemigo {
	private int posx; 
	private int posy;
	private float veloy; 
	
	
	public Enemigo(int px, int py) {
		
		posx = px; 
		posy = py;
		veloy = 2; 
		
	}

	public void moverlo() {
	
		posy -= veloy; 
	}
	public int getPosx() {
		return posx;
	}


	public void setPosx(int posx) {
		this.posx = posx;
	}


	public int getPosy() {
		return posy;
	}


	public void setPosy(int posy) {
		this.posy = posy;
	}

}
