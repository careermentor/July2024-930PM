package oops;

public class CallDemoInterface implements DemoInterface
{

	public static void main(String[] args)
	{
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.im1();
		cdi.im2();

	}

	public void im1() {
	
		System.out.println("this is interface method code");
		
	}

	
	public void im2() {
		System.out.println("this is interface method code");
	}

}
