package demoPkg;

public class DemoStatic 
{

	static int a = 20;
	
	public static void val()
	{
		
		System.out.println(a);
	}
	
	public void test()
	{
		System.out.println("this is not static method");
	}
	
	public static void main(String[] args) {
		
		DemoStatic ds = new DemoStatic();
		ds.test();
		DemoStatic.val();
		
	}
	
}
