/*
	* @author bacng
	* @ Date Jun 7, 2022
*/
package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the width: ");
		double width = Double.parseDouble(scanner.nextLine());
		System.out.println("input the height:");
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Aria is "+width+" * "+height+" = "+(width*height));
		System.out.println("Perimeter is "+"2*("+width+" + "+height+") = "+2*(width+height));
		
	}

}
