public class Arrays{
public static void main(String args[]){
String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex","Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
"Aaron", "Kate"};
int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,343, 317, 265};
String[] names2 = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex","Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
"Aaron", "Kate"};
int[] times2 = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,343, 317, 265};
int least=times[0],second=times[0],largest=times[0];
String fastest=names[0],fastestsecond=names[0];
for (int i = 0; i < names.length; i++){
System.out.println(names[i] + ": " + times[i]+" | "+names2[i] + ": " + times2[i]);
if(largest<times[i]){
largest=times[i];
}
if(least>times[i]){
least=times[i];
fastest=names[i];
times[i]=times[i]+largest;
}
}

for(int i=0;i<names.length;i++){
if(second>times[i]){
second=times[i];
fastestsecond=names[i];
}
}
/*
int smallest=  times[0];
int second_smallest =  times[0];
for(int n:times)
           {
               if(n< smallest)
                   {
                       second_smallest = smallest;
                       smallest=n;
                   }
               else if( n< second_smallest)
                   {
                       second_smallest= n;
                   }
           }*/
System.out.println("The fastest runner is: "+fastest+" with time: "+least);
System.out.println("The second fastest runner is: "+fastestsecond+" with time: "+second);
}
}
