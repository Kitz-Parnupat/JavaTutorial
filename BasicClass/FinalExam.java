
package BasicClass;

public class FinalExam extends GradeActivity{
    private int numQuestion;
    private double pointsEach;
    private int numMissed;
    
    public FinalExam(int question,int missed){
       double numericScore;
       this.numQuestion = question;
       this.numMissed = missed;
       this.pointsEach = 100.0 / question;
       numericScore = 100.0 - (missed*this.pointsEach);
       
       setScore(numericScore);
    }
    public double getPointsEach(){
        return this.pointsEach;
    }
    public int getNumMissed(){
        return this.numMissed;
    }
}
