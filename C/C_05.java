import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c05();
  }
  static int[]mdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  void c05(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a month > ");
    int month = s.nextInt();
    System.out.print("Enter a day > ");
    int day = s.nextInt(); // 날 수
    if(month>=1&&month<=12&&day>=1&&day<=mdays[month-1]) {
      int day_count = day;
      for(int i=0; i<month-1; i++) {
        day_count += mdays[i];
      }
      System.out.print("This date is "+day_count+"th of the year");
    }
    else
      System.out.print("This date is not valid.");
  }
}