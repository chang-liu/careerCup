public class StrReplace {
  private String str;
  public StrReplace(String input) {
    this.str = input;
  }
  
  public String replace() {
    int spaceCnt = 0;
    char[] output;
    
    char[] chrs = this.str.toCharArray();
    for (int i=0;i<chrs.length;i++) {
      if (chrs[i] == ' ') {
        spaceCnt++;
      }
    }
    
    output = new char[chrs.length + spaceCnt * 2];
    int outputTag = output.length - 1;
    for (int i=chrs.length-1;i>=0;i--) {
      if (chrs[i] == ' ') {
        output[outputTag--] = '0';
        output[outputTag--] = '2';
        output[outputTag--] = '%';
      }
      else {
        output[outputTag--] = chrs[i];
      }
    }
    
    return new String(output);
  }
  
  public static void main(String args[]) {
    System.out.println("hello world Java!");
    StrReplace sr = new StrReplace("hello world Java!");
    System.out.println(sr.replace());
  }
}