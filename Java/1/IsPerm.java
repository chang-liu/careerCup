public class IsPerm {
  private char[] str1, str2;
  
  public IsPerm (String str1, String str2) {
    this.str1 = str1.toCharArray();
    this.str2 = str2.toCharArray();
  }
  
  public boolean check() {
    java.util.Arrays.sort(this.str1);
    java.util.Arrays.sort(this.str2);
    return new String(this.str1).equals(new String(this.str2));
  }
  
  public static void main(String args[]) {
    IsPerm is = new IsPerm("abc", "cbaa");
    System.out.println(is.check());
  }
}