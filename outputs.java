import java.util.Scanner;
class polymorphism{
String name,level;
void getdata(){
Scanner input = new Scanner(System.in);
System.out.println("What's your name?");
name = input.nextLine();
System.out.println("This is what I got as your name: "+name);
}
void getdata(String f_name){
name= f_name;
	System.out.println("Your name is:" +name);
}
	void getdata(String l_name, String Level){
	name=l_name;
	level=Level;
	System.out.println("You are "+name+" and you are in this level:" +level);
	}
}
class outputs{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
polymorphism poly =new polymorphism();
poly.getdata();
System.out.println("Please Remind me your name:");	
poly.getdata(input.nextLine());
System.out.println("Okay for the last time tell me your name and level, start with name then level");
poly.getdata(input.nextLine(),input.nextLine());
}
}