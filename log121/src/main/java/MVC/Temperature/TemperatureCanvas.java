package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class TemperatureCanvas extends Canvas
{	
	private static final long serialVersionUID=1234;
	private TemperatureGauge _farenheit;
	private static final int width = 20;
	private static final int top = 20;
	private static final int left = 100;
	// private static final int right = 250;
	private static final int height = 200;

	public TemperatureCanvas(TemperatureGauge farenheit)
	{	
		_farenheit = farenheit;
	}
	
	public void paint(Graphics g)
	{	
		g.setColor(Color.black);
		g.drawRect(left,top, width, height);
		g.setColor(Color.red);
		g.fillOval(left-width/2, top+height-width/3,width*2, width*2);
		g.setColor(Color.black);
		g.drawOval(left-width/2, top+height-width/3,width*2, width*2);
		g.setColor(Color.white);
		g.fillRect(left+1,top+1, width-1, height-1);
		g.setColor(Color.red);
		long redtop = height*(_farenheit.get()-_farenheit.getMax())/(_farenheit.getMin()-_farenheit.getMax());
		g.fillRect(left+1, top + (int)redtop, width-1, height-(int)redtop);
	}
	
}
