import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d05();
  }
  void d05(){
    Scanner s = new Scanner(System.in);
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
    while(true) {
      System.out.print("Enter width, height of Rectangle > ");
      int width = s.nextInt();
      int height = s.nextInt();
      if(width <= 0 || height <= 0) break;
      if(width == height) count1++;
      else if(width >= height * 2) count2++;
      else if(height >= width * 2) count3++;
      else if(width > height) count4++;
      else if(height > width) count5++;
    }
    System.out.println("Count of square is "+count1);
    System.out.println("Count of an oblong rectangle from side to side is "+count2);
    System.out.println("Count of an oblong rectangle from top to bottom is "+count3);
    System.out.println("Count of a horizontal rectangle is "+count4);
    System.out.println("Count of a vertical rectangle is "+count5);
  }
}