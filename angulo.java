import java.awt.Color;
import java.awt.Graphics;

public class angulo extends inicio{
	private double x1, x2, y1, y2;
	
	public angulo() {
		x1 = wide/2;
		x2 = x1 + 150;
		y1 = 830;
		y2 = y1;
	}
	
	public void drawangle(Graphics g) {
		g.setColor(Color.orange);
		g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
	}
	public void angle(double xVel, double yVel) {
		x2 = x1 + 30*xVel;
		y2 = y1 + 30*yVel;
	}
	public void lineaenplataforma( boolean derecha, boolean izquierda) {
		if(izquierda) {
			x1 -= 6;
		}else if(derecha){
			x1 += 6;
		}
		if(x1 > wide-75) {
			x1 = wide-75;
		}else if(x1 < 75) {
			x1 = 75;
		}
	}
}
