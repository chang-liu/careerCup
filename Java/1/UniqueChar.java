import java.util.*;

public class UniqueChar {
  public static void main(String args[]) {
    CharDetector cd = new CharDetector("abcd");
    CharDetector cd2 = new CharDetector("abcad");
    System.out.println(cd.detect());
    System.out.println(cd2.detect());
    
    CharDetectorNoStruct cdns = new CharDetectorNoStruct("abcd");
    CharDetectorNoStruct cdns2 = new CharDetectorNoStruct("abcad");
    System.out.println(cdns.detect());
    System.out.println(cdns2.detect());
  }
}

class CharDetector {
  String str;
  public CharDetector(String input) {
    this.str = input;
  }
  
  public boolean detect() {
    HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
    for (int i=0;i<this.str.length();i++) {
      if (map.containsKey(this.str.charAt(i))) {
        return false;
      }
      map.put(this.str.charAt(i), true);
    }
    
    return true;
  }
}

class CharDetectorNoStruct {
  char[] cs;
  public CharDetectorNoStruct(String input) {
    this.cs = input.toCharArray();
  }
  
  public boolean detect() {
    for (int i=0;i<cs.length;i++) {
      for (int j=i+1;j<cs.length;j++) {
        if (cs[i] == cs[j]) {
          return false;
        }
      }
    }
  
    return true;
  }
}