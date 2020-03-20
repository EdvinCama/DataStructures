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
		
		for(char c: input.toCharArray()) {
			
			if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
				
				Operands.push(c);
			}
			
			else if(c >= '0' && c <= '9') {
				
				Value.push(Character.getNumericValue(c));
			}
			
			else if(c == ')' && Value.size() > 1) {
				
				Character I = Operands.pop();
				int result = 0;
				int first = Value.pop();
				int second = Value.pop();
				
				switch(I) {
					
				case '+':
					result = first + second;
					break;
					
				case '-':
					result = first - second;
					break;
					
				case '*':
					result = first * second;
					break;
				
				case '/':
					result = first / second;
					break;
					
				case '%':
					result = first % second;
					break;
					
				default:
					break;
				}
				
				Value.push(result);
				
			}
			
			
		}
		System.out.println("Result: " + Value.pop());
		
	}
	
}

