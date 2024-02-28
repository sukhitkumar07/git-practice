import java.util.Scanner;
public class EvenOrOdd{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
System.out.println(num%2==0?num+" is Even Number":num+" is Odd Number");
}
}