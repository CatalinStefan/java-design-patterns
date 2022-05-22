package adapter;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    DatabaseDataGenerator gen = new DatabaseDataGenerator();
    DisplayDataAdapter adapter = new DisplayDataAdapter();

    List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());

    for (DisplayData3rdParty datum : legacyData) {
      datum.displayData();
    }
  }
}
