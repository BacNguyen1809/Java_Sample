/*
	* @author bacng
	* @ Date Jun 7, 2022
*/
package fa.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input fist number: ");
		int fist_number = Integer.parseInt(scanner.nextLine());
		System.out.println("input second number: ");
		int second_number = Integer.parseInt(scanner.nextLine());
		System.out.println(fist_number+" + "+second_number+ " = "+(fist_number+second_number));
		System.out.println(fist_number+" - "+second_number+ " = "+(fist_number-second_number));
		System.out.println(fist_number+" x "+second_number+ " = "+(fist_number*second_number));
		System.out.println(fist_number+" / "+second_number+ " = "+(fist_number/second_number));
		System.out.println(fist_number+" % "+second_number+ " = "+(fist_number%second_number));
		scanner.close();

	}

}
