class Calc
{
	int num1;
	int num2;
	int result;
	public void perform()	//public is the access modifier & void is return type
	{
		result = num1 + num2;
	}
}
public class Date2106 {

	public static void main(String[] args)
	{
		Calc obj1 = new Calc();
		obj1.num1 = 3;
		obj1.num2 = 5;
		obj1.perform();
		System.out.print(obj1.result);
	}
}
