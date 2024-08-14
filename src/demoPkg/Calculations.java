package demoPkg;

public class Calculations 
{
	
	public Calculations(int a, int b)
	{
		System.out.println("this is method of constructor");
		
		int c = a+b;
				
		System.out.println("this is addition of 2 numbers using const: " + c);
		
	}
	
	public int add()
	{
		int a = 30;
		int b = 40;
		int c = a+b;
				
		System.out.println("this is addition of 2 numbers: " + c);
		return c;
		
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("this is sum of 2 numbers: " + c);
		return c;
	}
	
	//40,50,60
	//x = 40+50
	//x+60
		
	public static void main(String[] args)
	{
	
		Calculations abc = new Calculations(10,20);
		
		int y = abc.add();
		int x = abc.sum(40, 50);
		abc.sum(x, y);
		
	}
	
}
