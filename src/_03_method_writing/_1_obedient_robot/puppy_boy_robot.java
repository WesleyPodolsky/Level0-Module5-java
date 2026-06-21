package _03_method_writing._1_obedient_robot;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class puppy_boy_robot {
	public static void main(String[] args) {
	
		Robot robot = new Robot();
		
		robot.penDown();
		robot.hide();
		robot.setSpeed(100);
		String choice = JOptionPane.showInputDialog("square (s) circle (c) or triangle? (t)");
		if(choice.equals("s")) {
			drawSquare(robot);
		}
		else if(choice.equals("c")) {
			drawCircle(robot);
		}
		else if(choice.equals("t")) {
			drawTriangle(robot);
		}
	}
		
	public static void drawSquare(Robot robot) {
		System.out.println("drawing Square...");
		for(int i=0;i<4;i++) {
		robot.turn(90);
		robot.move(20); 
		}
	}
	
	public static void drawCircle(Robot robot) {
		System.out.println("drawing O...");
		for(int i=0;i<72;i++) {
		robot.turn(5);
		robot.move(3); 
		}
	}
	
	public static void drawTriangle(Robot robot) {
		System.out.println("drawing tribabyanglething...");
		for(int i=0;i<3;i++) {
		robot.turn(120);
		robot.move(15); 
		}
	}
		
		
	
}
