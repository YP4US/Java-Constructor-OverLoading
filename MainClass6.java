//To track number of instance created using single non-static block
//Name: Yogesh Pawar Date:10/08/2017

class Demo
{
	static int count;

	{
		count++;
	}

	Demo()
	{
		System.out.println("Running zero argument constructor....");
	}
	Demo(int k)
	{
		System.out.println("Running int type single argument constructor....");
	}
	Demo(double x)
	{
		System.out.println("Running double type argument constructor....");
	}
	Demo(int x,double k)
	{
		System.out.println("Running multiple type and length argument constructor....");
	}

}

class MainClass6
{
	public static void main(String arg[])
	{
	System.out.println("Started....");
	new Demo();
	for(int i=1;i<=4;i++)
	{
		new Demo(11);
	}
	new Demo(11.11);
	new Demo(11,11.11);
	System.out.println("Number of instances created of class Demo:"+Demo.count);
	System.out.println("Ended...");

	}
	
}