import java.util.Scanner;

public class Hailstone {
	private static int NUMBER;
	private static Scanner myVar;
	
	public static void run() {
		myVar = new Scanner(System.in);
		System.out.println("Enter a number:");		
		NUMBER = myVar.nextInt();
		System.out.println("You entered:"+NUMBER);
		while (true) {
			if (NUMBER == 1) {
				break;
			}else if (NUMBER % 2 == 0) {
				System.out.println(NUMBER+ " is even, so I take half:");
				NUMBER = NUMBER/2;
				System.out.println(NUMBER);
			}else {
				System.out.println(NUMBER+ " is odd, so I make 3n +1:");
				NUMBER = 3*NUMBER + 1;
				System.out.println(NUMBER);
			}
		}
	}

	public static void main(String[] args) {
		run();
		// TODO Auto-generated method stub	
	}
}
