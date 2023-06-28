import java.util.Scanner;
public class LargestNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your first Number");
int num1 = input.nextInt();
System.out.println("Enter your second number");
int num2 = input.nextInt();
System.out.println("Enter your 3rd Number");
int num3 = input.nextInt();
if(num1 >= num2 && num1 >= num3 )
{
System.out.println("The number is largest" +num1);
}
else if (num2 >= num1 && num2 >= num3){
System.out.println("The number is largest :" +num2 );
}
else{
System.out.println("The number is largest ;" +num3);
}
}
}
