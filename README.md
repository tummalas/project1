# project1
first repository
public class circle extends Shape 
{
	public circle(double r)
	{
		super(r);
	}
	public double Area()      //overriding
	{
		return 3.14*r*r;
	}
	public static void main(String args[])
	{
		circle c=new circle(2.5);
		System.out.println("Area:"+c.Area());
	}
}
