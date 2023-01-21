import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e04();
  }

  void e04(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
    int mode = sc.nextInt();

    if (mode != 1 && mode != 2) {
      System.out.println("Invalid input. Exiting program.");
      return;
    }

    int start;
    if (mode == 1) {
      start = 3;
    } else {
      start = 2;
    }

    for (int i = start; i <= 9; i += 2) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d X %d = %d\t", i, j, i * j);
        if (j % 3 == 0) {
          System.out.println();
        }
      }
      System.out.println();
    }
  }
}

// Scanner s = new Scanner(System.in);
//     while(true) {
//       System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
//       int mode = s.nextInt();
//       if(mode == 1) {
//         for(int i=3; i<10; i=i+2) {
//           for(int j=1; j<10; j++) {
//             System.out.printf("%d X %d = %d", i, j, i*j);
//             if(j%3==0) {
//               System.out.print("\n");
//             }
//           }
//           System.out.print("\n"); 
//         }
//       }
//       else {
//         for(int i=2; i<10; i=i+2) {
//           for(int j=1; j<10; j++) {
//             System.out.printf("%d X %d = %d", i, j, i*j);
//             if(j%3==0) {
//               System.out.print("\n");
//             }
//           }
//           System.out.print("\n"); 
//         }
//       }