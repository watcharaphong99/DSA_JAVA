package array;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Helloworld");

        //array of primitive -> value is default
        //array of reference type -> value initial by null
        int[] data = new int[20];
        System.out.println(Arrays.toString(data));

        int index = 0;
        data[index] = 5;
        System.out.println(Arrays.toString(data));
        System.out.println(data[index]);

        String[] name = {"Best","Boat","Base"};
        System.out.println(name.length);

        int[] data2  = new int[20];
        //initial is 1 in data2
        Arrays.fill(data2, 1);
        System.out.println(Arrays.toString(data2));

        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 1;
        System.out.println("==Before Sort===");
        System.out.println(Arrays.toString(numbers));
        // DESC -> Primitive -> reverse by ourselves
       
        Arrays.sort(numbers);
       
    
        System.out.println("==After Sort===");
       var numberBoxType =   Arrays.stream(numbers)
        .boxed()
        .toList()
        .toArray(new Integer[0]);

        Arrays.sort(numberBoxType,(a,b) -> Integer.compare(a,b));
        System.out.println(Arrays.toString(numbers));


    }
}
