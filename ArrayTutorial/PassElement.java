
package ArrayTutorial;

public class PassElement {

    public static void main(String[] args) {
        int[] number = {5,10,15,20,25,30};//ประกาศตัวแปร เก็บค่า Array
        for(int index = 0;index < number.length;index++){
            showValue(number[index]);//เรียกใช้ method โดยส่งค่าเข้าไป ครั้งละ sell 
            //System.out.println(number[index]);
        }
    }
    public static void showValue(int n){
        System.out.print(n+","); // แสดงข้อความ
    }
    
}
