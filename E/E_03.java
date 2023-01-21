import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e03();
  }
  void e03(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a height of triangle > ");
    int height = s.nextInt();
    
    for(int i=0; i<height; i++) {
      for(int j=0; j<height-1-i; j++) {
        System.out.print(" ");
      }
      for(int j=0; j<i; j++) {
        System.out.print("*");
      }
      System.out.print("*");
      for(int j=0; j<i; j++) {
        System.out.print("*");
      }
      for(int j=0; j<height-1-i; j++) {
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}