package bcd;

public class samp {
	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int sum = 0;
		do {
			sum = sum + a;

			a++;
		} while (a <= b);
		System.out.println(sum);
	}

}
