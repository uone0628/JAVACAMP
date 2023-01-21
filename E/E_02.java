import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e02();
  }
  void e02(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a height of right triangle and black > ");
    int height = s.nextInt();
    int blank = s.nextInt();
    for(int i=0; i<height; i++) {
      for(int j=0; j<blank; j++) {
        System.out.print(" ");
      }
      for(int j=0; j<height-1-i; j++) {
        System.out.print(" ");
      }
      for(int j=0; j<1+i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}