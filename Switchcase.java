import java.util.Scanner;

public class Main

{

public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the first number:");

int a = sc.nextInt();

System.out.print("Enter another number:");

int b = sc.nextInt();

System.out.print("Enter operator:");

char op = (char)System.in.read();

    switch(op){

        case '+':

            System.out.println(a+b);

            break;

        case '-':

            System.out.println(a-b);

            break;

        case '*':

            System.out.println(a*b);

            break;

        case '/':

            System.out.println(a/(float)b);

            break;

        default:

            System.out.println("Invalid operatrion");

            break;

    }

}

}