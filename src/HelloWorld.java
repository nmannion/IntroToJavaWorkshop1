import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HelloWorld {
public static void main(String[]x){
//JOptionPane.showMessageDialog(null, "Hello, it's me");
	Robot jeff=new Robot();
	Robot steve=new Robot(100,100);
	jeff.penDown();
	jeff.setPenWidth(30);
	jeff.setPenColor(Color.BLUE);
	int i=1;
	while(i<5){
	

		
		}

	jeff.move(250);
	jeff.turn(90);
	i+=1;
	}
	}	
