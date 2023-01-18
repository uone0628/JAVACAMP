import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c08();
  }
  void c08(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first number > ");
    int num1 = s.nextInt();
    System.out.print("Enter second number > ");
    int num2 = s.nextInt();
    System.out.print("Enter third number > ");
    int num3 = s.nextInt();
    int max_num = num1, min_num = num1;
    if(num2 > max_num) max_num = num2;
    if(num3 > max_num) max_num = num3;
    if(num2 < min_num) min_num = num2;
    if(num3 < min_num) min_num = num3;
    System.out.print("Max number is "+max_num+", Min number is "+min_num+"");
  }
}