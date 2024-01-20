package Access_Specifiers;

public class sample3 
{
	//example of access specifier (sample3,4,3in new package)
int a;    //default access specifier
sample3()   //default access specifier
{
a=10;	
}
void m2()  //default access specifier
{
System.out.println(a);	
}
public static void main(String[] args)
{
	sample3 s3=new sample3();
	s3.m2();
	System.out.println("------------");
	
	System.out.println(s3.a);
}
}
