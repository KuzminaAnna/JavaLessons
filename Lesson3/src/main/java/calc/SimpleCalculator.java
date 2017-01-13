package calc;

import calc.Calculator;

public class SimpleCalculator {
	public static void main(String[] params) {
		int numb1 = Integer.parseInt(params[0]);
		int numb2 = Integer.parseInt(params[1]);
		Calculator calc = new Calculator();
		int sum = calc.sumInts(numb1, numb2);
		System.out.println("Sum: " + sum);
		
	}
} 
