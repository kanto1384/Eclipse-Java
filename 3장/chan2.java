import java.util.Scanner;
public class chan2 {

	public static void main(String[] args) {
		      int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		      int m;
		      
		      System.out.print("금액을 입력하시오 : ");
		      System.out.print(" ");
			  Scanner sc = new Scanner(System.in);
		      m = sc.nextInt();
		      
		      for(int i=0; i<unit.length; i++) {
		         System.out.printf("%d 원 짜리 : %d개 \n",unit[i], m/unit[i]);
		         m = m - (m / unit[i])*unit[i];
		      									}
											}
					}
