package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr =new Arrayss();
        int []numbers={3,6,6,7,9};
        int result =arr.linearSearch(numbers,12);
       if(result!=-1)
        System.out.println("Value found at index:"+result);
        else
            System.out.println("Value not found ");


        //arr.delete(numbers,3);
        //int []numbers2=new int[7];

        //arr.traversal(numbers);
//        System.out.println("**************************");
//    arr.reverse_traversal(numbers);


        // System.out.println(Arrays.toString(numbers2));
//
//  for(int e:numbers)
//     System.out.println(e);


    }

}
