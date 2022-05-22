package memento;

import java.util.ArrayList;

public class Caretaker {
  ArrayList<Memento> mementoList = new ArrayList<>();

  public void saveState(Memento mem) {
    mementoList.add(mem);
  }

  public Memento restoreState(int index) {
    return mementoList.get(index);
  }
}
