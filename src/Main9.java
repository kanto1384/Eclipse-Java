
public class Main9 {

	public static void main(String[] args) {
		
		String a = "Man";
		int b = 0;
		
		//자바는 String을 비교할때 equal()을 이용합니다.
		//그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문이다.
		if(a.equals("Man"))
		{
			System.out.println("남자임");
		}
		else 
		{
			System.out.println("여자임");
		}
		if(b == 3)
		{
			System.out.println("b는 3임");
		}
		else
		{
			System.out.println("b는 3이 아님");
		}
		if(a.equalsIgnoreCase("man") && b == 0) //대문자 소문자 동시 포함
		{
			System.out.println("진실");
		}
		else {
			System.out.println("거짓");
		}
		
	}

}
