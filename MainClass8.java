//program to elucidate that constructor(function member) can also return value of type "class type"
//Name: Yogesh Pawar	Date:15/08/2017
class Demo
{
	int k=11;
	void disp()
	{
	System.out.println("Running disp() of Demo class");
	}
	
}

class MainClass8
{
		static Demo execution()
		{
		System.out.println("Running execution() of main class");
		Demo d1=new Demo();
		return d1;
	
		}
	public static void main(String args[])
	{
			System.out.println("Program Started....");
			Demo d2=execution();
			System.out.println("d2 value is:"+d2);
			System.out.println("k value is:"+d2.k);
			d2.disp();
			System.out.println("Program Started....");


		}	
}