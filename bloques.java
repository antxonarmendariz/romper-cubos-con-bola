import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class bloques extends inicio{
	private Random rand = new Random();
	private int x = 0, y = 100;
	private int[] vida = new int[nbloques], ybl = new int[nbloques], xbl = new int[nbloques];
	public bloques() {
	
		
	}
	
	public void draw(Graphics g, int x1, int y1, int vida1) {
		if(vida1 == 1) {
			g.setColor(Color.GREEN);
			g.fillRect(x1, y1, 49, 49);
		}else if(vida1 == 2) {
			g.setColor(Color.RED);
			g.fillRect(x1, y1, 49, 49);
		}else if(vida1 == 3) {
			g.setColor(Color.BLUE);
			g.fillRect(x1, y1, 49, 49);
		}
		
	}
	public int getx(int id){
	
		return xbl[id];
	}
	public int gety(int id){
		
		return ybl[id];
	}
	public void blockvidainicio(){
		int cubporlin1 = 16, cubporlin2 = 0, difl = 0;
		for(int i = 0; i < nbloques-43; i++) {
			vida[i] = 3;
		}
		for(int i = nbloques-43; i < nbloques-21; i++) {
			vida[i] = 2;
		}
		for(int i = nbloques-21; i < nbloques-1; i++) {
			vida[i] = 1;
		}
		for(int i = 0; i < nbloques-1; i++) {
			if(cubporlin1 == i-cubporlin2) {
				cubporlin2 = cubporlin1 + cubporlin2;
				cubporlin1 = cubporlin1 -2;	
				y += 50;
			}
			ybl[i] = y; 
			
		}
		for(int i = 0; i < nbloques-1; i++) {
			if(x == 800) {
				difl += 50;
				x = 0;
			}
			xbl[i] = x;
			x += 50;
			if(400 - difl == x) {
				x = 400 + difl;
			}
		}
		
	}
	public void blockvida(int id){
		vida[id]--;
	}
	public int getvida(int id){
		
		return vida[id];
	}
}
