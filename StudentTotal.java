public class StudentTotal 
{
	private int subject1,subject2,subject3,subject4,subject5,subject6,total,average;
	
	public StudentTotal(int s1,int s2,int s3,int s4,int s5,int s6)
	{
		subject1=s1;
		subject2=s2;
		subject3=s3;
		subject4=s4;
		subject5=s5;
		subject6=s6;
	}
	public static void FindTotal(StudentTotal s)
	{
		s.total=s.subject1+s.subject2+s.subject3+s.subject4+s.subject5+s.subject6;
		s.average=s.total/6;
		System.out.println("Total is"+s.total);
		System.out.println("Average is"+s.average);
	}
	public static void main(String args[])
	{
		StudentTotal st=new StudentTotal(42,51,46,42,44,51);
		StudentTotal st1=new StudentTotal(42,54,46,42,44,51);
		StudentTotal.FindTotal(st);
		StudentTotal.FindTotal(st1);
	}
	

}
