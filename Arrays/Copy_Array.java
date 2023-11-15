package Arrays;

public class Copy_Array {
    public void copy(int a[])
    {
        int arr[]=new int [a.length];
        for(int i=0;i<a.length;i++)
        {
            arr[i]=a[i];

        }
        System.out.println("The Copy Array Is:");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+",");
        }
    }
    public static void main(String[] args) {
        Copy_Array obj=new Copy_Array();
        Sum_Elements s=new Sum_Elements();
        int array[]=s.createArray();
        obj.copy(array);
    }
    
}
