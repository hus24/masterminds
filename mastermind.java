
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class mastermind {
	public static void main(String[] args) {
		int guess = 1;
		System.out.println("Welcome to Mastermind. You have only five guesses before the game is over.");
		int realnumone = (int) (Math.random()*5)+1;
		int realnumtwo = (int) (Math.random()*5)+1;
		int realnumthree = (int) (Math.random()*5)+1;
		while(guess!=0) {
			System.out.println();
			
			System.out.println("Guess: "+guess);
			System.out.print("First number: ");
			Scanner input = new Scanner(System.in);
			int firstNum= input.nextInt();
			System.out.print("Second number: ");
			Scanner inputed = new Scanner(System.in);
			int secNum= input.nextInt();
			System.out.print("Third number: ");
			Scanner inputs = new Scanner(System.in);
			int thirdNum= input.nextInt();
			
			System.out.println(realnumone+ " "+realnumtwo+" "+ realnumthree );
			int position =0;
			int positioned = 0;
			int positions = 0;
			
			ArrayList bList = new ArrayList();
			bList.add(firstNum);
			bList.add(secNum);
			bList.add(thirdNum);
			ArrayList aList = new ArrayList();
			aList.add(realnumone);
			aList.add(realnumtwo);
			aList.add(realnumthree);
			if (bList.get(0)==aList.get(0)) {
				
			//if (realnumthree==firstNum || realnumthree==secNum || realnumthree==thirdNum || realnumtwo == firstNum || realnumtwo==secNum || realnumtwo==thirdNum || realnumone == firstNum || realnumone== secNum|| realnumone == thirdNum) {
				position=1; 
			}
			if (bList.get(1)==aList.get(1)) {
				positions=1;
			}
			if(bList.get(2)==aList.get(2)) {
				positioned = 1;
			}
			int sumed = position + positioned + positions;
			
			int count=0;
			int counts=0;
			int doublecount =0;
			int counted =0;
			
			
			//System.out.println(aList);
			if(aList.contains(firstNum)) {
				count=1;
			}
			if(aList.contains(secNum)) {
				counts=1;
			}
			if(aList.contains((thirdNum))) {
				counted=1;
			}
			//int sum = count+counts+counted+doublecount;
			//if (realnumthree==firstNum || realnumthree==secNum || realnumthree==thirdNum) {
				//count=1;
			//}
			//if (realnumtwo == firstNum || realnumtwo==secNum || realnumtwo==thirdNum) {
				//counts=1;
			//}
			//if (realnumone == firstNum || realnumone== secNum|| realnumone == thirdNum) {
				//counted=1;
			//}
			if (guess==4) {
				System.out.println("you have one more guess remaining!! Use it wisely. ");
			}
			int sum = count+counts+counted+doublecount;
			//int sum= num+nums+numed;
			//System.out.println(sum);
			guess++;
			
			
			System.out.println("you have "+sumed+" correct positions and "+sum+" correct numbers");
			if (sum==3 && sumed==3 ) {
				
				System.out.println("you have solved the puzzle in "+guess+" guesses");
				guess=1;
				System.out.println("Would you like to play again? 1 for yes and no for 0 ");
				Scanner inpu = new Scanner(System.in);
				int fin= input.nextInt();
				if (fin==1) {
					guess=1;
					
				}
				
				if (fin==0) {
					guess=0;
					System.out.println("thanks for playing!");
				}
			}
			
			if (guess==6) {
				guess=0;
				System.out.println();
				System.out.println("you lost potato head. Here were the real numbers: " +realnumone+ " "+realnumtwo+" "+ realnumthree );
			
			System.out.println("Would you like to play again? 1 for yes and no for 0 ");
			Scanner inpu = new Scanner(System.in);
			int fin= input.nextInt();
			if (fin==1) {
				guess=1;
				
			}
			
			if (fin==0) {
				guess=0;
				System.out.println("thanks for playing!");
			}
	}
		
		
}
	}

	private static Object ArrayList (int thirdNum) {
		// TODO Auto-generated method stub
		return null;
	}
