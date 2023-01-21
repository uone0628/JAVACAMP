import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d09();
  }
  void d09(){
    Scanner s = new Scanner(System.in);
    int dan;
    while(true) {
      System.out.print("Enter number of gugudan(2~9) > ");
      dan = s.nextInt();
      if(dan >= 2 && dan <= 9) break;
      else System.out.println("Invalid input");
    }
    for(int i=1; i<=9; i++) {
      System.out.println(""+dan+" X "+i+" = "+dan*i+"");
    }
  }
}