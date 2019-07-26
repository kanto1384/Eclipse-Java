
public class Main3 {

	public static void main(String[] args) {

		int a = 50;
		int b = 50;
		
		System.out.println("a와 b가 같은가요" +  (a==b));
		System.out.println("a가 b보다 큰가요" +  (a>b)); 
		System.out.println("a가 b보다 작은가요" +  (a<b)); 
		System.out.println("a가 b와 같은면서 a가 b보다 큰가요" +  ((a == b) && (a > b)) + " a와 b는" + (a==b) + "이지만 a가 b보다 크지는 " + (a > b) + "이다" ); 
	}

}
