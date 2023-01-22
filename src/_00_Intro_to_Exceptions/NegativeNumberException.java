package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
 public void scaryPopup(){
	JOptionPane.showMessageDialog(null, "CRITICAL ERROR!!!");
}

public void printStackTrace() {
	// TODO Auto-generated method stub
	
}
}
