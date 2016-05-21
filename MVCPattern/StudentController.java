
package MVCPattern;

public class StudentController {
    private StudentModel model = new StudentModel();
    private StudentView view = new StudentView();
    
    public StudentController(StudentModel model,StudentView view){
        this.model = model;
        this.view = view;
    }
    
    public void setStudentID(int id)
    {
        model.setId(id);
    }
    public int getStudentID(){
        return model.getId();
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setGPA(double gpa)
    {
        model.setGPA(gpa);
    }
    public double getGPA(){
        return model.getGPA();
    }
    public void UpdateView(){
        view.ShowDataStudent(model.getId(), model.getName(),model.getGPA());
    }
}
