import java.util.Scanner;
public class chan4 
{

	public static void main(String[] args) 
	{
	      String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	      int score[]  = {95, 88, 76, 62, 55};
	      String name="";
	      int x =0;
	      
	      while(true) 
	      {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("과목 이름 : ");
	         name = sc.next();
	         if(name.equals("그만")) break;
	         for(x=0;x<course.length; x++) 
	         {
	            if(course[x].equals(name)) 
	            {
	               System.out.println(course[x]+"의 점수는 "+score[x]);
	               break;
	            }
	         }
	         if(x == course.length) {
	            System.out.println("없는 과목입니다.");
	         }
	      }
	}

}
