import javax.swing.*;

public class Main {
	public static void main (String args[]) {
		try {
		methods Object = new methods();
		String baseString = JOptionPane.showInputDialog("Enter Base Here");
		if (baseString == null) { 
			JOptionPane.showMessageDialog(null, "You ended the program");
			System.exit(0);
		}
		else {
		String heightString = JOptionPane.showInputDialog("Enter Height Here");
		if (heightString == null) {
			JOptionPane.showMessageDialog(null, "You ended the program");
			System.exit(0);
		}
		else {
		double baseDouble = Double.parseDouble(baseString);
		double heightDouble = Double.parseDouble(heightString);
		
		Object.setBase(baseDouble);
		Object.setHeight(heightDouble);
		Object.Area();
		}
	  }
   }
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You closed the program");
		}
	}
}

