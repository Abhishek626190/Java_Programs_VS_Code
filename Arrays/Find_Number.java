package Arrays;
import java.util.Scanner;
public class Find_Number {
Scanner sc=new Scanner(System.in);
    public void find(int a[])
    {
        System.out.println("Enter Element to search");
        int num=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(num==a[i])
            {
                System.out.println("The index number of "+num+" is: "+i);
            }
        }
    }
    public static void main(String[] args) {
        Sum_Elements s=new Sum_Elements();
        Find_Number f=new Find_Number();
        int arr[]=s.createArray();
        f.find(arr);
    }
    
}
