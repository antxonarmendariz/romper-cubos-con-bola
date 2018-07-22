import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class inicio extends Applet implements Runnable, KeyListener{
	protected final int wide = 800, high = 1000;
	private Random rand = new Random();
	private static boolean iniciar;
	protected plataform barra;
	private ball pelota;
	private static int i = 0, h = 0, k = 0;
	private angulo anglee;
	private double xVel, yVel;
	private boolean izquierda, derecha;
	private bloques block;
	private int xblock, yblock, xbarra, ybarra, vida;
	protected int  nbloques = 73;
	
	public void init() {
		this.resize(wide, high);
		this.addKeyListener(this);
		iniciar = false;
		barra = new plataform();
		pelota = new ball();
		anglee = new angulo();
		for(int j = 0; j < 2; j++) {
			block = new bloques();
		}
		block.blockvidainicio();
		
		Thread hilillo = new Thread(this);
		hilillo.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, wide, high);
		if(pelota.gety() > 1000) {
			g.setColor(Color.red);
			g.drawString("GAME OVER", 390, 500);
		}else {
			barra.draw(g);
			pelota.draw(g);
			for(int j = 0; j < nbloques; j++) {
				xblock = block.getx(j);
				yblock = block.gety(j);
				vida = block.getvida(j);
				block.draw(g, xblock, yblock, vida);
			}
			if(h == 0) {
				anglee.drawangle(g);
			}
			
		}
	}
	public void run() {
		while(true) {
			
			if(iniciar) {
				pelota.move();
				xbarra = barra.getx();
				pelota.colisionbarra(xbarra);
				for(int p = 0; p < nbloques; p++) {
					k = 0;
					xblock = block.getx(p);
					yblock = block.gety(p);
					vida = block.getvida(p);
					k = pelota.colisionbloque(xblock, yblock, vida);
					if(k == 1) {
						block.blockvida(p);
					}
				}
				
				h = 1;	
			}else {
				i++;
				if (i >= 36000) {
					i = 0;
				}
				derecha = barra.getderecha();
				izquierda = barra.getizquierda();
				anglee.lineaenplataforma(derecha, izquierda);
				pelota.pelotaenplataforma(derecha, izquierda);	
				pelota.angle(i);
				xVel = pelota.getxVel();
				yVel = pelota.getyVel();
				anglee.angle(xVel, yVel);
			}
			barra.move();
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_A) {
			barra.izquierdaAcel(true);
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			barra.derechaAcel(true);
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			iniciar = true;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_A) {
			barra.izquierdaAcel(false);
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			barra.derechaAcel(false);
		}
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
}
