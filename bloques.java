import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class bloques {
	private Random rand = new Random();
	private int x, y;
	public bloques() {
		
		
	}
	
	public void draw(Graphics g, int x1, int y1) {
		g.setColor(Color.GREEN);
		g.fillRect(x1, y1, 49, 49);
	}
	public int getx(int id){
		
		switch(id) {
		case 0:
			x = 0;
			break;
		case 1:
			x = 50;
			break;
		case 2:
			x = 100;
			break;
		case 3:
			x = 150;
			break;
	}
		return x;
	}
	public int gety(int id){
		switch(id) {
		case 0:
			y = 0;
			break;
		case 1:
			y = 0;
			break;
		case 2:
			y = 0;
			break;
		case 3:
			y = 0;
			break;
	}
		return y;
	}
}
