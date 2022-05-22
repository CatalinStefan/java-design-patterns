package visitor;

public class YearlyCostReportVisitor implements ReportVisitor<Long> {

  @Override
  public Long visit(FixedPriceContract contract) {
    return contract.costPerYear;
  }

  @Override
  public Long visit(TimeAndMaterialsContract contract) {
    return contract.costPerHour * contract.hours;
  }

  @Override
  public Long visit(SupportContract contract) {
    return contract.costPerMonth * 12;
  }
  
}
