
package MVCPattern;

public class StudentModel {
    private int id;
    private String name;
    private double gpa;
    
    public void setId(int stdId){
        this.id = stdId;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String stdName){
        this.name = stdName;
    }
    
    public String getName(){
        return this.name;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    public double getGPA(){
        return this.gpa;
    }
}
