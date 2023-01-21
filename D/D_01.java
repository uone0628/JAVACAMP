import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d01();
  }
  void d01(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number > ");
    int number = s.nextInt();
    int totalsum = 0;
    if(number > 1) {
      for(int i=1; i<=number; i++) {
        totalsum += i;
      }
      System.out.println("The sum of all integer from 1 to the number entered is "+totalsum);
    }
    else
      System.out.println("Invalid input");
  }
}