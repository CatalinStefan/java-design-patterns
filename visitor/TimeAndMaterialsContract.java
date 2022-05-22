package visitor;

public class TimeAndMaterialsContract implements ReportElement {
  long costPerHour;
  long hours;

  public TimeAndMaterialsContract(long costPerHour, long hours) {
    this.costPerHour = costPerHour;
    this.hours = hours;
  }

  @Override
  public <R> R accept(ReportVisitor<R> visitor) {
    return visitor.visit(this);
  }
}
