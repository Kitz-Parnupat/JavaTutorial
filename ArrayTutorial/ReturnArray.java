
package ArrayTutorial;


public class ReturnArray {


    public static void main(String[] args) {
       double[] value;
       value = getArray();
       for(int index = 0;index<value.length;index++)
           System.out.print(value[index]+",");
    }

    private static double[] getArray() {
        double[] array = {1.2,2.3,4.5,5.6};
        return array;
    }
    
}
