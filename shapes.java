import java.util.Scanner;

public class shapes{
	public static void main(String args[]) {
		int counter,autocounter,ques1,ques2,ques3,ques4, ques5, ques6, ques7, ques8, ques9, ques10,marks;
		autocounter = 0;
		marks=0;
		Scanner item = new Scanner(System.in);
		System.out.println("Hi, how many questions do you want to be asked?");
		counter = item.nextInt();
		if(counter>10){
			System.out.println("Please enter 10 questions or less and not any more");
		}
		else{
		while(counter>autocounter){	
		switch(autocounter){
			case 0:{
			System.out.println("How many sides does a triangle have?");
			ques1= item.nextInt();
			if(ques1==3){
				++autocounter;
				++marks;
				System.out.println("Correct!");
			}	
			else{
				--marks;
				System.out.println("Wrong! Try again");

			}			
			};
			break;
			case 1:{
			System.out.println("How many sides does a square have?");
			ques2 = item.nextInt();
			if(ques2==4){
					++autocounter;
					++marks;
					System.out.println("Correct!");
				}
				else{
					--marks;
				System.out.println("Wrong! Try again");
			}
			};
			break;
			case 2:{ 

					System.out.println("How many vertexes does a circle have?");
					ques3 = item.nextInt();
					if(ques3==0){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}
		else{
			--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 3:{ 

					System.out.println("How many sides does octagon have?");
					ques4 = item.nextInt();
					if(ques4==8){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}else{
				--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 4:{ 

					System.out.println("How many sides does a pentagon have?");
					ques5 = item.nextInt();
					if(ques5==5){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}else{
				--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 5:{ 

					System.out.println("How many sides does a hexagon have?");
					ques6 = item.nextInt();
					if(ques6==6){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}else{
				--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 6:{ 

					System.out.println("How many faces does a cube have");
					ques7 = item.nextInt();
					if(ques7==6){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}else{
				--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 7:{ 

					System.out.println("How many sides does a nanogon have?");
					ques8 = item.nextInt();
					if(ques8==9){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}else{
				--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 8:{ 

					System.out.println("How many faces does a hexahedron have?");
					ques9 = item.nextInt();
					if(ques9==6){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}else{
				--marks;
				System.out.println("Wrong! Try again");
			}};
			break;
			case 9:{ 

					System.out.println("How many faces does a heptahedron?");
					ques10 = item.nextInt();
					if(ques10==7){
						++autocounter;
						++marks;
						System.out.println("Correct!");

			}
			else{
				--marks;
				System.out.println("Wrong! Try again");
			}
		};
			break;
			
			default:{
				System.out.println("It is working");
			};
		
		}
}
System.out.println("===================");
System.out.println("End of Game Results");
System.out.println("===================");
System.out.println("Your points are: "+marks);

}
}
}