// # CareerCup 1.6
// # Rotate a imgage by 90 degrees such that [[1, 2], [3, 4]] becomes [[3, 1], [4, 2]]
// #
// # @author Chang Liu

public class ImgRotate {
  private int[][] img;
  
  public ImgRotate(int[][] imgMatrix) {
    img = imgMatrix;
  }
  
  public void rotate() {
    int n = img.length;
    for(int i=0;i<n/2;i++) {
      for(int j=i;j<n-1-i;j++) {
        int tmp = img[i][j];
        img[i][j] = img[n - 1 - j][i];
        img[n - 1 - j][i] = img[n - 1 - i][n - 1 - j];
        img[n - 1 - i][n - 1 - j] = img[j][n - 1 - i];
        img[j][n - 1 - i] = tmp;
      }
    }
  }
  
  public void print() {
    for(int i = 0; i < img.length; i++) {
      for(int j=0; j < img.length; j++) {
        System.out.print(img[i][j] + ", ");
      }
      System.out.println();
    }
  }
  
  public static void main(String args[]) {
    int[][] img = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    ImgRotate ir = new ImgRotate(img);
    ir.rotate();
    ir.print();
    
  }
}