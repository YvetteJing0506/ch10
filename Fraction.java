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
	 
	 public double toDouble() {
		 return numerator*1.0/denominator;
	 }
	 
	 //mutator methods
	 public void reduce() {
		 int a = numerator; int b = denominator;
		 while (a!=b) {
			 if (a>b) {
				 a=a-b;
			 } else {
				 b=b-a;
			 } 
		 } numerator = numerator/a; 
		   denominator = denominator/a;
	 }
	 
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
	 
	 //static methods
	 public static Fraction multiply(Fraction a, Fraction b) {
		 int n = a.numerator * b.numerator;
		 int d = a.denominator * b.denominator;
		 Fraction answer = new Fraction(n, d);
		 return answer;
	 }
	 
	 public static Fraction divide(Fraction a, Fraction b) {
		 int n = a.numerator * b.denominator;
		 int d = a.denominator * b.numerator;
		 Fraction answer = new Fraction(n, d);
		 return answer;
	 }
	 
	 public static int GCF(int num, int denom) {
		 int a = num; int b = denom;
		 while (a!=b) {
			 if (a>b) {
				 a=a-b;
			 } else {
				 b=b-a;
			 } 
		 } return a;
	 }
	 
	 public static Fraction add(Fraction a, Fraction b) {
		 int numA = a.numerator * b.denominator;
		 int numB = b.numerator * a.denominator;
		 int num = numA + numB;
		 int denom = a.denominator * b.denominator;
		 int GCF = GCF(num, denom);
		 Fraction answer = new Fraction(num/GCF, denom/GCF);
		 return answer;
	 }
	 
	 public static Fraction subtract(Fraction a, Fraction b) {
		 int numA = a.numerator * b.denominator;
		 int numB = b.numerator * a.denominator;
		 int num = numA-numB;
		 int denom = a.denominator * b.denominator;
		 int GCF = GCF(num, denom);
		 Fraction answer = new Fraction(num/GCF, denom/GCF);
		 return answer; 
	 }
}
