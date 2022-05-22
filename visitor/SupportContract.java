package visitor;

public class SupportContract implements ReportElement {
  long costPerMonth;

  public SupportContract(long costPerMonth) {
    this.costPerMonth = costPerMonth;
  }

  @Override
  public <R> R accept(ReportVisitor<R> visitor) {
    return visitor.visit(this);
  }
}
