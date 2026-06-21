package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skill_practice {
	public static void main(String[] args) {
		
		Random random = new Random(); 
		
		skill1(JOptionPane.showInputDialog("how many dimes do you have?"));
		skill2();
		skill3(random);
		skill4(JOptionPane.showInputDialog("what city do you live in?"),JOptionPane.showInputDialog("how many cars do you have?"));
		skill5(JOptionPane.showInputDialog("whats the name of your school?"));
		
	}
	
	
	public static void skill1(String dimesText) {
		int dimes = Integer.parseInt(dimesText);
		JOptionPane.showMessageDialog(null, "you have " +dimes*10 +" cents");
	}
	
	public static void skill2() {
		for(int i = 1; i<31; i++) {
			if(i % 3==0) {
				System.out.println(i);
			}
		}
	}
	public static void skill3(Random random) {
		int num1 = random.nextInt(20);
		int num2 = random.nextInt(10);
		JOptionPane.showMessageDialog(null, "distance between the two random numbers is " +(num1-num2) +".");
	}
	public static void skill4(String city, String carText) {
		int cars = Integer.parseInt(carText);
		if(city.equals("san diego") || city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "you live in america's finest city");
		}
		else {
			JOptionPane.showMessageDialog(null, "move to san diego.");
		}
		
		if(cars==0) {
			JOptionPane.showMessageDialog(null, "i bet you use public transportation");
		}
		else if(cars==1) {
			JOptionPane.showMessageDialog(null, "you drive a ram 1400");
		}
		else {
			JOptionPane.showMessageDialog(null, "you got " + cars*4 + " wheels. ");
		}
	}
	public static void skill5(String schoolName) {
		JOptionPane.showMessageDialog(null, schoolName + " is a fantastic school!");
	}

}
