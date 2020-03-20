package ds.homework2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> Value = new Stack<Integer>();
		Stack<Character> Operands = new Stack<Character>();
		
		String input = null;
		Scanner expresion = new Scanner(System.in);
		
		System.out.println("This is a Dijkstra two-stack algorithm for simple expressions.");
		System.out.println("Example: ( ( 5 + ( 3 * 8 ) ) - ( 2 * 7 ) )");
		System.out.println("Enter your expresion here: ");
		
		input = expresion.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			Boolean type = Character.isDigit(input.charAt(i));
			
			if(type) {
				Value.push(i);
			}else {
				Operands.push();
			}
			
			
			
			
			
			//char c = input.charAt(i);
			System.out.println(i);
		}
		
		System.out.println("Entered: " + input);
	}

}
