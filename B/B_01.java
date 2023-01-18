import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b01();
  }
  void b01(){
    Scanner s = new Scanner(System.in);
  	System.out.print("Enter a birth year > ");
  	int birthyear = s.nextInt();
  	int age = 2022 - birthyear + 1;
    if(age >= 20)
  	  System.out.println("You are adult");
    else
      System.out.println("You are not adult");
  }
}