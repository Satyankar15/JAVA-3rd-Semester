import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		int m[]=new int[10];
		int i,total=0;
		float avg;
		Scanner sc= new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			System.out.println("Enter marks of subject number "+(1+i));
			m[i]=sc.nextInt();
			total=total+m[i];
		}
		avg=total/3;
		if(avg>=80)
			System.out.println("Grade is A");
		if(avg<80&&avg>=60)
			System.out.println("Grade is B");
		if(avg<60&&avg>=40)
			System.out.println("Grade is C");
		if(avg<40)
			System.out.println("Grade is D");
	}
}
		