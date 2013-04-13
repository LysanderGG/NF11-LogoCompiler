/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Traceur {
	private final int SIZE = 1000;
	
	private static Traceur s_instance;
	private Graphics2D m_g2d;
	private double m_dInitX = 300, m_dInitY = 300;   // position initiale
	private double m_dPosX = m_dInitX, m_dPosY = m_dInitY; // position courante
	private int m_iAngle = 90;
	private double m_dTeta;
	private boolean	m_bIsDrawing = true;
	
	public Traceur() {
		setTeta();
	}

	public void setGraphics(Graphics g) {
		m_g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	private void setTeta() {
		m_dTeta = Math.toRadians(m_iAngle);
	}
	
	public void avance(double r) {
		double a = m_dPosX + r * Math.cos(m_dTeta) ;
		double b = m_dPosY - r * Math.sin(m_dTeta) ;
		int x1 = toInt(m_dPosX);
		int y1 = toInt(m_dPosY);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(m_bIsDrawing) {
			m_g2d.drawLine(x1,y1,x2,y2);
		}
		m_dPosX = a;
		m_dPosY = b;
	}
	
	public void recule(double r) {
		double a = m_dPosX - r * Math.cos(m_dTeta) ;
		double b = m_dPosY + r * Math.sin(m_dTeta) ;
		int x1 = toInt(m_dPosX);
		int y1 = toInt(m_dPosY);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(m_bIsDrawing) {
			m_g2d.drawLine(x1,y1,x2,y2);
		}
		m_dPosX = a;
		m_dPosY = b;
	}
	
	public void bc() {
		m_bIsDrawing = true;
	}
	
	public void lc() {
		m_bIsDrawing = false;
	}
	
	public void td(double r) {
		m_iAngle = (m_iAngle - toInt(r)) % 360;
		setTeta();
	}
	
	public void tg(double r) {
		m_iAngle = (m_iAngle + toInt(r)) % 360;
		setTeta();
	}

	public void ve() {
		m_g2d.clearRect(0, 0, SIZE, SIZE);

	}

	public void fPos(double x, double y) {
		m_dPosX = x;
		m_dPosY = y;
	}

	public void setColor(int color) {		
		switch(color % 8) {
		case 0:
			m_g2d.setColor(Color.BLACK);
			break;
		case 1:
			m_g2d.setColor(Color.RED);
			break;
		case 2:
			m_g2d.setColor(Color.GREEN);
			break;
		case 3:
			m_g2d.setColor(Color.YELLOW);
			break;
		case 4:
			m_g2d.setColor(Color.BLUE);
			break;
		case 5:
			m_g2d.setColor(Color.MAGENTA);
			break;
		case 6:
			m_g2d.setColor(Color.CYAN);
			break;
		case 7:
			m_g2d.setColor(Color.WHITE);
			break;
		default:
			break;
		}
	}

}
