//This is a program to print 2d array

public class Twodarray {
    public static void main(String[] args)
    {
        int a[][]={{23,45,23},{87,67,5},{2,3,4}};
        int n= a.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
