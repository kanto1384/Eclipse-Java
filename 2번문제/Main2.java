import java.util.Scanner; //-encoding UTF-8 잊지말것
public class Main2 {

	public static void main(String[] args) {
				int c,a=1,b;
		System.out.print("1~99 사이의 정수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		if(10<=c) //10이하로 3,6,9포함되도 짝짝이 나오는걸 방지
			a = c / 10; 
			b = c % 10;
		System.out.print("박수");
		if(a%3 == 0) //10의자리
			System.out.print("짝");
		if(b%3 == 0) //1의자리
			System.out.print("짝");
	}
}