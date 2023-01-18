import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b07();
  }
  void b07(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter file size as megabytes > ");
    int megabytes = s.nextInt();
    long bytes = (long) megabytes * 1024 * 1024; // 용량(바이트 단위)
    System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
    String usb2 = s.next();
    int time = 0;
    if(usb2.equals("Y"))
      time = (int) bytes / 60000000;
    else
      time = (int) bytes / 1500000;
    System.out.println("File transfer time is "+time);
  }
}