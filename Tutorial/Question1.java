
package Tutorial;
import java.util.Scanner;
public class Question1 {
    private int getYear;

    public static void main(String[] args) {
        int i = 0;
        Question1 gy = new Question1();
        while(i<3){
        gy.getYear();
        System.out.println("AGE: "+gy.mathYear());
        i++;
        }
        System.out.println("Thank You");
    }
    void getYear(){
        Scanner sc = new Scanner(System.in);
       System.out.println("my Year : ");
        int getYear = sc.nextInt();
        this.getYear = getYear;
    }
    int mathYear(){
        
        return 2559 - this.getYear;
    }
    
}
