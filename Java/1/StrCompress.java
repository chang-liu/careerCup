// # CareerCup 1.5
// # Compress string so 'abcc' -> 'a1b1c2' and return the shorter one
// #
// # @author Chang Liu

import java.util.*;

public class StrCompress {
  String str;
  public StrCompress(String input) {
    this.str = input;
  }
  
  public String compress() {
    StringBuffer sb = new StringBuffer();
    if(this.str.length() == 0) {
      return "Empty String!";
    }
    char last = this.str.charAt(0);
    int cnt = 0;
    for(int i=1;i<this.str.length();i++) {
      if(this.str.charAt(i) == last) {
        cnt++;
      }
      else {
        sb.append(Character.toString(last));
        sb.append(Integer.toString(cnt));
        last = this.str.charAt(i);
        cnt = 1;
      }
    }
    sb.append(last);
    sb.append(cnt);
    
    return sb.length() < this.str.length() ? sb.toString() : this.str;
  }
  
  public static void main(String args[]) {
    StrCompress sc = new StrCompress("aaabbbcde");
    System.out.println(sc.compress());
  }
}