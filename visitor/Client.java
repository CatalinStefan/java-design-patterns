package visitor;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    FixedPriceContract projectAlpha = new FixedPriceContract(10000);
    SupportContract projectBeta = new SupportContract(500);
    TimeAndMaterialsContract projectGamma = new TimeAndMaterialsContract(150, 10);
    TimeAndMaterialsContract projectDelta = new TimeAndMaterialsContract(50, 50);

    List<ReportElement> projects = List.of(projectAlpha, projectBeta, projectDelta, projectGamma);

    MonthlyCostReportVisitor monthlyReport = new MonthlyCostReportVisitor();
    YearlyCostReportVisitor yearlyReport = new YearlyCostReportVisitor();

    long monthlyCost = 0;
    long yearlyCost = 0;

    for (ReportElement project : projects) {
      monthlyCost += project.accept(monthlyReport);
      yearlyCost += project.accept(yearlyReport);
    }

    System.out.println("Monthly cost is " + monthlyCost);
    System.out.println("Yearly cost is " + yearlyCost);
  }
}
