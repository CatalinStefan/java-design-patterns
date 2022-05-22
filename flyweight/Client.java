package flyweight;

import java.util.Random;

public class Client {
  public static void main(String[] args) {
    int toDraw = 1000000;
    Army army = new Army();
    FighterRank currentRank;
    Random random = new Random();

    for (int i = 0; i < toDraw; i++) {
      switch (random.nextInt(3)) {
        case 0: currentRank = FighterRank.PRIVATE;
          break;
        case 1: currentRank = FighterRank.SERGEANT;
          break;
        default: currentRank = FighterRank.MAJOR;
          break;
      }
      army.spawnFighter(currentRank);
    }

    army.drawArmy();
  }
}