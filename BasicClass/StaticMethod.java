
package BasicClass;


public class StaticMethod { // การเรียกใช้ ไม่จำเป็นต้องสร้าง Object แต่ใช้กับ method ที่เป็น Static เท่านั้น
    public static void main(String[] args) {
       name.Setname("GG"); // ชื่อ Class และ ตามด้วยชื่อ method 
       System.out.println( name.Showname());
       System.out.println(name.Setnum(10));
       
    }
    //***หมายเหตุ**** Static ไม่สามาร ใช้ this. ตามด้วยชื่อตัวแปรได้ 
    
}

class name{
    static String name = "JS"; // ประกาศตัวแปรแบบ Static 
    
    public static String Showname(){ //method แบบ Static 
        return name;
    }
    
    public static int Setnum(int numA){
        int numB = 0;
        return numA + numB;
    }
    public static void Setname(String NickName){
        name = NickName;
    }
}
