//This program checks whether two arrays are equal or not

import java.util.Arrays;

public class EqualArray {

    private static void equ(int a[], int b[])
    {
        boolean result = Arrays.equals(a, b);

        if(result)
        {
            System.out.println("Two arrays are equal");
        }
        else
        {
            System.out.println("Two arrays are not equal");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {1,2,4,3,4,6};

        equ(a, b);
    }
    
}
