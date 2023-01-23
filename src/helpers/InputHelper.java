package helpers;

import javax.swing.JOptionPane;

public class InputHelper {
	
	public String inputData(String message) {
		
		String valor = JOptionPane.showInputDialog(message);
		return valor;
		
	}
}
