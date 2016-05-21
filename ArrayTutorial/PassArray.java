
package ArrayTutorial;

import java.util.Scanner;

public class PassArray {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 4; //กำหนดขนาดความจุของ Array 
        int[] number = new int[ARRAY_SIZE]; // ประกาศตัวแปร Array อ้างอิงขนาดความจุจาก ARRAY_SIZE
        getValue(number); // เรียกใช้ method getValue
        
        System.out.print("Here are the"+"number that you entered : ");
        showArray(number);// เรียกใช้ method showArray
    }

    private static void getValue(int[] number) {
        Scanner keyboard = new Scanner(System.in);// สร้าง object สำหรับรับค่าจาก keyboard
        System.out.print("Enter a series of"+number.length+"number.\n");
        for(int index = 0;index < number.length;index++){ 
            System.out.print("Enter number"+(index+1)+":");
            number[index] = keyboard.nextInt();//นำค่าที่ได้จาก keyboard มาเก็บไว้ใน Array
        }       
    }

    private static void showArray(int[] number) {
       for(int index = 0;index<number.length;index++){
           System.out.print(+number[index]+","); // แสดงค่าที่รับมาจาก keyboard
       }
    }
    
}
