package helloworld;

import java.util.*;

public class nextt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("what is the value of num1 ");
		int a=sc.nextInt();
		
		System.out.println("what is the value of  num2 ");
		int b=sc.nextInt();
		
		System.out.println("mention the operator ");
		char operator =sc.next().charAt(0);
		
		//for the operators char datatype must used to read the data
		
		
		int result;
		switch (operator) {
		case '+':result =a+b;
		System.out.println("the result is "+ result);
		break ;
		case '-':result=a-b;
		System.out.println("the result is "+ result);
		break;
		case '/':result=a/b;
		System.out.println("the result is "+ result);
		break;
		default:System.out.println("Invalid operation");
		break;
		}
		
	
		
}} 
