package oops;

public class QA2 extends QA1
{
	
	
	int x = 100;
	
	public void printval()
	{
		final int x = 200;
		//x=300;
		System.out.println(x);  //200
		System.out.println(this.x);  //100
		System.out.println(super.x);
		
		super.sum(30, 50);
		
	}
	
	

	public void sum(int a, int b)
	{
		int c = a*a + b*b;
		System.out.println("sum of a&b: "+c);
	}
	
	
	public void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("sub of a&b: "+c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		  
		q2.sum(30, 50);
		q2.printval();
	}


	
	public void qa1im() {
		
		
	}
}
