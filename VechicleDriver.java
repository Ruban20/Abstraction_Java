package Abstraction_program;

import java.util.Scanner;

public class VechicleDriver {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice\n1Bike\n2Car\n3bus");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	{
		Vechicle v1=VechiclesFactory.getinstanceVechicle("Bike");
		v1.start();
		v1.stop();
	}
	break;
	case 2:
	{
		Vechicle v2=VechiclesFactory.getinstanceVechicle("Bike");
		v2.start();
		v2.stop();
	}
	break;
	case 3:
	{
		Vechicle v3=VechiclesFactory.getinstanceVechicle("Bike");
		v3.start();
		v3.stop();
	}
	break;
	default:
	{
		System.out.println("Invalid choice");
	}
	
	}
}
}
