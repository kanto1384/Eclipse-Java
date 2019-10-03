import java.util.Scanner; //-encoding UTF-8 잊지말것
public class Main1 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.print("정수 3개 입력 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	      if((b < a && a < c) || (c < a && a < b)) {
	          System.out.print("중간 값은 "+a);
	       }
	       else if ((a < b && b < c)  || (c < b && b < a)) {
	          System.out.print("중간 값은 "+b);
	       }
	       else {
	          System.out.print("중간 값은 "+c);
	       }
	}

}
