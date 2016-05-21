
package LibrarySystem;

public class LibaryCard {
    private Student Owner = new Student(); 
    int borrowCnt; // จำนวนการยืม
    public LibaryCard(){
        this.Owner = null;
        this.borrowCnt = 0;
    }
    public void checkOut(int numOfBook){
        this.borrowCnt = numOfBook;
    }
    public int getNumberOfBook(){
        return this.borrowCnt;
    }
    public String getOwnerName(){
        return Owner.getName();
    }
    public void setOwner(Student student){
        this.Owner = student;
    }
    public String toString(){
        return "Owner Name : "+Owner.getName()+"\n"+
               "Email : "+Owner.getEmail()+"\n"+
               "Book Borrowed : "+borrowCnt;
    }
    
}
