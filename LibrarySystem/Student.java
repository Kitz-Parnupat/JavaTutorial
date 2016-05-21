
package LibrarySystem;

public class Student {
    String Name;
    String Email;
    public Student(){
        this.Name = null;
        this.Email = null;
    }
    public void setData(String name,String email){
        this.Name = name;
        this.Email = email;
    }
    public String getName(){
        return this.Name;
    }
    public String getEmail(){
        return this.Email;
    }
}
