
package LibrarySystem;

public class LibrarianAction {
    
 public static void main(String[] args) {
      Student st = new Student();
      LibaryCard card = new LibaryCard();
      
      st.setData("Kit", "Kit@hotmail.com");
      
      card.setOwner(st);
      card.checkOut(3);
      
      System.out.println("Card Data");
      System.out.println(card.toString()+"\n");
      }
    
}
