import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	PImage fondo; 
	float y; 
	float radio; 
	Personaje yo; 
	ArrayList<Enemigo> mal; 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");

	}
	public void settings() {
		size(500,600); 

	}

	public void setup() {
		
		fondo = loadImage("images/fondo.png"); 
		y=0; 
		yo = new Personaje(255,250); 
		radio = 25/2; 
		mal = new ArrayList<Enemigo>();
		for(int i =0; i<30; i++) {
			mal.add(new Enemigo((int)random(0,500),
					(int)random(800,1800))); 
		}
	

	}

	public void draw() {
		background(0);
		image(fondo,0,y); 
		y--; 
		if(y< -1100) {
			y=-1100; 
		}
		
		//////////////////
		if(yo.getPosy()>=335) {
			textSize(20); 
			fill(0); 
			text("que se acabe el semestre ya pls",80,500); 
		}
		if(keyPressed) {
			if(key=='d') {
				yo.setPosx(yo.getPosx()+3);
				
				float end =  500 - radio; 
				if(yo.getPosx()>= end) {
					yo.setPosx(500-(25/2));
					
				}
			}
			if(key=='a') {
				yo.setPosx(yo.getPosx()-3);
				if(yo.getPosx()<= 25/2) {
					yo.setPosx(25/2);
					
				}
			}
			if(key=='w') {
				yo.setPosy(yo.getPosy()-3);
				if(yo.getPosy()<= radio) {
					yo.setPosy(25/2);
					
				}
			}
			if(key=='s') {
				yo.setPosy(yo.getPosy()+3);
				
				if(y> -1100) {
					
					if(yo.getPosy()>300) {
						yo.setPosy(300);; 
					}
					
					
				}else {
					if(yo.getPosy()>= 600-(25/2)) {
						
						yo.setPosy(600-(25/2));
						
						
					}
					
				}
				
				
				
			}
			
		}
		////////////////////////////////////
		fill(255,100,30); 
		ellipse(yo.getPosx(),yo.getPosy(),25,25); 
		for(int i = 0; i<30;i++) {
			fill(0); 
			ellipse(mal.get(i).getPosx(),mal.get(i).getPosy(),30,30); 
			mal.get(i).moverlo(); 
			
			
		} 

		
		//textSize(20); 
		//text("posx: "+mouseX+"posy: "+mouseY, mouseX,mouseY ); 
		

	}
	


}
