import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h05();
    }

    void h05() {
      Scanner s = new Scanner(System.in);
      int coins;
      int[] number = new int[3];
      int dummy;

      System.out.print("Enter number of coins > ");
      coins = s.nextInt();
      int i=0;
      while(true){
        if(coins == 0) break;

        System.out.printf("Start %dth game!!! (Enter any number) > ", i+1);
        dummy = s.nextInt();
        coins--;
        i++;

        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        System.out.print("Result of game : ");
        for(int j=0; j<3; j++){
          number[j] = random.nextInt(9)+1;
          System.out.printf("%d ", number[j]);
        }
        System.out.print("---> ");

        if(number[0] == number[1] && number[1] == number[2]) {
          coins += 4;
          System.out.println("match 3 numbers! got four more coins");
        }
        else if(number[0] == number[1] || number[1] == number[2] || number[0] == number[2]){
          coins += 2;
          System.out.println("match 2 numbers! got two more coins");
        }
        else System.out.println("Failed...");
        System.out.printf("There are %d coins ramaining.\n\n", coins);
      }

      System.out.print("Game over!");
	}
}