package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {

	public static void main(String[] args) {
		
		boolean isPrime = true;
		String divBy = "";
		String numberStr = JOptionPane.showInputDialog("pick a number i dont got all day");
		int number = Integer.parseInt(numberStr);
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
				divBy = divBy +", " + String.valueOf(i);
				
			}
		}
		if(isPrime) { JOptionPane.showMessageDialog(null,"wow ur number is prime nice"); }
		else { JOptionPane.showMessageDialog(null,"nope, not prime. sorry. its divisible by" + divBy);}
		
	
	

}
}
