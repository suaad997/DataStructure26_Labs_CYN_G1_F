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
public void update(int[]a, int index, int nvalue){
    if(index<0 || index >=a.length)
        System.out.println("Index not found");
    else
    {
    a[index]=nvalue;
    }
}
    public void delete(int[]a, int index){
        if(index<0 || index >=a.length)
            System.out.println("Index not found");
        else
        {
            a[index]=0;
        }
    }

public int linearSearch(int []a,int svalue){
    for(int i=0; i<a.length;i++)
    {
        if(svalue==a[i])
            return i;
    }
    return -1;
    }

    //n={3,7,9,12,14,22}  f=3 l=3     s=12
public int binarySearch(int []a, int svalue,int findex, int lindex){
    while (findex<=lindex) {
        int mid = (findex + lindex) / 2; //4
        if (svalue == a[mid])
            return mid;
        if (svalue > a[mid])
            findex = mid + 1;
        if (svalue < a[mid])
            lindex = mid - 1;  // 3
    }


    return -1;
    }

public void shift_delete(int []a, int index){
    if(index<0 || index >=a.length) {
        System.out.println("Index not found");
        return;
    }
    for(int i=index; i<a.length-1;i++)
        a[i]=i+1;
    a[a.length-1]=Integer.MIN_VALUE;

}






}
