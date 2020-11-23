public class RationalNumber extends RealNumber {
  private int numerator, denominator;
  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0){
      denominator = -1 * deno;
      numerator = -1 * nume;
    }
    else {
      denominator = deno;
      numerator = nume;
    }
    reduce();
  }
  public double getValue() {
    return numerator / (double)denominator;
  }
  public int getNumerator() {
    return numerator;
  }
  public int getDenominator() {
    return denominator;
  }
  public RationalNumber reciprocal() {
    return new RationalNumber(denominator, numerator);
  }
  public boolean equals(RationalNumber other) {
    return this.numerator == other.numerator && this.denominator == other.denominator;
  }
  public String toString() {
    return "" + numerator + "/" + denominator;
  }
  private static int gcd(int a, int b) {
    if (Math.abs(a) < Math.abs(b)) {
      int x = Math.abs(b);
      b = Math.abs(a);
      a = x;
    }
    if (b == 0) {
      return a;
    }
    while (a % b != 0) {
      int x = a % b;
      a = b;
      b = x;
    }
    return b;
  }
  private void reduce() {
    int x = gcd(numerator, denominator);
    numerator = numerator / x;
    denominator = denominator / x;
  }
  public RationalNumber multiply(RationalNumber other) {
    return new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
  }
  public RationalNumber divide(RationalNumber other) {
    return new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
  }
  public RationalNumber add(RationalNumber other) {
    int a = this.getDenominator() * other.getDenominator();
    int b = this.getNumerator() * other.getDenominator();
    int c = other.getNumerator() * this.getDenominator();
    return new RationalNumber(b + c, a);
  }
  public RationalNumber subtract(RationalNumber other) {
    int a = this.getDenominator() * other.getDenominator();
    int b = this.getNumerator() * other.getDenominator();
    int c = other.getNumerator() * this.getDenominator();
    return new RationalNumber(b - c, a);
  }
}
