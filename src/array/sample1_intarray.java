package array;

public class sample1_intarray 
{
public void main(String []args ) 
{
// array declaration
	int[] ar=new int[5];
	
	//step2- array initialization
	
	ar[0]=40;
	ar[1]=50;
	ar[2]=10;
	ar[3]=30;
	ar[4]=20;
	
	
	//step3 array usage
	System.out.println(ar[0]);
	System.out.println(ar.length);
	
	
	System.out.println("-----print all the information in the array----");
	for(int i=1;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
		
	}

}
}
