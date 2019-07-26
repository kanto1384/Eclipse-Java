import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		
		File file =new File("input.txt");
		try {
			Scanner sc =new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100 / 2); //암호활할떄 쓰일수있음
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 불러올수가 없다");
		}
		
		
	}

}
