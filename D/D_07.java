import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d07();
  }
  void d07(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the coefficients a and b of linear function(y=ax+b) > ");
    int a = s.nextInt();
    int b = s.nextInt();
    System.out.print("Enter the start and end values of x coordinates > ");
    int x_begin = s.nextInt();
    int x_end = s.nextInt();
    int x = x_begin;
    for(int i=0; i <= x_end - x_begin; i++) {
      int y = a * x + b;
      System.out.println("coordinates ("+x+", "+y+")");
      x++;
    }
  }
}