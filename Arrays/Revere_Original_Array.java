package Arrays;

public class Revere_Original_Array {
    public void reverseOrg(int a[]) {
        int temp;
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length / 2))
                break;

            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            j--;

        }
        System.out.println("Reversed Original Array is:");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + ",");
        }

    }

    public static void main(String[] args) {
        Revere_Original_Array obj = new Revere_Original_Array();
        Sum_Elements s = new Sum_Elements();
        int array[] = s.createArray();
        obj.reverseOrg(array);

    }

}
