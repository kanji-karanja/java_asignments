import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.text.*;
class restaurant{
	public static void main(String args[]){
	menu display=new menu();
	display.displaymenu();
	display.todaysoffer();
	display.customerchoice();
	}
}
class menu{
void displaymenu(){
System.out.println("Hotel Baracuda\n===============\n\nMenu\n\n1.Ugali Nyama \n2.Mutton Pilau\n3.Ugali Scramble\n4.Rice beans\n5.Rice Nyama\n6.Rice Ndengu\n7.Chapo Ndengu\n8.Ugali Kienjeji\n9.Chips\n10.Githeri\n");
}
void todaysoffer(){
Date dNow = new Date();
SimpleDateFormat ft = new SimpleDateFormat ("E");
	String date=ft.format(dNow);
	System.out.println("Today is: "+date);
int n;
System.out.println("Today's offer is:");
System.out.println("-----------------");

	if(date.equals("Thursday") || date.equals("Thu")){
Random offer=new Random();
n=offer.nextInt(10)+1;
switch(n){
	case 1: System.out.println("1. Ugali Nyama");break;
	//case 2: System.out.println("2. Mutton Pilau");break;
	case 3: System.out.println("3. Ugali Scramble");break;
	case 4:	System.out.println("4. Rice Beans");break;
	case 5: System.out.println("5. Rice Nyama");break;
	case 6:	System.out.println("6. Rice Ndengu");break;
	case 7: System.out.println("7. Chapo Ndengu");break;
	case 8: System.out.println("8. Ugali Kienyeji");break;
	case 9: System.out.println("9. Chips");break;
	case 10:System.out.println("10.Githeri");break;
}
	}
System.out.println("2. Mutton Pilau\n");

}
	void customerchoice(){
		int choice,choice2,choice3,choice4,choice5,choice6,choice7,number;
		number=1;
		choice2=0;
		String confirm,add;
	Scanner obj=new Scanner(System.in);
	System.out.println("What is your choice? Use food number");
	choice= obj.nextInt();
	System.out.println("To add an item to the menu type (a), to checkout type(c)");
	Scanner obj2=new Scanner(System.in);
	add = obj2.nextLine();
		while(add.equals("a")){
		System.out.println("What is your choice? Use food number");
		choice2=obj.nextInt();
		number=2;
		System.out.println("To add an item to the menu type (a), to checkout type(c)");
			add=obj2.nextLine();
		}
	System.out.println("\nPlease Confirm your order:\n=======================");
	switch(choice){
	case 1: System.out.println("1. Ugali Nyama");break;
	case 2: System.out.println("2. Mutton Pilau");break;
	case 3: System.out.println("3. Ugali Scramble");break;
	case 4:	System.out.println("4. Rice Beans");break;
	case 5: System.out.println("5. Rice Nyama");break;
	case 6:	System.out.println("6. Rice Ndengu");break;
	case 7: System.out.println("7. Chapo Ndengu");break;
	case 8: System.out.println("8. Ugali Kienyeji");break;
	case 9: System.out.println("9. Chips");break;
	case 10:System.out.println("10.Githeri");break;
	}
		if(number==2){
	switch(choice2){
	case 1: System.out.println("1. Ugali Nyama");break;
	case 2: System.out.println("2. Mutton Pilau");break;
	case 3: System.out.println("3. Ugali Scramble");break;
	case 4:	System.out.println("4. Rice Beans");break;
	case 5: System.out.println("5. Rice Nyama");break;
	case 6:	System.out.println("6. Rice Ndengu");break;
	case 7: System.out.println("7. Chapo Ndengu");break;
	case 8: System.out.println("8. Ugali Kienyeji");break;
	case 9: System.out.println("9. Chips");break;
	case 10:System.out.println("10.Githeri");break;
	}
		}

	confirm();
}
	void confirm(){
	int confirm;
	System.out.println("\nIf Correct Type: 1 If not sure or would like to change type: 2");
	Scanner obj2=new Scanner(System.in);
	for(confirm = obj2.nextInt();confirm>1;){
	customerchoice();
	}
	if(confirm==1){
		System.out.println("\n\nYour Bill is being processed, The waiter will be with you shortly");
		System.out.println("=================================================================");
		System.out.println("Thank you for keeping it Hotel Baracuda");

	}
	}
}
