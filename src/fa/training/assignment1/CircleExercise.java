/*
	* @author bacng
	* @ Date Jun 7, 2022
*/
package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input radius:");
		double radius = Double.parseDouble(scanner.nextLine());
		System.out.println("Perimeter is: "+ (2*radius*Math.PI));
		System.out.println("Area is: "+(Math.pow(radius, 2)*Math.PI));
	}
	
	
}
