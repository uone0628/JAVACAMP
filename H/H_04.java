import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h04();
    }

    void h04() {
      Scanner s = new Scanner(System.in);
      String str[] = {"Scissors", "Rock", "Paper"};

      int com_finger;
      int my_finger;
      int score[][] = new int[2][3];
      for(int i=0; i<2; i++){
        for(int j=0; j<3; j++) score[i][j] = 0;
      }

      while(true){
        System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
        my_finger = s.nextInt();
        if(my_finger == 0) break;

        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        com_finger = random.nextInt(3)+1;

        if(com_finger == my_finger){  // 무승부
          System.out.printf("What the computer has given out is %s ---> Draw!\n", str[com_finger-1]);
          score[0][2]++;
          score[1][2]++;
        }  
        else if(my_finger == 1 && com_finger == 3 || my_finger == 2 && com_finger == 1 || my_finger == 3 && com_finger == 2){
          System.out.printf("What the computer has given out is %s ---> You win!\n", str[com_finger-1]);
          score[0][1]++;
          score[1][0]++;
        }
        else  {  
          System.out.printf("What the computer has given out is %s ---> Computer win..\n", str[com_finger-1]);
          score[0][0]++;
          score[1][1]++;
        }
      }

      System.out.printf("Computer : win - %d, lost - %d, draw - %d\n", score[0][0], score[0][1], score[0][2]);
      System.out.printf("User : win - %d, lost - %d, draw - %d\n", score[1][0], score[1][1], score[1][2]);
	}
}