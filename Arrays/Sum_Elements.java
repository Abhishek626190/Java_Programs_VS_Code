package Arrays;

import java.util.Scanner;

public class Sum_Elements {
    Scanner sc = new Scanner(System.in);

    public int[] createArray() {

        System.out.println("Enter Size Of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1 )+ " Element of array");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.println("The Array Is:");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+",");
        }
        return arr;

    }

    public void sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        System.out.println(sum);
        
    }

    public static void main(String[] args) {
        Sum_Elements obj = new Sum_Elements();
        int array[] = obj.createArray();
        obj.sum(array);
    }

}
