package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FighterFactory {
  
  static Map<FighterRank, Fighter> fighters = new HashMap<>();

  public static Fighter getFighter(FighterRank rank) {
    Fighter f = fighters.get(rank);
    if (f == null) {
      f = new Fighter(rank);
      fighters.put(rank, f);
    }
    return f;
  }
}
