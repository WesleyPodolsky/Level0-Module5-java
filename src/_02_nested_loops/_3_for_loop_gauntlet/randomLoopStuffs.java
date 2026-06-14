package _02_nested_loops._3_for_loop_gauntlet;

public class randomLoopStuffs {
public static void main(String[] args) {
	
//NORMAL FOR LOOPS
	
	//1 to 100
	for(int i =0; i<101;i++) {System.out.print(i + ",");} System.out.println("");

	// 100 to 0
	for(int i =100; i>-1;i--) {System.out.print(i + ",");} System.out.println("");
	
	//evenNumbers
	for(int i =1; i<101;i++) {
		if(i%2==0) {
		System.out.print(i + ","); }}
	System.out.println(""); 
	
	//oddNumbers
		for(int i =1; i<101;i++) {
			if(i%2!=0) {
			System.out.print(i + ","); }}
		System.out.println(""); 
	
	//too500
		for(int i =1; i<501;i++) {
			if(i%2==0) {
			System.out.print(i + " is even, "); }
			else { System.out.print(i + " is is odd, "); }
		}System.out.println(""); 
		
	//777.
		for(int i =1; i<778;i++) {
			if(i%7==0) {
			System.out.print(i + " is a multiple of 7, "); }}
		System.out.println(""); 
	
	//birthDay
		for(int i =0; i<16;i++) {
			System.out.print("in "+ (i+2011) + " i was " + (i) + " years old, "); }
		System.out.println(""); 
		
//NESTED FOR LOOPS
		
		//numberSequence
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				System.out.print(i + " ");
				System.out.print(j + " ");
			}}
		//3x3
		for(int i=0;i<3;i++) {
			System.out.println("");
			for(int j=1; j<4; j++) {
				System.out.print((j+(i*3))+" ");
			}}
		//10x10
		for(int i=0;i<10;i++) {
			System.out.println("");
			for(int j=1; j<11; j++) {
				System.out.print((j+(i*10)) + " ");
			}}
		//starOutput 
		System.out.println("");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				if((2*i)+1+j==3) {System.out.println(" ");}
				else if((2*i)+1+j==5) {System.out.println("* *");}
				else{System.out.println("*");}
			}}
		
//BONUS
		//100to0Modded
		for(int i =0; i<101;i++) {System.out.print(100-i + ",");} System.out.println("");
		
}	
}
