
package Tutorial;
import java.util.Scanner;
public class Question2 {
    
    private final Scanner sc = new Scanner(System.in);
    private int price,vat;
    public static void main(String[] args) {
       Question2 qu = new Question2();
       
       System.out.println("Service Price : "+qu.getPrice());
       System.out.println("Vat : "+qu.MathVat());
       System.out.println("Total Price : "+qu.MathTotalPrice());
    }
    
    int getPrice(){
        System.out.print("Enter Price :");
        int getP = sc.nextInt();
        this.price = getP;
        return this.price;
    }
    
    int MathVat(){
        this.vat = this.price * 7/100;
        return this.vat;
    }
    int MathTotalPrice(){
        return this.vat+this.price;
    }
}
