import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Fraction Calculation Quiz. Answers should be reduced to lowest term. No Calculator Allowed!");
		int correctTerms = 0; int totalTerms = 0; int i=0;
		while (i<=100000) {
			System.out.println();
			Fraction f1 =  new Fraction();
			Fraction f2 =  new Fraction();
			String operator = randomOperator();
			System.out.print(equation(f1, operator, f2));
			String userAns = scanner.nextLine();
			if (userAns.equals("quit")) {
				totalTerms=i;
				break; 
			} System.out.println(checkAnswer(f1, operator, f2, userAns));
			if (checkAnswer(f1, operator, f2, userAns).equals("Correct")) {
				correctTerms++; totalTerms++;
			} totalTerms++; 
			i++;
		} Fraction score = new Fraction(correctTerms, totalTerms);
		  int percentile = (int)(correctTerms*100.0/totalTerms+0.5);
		  System.out.println("Your score is: " + score + " (" + percentile + "%" + ")");
	}
	public static String randomOperator() {
		String[] operators = {"+", "-", "*", "/"};
		Random random = new Random();
		int num = random.nextInt(4);
		return operators[num];
	}
	public static String equation(Fraction a, String operator, Fraction b) {
		return a + " " + operator + " " + b + " = ";
	}
	public static String checkAnswer(Fraction a, String operator, 
									  Fraction b, String userAns) {
		Fraction userAnswer = new Fraction(userAns);
		Fraction answer = new Fraction();
		if (operator.equals("+")) {
			answer = Fraction.add(a, b);
		} if (operator.equals("-")) {
			answer = Fraction.subtract(a, b);
		} if (operator.equals("*")) {
			answer = Fraction.multiply(a, b);
		} if (operator.equals("/")) {
			answer = Fraction.divide(a, b);
		} int n = userAnswer.getNum(); int d = userAnswer.getDenom();
		  int N = answer.getNum(); int D = answer.getDenom();
		if (n==N && d==D) {
			return "Correct";
		} return "Wrong. The answer is " + answer;
	}
	
} 
