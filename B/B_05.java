import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b05();
  }
  void b05(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of days > ");
    int days = s.nextInt(); // 날 수
    int seconds = days * 24 * 60 * 60; // 초 단위 시간
    int m_count = seconds / 1000000; // 100만 초 포함 횟수
  	System.out.println("Total seconds is "+seconds);
    if(seconds > 1000000)
      System.out.print("It includes million seconds "+m_count+" times");
  }
}