import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c09();
  }
  void c09(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your income > ");
    int income = s.nextInt();
    int tax;
    if(income >= 80000000) tax = income / 100 * 37;
    else if(income >= 40000000) tax = income / 100 * 28;
    else if(income >= 10000000) tax = income / 100 * 19;
    else tax = income / 1000 * 95;
    System.out.print("Income tax on salary is "+tax+"");
  }
}