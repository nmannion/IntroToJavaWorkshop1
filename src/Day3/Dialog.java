package Day3;

import javax.swing.JOptionPane;

public class Dialog {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "yooyoyoyoyo");
	String name= JOptionPane.showInputDialog("Enter your Name");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, "Hello, "+ name);
}
}
