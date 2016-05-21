
package extendClass;

public class Play extends Production{
    protected int performand;
    public Play(){
        super();
        this.performand = 0;
    }
    public Play(String t,String d,String w,int p){
        super(t,d,w);
        this.performand = p;
    }
    public int getPerformand(){
        return this.performand;
    }
    public void setPerformand(int p){
        this.performand = p;
    }
    public void Display(){
        System.out.println("Title : "+super.title);
        System.out.println("Director : "+super.director);
        System.out.println("Playwrighrt : "+super.writer);
        System.out.println("Performand : "+this.performand);
    }
}
