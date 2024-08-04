package CalPack;

import java.util.Scanner;

public class CalculatorJava {

	public static void main(String[] args) {

		System.out.println("Arithmetric operation");

		int n1, n2, ch, cal;
		System.out.println("Elements two numbers");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("1.Addition\t2.Subtraction\t3.Multiplication\t4.Division\t5.modules\n");
		System.out.println("Select Operation");
		ch = sc.nextInt();

		if (ch == 1) {
			cal = n1 + n2;
			System.out.println("Addition :" + cal);

		} else if (ch == 2) {
			cal = n1 - n2;
			System.out.println("Subtractionn:" + cal);
		} else if (ch == 3) {
			cal = n1 * n2;
			System.out.println("mutiplication :" + cal);
		} else if (ch == 4) {
			cal = n1 / n2;
			System.out.println("Division :" + cal);
		} else {
			cal = n1 % n2;
			System.out.println("Remainder :" + cal);
		}
	}

}