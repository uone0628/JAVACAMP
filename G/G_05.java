import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g05();
    }

    void g05() {
      Scanner s = new Scanner(System.in);

      int hour, minute;
      int charge;
      int total_charge=0;

      while(true){
        System.out.printf("Enter hours and minutes of use > ");
        hour = s.nextInt();
        minute = s.nextInt();

        if(hour==0 && minute==0) break;

        charge = (hour*2 + (minute/30)) * 1000;
        if(minute % 30 != 0) charge += 1000;

        if(hour >= 2) {
          if(hour < 3) charge *= 0.95;
          else if(hour < 5) charge *= 0.9;
          else charge *= 0.8;
        }

        System.out.printf("Your charge is %d\n\n", charge);
        total_charge += charge;
      }
      System.out.printf("Your total charge is %d", total_charge);
	}
}