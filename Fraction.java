public class Fraction {
	 
	 //instance variables (attributes, fields) 
	 private int numerator, denominator;
	 
	 //constructors
	 public Fraction() { //default constructor
		 numerator = 1;
		 denominator = 1;
	 }
	 
	 public Fraction(int n, int d) {
		 numerator = n; 
		 setDenom(d);
	 }
	 
	 public Fraction(String s) {
		 numerator = Integer.parseInt(s.substring(0, s.indexOf("/")));
		 setDenom(Integer.parseInt(s.substring(s.indexOf("/")+1)));
	 }
	 
	 public Fraction(Fraction f) {
		 numerator = f.numerator;
		 denominator = f.denominator;
	 }
	 
	 //behaviour methods (accessor, mutator, helper)
	 //accessor methods
	 public int getNum() {
		 return numerator;
	 }
	 
	 public int getDenom() {
		 return denominator;
	 }
	 
	 public String toString() {
		 return numerator + "/" + denominator;
	 }
	 
	 //mutator methods
	 public void setNum(int n) {
		 numerator = n;
	 }
	 
	 public void setDenom(int d) {
		 if (d != 0) {
			 denominator = d;
		 } else {
			 denominator = 1;
			 System.out.println("Error: denominator cannot be zero.");
		 } 
	 }
}
