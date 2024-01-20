package String_class;

public class sample1
{
	int num1;
	int num2;
	sample1(int j,int k) //constructor can be overloaded
	{
	}
	sample1(int h)
	{
		
	}
	public static void substraction(int l,int m) //static regular method can be overloaded
	{
		System.out.println(l-m);
	}
	public static void substraction(int n)
	{
		System.out.println(n);
	}
	
public void addition(int a ,int b) //Non-static regular method can be overloaded
{
	System.out.println(a+b);  //static method call at only compile time so static method can not over ride.
}                              // Non static method call at run time so non static methods can be over ride.

public void addition(int c ,int d ,int x)
{
	System.out.println(c+d+x);
}
public void addition(int a  )
{
	System.out.println(a);
}
public void  addition(String fname)
{
System.out.println(fname);	
}
public static void main(String[] args) // Main method can be overloaded
{
	sample1 s1=new sample1(12);
	s1.addition(2);
	s1.addition(12, 10);
	s1.addition(1, 2, 3);
	s1.addition("advik");
	
}

}

