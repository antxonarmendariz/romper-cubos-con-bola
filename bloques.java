import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class bloques extends inicio{
	private Random rand = new Random();
	private int x, y;
	private int[] vida = new int[nbloques];
	public bloques() {
	
		
	}
	
	public void draw(Graphics g, int x1, int y1, int vida1) {
		if(vida1 == 1) {
			g.setColor(Color.GREEN);
			g.fillRect(x1, y1, 49, 49);
		}else if(vida1 == 2) {
			g.setColor(Color.RED);
			g.fillRect(x1, y1, 49, 49);
		}
		
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
		case 4:
			x = 200;
			break;
		case 5:
			x = 250;
			break;
		case 6:
			x = 300;
			break;
		case 7:
			x = 350;
			break;
		case 8:
			x = 400;
			break;
		case 9:
			x = 450;
			break;
		case 10:
			x = 500;
			break;
		case 11:
			x = 550;
			break;
		case 12:
			x = 600;
			break;
		case 13:
			x = 650;
			break;
		case 14:
			x = 700;
			break;
		case 15:
			x = 750;
			break;
		case 16:
			x = 0;
			break;
		case 17:
			x = 50;
			break;
		case 18:
			x = 100;
			break;
		case 19:
			x = 150;
			break;
		case 20:
			x = 200;
			break;
		case 21:
			x = 250;
			break;
		case 22:
			x = 300;
			break;
		case 23:
			x = 450;
			break;
		case 24:
			x = 500;
			break;
		case 25:
			x = 550;
			break;
		case 26:
			x = 600;
			break;
		case 27:
			x = 650;
			break;
		case 28:
			x = 700;
			break;
		case 29:
			x = 750;
			break;
		case 30:
			x = 0;
			break;
		case 31:
			x = 50;
			break;
		case 32:
			x = 100;
			break;
		case 33:
			x = 150;
			break;
		case 34:
			x = 200;
			break;
		case 35:
			x = 250;
			break;
		case 36:
			x = 500;
			break;
		case 37:
			x = 550;
			break;
		case 38:
			x = 600;
			break;
		case 39:
			x = 650;
			break;
		case 40:
			x = 700;
			break;
		case 41:
			x = 750;
			break;
		case 42:
			x = 0;
			break;
		case 43:
			x = 50;
			break;
		case 44:
			x = 100;
			break;
		case 45:
			x = 150;
			break;
		case 46:
			x = 200;
			break;
		case 47:
			x = 550;
			break;
		case 48:
			x = 600;
			break;
		case 49:
			x = 650;
			break;
		case 50:
			x = 700;
			break;
		case 51:
			x = 750;
			break;
		case 52:
			x = 0;
			break;
		case 53:
			x = 0;
			break;
		case 54:
			x = 50;
			break;
		case 55:
			x = 100;
			break;
		case 56:
			x = 150;
			break;
		case 57:
			x = 600;
			break;
		case 58:
			x = 650;
			break;
		case 59:
			x = 700;
			break;
		case 60:
			x = 750;
			break;
		case 61:
			x = 0;
			break;
		case 62:
			x = 50;
			break;
		case 63:
			x = 100;
			break;
		case 64:
			x = 650;
			break;
		case 65:
			x = 700;
			break;
		case 66:
			x = 750;
			break;
		case 67:
			x = 0;
			break;
		case 68:
			x = 50;
			break;
		case 69:
			x = 700;
			break;
		case 70:
			x = 750;
			break;
		case 71:
			x = 0;
			break;
		case 72:
			x = 750;
			break;
		}
	
		return x;
	}
	public int gety(int id){
		switch(id) {
		case 0:
			y = 100;
			break;
		case 1:
			y = 100;
			break;
		case 2:
			y = 100;
			break;
		case 3:
			y = 100;
			break;
		case 4:
			y = 100;
			break;
		case 5:
			y = 100;
			break;
		case 6:
			y = 100;
			break;
		case 7:
			y = 100;
			break;
		case 8:
			y = 100;
			break;
		case 9:
			y = 100;
			break;
		case 10:
			y = 100;
			break;
		case 11:
			y = 100;
			break;
		case 12:
			y = 100;
			break;
		case 13:
			y = 100;
			break;
		case 14:
			y = 100;
			break;
		case 15:
			y = 100;
			break;
		case 16:
			y = 100;
			break;
		case 17:
			y = 150;
			break;
		case 18:
			y = 150;
			break;
		case 19:
			y = 150;
			break;
		case 20:
			y = 150;
			break;
		case 21:
			y = 150;
			break;
		case 22:
			y = 150;
			break;
		case 23:
			y = 150;
			break;
		case 24:
			y = 150;
			break;
		case 25:
			y = 150;
			break;
		case 26:
			y = 150;
			break;
		case 27:
			y = 150;
			break;
		case 28:
			y = 150;
			break;
		case 29:
			y = 150;
			break;
		case 30:
			y = 200;
			break;
		case 31:
			y = 200;
			break;
		case 32:
			y = 200;
			break;
		case 33:
			y = 200;
			break;
		case 34:
			y = 200;
			break;
		case 35:
			y = 200;
			break;
		case 36:
			y = 200;
			break;
		case 37:
			y = 200;
			break;
		case 38:
			y = 200;
			break;
		case 39:
			y = 200;
			break;
		case 40:
			y = 200;
			break;
		case 41:
			y = 200;
			break;
		case 42:
			y = 250;
			break;
		case 43:
			y = 250;
			break;
		case 44:
			y = 250;
			break;
		case 45:
			y = 250;
			break;
		case 46:
			y = 250;
			break;
		case 47:
			y = 250;
			break;
		case 48:
			y = 250;
			break;
		case 49:
			y = 250;
			break;
		case 50:
			y = 250;
			break;
		case 51:
			y = 250;
			break;
		case 52:
			y = 300;
			break;
		case 53:
			y = 300;
			break;
		case 54:
			y = 300;
			break;
		case 55:
			y = 300;
			break;
		case 56:
			y = 300;
			break;
		case 57:
			y = 300;
			break;
		case 58:
			y = 300;
			break;
		case 59:
			y = 300;
			break;
		case 60:
			y = 300;
			break;
		case 61:
			y = 350;
			break;
		case 62:
			y = 350;
			break;
		case 63:
			y = 350;
			break;
		case 64:
			y = 350;
			break;
		case 65:
			y = 350;
			break;
		case 66:
			y = 350;
			break;
		case 67:
			y = 400;
			break;
		case 68:
			y = 400;
			break;
		case 69:
			y = 400;
			break;
		case 70:
			y = 400;
			break;
		case 71:
			y = 450;
			break;
		case 72:
			y = 450;
			break;
		}
		return y;
	}
	public void blockvidainicio(){
		for(int i = 0; i < nbloques; i++) {
			vida[i] = 2;
		}
	}
	public void blockvida(int id){
		vida[id]--;
	}
	public int getvida(int id){
		
		return vida[id];
	}
}
