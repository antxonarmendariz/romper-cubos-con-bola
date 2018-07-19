import java.awt.Color;
import java.awt.Graphics;

public class angulo extends inicio{
	private double x1, x2, y1, y2;
	
	public angulo() {
		x1 = wide/2;
		x2 = x1 + 150;
		y1 = 820;
		y2 = y1;
	}
	
	public void drawangle(Graphics g) {
		g.setColor(Color.orange);
		g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
	}
	public void angle(double xVel, double yVel) {
		x2 = x1 + 50*xVel;
		y2 = y1 + 50*yVel;
	}
	public void lineaenplataforma( boolean derecha, boolean izquierda) {
		if(izquierda) {
			x1 -= 4;
		}else if(derecha){
			x1 += 4;
		}
		if(x1 > wide-75) {
			x1 = wide-75;
		}else if(x1 < 75) {
			x1 = 75;
		}
	}
}
