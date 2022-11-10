package pomPackage;

public class Tushar
{
public static void main(String[] args)
{
	String a="NITIN";
	 String b="";
	 int size=a.length();
	 for(int i=size-1;i>=0;i--)//reverse the string
	 {
		 b=b+a.charAt(i);//store reverse in b
	 }
	 if (a.equals(b))
	 {
  System.out.println(" String is Palindrome");		 
	 }
	 else
	 {
		 System.out.println("String is not Palindrome");
	 }	
}
}
