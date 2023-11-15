package Arrays;

import java.util.Scanner;

public class Insert_Element_Specific_Pos {
    Scanner sc = new Scanner(System.in);

    public void insert(int a[]) {
        System.out.println("Enter Element to insert :");
        int ele = sc.nextInt();
        System.out.println("In which Index You want to insert:Enter Index Number ");
        int index = sc.nextInt();
        a[index] = ele;
        System.out.println("\nElement Insert Successfully");
        System.out.println("Array After Inserting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

    public static void main(String[] args) {
        Insert_Element_Specific_Pos obj = new Insert_Element_Specific_Pos();
        Sum_Elements s = new Sum_Elements();
        int array[] = s.createArray();
        obj.insert(array);

    }

}
