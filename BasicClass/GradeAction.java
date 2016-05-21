
package BasicClass;
import java.util.Scanner;
public class GradeAction {

    public static void main(String[] args) {
        int numQuestin,numMissed;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numQuestion :\n");
        numQuestin = sc.nextInt();
        System.out.print("Input numMissed :\n");
        numMissed = sc.nextInt();
        
        FinalExam fe = new FinalExam(numQuestin,numMissed);
        
        System.out.println("Score :"+fe.getScore());
        System.out.println("NumMissed :"+fe.getNumMissed());
        System.out.println("PointsEach :"+fe.getPointsEach());
        System.out.println("Grade :"+fe.getGrade()); 
    }
    
}
