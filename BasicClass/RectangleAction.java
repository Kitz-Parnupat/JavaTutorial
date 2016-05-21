
package BasicClass;

public class RectangleAction {
    
   public static void main(String[] args){ 
       Rectangle box = new Rectangle(); // สร้าง object ของ class Rectangle โดยมีชื่อ Object ว่า box
        //           ส่งค่า 10 ไปที่ method setLength
        box.setLength(10); // เรียกใช้งาน method ที่ชื่อว่า setLength จะเรียกผ่าน object ที่ชื่อว่า box  เป็น method แบบรับค่า 
        box.setWidth(20);
        System.out.println("Length = "+box.getLength());//รับค่า มาจาก method getLength เป็นmethod แบบส่งค่ากลับ
        System.out.println("Width = "+box.getWidth());
        System.out.println("Rectangle Area = "+box.CalArea());
    }
}
