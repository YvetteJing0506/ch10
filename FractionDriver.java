public class FractionDriver {
	
	public static void main (String[] args) {
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1,2);
		Fraction f3 = new Fraction("1/3");
		Fraction f4 = new Fraction(f3);
		
		System.out.println(Fraction.divide(f2, f3));
	}
}
