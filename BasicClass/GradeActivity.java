
package BasicClass;


public class GradeActivity {
    private double score;
    
    public void setScore(double s){
     this.score = s;   
    }
    public double getScore(){
        return this.score;
    }
    public char getGrade(){
        char Grade = 'N';
        
        if(this.score >= 90 )  Grade = 'A';
        else if (this.score >= 80) Grade = 'B';
        else if (this.score >= 70) Grade = 'C';
        else if (this.score >= 60) Grade = 'D';
        else Grade = 'F';
        return Grade;
    }
}
