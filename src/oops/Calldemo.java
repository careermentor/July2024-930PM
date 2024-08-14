package oops;

public class Calldemo extends AbstractDemo
{

	public void meth2() 
	{
	
		System.out.println("this is my password");
		
		
	}
	
	public static void main(String[] args) 
	{
		
		
		Calldemo cd = new Calldemo();
		cd.ad();
		cd.meth2();
		
		
	}

	
	
}
