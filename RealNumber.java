public class RealNumber {
  private double value;

  public RealNumber(double v) {
    value = v;
  }
  public double getValue() {
    return value;
  }
  public String toString() {
    return "" + getValue();
  }
  public boolean equals(RealNumber other) {
    x = Math.abs(this.getValue() - other.getValue();)
    y = (this.getValue() + other.getValue())/ 2;
    return (x / y) * 100 <= .001;
  }
  public RealNumber add (RealNumber other) {
    return this.getValue() + other.getValue();
  }
  public RealNumber multiply(RealNumber other) {
    return this.getValue() * other.getValue();
  }
  public RealNumber divide(RealNumber other) {
    return this.getValue() / other.getValue();
  }
  public RealNumber subtract(RealNumber other) {
    return this.getValue() - other.getValue();
  }
}
