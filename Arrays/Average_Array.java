package Arrays;

public class Average_Array {
    public void average(int a[])
    {   int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("The Sum of elements of array is :"+ sum);
       
        System.out.println("The Average of elements of array is :"+ (sum/a.length));

    }
    public static void main(String[] args) {
        Average_Array obj=new Average_Array();
        Sum_Elements s=new Sum_Elements();
        int array[]=s.createArray();
        obj.average(array);

    }
    
}
