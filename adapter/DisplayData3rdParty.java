package adapter;

public class DisplayData3rdParty {
  public float index;
  public String data;

  public DisplayData3rdParty(float index, String data) {
    this.index = index;
    this.data = data;
  }

  public void displayData() {
    System.out.println("Data is displayed: " + index + " - " + data);
  }
}
