import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) {
      Main stepH = new Main();
      stepH.h08();
  }

  void h08() { 
    Scanner s = new Scanner(System.in);
    String input;
    String findstr;
    String replace;
    int i = 0;
    while(true){
      i = 0;
      System.out.println("===============================");
      System.out.print("=> Enter a sentence ('x' for exit) > ");
      input = s.nextLine();
      if(input.equals("x")) break;
      System.out.print("=> Enter a sentence to find > ");
      findstr = s.nextLine();
      System.out.print("=> Enter a sentence to replace > ");
      replace = s.nextLine();
      while(!input.replaceFirst(findstr, replace).equals(input)){
        input = input.replaceFirst(findstr, replace);
        i++;
      }
      System.out.printf("=> The replacement occurred %d times\n", i);
      System.out.println("=> "+input);
    }
    System.out.print("Exit program");
  }
}










// Scanner s = new Scanner(System.in);
//     String input="";
//     String findStr="";
//     String replaceStr="";
//     int count;

//     while(true){
//       count=0;
//       System.out.println("===============================");
//       System.out.print("=> Enter a sentence ('x' for exit) > ");
//       input = s.nextLine();

//       if(input.compareTo("x")==0) break;

//       System.out.print("=> Enter a sentence to find > ");
//       findStr = s.nextLine();
//       System.out.print("=> Enter a sentence to replace > ");
//       replaceStr = s.nextLine();
//       // next로반 받아오면 마지막에 \n가 버퍼에 남아 있어서 다음 문장을 nextLine으로 읽어올 때 \n만 읽어오게 됨. 

//       StringTokenizer tokenizer = new StringTokenizer(input);
//       while(tokenizer.hasMoreTokens()){
//         String next = tokenizer.nextToken();
//         if(next.compareTo(findStr)==0 || next.compareTo(findStr + ".")==0) count++;
//       }
//       System.out.printf("=> The replacement occurred %d times\n", count);
//       input = input.replaceAll(findStr, replaceStr);
//       System.out.println("=> " + input);
//     }

//     System.out.print("Exit program");