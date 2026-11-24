import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fraction Calculation Quiz. No Calculator Allowed!");
		
		Fraction f1 = randomFraction();
		Fraction f2 = randomFraction();
		String operator1 = randomOperator();
		System.out.println(equation());
		String userAns1 = scanner.nextString;
		Fraction userAnswer1 = new Fraction(userAnswer1);
		checkAnswer(f1, operator, f2, userAnswer1);
		
		Fraction f3 = randomFraction();
		Fraction f4 = randomFraction();
		String operator2 = randomOperator();
		System.out.println(equation());
		String userAns2 = scanner.nextString;
		Fraction userAnswer2 = new Fraction(userAnswer2);
		checkAnswer(f3, operator, f4, userAnswer2);
		
		Fraction f5 = randomFraction();
		Fraction f6 = randomFraction();
		String operator3 = randomOperator();
		System.out.println(equation());
		String userAns3 = scanner.nextString;
		Fraction userAnswer3 = new Fraction(userAnswer3);
		checkAnswer(f5, operator, f6, userAnswer3);
		
		Fraction f7 = randomFraction();
		Fraction f8 = randomFraction();
		String operator4 = randomOperator();
		System.out.println(equation());
		String userAns4 = scanner.nextString;
		Fraction userAnswer4 = new Fraction(userAnswer4);
		checkAnswer(f7, operator, f8, userAnswer);
		
		System.out.println("Your score is: " + score + ".");
	}
	public static Fraction randomFraction() {
		Random random = new Random();
		int numerator = random.nextInt(9)+1;
		int denominator = random.nextInt(9)+1;
		Fraction f = new Fraction(numerator, denominator);
		return f;
	}
	public static String randomOperator() {
		String[] operators = {"+, -, *, /"};
		Random random = new Random();
		int num = random.nextInt(4);
		return operators[num];
	}
	public static void equation(Fraction f1, String operator, Fraction f2) {
		System.out.println(f1 + " " + operator + " " + f2 + " = ");
	}
	public static boolean checkAnswer(Fraction a, String operator, 
									  Fraction b, Fraction userAnswer) {
		Fraction answer = new Fraction();
		if (operator.equals("+")) {
			answer = Fraction.add(a, b);
		} if (operator.equals("-")) {
			answer = Fraction.subtract(a, b);
		}
	}
} 
