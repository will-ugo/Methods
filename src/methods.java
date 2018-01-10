import javax.swing.*;

public class methods {
	double base;
	double height;
	double Area;
	
	public void setBase(double b) {
		base = b;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void Area() {
		JOptionPane.showMessageDialog(null, "The Area of the Triangle is " + (0.5 * (getBase() * getHeight())));
	}
}
