package _01_algorithms._2_fibonacci;

public class fibo_natatata {
public static void main(String[] args) {
	
	int num1 = 0;
	int num2 = 1;
	
	for(int i=0; i<12;i++) {
		System.out.print(String.valueOf(num1)+", "+String.valueOf(num2)+", "); 
		num1 += num2; num2 += num1;
	}	
}
}
