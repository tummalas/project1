# project1
first repository
public class Rectangle extends Shape 
{
	public Rectangle(double d1,double d2)
	{
		super(d1,d2);
	}
	public double Area()      //overriding
	{
		return dim1*dim2;
	}
	public static void main(String args[])
	{
		Rectangle re=new Rectangle(10,20);
		System.out.println("Area:"+re.Area());
	}
}
