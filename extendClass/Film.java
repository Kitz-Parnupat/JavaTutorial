
package extendClass;


public class Film extends Production{
    protected int boxOfficeGross,year;
    public Film(){
        super();
        this.boxOfficeGross = 0;
        this.year = 0;
    }
    public Film(String t,String d,String w,int g,int y){
        super(t,d,w);
        this.boxOfficeGross = g;
        this.year = y;
    }
    public int getYearOfficeGross(){
        return this.year;
    }
    public int getBoxOfficeGross(){
        return this.boxOfficeGross;
    }
    public void setBoxOfficeGross(int g){
        this.boxOfficeGross = g;
    }
    public void setYearOfficeGross(int y){
        this.year = y;
    }
    public void Display(){
        System.out.println("Title : "+super.title);
        System.out.println("Director : "+super.director);
        System.out.println("Screenwriter : "+super.writer);
        System.out.println("Total gross : $ "+this.boxOfficeGross+"million");
        System.out.println("Year : "+this.year);
    }
}
