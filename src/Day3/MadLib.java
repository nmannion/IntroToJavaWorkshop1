package Day3;

import javax.swing.JOptionPane;

public class MadLib {
public static void main(String[] args) {
	String verb= JOptionPane.showInputDialog("Enter a verb/ing");
	String adjective= JOptionPane.showInputDialog("Enter an adjective");
	String verb2= JOptionPane.showInputDialog("Enter a verb/ing");
	String part= JOptionPane.showInputDialog("Enter a part of body");
	String adverb= JOptionPane.showInputDialog("Enter an adverb");
	String part2= JOptionPane.showInputDialog("Enter a part of body");
	JOptionPane.showMessageDialog(null, "Most doctors agree that bicycle "+verb+" is a/an "+adjective+" form of exercise. "+verb2+" a bicyle enables you to develop your "+part+" muscles as well as "+adverb+" increase the rate of your "+part2);
	
}
}
