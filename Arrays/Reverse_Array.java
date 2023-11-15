package Arrays;

public class Reverse_Array {
    public void revrse(int a[])
    {
        System.out.println("\nArray In Reverse Order");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        Reverse_Array obj=new Reverse_Array();
        Sum_Elements s=new Sum_Elements();
        int array[]=s.createArray();
        obj.revrse(array);
    }
}
