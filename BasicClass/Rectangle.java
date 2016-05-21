
package BasicClass;

public class Rectangle {
    private double length; //มีการ ห่อหุ้มตัวแปรไว้ class อื่นๆที่เรียกไปไม่สามารถแก้ไขค่าตัวแปรนี้ได้
    private double width;
 
    
    public void setLength(double Length) //จึงจำเป็นต้องแก้ไข ผ่าน method 
    {                                   //เป็น method แบบรับค่า 
        this.length = Length;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double Width)
    {
        this.width = Width;
    }
    public double getWidth(){ //method แบบคืนค่า 
        return this.width;
    }
    public double CalArea(){
        return this.length*this.width;
    }
}
