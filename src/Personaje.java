
public class Personaje {
	private int posx; 
	private int posy; 
	private int velox; 
	private int veloy; 
	public Personaje(int px, int py) {
		velox =5; 
		veloy = 2; 
		posx = px; 
		posy = py;
		
	}
	
	public void mover() {
		posx += velox; 
		posy += veloy; 
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}
	public int getPosx() {
		return posx;
	}
	public int getPosy() {
		return posy;
	}

}
