
package extendClass;


public class Production {
    protected String title;
    protected String director;
    protected String writer;
    
    public Production(){
        this.title = "";
        this.director = "";
        this.writer = "";
    }
    public Production(String t,String d,String w){
        this.title = t;
        this.director = d;
        this.writer = w;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDirector(){
        return this.director;
    }
    public String getWriter(){
        return this.writer;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public void setDirector(String d){
        this.director = d;
    }
    public void setWriter(String w){
        this.writer = w;
    }
    public void Display(){
        System.out.println("Production Class");
    }
}
