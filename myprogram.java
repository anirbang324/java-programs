class abc {
	static int Multiply(int a, int b)
	{
		return a * b;
	}
static double Multiply(double a, double b)
	{
		return a * b;
	}
}
public class myprogram {

	// Main driver method
	public static void main(String[] args)
	{
		System.out.println(abc.Multiply(2, 4));
		System.out.println(abc.Multiply(5.5, 6.3));
	}
}
