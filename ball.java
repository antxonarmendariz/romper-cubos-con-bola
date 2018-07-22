import java.awt.Color;
import java.awt.Graphics;

public class ball extends inicio implements centrodecontrol{

	private double x, y, xdif;
	private double xVel, yVel;
	
	public ball() {
		x = wide/2 -10;
		y = 830;
		xVel = 1;
		yVel = -2;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval((int)x, (int)y, 20, 20);
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
		xVel = Math.cos(i/100)*5;
		yVel = Math.sin(i/100)*5;
		if(yVel > 0 ) {
			yVel = -yVel;
		}
	}
	public void pelotaenplataforma( boolean derecha, boolean izquierda) {
		if(izquierda) {
			x -= 6;
		}else if(derecha){
			x += 6;
		}
		if(x > wide-90) {
			x = wide-90;
		}else if(x < 60) {
			x = 60;
		}
	}
	public void colisionbarra(int xbarra) {
		if(y > 831 && y < 836 ) {
			if(x > xbarra-20 && x < xbarra + 140) {
				xdif = x - xbarra;
				xdif = xdif/150;
				xdif = xdif*180;
				xVel = -Math.cos(xdif)*5;
				yVel = Math.sin(xdif)*5;
				if(yVel > 0 ) {
					yVel = -yVel;
				}
				if(xdif > 90) {
					xVel = -xVel;
				}
			}
		}
		
	}
	public double getxVel(){
		return xVel;
	}
	public double getyVel(){
		return yVel;
	}
	public int colisionbloque(int xbloque, int ybloque, int vida) {
		int k = 0;
		if(vida != 0) {
			if(x >= xbloque && x <= xbloque+5) {
				if(y >= ybloque && y <= ybloque + 50) {
					xVel = -xVel;
					k = 1;
				}
			}else if(x >= xbloque+45 && x <= xbloque+50) {
				if(y >= ybloque && y <= ybloque + 50) {
					xVel = -xVel;
					k = 1;
				}
			}else if(y >= ybloque+45 && y <= ybloque+50) {
				if(x >= xbloque && x <= xbloque + 50) {
					yVel = -yVel;
					k = 1;
				}
			}else if(y >= ybloque && y <= ybloque+5) {
				if(x >= xbloque && x <= xbloque + 50) {
					yVel = -yVel;
					k = 1;
				}
			}
		}
		return k;
	}
	public int gety() {
		return (int) y;
	}
}
