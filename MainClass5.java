//Constructor overloading
//Name: Yogesh Pawar  Date:10/08/2017

class Demo
{
	Demo()
	{
	System.out.println("Running Zero argument Constructor....");
	}

	Demo(int k)
	{
	System.out.println("Running single int type argument Constructor....");
	}
	Demo(double x)
	{
	System.out.println("Running single double type argument Constructor....");
	}
	Demo(int k,double x)
	{
	System.out.println("Running multiple argument Constructor....");
	}
}

class MainClass5
{
	public static void main(String arg[])
	{
		System.out.println("Program Started....");
		new Demo();
		new Demo(11);
		new Demo(11.11);
		new Demo(11,11.11);
		System.out.println("Program Ended");
	}
}