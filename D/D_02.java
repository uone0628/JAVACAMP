import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d02();
  }
  void d02() {
    Scanner s = new Scanner(System.in);
    int max_num = 0, min_num = 100;
    while(true) {
      System.out.print("Enter a number > ");
      int number = s.nextInt();
      if(number < 0 || number > 100) break;
      if(max_num < number) max_num = number;
      if(min_num > number) min_num = number;
    }
    System.out.println("Max number is "+max_num+", Min number is "+min_num+"");
  }
}