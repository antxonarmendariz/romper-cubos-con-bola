import java.awt.Color;
import java.awt.Graphics;

public class plataform extends inicio implements centrodecontrol{

	private double x, y;
	private static boolean derecha, izquierda;
	
	public plataform() {
		derecha = false; izquierda = false;
		x = wide/2 -75;
		y = 850;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)x, (int)y, 150, 30);
	}

	public void move() {
		if(izquierda) {
			x -= 6;
		}else if(derecha){
			x += 6;
		}
		if(x > wide-150) {
			x = wide-150;
		}else if(x < 0) {
			x = 0;
		}
	}
	
	public void modify() {
		
	}
	public void izquierdaAcel(boolean imput) {
		izquierda = imput;
	}
	
	public void derechaAcel(boolean imput) {
		derecha = imput;
	}
	public boolean getizquierda() {
		return izquierda;
	}
	public boolean getderecha() {
		return derecha;
	}
	public int getx() {
		return (int) x;
	}
	public int gety() {
		return (int) y;
	}
}
