import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d03();
  }
  void d03(){
    Scanner s = new Scanner(System.in);
    int count=0;
    int totalsum = 0;
    while(true) {
      System.out.print("Enter a number from 0 to 100 > ");
      int number = s.nextInt();
      if(number < 0 || number > 100) break;
      totalsum += number;
      count++;
    }
    double average = (double) totalsum / count;
    System.out.println("The sum of "+count+" numbers is "+totalsum+", average is "+average+"");
  }
}