package Day3;

import javax.swing.JOptionPane;

public class QuizGame {
public static void main(String[] args) {
String realanswer="700 pounds";
JOptionPane.showMessageDialog(null, "How much wood could a wood chuck chuck if a wood chuck could chuck wood?");
String answer=JOptionPane.showInputDialog("Enter answer here");
if(realanswer.equals(answer)){
JOptionPane.showMessageDialog(null, "gg m8");
}
if(!realanswer.equals(answer)){
JOptionPane.showMessageDialog(null, "lolnoobgetrekt");	
}
}
}