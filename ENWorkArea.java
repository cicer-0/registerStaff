import java.util.HashMap;
import java.util.Map;

public enum ENWorkArea {
  PROFESSOR(0), ADMINISTRATOR(1), INTERN(2);

  private static Map map = new HashMap<>();
  private int value;
  static {
    for (ENWorkArea workArea : ENWorkArea.values()) {
      map.put(workArea.value, workArea);
    }
  }

  public static ENWorkArea valueOf(int workArea) {
    return (ENWorkArea) map.get(workArea);
  }

  private ENWorkArea(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
