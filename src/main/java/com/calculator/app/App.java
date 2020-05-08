package com.calculator.app;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        
	System.out.print("Enter Two Numbers : ");
	double num1 = reader.nextDouble();
	double num2 = reader.nextDouble();
       
	System.out.print("Enter the operation to perform '+' '-' '/' '*' '%' ");
	 char operator = reader.next().charAt(0);

	double answer;

	switch(operator)
	{
	case'+':
		answer = num1 + num2;
		break;

	case'-':
		answer = num1 - num2;
		break;


	default:
                System.out.printf("Error! operator is not correct");
                return;

	}
	System.out.printf("%.1f %c %.1f = %.1f", num1, operator,num2, answer);
    }
}
