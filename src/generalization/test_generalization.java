package generalization;

public class test_generalization 
{
public static void main(String[] args)

{
	airtel a=new airtel();
	a.audiocalling();
	a.internet();
	a.sms();
	a.a2();
	
	System.out.println("---------------------");
	
	jio j=new jio();
	j.a1();
	j.internet();
	j.sms();
	j.audiocalling();
	
	System.out.println("--------------------");
	vi v=new vi();
	v.audiocalling();
	v.internet();
	v.sms();
	
}
}

