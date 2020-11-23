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
    double x = Math.abs(this.getValue() - other.getValue());
    double y = (this.getValue() + other.getValue())/ 2;
    return (x / y) * 100 <= .001;
  }
  public RealNumber add (RealNumber other) {
    return new RealNumber(this.getValue() + other.getValue());
  }
  public RealNumber multiply(RealNumber other) {
    return new RealNumber(this.getValue() * other.getValue());
  }
  public RealNumber divide(RealNumber other) {
    return new RealNumber(this.getValue() / other.getValue());
  }
  public RealNumber subtract(RealNumber other) {
    return new RealNumber(this.getValue() - other.getValue());
  }
}
