//To eluidate call by value and call by reference concept in java
//Name: Yogesh Pawar  Date:10/08/2017

class CallByValue
{
	void test(int arg)
	{
		System.out.println("Running test() of Demo class to elucidate CallByValue concept......");
		System.out.println("arg:"+arg);
		arg=100;
		System.out.println("arg:"+arg);
	}
	
}

class CallByRef
{
	void ref()
	{
		System.out.println("In java it is not possible to access or call value by reference because in java we can't store address of variable and use this to manipulate data. ");
	}
}

class MainClass7
{
	public static void main(String arg[])
	{
		System.out.println("**************************************************************************************************************");
		int y=10;
		CallByValue d1=new CallByValue();
		d1.test(y);
		System.out.println("Value of y is:"+y);
		System.out.println("Value of y doesn't change because we are just copying value of y i.e. 10 in arg local variable");
		System.out.println("**************************************************************************************************************");
		CallByRef r1=new CallByRef();
		r1.ref();
		System.out.println("**************************************************************************************************************");
	}
}