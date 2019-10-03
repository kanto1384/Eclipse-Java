import java.util.Scanner; //-encoding UTF-8 잊지말것
public class Main3 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) : ");
		a = sc.nextInt();
		switch (a) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("12를 초과했거나 잘못입력했습니다.");
			break;
		}
	}

}
