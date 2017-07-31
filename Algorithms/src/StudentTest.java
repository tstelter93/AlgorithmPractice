
public class StudentTest {

	public static void main(String[] args) {
		int time = 1;
		for (int i = 1; i <=4; i++)
		{
			for (int k=1; k <= i-1; k++)
			{
				time++;
				System.out.println("t");
			}
			System.out.println("time = ");
		}
		System.out.println("time = " + time);
	}

}
