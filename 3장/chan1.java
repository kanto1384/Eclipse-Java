import java.util.Scanner;
public class chan1 
{

	public static void main(String[] args)
	{
		int a[] = new int[10];
		int b = 0;
		System.out.print("양의 정수 10개를 입력하시오 :");
		System.out.print(" ");
		Scanner sc = new Scanner(System.in);
		for(int x=0;x<a.length; x++) //행 10개에 정수데이터를 넣는다
			a[x] = sc.nextInt();
		System.out.print("3의 배수는");
		for(int x=0;x<a.length; x++)
		{
			b = a[x];
		if(b%3 == 0)  // 0으로 나오면 나옴
			{
			System.out.print(" "+ a[x]);
			}
		}
	}
}
