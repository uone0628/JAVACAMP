import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c07();
  }
  void c07(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter file size as megabytes > ");
    int megabytes = s.nextInt();
    long bytes = (long) megabytes * 1024 * 1024; // 용량(바이트 단위)
    System.out.print("Enter transfer method (1. WiFi, 2. Bluetooth, 3. LTE, 4. USB) > ");
    byte kind = s.nextByte();
    double time = 0;
    if(kind == 1)
      time = (double) bytes / 1500000;
    else if(kind == 2)
      time = (double) bytes / 300000;
     else if(kind == 3)
      time = (double) bytes / 1000000;
     else if(kind == 4)
      time = (double) bytes / 60000000;
    System.out.printf("File transfer time is %.1f", time);
  }
}