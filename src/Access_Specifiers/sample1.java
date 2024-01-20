package Access_Specifiers;

public class sample1 
{
	
	//example of private  access specifiers(sample1 and sample2)
	
 private int a ;  //global variable
 private sample1() //user define constructor
{
 a=10;	          // variable initialization
}

private  void m1()
{
	System.out.println(a);
}
public static void main(String[] args) 
{
sample1 s1=new sample1();
s1.m1();

System.out.println("----------");
System.out.println(s1.a);
}
}
