package Array;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner =new Scanner(System.in);

public void traversal(int []a){
    for(int i=0;i<a.length;i++)
        System.out.println("Index["+i+"]="+a[i]);
}
public void reverse_traversal(int []a){
        for(int i=a.length-1;i>=0;i--)
            System.out.println("Index["+i+"]="+a[i]);
    }
public void input(int []a){
    System.out.println("Enter "+a.length+" elements");
    for(int i=0;i<a.length;i++)
        a[i]=scanner.nextInt();
}


}
