package pack;

import java.util.*;

public class EvenOdd {
	void evenoddcheck()
	{
		
		for(int i=0;i<5;i++)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=s.nextInt();
		if(a%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		}
		
		System.out.println("We Checked 5 time .Now we exit the programm");
	}
	

	public static void main(String[] args) {
		
		EvenOdd a=new EvenOdd();
		a.evenoddcheck();
		

	}

}
