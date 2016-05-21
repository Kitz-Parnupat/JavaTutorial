
package MVCPattern;

public class StudentAction {
   
    public static void main(String[] args){
        StudentModel model = RetriveStudentFrom();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        controller.UpdateView();
    }

    private static StudentModel RetriveStudentFrom() {
        StudentModel student = new StudentModel();
        student.setId(5);
        student.setName("kit");
        student.setGPA(4);
        return student;
    }
}
