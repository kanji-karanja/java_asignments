import java.util.Scanner;
public class grader{
public static void main(String Args[]){
int marks;
String grade;
Scanner input = new Scanner(System.in);
System.out.println("================");
System.out.println("AUTOMATIC GRADER");
System.out.println("================");
while(0==0){
System.out.println("Please input marks to receive grade:");
marks= input.nextInt();
if(marks>=70 && marks<=100){
  grade = "A";
}
else if(marks>=60 && marks<70){
  grade = "B";
}
else if(marks>=50 && marks<60){
  grade = "C";
}
else if(marks>=40 && marks<50){
  grade = "D";
}
else if(marks>0 && marks<40){
  grade = "E";
}
else{
  grade ="Invalid";
}
System.out.println(grade);
}
}
}
