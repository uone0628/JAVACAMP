import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c01();
  }
  void c01(){
    Scanner s = new Scanner(System.in);
  	System.out.print("Enter a birth year > ");
  	int birthyear = s.nextInt();
  	int age = 2022 - birthyear + 1;
    if(age >= 60)
  	  System.out.println("You are old age");
    else if(age >= 30)
      System.out.println("You are middle-age");
    else if(age >= 20)
      System.out.println("You are youth");
    else if(age >= 13)
      System.out.println("You are teenage");
    else if(age >= 7)
      System.out.println("You are child");
    else
      System.out.println("You are baby");
  }
}