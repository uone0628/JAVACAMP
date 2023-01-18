import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b02();
  }
  void b02(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter temperature > ");
    double degree1 = s.nextFloat();
    System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
    char check = s.next().charAt(0);
    double degree2=0;
    if(check == 'C') {
      degree2 = degree1 * 1.8 + 32;
      System.out.println("Fahrenheit temperature is "+degree2);
    }
    else if(check == 'F') {
      degree2 = (degree1 - 32) / 1.8;
      System.out.println("Celsius temperature is "+degree2);
    }
  }
}