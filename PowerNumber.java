import java.util.Scanner;
public class PowerNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int base,exponent;
System.out.println("Enter base number");
base = input.nextInt();
System.out.println("Enter exponent number");
exponent = input.nextInt();
System.out.println("The result is: " + Math.pow(base,exponent));
}
}


