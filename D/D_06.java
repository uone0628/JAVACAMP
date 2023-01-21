import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d06();
  }
  void d06(){
    Scanner s = new Scanner(System.in);
    int count1 = 0; // 소형 아파트 개수
    int count2 = 0; // 중소형 아파트 개수
    int count3 = 0; // 중형 아파트 개수
    int count4 = 0; // 대형 아파트 개수
    int i; // 반복문을 위한 변수
    for(i=0; i<10; i++) {
      System.out.print("Enter area of Apartment(m^2) > ");
      double m2_area = s.nextFloat();
      double pyung_area = m2_area / 3.305;
    	System.out.printf("Area of Apartment(pyung) %.1f\n",pyung_area);
      if(pyung_area >= 50)
        count1++;
      else if(pyung_area >= 30)
        count2++;
      else if(pyung_area >= 15)
        count3++;
      else
        count4++;
    }
    System.out.printf("Count of small-sized apartment is "+count4);
    System.out.printf("\nCount of small and medium-sized apartment is "+count3);
    System.out.printf("\nCount of medium-sized apartment is "+count2);
    System.out.printf("\nCount of big-sized apartment is "+count1);
  }
}