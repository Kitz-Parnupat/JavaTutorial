
package Tutorial;

import java.util.Scanner;


public class NastedLoops {

    public static void main(String[] args) {
        int num = 0;
      //showNum();
      Scanner keyboard = new Scanner(System.in);
      Star();  
      }
    
    public static void showNum(){
          for(int i = 1;i<=3;i++){
            for(int j = 1;j<=3;j++)
                System.out.print(j);
            System.out.println();
        }
    }
    public static void Star(){
        for(int i = 1;i<=8;i++){
            for(int j = 1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
