
import java.awt.*;

import javax.swing.JPanel;

public abstract class AbstructDrawFunction extends JPanel{
	
	
	private Polygon p = new Polygon();
	protected AbstructDrawFunction(){
		drawFunction();
	}
	abstract double f(double x);
	
	public void drawFunction(){
		for(int x = -100;x<=100;x++){
			p.addPoint(x+200,200-(int)f(x));
		}
	}
	@Override
	protected void paintComponent(Graphics g){
		
	}

}
