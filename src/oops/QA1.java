package oops;

public class QA1 
{

	int x = 500;
	
	public void sum(int a, int b)
	{
		int c = a + b; 
		System.out.println("sum of a&b: "+c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a + b + c;
		System.out.println("sum of a&b&c: "+d );
	}
	
	public void sum(int a, float b)
	{
		float c = a + b;
		System.out.println("sum of a&b: "+c);
	}
	
	public void sum(float a, float b)
	{
		float c = a + b;
		System.out.println("sum of a&b: "+c);
	}
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		//q1.sum(20, 30.5f);
		//q1.sum(20, 30, 40);
		//q1.sum(20.5f, 30.5f);
		
		
	}
}
