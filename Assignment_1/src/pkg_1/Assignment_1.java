package pkg_1;

public class Assignment_1 
{
	public int add(int a, int b)     //method 1
	{
		int c = a+b;
		System.out.println("Sum is : "+c);
		return c;
	}
	
	public int sub(int a, int b)     //method 2
	{
		int c = a-b;
		System.out.println("Sub is : "+c);
		return c;
	}
	
	public int multi(int a, int b)     //method 3
	{
		int c = a*b;
		System.out.println("Multiply is : "+c);
		return c;
	}
	
	public void divide(int a, int b)     //method 4
	{
		int d = a/b;
		System.out.println("Total is : "+d);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Solve: (((((10+2)+2)-2)*2)/2)");
		Assignment_1 aks = new Assignment_1();
		int add1 = aks.add(10, 2);
		int add2 = aks.add(add1, 2);
		int sub1 = aks.sub(add2, 2);
		int multiplication = aks.multi(sub1, 2);
		aks.divide(multiplication, 2);
	}
}
