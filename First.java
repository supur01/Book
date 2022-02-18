import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your text:");

		String text = input.nextLine();
		System.out.println("How many times to repeat the last letter?");

		int repeat = input.nextInt();

		for(int i = 0; i<repeat; i++){

			text += text.charAt(text.length()-1);
		}

		System.out.println(text);
	}
}
