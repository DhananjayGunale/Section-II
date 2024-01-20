package Access_Specifiers;

public class sample5 
{
int a;
sample5()
{
a=50;	
}
public void m3()
{
System.out.println(a);	
}
public static void main(String[] args) 
{
	sample5 s5=new sample5();
	s5.m3();
System.out.println(s5.a);	
}
}
