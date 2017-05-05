import java.util.*;
class quiz{
public static void main(String args[]){
	System.out.println("Hello");
	control cont= new control();
	cont.randomques();
}
}
class control{
	int gameoption;
	String rps;
void randomques(){
	System.out.println("=============");
	System.out.println("Choose a game");
	System.out.println("=============");
	System.out.println("1. Rock,Paper,Scissors" );
	System.out.println("2. Guess my number" );
	System.out.println("3. Guess the animal" );
	System.out.println("4. Throw Dice" );
	System.out.println("\nYour choice:");
	Scanner input=new Scanner(System.in);
	gameoption = input.nextInt();
	switch(gameoption){
		case 1:game1();
		break;
		case 2:game2();
		break;
		case 3:game3();
		break;
		default:game4();
			
	}
}
	void game1(){
	System.out.println("\nWelcome to Rock,Paper, Scissors" );
	System.out.println("Choose (r) for rock , (p) for paper and (s) for Scissors" );
		System.out.println("Let's start!" );
		System.out.println("(R)Rock (P)Paper (S)Scissors" );
		Scanner choice=new Scanner(System.in);
		for(rps=choice.nextLine();!(rps=="R");){
			System.out.println("Wrong Input received, Try Again");
			rps=choice.nextLine();
		}
	}
	void game2(){}
	void game3(){}
	void game4(){}
}