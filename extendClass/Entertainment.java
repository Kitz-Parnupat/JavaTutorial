
package extendClass;

public class Entertainment {
    
    public static void main(String[] args) {
        Film f =  new Film("Titanic","Jame Cameron","James",2500,2523);
        Play p = new Play("Bus Stop","Harold Clurman","William",478);
        f.Display();
        System.out.println("==============================");
        p.Display();
    }
}
