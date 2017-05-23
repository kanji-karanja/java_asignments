import java.util.*;
class Constructors{
int mark1, mark2, counter=0, numpeople;
String name;
Constructors(){
Scanner count = new Scanner(System.in);
System.out.println("Hi admin, Please enter the number of people you wish to enter marks");
numpeople = count.nextInt();
while(counter<numpeople){
Scanner input = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
System.out.println("Enter name:");
name= input.nextLine();
System.out.println("Please input First Mark: ");
mark1 = input2.nextInt();
System.out.println("Please input Second Mark: ");
mark2 = input2.nextInt();
int total = mark1+mark2;
System.out.println("Okay "+name+", Your total is: "+total);
++counter;
}
}
}
public class Mains2{
public static void main(String args[]){
Constructors obj= new Constructors();
}
}
