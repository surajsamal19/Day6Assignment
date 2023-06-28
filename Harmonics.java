import java.util.Scanner;
public class Harmonics{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
double result = 0.0;
System.out.println("The harmonics series is:");
for(int i = num; i>0;i--){
result  = result + (double)1 / i;
System.out.println(result + ",  ");
}
}
}