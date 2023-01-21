import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g06();
    }

    void g06() {
      Scanner s = new Scanner(System.in);

      int[] price = {10000, 6000, 3000};
      String str[] = {"first", "second", "third"};
      int sale;
      int total_sale=0;
      System.out.println("There are three type of products");
      System.out.printf("(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)\n\n");
      while(true){
        sale=0;
        for(int i=0; i<3; i++) {
          System.out.printf("How many %s products do you want to buy? > ", str[i]);
          sale += price[i] * s.nextInt();
        }
        if(sale == 0) break;
        total_sale += sale;
        System.out.printf("The price is %d\n\n", sale);
      }
      System.out.printf("Total price from now on is %d", total_sale);
	  }
}