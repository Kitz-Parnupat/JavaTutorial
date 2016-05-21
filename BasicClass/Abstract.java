
package BasicClass;

abstract class Abstract { // Class ที่เป็น Class ต้นแบบให้กับ Class อื่นๆ 

    abstract void SetData(); // กำหนด Method เป็น Abstract Class ที่ทำการสืบทด Class นี้ต้องมี Method 
                             // นี้ด้วย โดยจะต้องเป็น method ชนิดเดียวกัน ชื่อเดี่ยวกัน  

    abstract public void GetData(); // ถ้ามีการกำหนดสิทธิ class ที่สืบทอดจะต้องมีการกำหนด สิทธิของ method 
                                    // แบบเดียวกันด้วย 
    
    void Math(){} // ไม่มีการกำหนด abstract ด้านหน้า คือ class ที่สืบทอดไม่จำเป็นต้องมี method นี้ 
}

class B extends Abstract { // Class B ได้ สืบทอด class มาจาก class Abstract (ด้านบน)

    void SetData() { // บังคับmethod ชนิด เดี่ยวกัน และ ชื่อเดียวกัน
    }
                    
    public void GetData() { //การกำหนดสิทธิจะเหมือนกับ Class Abstract ด้านบน 
        status a = status.OFF; // การใช้งาน enum
        
        System.out.println("" + a);
    }
    
    private void math(){}; /// แต่ Class B สามารสร้าง Method อื่นๆ ได้ 

    enum status { //ตัวแปร enum ข้อมูลบางชนิดที่มีค่าเป็นไปได้เพียงไม่กี่ค่า เช่น ข้อมูล เพศ, สี, ระดับคะแนน หรือ ข้อมูลเดือนต่าง ๆ ในปัจจุบัน
        ON, OFF, 
    }
}

class C extends Abstract { // Class Abstract สามารถสืบถอดได้ หลายคลาส แต่ต้องมีคุณสมบัติเหมือน Class Abstract 

    void SetData() {

    }

    public void GetData() {

    }
}

class main {

    public static void main(String[] args) {
        B b = new B();

        b.GetData();
    }
}
