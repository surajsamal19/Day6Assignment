import java.util.Scanner;
public class FactorOfNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your Base");
int base = input.nextInt();
System.out.println("Enter your exponent");
int exponent = input.nextInt();
long result = 1;
while (exponent != 0){
result  *= base;
--exponent;
}
System.out.println("Answer =" +result);
}
}