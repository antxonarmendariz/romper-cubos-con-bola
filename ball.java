import java.awt.Color;
import java.awt.Graphics;

public class ball extends inicio implements centrodecontrol{

	private double x, y;
	private double xVel, yVel;
	
	public ball() {
		x = wide/2 -10;
		y = 820;
		xVel = 1;
		yVel = -2;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval((int)x, (int)y, 30, 30);
	}

	public void move() {
		y += yVel;
		x += xVel;
		if(wide-30 < x) {
			xVel = -xVel;
		}else if(0 > x){
			xVel = -xVel;
		}else if(0 > y) {
			yVel = -yVel;
		}
	}

	public void modify() {
		
	}
	public void angle(double i) {
		xVel = Math.cos(i/100)*3;
		yVel = Math.sin(i/100)*3;
		if(yVel > 0 ) {
			yVel = -yVel;
		}
	}
	public void pelotaenplataforma( boolean derecha, boolean izquierda) {
		if(izquierda) {
			x -= 4;
		}else if(derecha){
			x += 4;
		}
		if(x > wide-90) {
			x = wide-90;
		}else if(x < 60) {
			x = 60;
		}
	}
	public void colisionbarra(int xbarra) {
		if(y > 821 && y < 830 ) {
			if(x > xbarra && x < xbarra + 150) {
				yVel = -yVel;
			}
		}
	}
	public double getxVel(){
		return xVel;
	}
	public double getyVel(){
		return yVel;
	}
	public void colisionbloque(int xbloque, int ybloque) {
		if(y > ybloque+45 && y < ybloque+55) {
			if(x > xbloque && x < xbloque + 50) {
				yVel = -yVel;
			}
		}
		if(x > xbloque+45 && x < xbloque+55) {
			if(y > ybloque && y < ybloque + 50) {
				xVel = -xVel;
			}
		}
		if(x > xbloque-5 && x < xbloque+5) {
			if(y > ybloque && y < ybloque + 50) {
				xVel = -xVel;
			}
		}
	}
}
