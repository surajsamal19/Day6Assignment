import java.util.Scanner;
public class SwapTwoNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("before Swapping");
System.out.println("The first number is:" +num1);
System.out.println("The second number is:" +num2);
System.out.println("Enter your first number");
int num1 = input.nextInt();
System.out.println("Enter your second number");
int num2 = input.nextInt();
int temp;
temp = num1;
num1 = num2;
num2 = temp;
System.out.println("After Swapping");
System.out.println("The first Number is :" +num1);
System.out.println("The second number is :" +num2);
}
}