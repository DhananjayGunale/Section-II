package String_class;

public class demo4 
{
public static void main(String []args)
{
	//1.object creation of string without new keyword
	
	String s1="abc";
	String s2="abc";
	String s3="abc1";
	
	//2. object creation of string using new keyword
	
	String s4=new String ("abc");
	String s5=new String ("abc");
	String s6=new String ("abc");
	
	//3.usage
	
System.out.println(s1==s2); //check location is same or  not //true
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s4==s6);
}
	 
	
}
