import java.util.Scanner;
public class TwoN {

	public static void main(String[] args) {
		int ch = 1;
		System.out.print("Введите n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		for (int i = 1; i <= n; i++)
		{
			ch = ch * 2;
		}
		System.out.println("2 в степени " + n + " = " + ch);
	}

}
