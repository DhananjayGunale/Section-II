package array;

public class asample3_charArray 
{
	public static void main(String[] args) 
	{
		
	char[] ar=new char[5];
	
	ar[0]='A';
	ar[1]='B';
	ar[2]='C';
	ar[3]='D';
	
	
	System.out.println(ar[0]);
	
	System.out.println(ar.length-1);
	
	System.out.println("---print all data from string array--");
	  for (int i=0;i<=4;i++)
	  {
		  System.out.println(ar[i]);
	  }
	}
}
