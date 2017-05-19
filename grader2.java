import java.util.Scanner;
public class grader2{
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
switch(marks/10){
  case 0:grade="E";break;
  case 1:grade = "E"; break;
  case 2:grade = "E";break;
  case 3:grade = "E";break;
  case 4:grade = "D"; break;
  case 5:grade = "C"; break;
  case 6:grade = "B"; break;
  case 7:grade = "A";break;
  case 8:grade = "A"; break;
  case 9:grade = "A";break;
  case 10:grade = "A"; break;
  default: grade ="Invalid";
}
System.out.println(grade);
}
}
}
/*if(marks>=70 && marks<=100){
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
*/
