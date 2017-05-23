class Constructors{
int num1, num2;
String name;
Constructors(){
num1=20;
num2=30;
name="Karim";
int total = num1+num2;
System.out.println("The Total is "+total);
System.out.println("Name: "+name);
System.out.flush();
}
}
public class Mains{
public static void main(String args[]){
Constructors item = new Constructors();
}
}
