public class EstimatingPi {
	
	public static void main(String[] args) {
		
		Fraction MILU = new Fraction(355, 113);
		final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
		int num = 3; int denom = 1;
		Fraction answer = new Fraction(num, denom);
		System.out.println("initial guess equals " + answer);
		while (Math.abs(Math.PI-answer.toDouble()) >= EPSILON) {
			if (answer.toDouble() < Math.PI) {
			num++; 
			} else {
				denom++;
			} answer = new Fraction(num, denom);
		} System.out.println("Approximation equals: " + answer);
	}
	
}
